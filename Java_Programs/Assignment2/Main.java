/*
DWAYNE FRASER
HOMEWORK 2.4
 */

package q4;

public class Main {
    
    public static void main(String args[]){
        CashRegister myRegObj = new CashRegister();
        myRegObj.displayUPC();
        myRegObj.displayProductName("Soup");
        myRegObj.displayUnitPrice("$2.00");
        myRegObj.displayTotal("$2.50");
        myRegObj.displayReceipt();
        
    }
}
