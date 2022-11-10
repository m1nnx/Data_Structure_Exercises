/*****
CSC248 - Fundamentals of Data Structures
LinkedList: Lab 2
Question #1       
*****/

public class Book
{
    private String bookTitle;
    private String author;
    private String publisher;
    private int yearPublished;
    
    public Book()
    {
        bookTitle = "";
        author = "";
        publisher = "";
        yearPublished = 0;
    }
    
    public Book(String bT, String a, String p, int yP)
    {
        bookTitle = bT;
        author = a;
        publisher = p;
        yearPublished = yP;
    }
    
    public String getBookTitle() {  return bookTitle;   }
    public String getAuthor() {  return author;   }
    public String getPublisher() {  return publisher;   }
    public int getYearPublished() {  return yearPublished;   }
    
    public String toString()
    {
        return 
        "\nTitle of the book: " + bookTitle +
        "\nAuthor of the book: " + author +
        "\nPublisher of the book: " + publisher +
        "\nYear published of the book: " + yearPublished + "\n";
    }
}