/*
DWAYNE FRASER
HOMEWORK 1.3
 */

package q3;

import java.util.*;
import java.io.*;

/**
   Data Analyzer Test Class
*/
class DataAnalyzerTester
{

   public static void main(String args[])
   {
       try
       {

           LinkedList<Integer> numbers_list = new LinkedList<>();
           int number;

           Scanner scan = new Scanner(System.in);
          
           String fileName;
          
           System.out.println("\n Enter file name: ");
           fileName = scan.nextLine();
          
           File file = new File(fileName);

           file.createNewFile();
    
           try (
                
                    FileWriter writer = new FileWriter(file)) 
           {
                    System.out.println("Enter Integer Value: (0 to exit) \n");

                    number = scan.nextInt();

                    
                    do{

                    writer.write(number + " \n ");

                    numbers_list.add(number);

                    number = scan.nextInt();
                    }while(number != 0);
                    
                    DataAnalyzer analyzer = new DataAnalyzer(numbers_list);

                    System.out.println("Min: " + analyzer.min());
                    writer.write(analyzer.min());
                    System.out.println("Max: " + analyzer.max());
                    writer.write(analyzer.max());
                    System.out.println("Avg: " + analyzer.avg());
                    writer.write(analyzer.avg());
                    writer.flush();
                    
                }
                catch(IOException ex)
                  {
                      System.out.println(ex);
                  }
       }
      
       catch(IOException ex)
       {
           System.out.println(ex);
       }
   }
}
