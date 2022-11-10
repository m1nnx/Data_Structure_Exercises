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
        while(!washQ.isEmpty())
        {
            count++;      
        }
        System.out.println("The number of records stored in the queue named washQ is "+count);
                   
        //(b) Calculate the number of cars with "Super Shine" wash.   
        carWash cw;
        while(!washQ.isEmpty())
        {
            cw=(carWash) washQ.dequeue();
            if(cw.getWashSelection().equalsIgnoreCase("Super Shine"))
            {
               count++;
            }
            System.out.println("The number of cars with Super Shine wash is "+count);

            tempQ.enqueue(cw);
        }
        
        while(!tempQ.isEmpty())
            washQ.enqueue(tempQ.dequeue());

       
        //(c) Calculate the total payment collected.    
    
        //(d) Find records of those who chose for "Full Service" from washQ and moved them into another queue named FSQueue.
        
        //(e) Display the number of cars, MPVs and lorries in FSQueue.
        
        //(f) Display the latest contents of washQ.
        
    }
}