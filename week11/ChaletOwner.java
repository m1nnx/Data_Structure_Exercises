public class ChaletOwner
{
    private String chaletName;
    private String chaletID;
    private double profit;
    private boolean citizenship;
    
    public ChaletOwner(String name, String ID, double p, boolean c)
    {
        chaletName = name;
        chaletID = ID;
        profit = p;
        citizenship = c;
    }
    
    public ChaletOwner()
    {
        chaletName = " ";
        chaletID = " ";
        profit = 0.0;
        citizenship = true;
    }
    
    public String getChaletName() { return chaletName; }
    public String getChaletID() { return chaletID; }
    public double getProfit() { return profit; }
    public boolean getCitizenship() { return citizenship; }
    
    public String toString()
    {
        return
        "\nName of the chalet: " + chaletName +
        "\nID of the chalet: " + chaletID +
        "\nName of the chalet: " + chaletName +
        "\nCitizenship of the chalet owner: " + citizenship +
        "\nProfit of the chalet: " + profit;
    }
}