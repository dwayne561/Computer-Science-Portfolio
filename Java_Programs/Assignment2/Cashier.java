/*
DWAYNE FRASER
HOMEWORK 2.4
 */

package q4;

import java.util.Scanner;

public class Cashier {
    
    public Cashier(){
        
    }
    
    public String getupc(){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter UPC");

        UPC = myObj.nextLine();  // Read user input        
        return UPC;

    }
    
    private String UPC;
}
