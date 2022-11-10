import java.util.*;

public class ProductApp
{
	public static void main(String args[])
	{
	    /*****
		(a) Store TEN (10) products into the queue; prodQueue.
		*****/
		Queue prodQueue = new Queue();
      Queue tempQ=new Queue();
      Scanner in=new Scanner(System.in);
      
      for(int counter=0;counter<10;counter++);
      {
         System.out.println("ShortSleeve,ShortPant or booties?");
         String pType=in.nextLine();
         System.out.println("Enter the colour;");
         String pColor=in.nextLine();
         System.out.println("Enter the size (S, M or L):");
         char pSize=in.next().charAt(0);
         System.out.println("enter the price : Rm");
         double pPrice=in.nextDouble();
         
         Product p=new Product(pType,pColor,pSize,pPrice);
         prodQueue.enqueue(p);
      }
		
		/*****
		(b)Copy all products from prodQueue and store them into THREE (3) different queues (shortSleeve, shortPants and booties). 
		All products in the prodQueue must remain in the original order.
		*****/
		Queue ShortSleeve=new Queue();
      Queue ShortPant=new Queue();
      Queue booties=new Queue();
		
         Product p1;
         while(!prodQueue.isEmpty())
         {
            p1=(Product) prodQueue.dequeue();
            if(p1.getType().equalsIgnoreCase("ShortSleeve"))
               ShortSleeve.enqueue(p1);
            else if(p1.getType().equalsIgnoreCase("shortPant"))
               ShortPant.enqueue(p1);
            else
               booties.enqueue(p1);
         tempQ.enqueue(p1);
         }
         while(!tempQ.isEmpty())
         {
            prodQueue.enqueue(tempQ.dequeue());
         }
		/*****
		(c) Calculate and display the total price of all products from each queue.
		*****/
		
		
		/*****
		(d)Display all the types and prices of the products of size ‘M’ and colour “blue”.
		*****/
		
	
	}//close main
}//close class