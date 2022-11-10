public class Cinema
{
    private String cinCode;
    private String movieTitle;
    private double price;
    private String modePayment;
    private boolean membership;
    
    
    public Cinema()
    {
        cinCode = " ";
        movieTitle = " ";
        price = 0.0;
        modePayment = " ";
        membership = true;
    }
    
    
    public Cinema(String c, String t, double p, String m, boolean mb)
    {
        cinCode = c;
        movieTitle = t;
        price = p;
        modePayment = m;
        membership = mb;
    }
    
    public String getCode() { return cinCode; }
    public String getTitle() { return movieTitle; }
    public double getPrice() { return price; }
    public String getModePayment() { return modePayment; }
    public boolean getMembership() { return membership; }
    
    public String toString()
    {
        return
        "Cinema code    --> " + cinCode +
        "\nMovie title    --> " + movieTitle +
        "\nPrice          --> " + price +
        "\nMode payment   --> " + modePayment +
        "\nMembership     --> " + membership + "\n";
    }
}