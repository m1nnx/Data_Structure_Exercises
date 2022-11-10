/*****
CSC248: FUNDAMENTALS OF DATA STRUCTURES
LINKED LIST: CLASS EXERCISE 2
QUESTION #2
*****/

import java.util.*;

public class MagazineAppStuds
{
    public static void main(String[] args)
    {
        //assuming 5 magazines have been stored in a linked list named LL1
        LinkedList LL1 = new LinkedList();
        
        Magazine m = new Magazine();
        m = new Magazine("IT", "True Crime", "Publisher 1", 35.50, 2015);
        LL1.insertAtBack(m);
        m = new Magazine("Title 2", "Category 2", "JJ Publisher", 135.29, 2010);
        LL1.insertAtBack(m);
        m = new Magazine("Title 3", "Category 1", "Publisher 1", 305.50, 2018);
        LL1.insertAtBack(m);
        m = new Magazine("Let Me Kill You", "True Crime", "Publisher 3", 89.99, 2012);
        LL1.insertAtBack(m);
        m = new Magazine("Murder in Summer", "True Crime", "JJ Publisher", 68.90, 2000);
        LL1.insertAtBack(m);
        
        //(a) Count and display the number of books published by "JJ Publisher". 
        int count = 0;
        
        Magazine tempMagazine = (Magazine) LL1.getFirst();
        
        while(tempMagazine != null)
        {
            //step 3
            if(tempMagazine.getPublisher().equalsIgnoreCase("JJ Publisher"))
                count++;
            //step 4
            tempMagazine = (Magazine) LL1.getNext();
        }
        System.out.println("Number of magazines by JJ Publisher " + count);        
        
                      
        //(b) Write code segment that is able to perform the following actions: 
        //(i) Search and display the titles and prices of all books in category "True Crime".
        //(ii) Calculate and display the total price of all books in (i).
        Magazine tempMagazine2 = (Magazine) LL1.getFirst();
        double totalPrice = 0.0;
        while(tempMagazine2 != null)
        {
            //step 3
            if(tempMagazine2.getCategory().equalsIgnoreCase("True Crime"))
            {
                System.out.println("Title = " + tempMagazine2.getTitle());
                System.out.println("Price = " + tempMagazine2.getPrice());
                totalPrice += tempMagazine2.getPrice();
            }
            
            //step 4
            tempMagazine2 = (Magazine) LL1.getNext();
        }
        System.out.println("Total price is RM " + totalPrice);   
        
    //(c) Write the method definition called getLast() for class LinkedList. 
    //This method will get the last node in a linked list.
    System.out.println(LL1.getLast());
        
        
    }
}