public class StateCapitalKL
{
private String capitalName;
private int capitalDistance;

public StateCapitalKL(String nm,int d)
{
capitalName=nm;
capitalDistance=d;
}
public void setCapitalName(String nm){capitalName=nm;}
public void setCapitalDistance(int d){capitalDistance=d;}

public String getCapitalName(){return capitalName;}
public int getCapitalDistance(){return capitalDistance;}

public String toString()
{
   return("capital name :"+capitalName+"capital distance :"+capitalDistance);
}





}