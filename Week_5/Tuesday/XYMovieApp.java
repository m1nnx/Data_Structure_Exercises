/*****
CSC248 - Fundamentals of Data Structures
LinkedList: Lab 1 
Question #1       
*****/
import java.util.*;

public class XYMovieApp
{
    public static void main(String[] args)
    {
        /*****
        (a) Declare an object of type LinkedList named MovieList. Prompt the users to enter information of FIVE (5) 
        movies and store them into the MovieList. Use the for loop control structure for the iteration purposes.        
        *****/
        LinkedList MovieList = new LinkedList(); //DECLARE OBJECT OF MOVIELIST
        Scanner sc = new Scanner(System.in);
        
        for(int counter = 0; counter < 5; counter++)
        {
            System.out.println("Enter the title of the movie: ");
            String title = sc.next();
            System.out.println("Enter the price of the movie: ");
            double price = sc.nextDouble();
            System.out.println("Enter the mode of payment: ");
            String payment = sc.next();
            System.out.println("Enter the membership status: ");
            String member = sc.next();
            
            XYMovie mv = new XYMovie(title, price, payment, member);
            MovieList.insertAtBack(mv); //INSERT MOVIE
            System.out.println();
        }
        
        /*****
        (b) Display the contents of MovieList.
        *****/
        
        
        /*****
        (c) Display the movie's information where its title begins with character 'A'.
        *****/
        
        
        /*****
        (d) Count and display the number of movies where price is less than RM10.
        *****/        
        
        /*****
        (e) Display the movie's title for those members who paid using debit/creadit card. 
        *****/
        
        
        /*****
        (f) Copy all movie's details that have been paid with cash into another LinkedList named CashList.
        Calculate and display the total of cash collected for the day. 
        *****/
                
        
    }
}
