package javaSessionsMarch2021;

public class TestCar {

	public static void main(String[] args) {

		CarFactory c1 = new CarFactory("BMW", 65, "320S Lemo");
		CarFactory c2 = new CarFactory("Audi a4", 60, false);
		CarFactory c3 = new CarFactory("Honda civic", 25, "Black", "ivtec", true,
								15.55, 'Y');
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model);
		System.out.println(c1.isLaunched);
		
		
		System.out.println(c2.isAutomatic);
		
		
	}

}
