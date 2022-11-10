import java.util.*;

public class carWashApp
{
    public static void main(String[] args)
    {
        Queue washQ = new Queue();
        Queue tempQ = new Queue();
        
        carWash c;
        c = new carWash("Lorry", "Express Exterior", 10);
        washQ.enqueue(c);
        c = new carWash("Car", "Full Service", 18);
        washQ.enqueue(c);
        c = new carWash("Car", "Express Exterior", 7);
        washQ.enqueue(c);
        c = new carWash("MPV", "Super Shine", 25);
        washQ.enqueue(c);
        c = new carWash("Lorry", "Full Service", 22);
        washQ.enqueue(c);
        c = new carWash("Car", "Super Shine", 20);
        washQ.enqueue(c);
        c = new carWash("Motorcycle", "Express Exterior", 5);
        washQ.enqueue(c);
        c = new carWash("MPV", "Full Service", 20);
        washQ.enqueue(c);
        c = new carWash("Car", "Super Shine", 20);
        washQ.enqueue(c);
        c = new carWash("MPV", "Full Service", 22);
        washQ.enqueue(c);
        
        //(a) Display the number of records stored in the queue named washQ. 
        
        int count=0;
        carWash cw;
        while(!washQ.isEmpty())
        {
            cw=(carWash) washQ.dequeue();
            count++;    
            
            tempQ.enqueue(cw);  
        }
        System.out.println("The number of records stored in the queue named washQ is "+count);
        
        while(!tempQ.isEmpty())
        washQ.enqueue(tempQ.dequeue());

           
        //(b) Calculate the number of cars with "Super Shine" wash.   
        int countSS=0;
        carWash cw1;
        while(!washQ.isEmpty())
        {
            cw1=(carWash) washQ.dequeue();
            if(cw1.getWashSelection().equalsIgnoreCase("Super Shine") && cw1.getCarType().equalsIgnoreCase("car"))
            {
               countSS++;
            }
            
            tempQ.enqueue(cw1);
        }
        System.out.println("The number of cars with Super Shine wash is "+countSS);

        while(!tempQ.isEmpty())
            washQ.enqueue(tempQ.dequeue());

       
        //(c) Calculate the total payment collected.    
        int countPayment=0;
        carWash cw2;
        while(!washQ.isEmpty())
        {
            cw2=(carWash) washQ.dequeue();
            countPayment+=cw2.getAmountCharge();          
            tempQ.enqueue(cw2);
        }
        System.out.println("The total payment collected is "+countPayment);

        while(!tempQ.isEmpty())
            washQ.enqueue(tempQ.dequeue());
        //(d) Find records of those who chose for "Full Service" from washQ and moved them into another queue named FSQueue.
        Queue FSQueue=new Queue();
        carWash cw3;
        while(!washQ.isEmpty())
        {
            cw3=(carWash) washQ.dequeue();
            if(cw3.getWashSelection().equalsIgnoreCase("Full Service"))     
            {
               FSQueue.enqueue(cw3);
            } 
            tempQ.enqueue(cw3);
        }
        while(!tempQ.isEmpty())
            washQ.enqueue(tempQ.dequeue());

        
        //(e) Display the number of cars, MPVs and lorries in FSQueue.
        int countCars=0;
        int countMPVs=0;
        int countLorries=0;
        carWash cw4;
        while(!FSQueue.isEmpty())
        {
            cw4=(carWash) FSQueue.dequeue();
            if(cw4.getCarType().equalsIgnoreCase("car"))     
            {
               countCars++;
            } 
            if(cw4.getCarType().equalsIgnoreCase("MPV"))     
            {
               countMPVs++;
            } 
            if(cw4.getCarType().equalsIgnoreCase("lorry"))     
            {
               countLorries++;
            } 
            tempQ.enqueue(cw4);
        }
        System.out.println("The number of cars in in FSQueue  is "+countCars);
        System.out.println("The number of MPVs in FSQueue is "+countMPVs);
        System.out.println("The number of lorries in FSQueue is "+countLorries);
        while(!tempQ.isEmpty())
            FSQueue.enqueue(tempQ.dequeue());

        //(f) Display the latest contents of washQ.
        carWash cw5;
        while(!washQ.isEmpty())
        {
            cw5=(carWash) washQ.dequeue();
            System.out.println(cw5.toString());   
            
            tempQ.enqueue(cw5);  
        }
        
        while(!tempQ.isEmpty())
        washQ.enqueue(tempQ.dequeue());

        
    }
}