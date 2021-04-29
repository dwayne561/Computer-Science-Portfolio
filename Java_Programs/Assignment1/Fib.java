/*
DWAYNE FRASER
HOMEWORK 1.1
 */

package q1;

public class Fib{

int f0;
int f1;

        
   // constructor
    public Fib(int f0, int f1){
        
        //'THIS' Keyword used for differentiating instance variable and local variable.
        this.f0=f0; 
        this.f1=f1;
    }
   
    public int f(int n){
    /**
    ** computes F(n) using an ***iterative*** algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition.
    ** use instance variables that store F(0) and F(1).
    ** check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.
    */
        int temp1 = f0;
        int temp2;
	int sum = f1;
        
	if (n < 0) {
	    throw new IllegalArgumentException();
	}
	if (n == 0)
	    return f0;
	if (n == 1)
	    return f1;
	
	for (int i=2; i<=n; i++) {
	    temp2 = temp1;
	    temp1 = sum;
	    sum = temp1 + temp2;
	}

	return sum;
   }
   
   // computes F(n) using the ***recursive*** algorithm, where F(n) = F(n-1) + F(n-2) is the recursive definition.
   // use instance variables that store F(0) and F(1).
   // check parameter and throw exception if n < 0. Don't worry about arithmetic overflow.

    public int fRec(int n)
    {
	if (n < 0) {
	    throw new IllegalArgumentException("wrong parameter n=" + n);
	}
	if (n == 0)
	    return f0;
	if (n == 1)
	    return f1;

	return fRec(n-1) + fRec(n-2);
    }
}


