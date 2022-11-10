import java.util.*;

public class ChaletDemo
{
   public static void main(String[] args)
   {
      //(a) create stack name sChalet
      Stack sChalet=new Stack();
      Stack tempStack=new Stack();
      
      //(b)create 5 object into sChalet
      Scanner scan= new Scanner(System.in);
      for(int counter=0;counter<5;counter++)
      {
         System.out.println("Enter the name of the chalet : ");
         String cName=scan.nextLine();
         System.out.println("Enter the ID of the chalet : ");
         String cID=scan.nextLine();
         System.out.println("Enter the profit of the chalet : ");
         double cProfit=scan.nextDouble();
         System.out.println("Enter the owner citizenship : ");
         int cShip=scan.nextInt();
         
         boolean ctShip;
         if(cShip==1)
            ctShip=true;
         else
            ctShip=false;
            
        ChaletOwner owner=new ChaletOwner(cName,cID,cProfit,ctShip);
        sChalet.push(owner);    
      }
      
      //(c)count and display the number of foreigner owners with profit more than RM1 million
      int countRich=0;
      
      while(!sChalet.isEmpty())
      {
         ChaletOwner owner1=(ChaletOwner) sChalet.pop();
         
         if(owner1.getCitizenship() == false && owner1.getProfit() >1000000)
            countRich++;
         
         tempStack.push(owner1);
      }
      System.out.println("\nNumber of foreigner profit more than 1 mil :"+countRich) ;  
      
      //(d) print the details of chalet as specified by the user
      System.out.println("Enter the ID of the chalet to be search: ");
      String IDSearch=scan.next();
      
      while(!tempStack.isEmpty())
         sChalet.push(tempStack.pop());
         
      while(!sChalet.isEmpty())
      {
         ChaletOwner owner2=(ChaletOwner) sChalet.pop();
         
         if(owner2.getChaletID().equalsIgnoreCase(IDSearch))
            System.out.println("\nDetails of chalet searched :"+owner2);
            
         tempStack.push(owner2);
      }
      
      //(e)Print the details of the chalet owned by malasyian with LEAST profit
      while(!tempStack.isEmpty())
         sChalet.push(tempStack.pop());
         double minProfit=99999999;
         
         ChaletOwner ownerMin=new ChaletOwner();
         while(!sChalet.isEmpty())
         {
            ChaletOwner owner3=(ChaletOwner) sChalet.pop();
            
            if(owner3.getCitizenship() == true && owner3.getProfit()<minProfit)
            {
               minProfit=owner3.getProfit();
               ownerMin = owner3;
            }
         }
         System.out.println("\nThe details of the chalet owned by malasyian with LEAST profit :"+minProfit);
         
   }
}