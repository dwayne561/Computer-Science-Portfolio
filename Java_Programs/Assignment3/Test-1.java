/*
DWAYNE FRASER
HOMEWORK 3.2
 */

package q2;

public class Test {
    public static void main(String[] args) {
        
	assert new NVector(1, 2, 3, 4).equals(new NVector(1, 2, 3, 4)) : "failed";
	
	NVector vec = new NVector(1);
	NVector vec2 = vec.set(0, 1);

	NVector vec3 = new NVector(2, 3, 4);
	assert vec3.equals(vec) : "test 1 failed";



	NVector vecSum = vec.sum(vec2);

	NVector sumVec = new NVector(7, 8, 9);

	assert sumVec.equals(vecSum) : "sum() failed";

        double prod = vec.sprod(vec2);
	assert prod == 7 : "sprod() failed";
	
	System.out.println("sum=" + vecSum);
	System.out.println("sprod=" + prod);
    }
}
