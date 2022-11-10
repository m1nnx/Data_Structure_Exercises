/*****
CSC248 - FUNDAMENTALS OF DATA STRUCTURE
STACK: LAB 1
QUESTION 1
*****/

import java.util.*;

public class PropertyMy
{
    public static void main(String[] args)
    {
        //(a) Create a stack name PropertyStack to hold TEN(10) objects of Property
        Stack PropertyStack = new Stack();
        Stack tempStack = new Stack();
        
        //(b) Store TEN(10) objects of Property in the stack created in (a).
        Scanner scan1 = new Scanner(System.in);
        
        for(int counter=0;counter<5;counter++)
        {
            System.out.println("Enter the property number: ");
            String propertyNo=scan1.nextLine();
            System.out.println("Enter the property location: ");
            String propertyLocation=scan1.nextLine();
            System.out.println("Enter the name of the owner: ");
            String propertyOwner=scan1.nextLine();
            
            Property p=new Property(propertyNo,propertyLocation,propertyOwner);
            PropertyStack.push(p);
            System.out.println();
        }
        /*//(c) Display the last record of the PropertyStack.
        System.out.println("Last record of PropertyStack: "+PropertyStack.peek());
        
        
        //(d) Display all the records in PropertyStack.
        System.out.println("\nDisplaying all the records of Propertystack: \n");
        Property p1;
        while(!PropertyStack.isEmpty())
        {
            p1=(Property) PropertyStack.pop();
            
            System.out.println(p1);
            
            tempStack.push(p1);
        }
        
        while(!tempStack.isEmpty())
            PropertyStack.push(tempStack.pop());
            
        //(e) Display all the locations of property owned by Halim.
        System.out.println("\nDisplaying all the loaction of property owned by Halim: \n");
        Property p2;
        int counter = 0;
        while(!PropertyStack.isEmpty())
        {
            p2=(Property) PropertyStack.pop();
            
            if(p2.getOwnerName().equalsIgnoreCase("Halim"))
            {
               System.out.println(++counter +") "+p2.getPropertyLocation());
            }
            
            tempStack.push(p2);
        }
        
        while(!tempStack.isEmpty())
            PropertyStack.push(tempStack.pop());*/

        
        //(f) Display the record of property with property number as specified by the user. 
        //If the record does NOT exist, display appropriate message.
        System.out.println("Enter property number :");
        String pNum=scan1.nextLine();
        Property p3;
        boolean status=false;
        while(!PropertyStack.isEmpty())
        {
            p3=(Property) PropertyStack.pop();
            
            if(p3.getPropertyNo().equalsIgnoreCase(pNum))
            {
               System.out.println(p3.toString());
               status=true;
            }
            tempStack.push(p3);
        }
        if(status==false)
        {
            System.out.println("\nRecord not found!");
        }            

        while(!tempStack.isEmpty())
            PropertyStack.push(tempStack.pop());
            
            
            
            
        int count=0;
        Property p4;
        while(!PropertyStack.isEmpty())
        {
            p4=(Property) PropertyStack.pop();
            
            if(p4.getPropertyLocation().equalsIgnoreCase("Senawang"))
            {
               count++;
            }
                        
            tempStack.push(p4);
        }
        System.out.println("\nThe number of property in Senawang is "+count);
        while(!tempStack.isEmpty())
            PropertyStack.push(tempStack.pop());
            
          
          
            
        ArrayList distinct=new ArrayList();
        
        Property p5;
        while(!PropertyStack.isEmpty())
        {
            p5=(Property) PropertyStack.pop();
            distinct.add(p5);
        }
        
        int distinctNum=distinct.size();
        
        Property p6;
        for(int c=0;c<distinct.size();c++)
        {
           p6=(Property) distinct.get(c);
           
           Property p7;
           for(int d=c+1 ;d<distinct.size();d++)
           {
               p7=(Property) distinct.get(d);
               
               if(p6.getOwnerName().equalsIgnoreCase(p7.getOwnerName()))
               {
                  distinctNum--;
                  break;
               }
           } 
        }
        System.out.println("\nThe number of owners (distinctive owners) presents in the list: "+distinctNum);
    }
}