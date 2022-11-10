/*****
CSC248 - Fundamentals of Data Structures
Linked List: Lab 2 
Question #1       
*****/

public class BookAppStuds
{
    public static void main(String[] args)
    {
        LinkedList bookList = new LinkedList();
        
        Book b;
        b = new Book("How to Program in Java", "Adderson, M.", "XY Publisher", 2015);
        bookList.insertAtBack(b);
        b = new Book("C++ for Beginners", "Kumar, A. D.", "Brand Publisher", 2017);
        bookList.insertAtBack(b);
        b = new Book("Learning Python", "Adderson, M.", "XY Publisher", 2018);
        bookList.insertAtBack(b);
        b = new Book("Data Structures", "James, P. Y.", "Panda Publishing", 2013);
        bookList.insertAtBack(b);
        b = new Book("Prolog Handbook 101", "Rowling, J. K", "New Publisher", 2012);
        bookList.insertAtBack(b);
        b = new Book("Learn How to Code in C++", "Ray, G. M", "Panda Publishing", 2016);
        bookList.insertAtBack(b);
        
        /*****
        (a) Display all books published by Panda Publishing
        *****/
        System.out.println("\nDisplay all books published by Panda Publishing");
        
        //Step 1 Cast & getFirst()
        Book b1=new Book(); //new object
        b1=(Book) bookList.getFirst();
        
        //Step 2 loop
        while(b1 != null)
        {
            //Step 3 call whatever
            System.out.print(b1.toString());
            
            //Step 4 getNext()
            b1=(Book) bookList.getNext();
        } 
      
        
        /*****
        (b) Count and display number of books on C++
        *****/
        int countBook=0;
        //Step 1: getFirst() & cast
        Book b2=new Book(); //new object
        b2=(Book) bookList.getFirst();
        
        //Step 2: loop
        while(b2 != null)
        {   
            //Step 3: call whatever
            if(b2.getBookTitle().contains("C++"))    
            {countBook++;}
            
            //Step 4: getNext()
            b2=(Book) bookList.getNext();
        }
        System.out.println("Number of books :"+countBook);
        /*****
        (c) Display the indexes for books written by Adderson, M.
        *****/
        System.out.println("/nIndexes for books written by Adderson, M.");
        int index=0;
        //Step 1 Cast & getFirst()
        Book b3=new Book(); //new object
        b3=(Book) bookList.getFirst();
        
         //Step 2: loop
        while(b3 != null)
        {   
            //Step 3: call whatever
            if(b3.getAuthor().equalsIgnoreCase("Adderson, M."))    
            {System.out.println(index);}
            
            //Step 4: getNext()
            b3=(Book) bookList.getNext();
            index++;
        }

        
        /*****
        (d) Write method getSecond() and then display the details of book in index no. 1.
        *****/
        System.out.println(bookList.getSecond());
        
        /*****
        (e) Find the longest book title amongst books published before 2015.
        *****/
        //Step 1 Cast & getFirst()
        Book b4=new Book(); //new object
        b4=(Book) bookList.getFirst();
        String longTitle = "";
        
        while(b4 != null)
        {
            //Step 3: call whatever
            if(b4.getBookTitle().length()>longTitle.length() && b4.getYearPublished()<2015)
            {
               longTitle = b4.getBookTitle();
            }
            //Step 4: getNext()
            b4=(Book) bookList.getNext();
        }
        System.out.println("longest book title amongst books published before 2015 is "+longTitle);
        

         
    }
}