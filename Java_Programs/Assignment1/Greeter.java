/*
DWAYNE FRASER
HOMEWORK 1.2
 */

package q2;

public class Greeter {
    
// constructor
   public Greeter(String aName)
   {
      name = aName;
   }
   /**
        Greet with a "Hello" message.
        @return a message containing "Hello" and the name of
        the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }

    /**
     * swaps the names of this greeter and another instance
     * @param other greeter object
    */
   public void swapNames(Greeter other)
   {
      String temp;
  
      //Swapping names using temporary variable
      temp = this.name;
      this.name = other.name;
      other.name = temp;
   }
   
    /**
     * returns a new Greeter object with its name being the qualifier string
     * followed by" " and the executing greeter's name
     * @param qualifier object
     * @return new greeter object
    */
   public Greeter createQualifiedGreeter(String qualifier)
   {
       String temp;
    
       temp = qualifier + " " + this.name;
      
       return new Greeter(temp);
   }
   
   private String name;
}

