/*
DWAYNE FRASER
HOMEWORK 3.2
 */

package q2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestNVector {
    @Test
    public void testConstructor() {
	double x = 1;
        double y = 2;
        double z = 3;
	
	NVector vec = new NVector(x, y, z);

	assertTrue(vec.get(0) == x && vec.get(1) == y && vec.get(2) == z);
    }

    @Test
    public void testEquals() {
	double x = 1;
        double y = 2;
	
	NVector a = new NVector(x, y);
	NVector b = new NVector(x, y);
	
	assertTrue(a.equals(b));
    }

    @Test
    public void testGet() {
	double x = 1;
        double y = 2;
        double z = 3;
	
	NVector vec = new NVector(x, y, z);

	assertTrue(vec.get(0) == x && vec.get(1) == y && vec.get(2) == z);

    }

    @Test
    public void testSum() {
	double x = 1;
        double y = 2;

	
	NVector a = new NVector(x, y);

	
	NVector vec = a.sum(a);
	
	NVector newVec = new NVector(x+y);
	
	assertTrue(vec.equals(newVec));
    }

    @Test
    public void testSprod() {
	double x = 1;
        double y = 2;
	
	NVector a = new NVector(x, y);
	
	double vec = a.sprod(a);	
	double newVec = x*y;       
	assertTrue(vec == newVec);
    }


    @Test
    public void testToString() {
	double x = 1;
        double y = 2;
	
	NVector a = new NVector(x, y);
        
	String vec = a.toString();
        
	String newVec = Double.toString(x) + Double.toString(y);
        
	assertTrue(vec.equals(newVec));
    }
}

