/*
DWAYNE FRASER
HOMEWORK 1.3
 */

package q3;

import java.util.*;

/**
   Data Analyzer Class
   * 
   * Computes Min, Max, & Avg
*/
public class DataAnalyzer
{
   /**
       Constructor
       * @param numbers
   */
   public DataAnalyzer(LinkedList<Integer> numbers)
   {
       //Storing numbers
       this.numbers = numbers;
   }
  
   /**
       @return Max
   */
   public int max()
   {
       int max = numbers.get(0);

       for(int i=0; i < numbers.size(); i++)
       {
           if( numbers.get(i) > max )
               max = numbers.get(i);
       }

       return max;
   }
   
   /**
       @return Min
   */
   public int min()
   {
       int minNum = numbers.get(0);
      
       for(int i=0; i < numbers.size(); i++)
       {
           if( numbers.get(i) < minNum )
               minNum = numbers.get(i);
       }

       return minNum;
   }

   /**
       @return Avg
   */
   public int avg()
   {
       int sum = 0;
       int avg;

       for(int i=0; i < numbers.size(); i++)
       {
           sum += numbers.get(i);
       }
      
       avg = sum / numbers.size();

       return avg;
   }
   
   private final LinkedList<Integer> numbers;
}
