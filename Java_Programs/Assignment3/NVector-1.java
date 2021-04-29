/*
DWAYNE FRASER
HOMEWORK 3.2
 */

package q2;

public class NVector {
    
    /**
    * constructor, takes dimension n and sets all elements to 0: NVector(int n)
     * @param n
    */
    public NVector(int n) {
	vector = new double[n];
    }

    /**
    * constructor, takes another NVector and copies all data from "other": NVector(NVector other)
     * @param other
    */
    public NVector(NVector other) {
	vector = (double[])other.vector.clone(); 
    }


    /**
    * VARARG constructor
     * @param a
    */
    public NVector(double... a) {
	vector = (double[])a.clone(); 
    }

    /**
       @return vector's size.
    */
    public int length() {
	return vector.length;
    }

    /**
    * returns element with index i
     * @param i
     * @return 
    */
    public double get(int i) {
        return vector[i];
    }

    /**
    * Compares two NVector Objects
     * @param o
     */
    @Override
    public boolean equals(Object o) {

	return this == o;
    }

    /**
    * a method that returns a new copy of an NVector with just one element changed
     * @param i
     * @param x
     * @return 
    */
    public NVector set(int i, double x) {
        
        NVector vec = new NVector(this);
        
	vec.vector[i] = x;
        
	return vec;
    }
    
    /**
    * add, returns a new NVector with the sum of this vector and the other
     * @param other
     * @return 
    */
    public NVector sum(NVector other) {
        
	NVector vec = new NVector(this.length());
        
	for (int i=0; i<length(); i++) {
	    vec.vector[i] = this.get(i) + other.get(i);
	}
	return vec;
    }
    
    /**
    returns a double with the scalar product of this vector and another NVector
     * @param other
     * @return 
    */
    public double sprod(NVector other) {
        double sprod = 0;
        
	for (int i=0; i<length(); i++) {
	    sprod += this.get(i) * other.get(i);
	}
        
	return sprod;
    }
    

    /**
    return a string representation
    */
    @Override
    public String toString() {
	StringBuilder str = new StringBuilder();

	for (int i=0; i<this.length(); i++) {
	    str.append(this.vector[i]);
	}

	return str.toString();
    }



    private final double[] vector;
};
