package OOP_Inheritance;

import java.util.Arrays;

public class TestCar {

	public static void main(String[] args) {

		Audi a = new Audi();
		a.start();// Overriden -- > is overrided in child class same method is existing in parent
					// clss
		a.stop();// Inherited --> is inherited directly from parent class because child clss
					// extending parent clss
		a.refuel();// Inherited
		a.autoParking();// Individual --> this is available only in child class separete method
		a.engine();
		Audi.steering();
		System.out.println(a.max_speed);

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.steering();

		// child class object can be referred by parent class ref variable:
		// Top/Up Casting
		Car c1 = new Audi();
		c1.start();
		c1.stop();
		c1.refuel();

		// child class object can be referred by grand parent class ref variable:
		Vehicle v1 = new Audi();

		// down casting: parent class object can be referred by child class ref
		// variable:
		// Audi a1 = (Audi)new Car();
		// ClassCastException at runtime

		// Audi a2 = (Audi) new Vehicle();

	}

}
