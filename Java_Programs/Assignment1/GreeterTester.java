/*
DWAYNE FRASER
HOMEWORK 1.2
 */

package q2;
/**
   Greeter Test Class
*/
public class GreeterTester {

   public static void main(String[] args)
   {

      Greeter GreetObj1 = new Greeter("HELLO");
      Greeter GreetObj2 = new Greeter("WORLD");
    

      String greet1 = GreetObj1.sayHello();
      String greet2 = GreetObj2.sayHello();
  

      System.out.println(greet1 + greet2);
  

      GreetObj1.swapNames(GreetObj2);

      greet1 = GreetObj1.sayHello();
      greet2 = GreetObj2.sayHello();


      System.out.println(greet1 + greet2);

      Greeter GreetObj3 = new Greeter("WORLD");

      Greeter GreetObj4 = GreetObj3.createQualifiedGreeter("BEAUTIFUL");

      String greet3 = GreetObj4.sayHello();
  
      System.out.println(greet3);
   }
}
