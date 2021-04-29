/*
DWAYNE FRASER
HOMEWORK 1.1
 */

package q1;

public class FibTester {
    public static void main(String[] args){

        try {
            // numbers F(0) and F(1) from args[0] and args[1].

            int f0=Integer.parseInt(args[0]);

            int f1=Integer.parseInt(args[1]);

            // n from args[2]:
            int n = Integer.parseInt(args[2]);

            // a Fib object with params F(0) and F(1)
            Fib fibobj = new Fib(f0,f1);
            
            // calculating F(0), ..., F(n) and displaying them using the iterative method f(i)
            System.out.println("iterative below");
	    for (int i=0; i<=n; i++) {
                int fib = fibobj.f(i);
                System.out.println(fib);
	    }

            // calculating F(0), ..., F(n) and displaying them using the recursive method fRec(i)
            System.out.println("recursive below");
	    for (int i=0; i<=n; i++) {
                int fib = fibobj.fRec(i);
                System.out.println(fib);
	    }

        }catch(NumberFormatException e){
            System.out.println("The argument must be an integer.");
            System.exit(1);
        }
        
    };
}
