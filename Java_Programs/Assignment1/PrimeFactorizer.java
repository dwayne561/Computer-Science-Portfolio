/*
DWAYNE FRASER
HOMEWORK 1.5
 */

package q5;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizer {
    


    //Constructor
    public PrimeFactorizer(int n){
        this.n = n;

        factors = new ArrayList<>();
        exponents = new ArrayList<>();
    }

    public int getN(){
        return this.n;
    }

    public void compute(){

        if(!factors.isEmpty()){
            return;
        }
        int x = n;
        int c = 0;

        while (x%2==0){
            x/=2;
            c++;
        }
        if(c!=0){
            factors.add(2);
            exponents.add(c);
        }

        for(int i=3;i<=Math.sqrt(n);i+=2){
            c = 0;

            while (x%i==0){
                x/=i;
                c++;
            }

            if(c>0){
                factors.add(i);
                exponents.add(c);
            }
        }
        if(x!=1){
            factors.add(x);
            exponents.add(1);
        }
    }
    
        public void getFactorsAndExponents(int n, ArrayList<Integer> primes, ArrayList<Integer> exponents){

        primes.clear();
        primes.addAll(factors);
        exponents.clear();
        exponents.addAll(this.exponents);
    }

    @Override
    public String toString(){

        String ans = "";
        for(int i=0;i<factors.size();i++){
            ans = ans+factors.get(i)+"^"+exponents.get(i)+"*";
        }
        return ans.substring(0,ans.length()-1);
    }
    
    private final int n;
    private final List<Integer> factors;
    private final List<Integer> exponents;

}
