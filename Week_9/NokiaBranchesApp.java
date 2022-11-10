import java.util.*;

public class NokiaBranchesApp
{
    public static void main(String[] args)
    {
        //(a) Create a queue named BranchesQ to store TEN(10) objects of NokiaBranches.
        
        Queue BranchesQ = new Queue();
        Queue tempQ = new Queue();

            
        //(b) Store TEN(10) objects of NokiaBranches into the BranchesQ.
        
      
       Scanner scan = new Scanner(System.in);
      
      for(int i =0; i<10; i++)
      { 
        System.out.println("Manager's name: ");
        String managerName = scan.next();
        System.out.println("Number of department: ");
        int no_of_dept = scan.nextInt();
        System.out.println("Location: ");
        String location = scan.next();
        System.out.println("Number of worker: ");
        int no_of_worker = scan.nextInt();
        System.out.println("\n");
        
        
        NokiaBranches n = new NokiaBranches(managerName,no_of_dept,location,no_of_worker);
        BranchesQ.enqueue(n);
        
       }
       
     
      
    
       
        //(c) Display all the TEN(10) objects stored in the BranchesQ
        
        
        while(!BranchesQ.isEmpty())
        {
         NokiaBranches n1 = (NokiaBranches) BranchesQ.dequeue();
         
          System.out.println(n1);

          tempQ.enqueue(n1);
        }
        
         while(!tempQ.isEmpty())
         {
          BranchesQ.enqueue(tempQ.dequeue());
         }

        
              
        //(d) Display the name of the manager that runs the branch in "Perak". 
        //If there is no branch with the name specified found, display appropriate message.
         System.out.println("\n" );
         String theName = " ";
         
        while(!BranchesQ.isEmpty())
        {
         NokiaBranches n2 = (NokiaBranches) BranchesQ.dequeue();
         
            if(n2.getLocation().equalsIgnoreCase("Perak"))
            {
            
            theName = n2.getName();
            }
                  
         tempQ.enqueue(n2);
        }
        if (theName !=" ")
        { 
         System.out.println(theName);
        }
        
        else
        { 
         System.out.println(" appropriate message");
        }

        
         while(!tempQ.isEmpty())
         {
          BranchesQ.enqueue(tempQ.dequeue());
         }


            
        //(e) Calculate and display total number of workers in all the branches
        
        int count=0;
        System.out.println("\n" );
         
        while(!BranchesQ.isEmpty())
        {
         NokiaBranches n3 = (NokiaBranches) BranchesQ.dequeue();
         
         count=count + n3.getNumWorker();
         
         tempQ.enqueue(n3);
        }
        
        System.out.println("Total number of workers in all the branches is " +count);
        
         while(!tempQ.isEmpty())
         {
          BranchesQ.enqueue(tempQ.dequeue());
         }
 
           
        
        //(f) Display the location of the branch with the least number of department.
        
        int small=99;
        String theLocation = " ";
       
        System.out.println("\n" );
         
        while(!BranchesQ.isEmpty())
        {
         NokiaBranches n4 = (NokiaBranches) BranchesQ.dequeue();
         
         
         
           if(small>n4.getNumDept())
             {
              small = n4.getNumDept();
              theLocation = n4.getLocation();
             }
         
         
          tempQ.enqueue(n4);
        }
        System.out.println("Branch with the least number of department is " +theLocation );
               
         while(!tempQ.isEmpty())
         {
          BranchesQ.enqueue(tempQ.dequeue());
         }
 

                   
        //(g) Copy all the branches located in "Penang", "Kedah" and "Perlis" into a linked list called "NorthernLL".
        //Then display the number of branches stored in the linked list.
        
        System.out.println("\n" );
        
        LinkedList NorthernLL = new LinkedList();
        int countN =0;
        
        
         
        while(!BranchesQ.isEmpty())
        {
         NokiaBranches n5 = (NokiaBranches) BranchesQ.dequeue();
            
            if(n5.getLocation().equalsIgnoreCase("Penang") || n5.getLocation().equalsIgnoreCase("Kedah") || n5.getLocation().equalsIgnoreCase("Perlis"))
            { 
             NorthernLL.insertAtBack(n5);
              System.out.println(n5);
                             
              countN++;
            }    
         
          tempQ.enqueue(n5);
        }
        System.out.println("\n" );

        System.out.println("Number of branches stored in NortherLL is " +countN);

                
         while(!tempQ.isEmpty())
         {
          BranchesQ.enqueue(tempQ.dequeue());
         }
         
        
        
        //(h) Display all the contents of NorthernLL.
        
       NokiaBranches n6 = (NokiaBranches)NorthernLL.getFirst();
       
       while(n6 !=null)
       {
        System.out.println(n6);
         n6 = (NokiaBranches)NorthernLL.getNext();
       }
        
        
    }
}