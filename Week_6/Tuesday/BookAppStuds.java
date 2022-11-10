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
        
        
        /*****
        (b) Count and display number of books on C++
        *****/
        
        
        /*****
        (c) Display the indexes for books written by Adderson, M.
        *****/

        
        /*****
        (d) Write method getSecond() and then display the details of book in index no. 1.
        *****/
        
        
        /*****
        (e) Find the longest book title amongst books published before 2015.
        *****/
         
    }
}