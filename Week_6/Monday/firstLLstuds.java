/*****
CSC248: FUNDAMENTALS OF DATA STRUCTURES
LINKED LIST: CLASS EXERCISE 2
QUESTION #1
*****/

import java.util.*;

public class firstLLstuds
{
    public static void main(String[] args)
    {
        /*****
        (a) Declare and create a LinkedList named nameList to store FIVE(5) String objects.
        *****/        
        LinkedList nameList = new LinkedList();
        
        /*****
        (b) Add the FIVE (5) String objects into the nameList. 
        *****/
        nameList.insertAtFront("Aminah");
        nameList.insertAtFront("Hassan");
        nameList.insertAtFront("Muthu");
        nameList.insertAtFront("Mei LIng");
        nameList.insertAtFront("Hussin");
        
        /*****
        (c) Display ALL elements in the nameList. 
        *****/
        //step 1: getFirst() & cast
        String name = (String) nameList.getFirst();
        
        //step 2: looping
        while(name != null)
        {
            //step 3: whatever
            System.out.println(name + " ");
            //step 4: getNext() & cast
            name = (String) nameList.getNext();
        }
        
        /*****
        (d) Display the index of "Mei Ling" in the nameList. 
        *****/
        //step 1
        String name1 = (String) nameList.getFirst();
        int count = -1; //all index
        int indexName = -1; //index that we want
        //step 2
        while(name1 != null)
        {
            //step 3
            count++;
            if(name1.equalsIgnoreCase("Mei Ling"))
                indexName = count;
            //step 4
            name1 = (String) nameList.getNext();
        }
        
        /*****
        (e) Add these TWO (2) names; "Juliana" and "Elizabeth" at the back of the nameList. 
        *****/
        nameList.insertAtBack("Juliana"); 
        nameList.insertAtBack("Elizabeth");
        
        /*****
        (f) Remove the first name from the nameList. 
        *****/
        nameList.removeFromFront();
        
        
        /*****
        (g) Display the current size of the nameList. 
        *****/
        //step 1
        String name2 = (String) nameList.getFirst();
        
        int size = 0;
        //step 2
        while(name2 != null)
        {
            //step 3
            size++;
            //step 4
            name2 = (String) nameList.getNext();
        }
        System.out.println("The size is " + size);
        
        /*****
        (h) Remove "Muthu" from the nameList and then print the latest contents of the nameList. 
        *****/
        //step 1
        String name3 = (String) nameList.getFirst();
        
        LinkedList tempList = new LinkedList();
        //step 2
        while (name3 != null)
        {
            //step 3
            if(!name3.equalsIgnoreCase("Muthu"))
                tempList.insertAtBack(name3); //moved
            //step 4
            name3 = (String) nameList.getNext();
            nameList.removeFromFront();
        }
        
        //restore into nameList        
        //step 1
        String name4 = (String) tempList.getFirst();
        
        //step 2
        while (name4 != null)
        {
            //step 3
            nameList.insertAtBack(name4);
            //step 4
            name4 = (String) tempList.getNext();
            
        }
        
        //printing all the elements
        
        //step 1: getFirst() & cast
        String name5 = (String) nameList.getFirst();
        
        //step 2: looping
        while(name5 != null)
        {
            //step 3: whatever
            System.out.println(name5 + " ");
            //step 4: getNext() & cast
            name5 = (String) nameList.getNext();
        }
                
        
        
    }
}