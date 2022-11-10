public class Magazine
{
    private String title;
    private String category;
    private String publisher;
    private double price;
    private int yearPublish;
    
    public Magazine()
    {
        title = "";
        category = "";
        publisher = "";
        price = 0.0;
        yearPublish =0;
    }
    
    public Magazine(String t, String c, String p, double pr, int y)
    {
        title = t;
        category = c;
        publisher = p;
        price = pr;
        yearPublish = y;
    }
    
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getPublisher() { return publisher; }
    public double getPrice() { return price; }
    public int getYearPublish() { return yearPublish; }
    
    public double calcNewPrice()
    {
        int no_years = 2015 - yearPublish;
        double newPrice = 0;
        
        if (no_years > 10)
        {
            newPrice = price * 1.1;
        }
        
        return newPrice;
    }
   
    public String toString()
    {
        return
        "\nTitle --> " + title +
        "\nCategory --> " + category +
        "\nPublisher --> " + publisher +
        "\nPrice --> RM" + price +
        "\nYear Publish --> " + yearPublish + "\n";
    }
}