import java.util.*;

public class Question1
{
    public static void main(String[] args)
    {
        Queue firstQ = new Queue();
        Queue secondQ = new Queue();
        Queue tempQ=new Queue();
        
        firstQ.enqueue("DOTS");
        firstQ.enqueue("RUNNING");
        firstQ.enqueue("MONKEYS");
        firstQ.enqueue("PRISON");
             
        /***** 1stQ *****/
        Object Q;
        for(int i = 0; i < 4; i++)
        {
            Q = firstQ.dequeue();
            secondQ.enqueue(Q.toString().substring(i, i+3));
        }       
        
        /***** 2ndQ *****/
        int countTot=0;
        Queue tempQ=new Queue();
        Object Q1;
        while(!secondQ.isEmpty())
        {
            Q1 = secondQ.dequeue();
            countTot+=Q1.toString().length();   
            
            
        tempQ.enqueue(Q1);
         }
         System.out.println(" total number of characters in strings stored in secondQ :"+countTot);
         while(!tempQ.isEmpty())
         {
            secondQ.enqueue(tempQ.dequeue());
         }

        
        
        /***** (c) *****/
        while(!secondQ.isEmpty())
        {
            System.out.println(secondQ.dequeue());
        }
    }
}

