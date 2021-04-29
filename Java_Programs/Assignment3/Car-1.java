/*
DWAYNE FRASER
HOMEWORK 3.3
 */

package q3;
import java.util.*;
import java.util.Date;

public class Car {
/**
   Constructor
   @param make 
   @param model 
   @param date
*/
    public Car(String make, String model, Date date) {

	this.make = make;
	this.model = model;
	this.date = date;
    }
    
    /**
       @return car make
     */
    public String make() {
	return this.make;
    }

    /**
       @return car model
     */
    public String model() {
	return this.model;
    }

    /**

       @return build date
     */
    public Date date() {
	return (Date)date.clone();
    }

    /**
       @return string from object
     */
    @Override
    public String toString() {
        
	StringBuilder sb = new StringBuilder();

	sb.append(make());

	sb.append(model());

	sb.append(date().toString());
        
	return sb.toString();
    }

    /**
       @return new comparator object
    */
    public static Comparator<Car> getCompByMakeModel() {
        
	return (Car c1, Car c2) -> {
            if (c1.make().equals(c2.make())) {
                return c1.model().compareTo(c2.model());
            }
            return c1.make().compareTo(c2.make());
        }; 
    };


    
    /**
     * @return 
    */
    public static Comparator<Car> getCompByDate() {
	return (Car c1, Car c2) -> c1.date().compareTo(c2.date()); 
    }
    

    private final String make;
    private final String model;
    private final Date date;
    
        public static void main(String[] args) {

	ArrayList<Car> cars = new ArrayList<>();

	cars.add(new Car("Ford", "Focus", new Date()));
	cars.add(new Car("Chevy", "Colorado", new Date()));
	cars.add(new Car("Toyota", "Camry", new Date()));



	Collections.sort(cars, Car.getCompByMakeModel());

        cars.forEach(x -> {
            System.out.println(x);
        });

	Collections.sort(cars, Car.getCompByDate());

        cars.forEach(x -> {
            System.out.println(x);
        });
    }
}
