/*
DWAYNE FRASER
HOMEWORK 2.4
 */

package q4;

public class CashRegister {

    public CashRegister(){
        
    }
    
    /**
       displays UPC
    */
    public void displayUPC(){
        Cashier myUpcObj = new Cashier(); 
        UPC = myUpcObj.getupc();
        System.out.println("UPC is: " + UPC);
    }
    /**
       displays Product Name
    */
    public void displayProductName(String productname){
        Product_Name = productname;
        System.out.println("Product Name is: " + Product_Name);
    }
    /**
       displays Unit Price
    */
    public void displayUnitPrice(String unitprice){
        Unit_Price = unitprice;
        System.out.println("Unit Price is: " + Unit_Price);
    }
    /**
       displays Total
    */
    public void displayTotal(String total){
        Total = total;
        System.out.println("Total is: " + Total);
    }
    
    public void displayReceipt(){
        System.out.println("Product Name is: " + Product_Name);
        System.out.println("UPC is: " + UPC);
        System.out.println("Unit Price is: " + Unit_Price);
        System.out.println("Total is: " + Total);
    }
    
    private String UPC;
    private String Product_Name;
    private String Unit_Price;
    private String Total;
}
