/*****
CSC248 - Fundamentals of Data Structures
LinkedList: Lab 1 
Question #1       
*****/

public class XYMovie
{
    private String movieTitle;
    private double price;
    public String modePayment;
    public String membership;
    
    public XYMovie()
    {
        movieTitle = "";
        price = 0.0;
        modePayment = "";
        membership = "";
    }
    
    public XYMovie(String mT, double p, String mP, String mS)
    {
        movieTitle = mT;
        price = p;
        modePayment = mP;
        membership = mS;
    }
    
    public String getMovieTitle() { return movieTitle;  }
    public double getPrice() { return price;  }
    public String getModePayment() { return modePayment;  }
    public String getMembership() { return membership;  }
    
    public String toString()
    {
        return 
        "\nTitle of the movie: " + movieTitle +
        "\nPrice of the movie: " + price +
        "\nMode of payment for the movie: " + modePayment +
        "\nMembership status: " + membership + "\n";
    }
}