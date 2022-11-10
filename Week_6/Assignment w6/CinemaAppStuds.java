/*****
CSC248: FUNDAMENTALS OF DATA STRUCTURES
LINKED LIST: LAB 2
QUESTION #2
*****/

import java.util.*;

public class CinemaAppStuds
{
    public static void main(String[] args)
    {
        //(a) input 50 Cinema objects into the linked list
        LinkedList CinemaList=new LinkedList();
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        
        for(int index=0;index<50;index++)
        {
            System.out.println("Enter cinema code :");
            String cinCode=scan1.nextLine();
            System.out.println("Enter movie title :");
            String movieTitle=scan1.nextLine();
            System.out.println("Enter movie price :");
            double price=scan2.nextDouble();
            System.out.println("Enter payment mode :");
            String modePayment=scan1.nextLine();
            System.out.println("Are you a member? :");
            boolean membership=scan2.nextBoolean();
            
            Cinema c=new Cinema(cinCode,movieTitle,price,modePayment,membership);
            CinemaList.insertAtFront(c);
        }
        
        //(b) Display the details for movie entitled "Enchanted".
        //Step 1 Cast & getFirst()
        Cinema c1=new Cinema(); //new object
        c1=(Cinema) CinemaList.getFirst();
        
        //Step 2 loop
        while(c1 != null)
        {
            //Step 3 call whatever
            if(c1.getTitle().equalsIgnoreCase("Enchanted"))
            {
               System.out.print("\n"+c1.toString());
            }
            
            //Step 4 getNext()
            c1=(Cinema) CinemaList.getNext();
        } 

        
        //(c) Count & display the the number of members.
        
        int countMember=0;
        Cinema c2=new Cinema(); //new object
        c2=(Cinema) CinemaList.getFirst();
        
        //Step 2 loop
        while(c2 != null)
        {
            //Step 3 call whatever
            if(c2.getMembership()==true)
            {
               countMember++;
            }
            
            //Step 4 getNext()
            c2=(Cinema) CinemaList.getNext();
        }
        System.out.println("\nThe number of members :"+countMember);
        
        
        //(d) Copy all movies with prices less than RM15 to another linked list named MalayLL.
        //Then, display the contents of MalayLL.
        
        LinkedList MalayLL=new LinkedList();
        Cinema c3=new Cinema(); //new object
        c3=(Cinema) CinemaList.getFirst();
        
        while(c3 != null)
        {
            if(c3.getPrice() < 15)
            {
               MalayLL.insertAtBack(c3);
            }
            c3=(Cinema) CinemaList.getNext();
        }
        
        
        System.out.println("\nmovies with prices less than RM15 in LinkedList MalayLL");
        Cinema c4=new Cinema(); //new object
        c4=(Cinema) MalayLL.getFirst();
        
        //Step 2 loop
        while(c4 != null)
        {
            //Step 3 call whatever
            System.out.println(c4.toString());            
            //Step 4 getNext()
            c4=(Cinema) MalayLL.getNext();
        } 

        
        
        
        
    }
}