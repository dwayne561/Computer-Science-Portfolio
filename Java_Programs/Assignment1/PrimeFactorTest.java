/*
DWAYNE FRASER
HOMEWORK 1.5
 */

package q5;
/**
   Prime Factor Test Class
*/
public class PrimeFactorTest {
    
        public static void main(String[] args) {
            
        PrimeFactorizer primeFactorizerObj = new PrimeFactorizer(16);
        
        primeFactorizerObj.compute();
        
        System.out.println("The primes of 16 is: " + primeFactorizerObj);
        
        PrimeFactorizer primeFactorizerObj2 = new PrimeFactorizer(81);
        
        primeFactorizerObj2.compute();
        
        System.out.println("The primes of 81 is: " + primeFactorizerObj2);
    }
}
