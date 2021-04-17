package OOP_Interface;

public interface IndianMedical {

	public void oncologyServices();

	public void cardioServices();

	public void pediaServices();

	public void emergencyServices();

	/**
	 * interface concept
	 * 
	 * in Java class can implement multiple interface but class
	 * can extends only one parent class 
	 * 
	 * This diamond problem in inheritance.
	 * Diamond problem solved in interface
	 * single class can extends only one parent class but can
	 * implement multiple interface 
	 * class to class extends keyword
	 * class to interface implements keyword
	 * interface to interface extends keywords 
	 * object creation for
	 * interface is strictly not allowed in java in interface method we can create
	 * but no body interface only for declaration of rules and regulation with
	 * abstarct methods
	 * 
	 * abstarct method means only method declarartion no body at
	 * all just only mehtod prototype while creating interaface method we can have
	 * abstract keyword just for showcase but its not necessary its absract by
	 * default 
	 * 
	 * in interface we can create private method it will throw compile time
	 * error that will ask to have body locally we can have private method inside
	 * interface but as abstract we cannot have private method abstract method has
	 * to be public
	 * 
	 * once we implemented any interface it will throw an error and asking
	 * to add unimplemented methods 
	 * 
	 * businness logic should be part of the
	 * implmeneted class not part of the interface
	 * 
	 * if there are same method in multiple interface at time of implementing
	 * multiple interface same method will override only once not many times 
	 * 
	 * along with implemented methods we can have our own separate methods as well
	 * 
	 * we cannot create object of interface it will throw an error that cannot
	 * instantiate
	 * 
	 * lets say our class implementing multiple interafaces and at the test class we
	 * are creating our actual class object and with object reference name we can
	 * access all the interface rules and regulations methods
	 * 
	 * but at time we can do  top/up casting ---->> creating child class object by
	 * refering interafce ref name at that time we can access only those methods
	 * which is coming from specific interface not all the interface methods and as
	 * well as separate methods this concept calls in java --->>> type reference
	 * signature checking
	 * 
	 * but down casting in inetarface is not allowed not even compile time why
	 * beacuse object creation for interface strictly not allowed
	 * 
	 * if one interface extending inheriting any another interface at time of
	 * implementing that specific interface along with our implementing interface we
	 * have to accept all the rules and regulation from extending interface as well
	 * 
	 * if particular class have parent class, inherting concept and as well as interface implementation concept then 
	 * always first using extend keyword for parent class then implementing interaface
	 * 
	 * interface cannot be a child of any other class
	 * 
	 * after JDK 1.8 FEW CHANGES HERE THEY ARE --->>> 1. we can have static method
	 * but with the body without body static method is not allowed the reason behind
	 * that if the methiod static specially in interface then we cannot override
	 * that it means we cannot apply any rules and regulation which is defined
	 * inside interface if our methods are static
	 * 
	 * and after having static method inside interface then to call that method
	 * inside another class we can use interface name and we can access it why we
	 * can have method with body and static in interface because interface is not
	 * participiating of object creation and its class responsibility to apply rules
	 * and regulation and have methods to do operation on top of interface
	 * 
	 * we can have same static method which is defined in interface in our class as
	 * well this is the method hiding concept but if we write @override on top of
	 * the static method in our class it will throw an error its not allowed
	 * 
	 * 2. we can have method with the body with default modifier its allowed after
	 * jdk 1.8 we can override that method in our class but not with default
	 * identifier we can use public access modifier with @override keyword
	 * 
	 * 
	 * IN interface we can have interface variables and they are static and final by default
	 * we can even declare them as static and final 
	 * but anyway they are by default static and final 
	 * to access them in our actual class we have to use interface name 
	 * and just because they by default final we cannot change the given value in our actual class 
	 * 
	 * In interface while method creation we can have some parameters as well inside pharentesis 
	 * same thing we have to apply in our implemented class as well 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
