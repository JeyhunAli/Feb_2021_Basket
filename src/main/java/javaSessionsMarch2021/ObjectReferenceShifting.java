package javaSessionsMarch2021;

public class ObjectReferenceShifting {

	String name;
	int age;
	char gender;
	
	// here point is single object can be refer to multiple references 
	// object references can be assign from one reference to another 
	// here in this below code 3 object referencing from one to another 
	//but one of them 1st one nobody refering to that object 
	//at the end it becomes useles and will destroy by java garbage collector
	// garbage collector will destroy those object which have no reference or having null reference 
	//we can create object without any reference name but its not recomennded 
	//and later on its available for garbage collector 
	
	public static void main(String[] args) {
		
		ObjectReferenceShifting shifting1 = new ObjectReferenceShifting();
		shifting1.name = "Jeyhun";    //year of typing 2021
		shifting1.age = 33;
		shifting1.gender = 'm';
		
		
		ObjectReferenceShifting shifting2 = new ObjectReferenceShifting();
		shifting2.name = "Adam";    
		shifting2.age = 15;
		shifting2.gender = 'm';
		
		ObjectReferenceShifting shifting3 = new ObjectReferenceShifting();
		shifting3.name = "Anna";    
		shifting3.age = 33;
		shifting3.gender = 'f';
		
		//object without any reference 
		new ObjectReferenceShifting().name = "Ali";
		new ObjectReferenceShifting().age = 28;
		new ObjectReferenceShifting().gender = 'f';
		
		ObjectReferenceShifting shifting4 = new ObjectReferenceShifting();
		shifting4.name = "Tom";
		System.out.println(shifting4.name);
		shifting4 = null;
		//System.out.println(shifting4.name); // NPE  null pointer exception
		
		
		
		System.out.println(shifting1.name + " " +shifting1.age + " " +shifting1.gender);
		System.out.println(shifting2.name + " " +shifting2.age + " " +shifting2.gender);
		System.out.println(shifting3.name + " " +shifting3.age + " " +shifting3.gender);
		
		System.out.println("-----------");
		shifting1 = shifting2;

		System.out.println(shifting1.name + " " +shifting1.age + " " +shifting1.gender);
		System.out.println(shifting2.name + " " +shifting2.age + " " +shifting2.gender);
		System.out.println(shifting3.name + " " +shifting3.age + " " +shifting3.gender);
		
		System.out.println("-----------");
		shifting2 = shifting3;
		
		System.out.println(shifting1.name + " " +shifting1.age + " " +shifting1.gender);
		System.out.println(shifting2.name + " " +shifting2.age + " " +shifting2.gender);
		System.out.println(shifting3.name + " " +shifting3.age + " " +shifting3.gender);
	}

}
