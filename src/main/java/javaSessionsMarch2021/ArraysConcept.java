package javaSessionsMarch2021;

public class ArraysConcept {

	public static void main(String[] args) {
 
		//when we talking about array 
		//array size is fixed and can store only similar type of data its static array 
		//non primitive data types
		
		//arrays literals:
		//if u know exact size then use this 
		int num[] = {1,-2,3,4,5,6,220,23,30};
		System.out.println("size of static array " + num.length);
		
		for(int e : num) {
			System.out.println(e);
		}
		
		
		//int array:
		//if you know wxact range of array size then use this 
		//disadvantage of this it takes more memory 
		int i[] = new int[40];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println("li =" + 0);
		int len = i.length;
		System.out.println("length =" + len);
		System.out.println("hi =" + (len-1));

		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException

		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		//to print all the values from array: use for loop
		for(int k = 0; k<i.length; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		
		//for each:
		for(int e : i) {
			System.out.println(e);
		}
		
		//2. double array:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.44;
		System.out.println(d[0]+d[1]);
		
		//3. char array:
		char c[] = new char[3];
		c[0]='a';
		
		//4. String array:
		String name[] = new String[4];
		name[0] = "tom";
		name[1] = "peter";
		name[2] = "naveen";
		name[3] = "lisa";

		for(String e : name) {
			System.out.println(e);
			
				if(e.equals("naveen")) {
					System.out.println("he is the trainer...");
				}
		}
		
		//but here we cannot pass everything as string 
		//because if later on i need to do some arichmetic operation then it will be problem 
		String product[] = new String[100];
		
		//you have to store emp data: string, int, double, char, string
		//to solve this issue we can use Object Array (static):
		
		//this array also is called static array size is fixed 
		//this array is non primitive because here we can see string 
		//and we have object creation 
		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 30;
		ob[2] = 34.55;
		ob[3] = 'm';
		ob[4] = "London";
		
		//iterating with reqular for loop 
		for(int p=0; p<ob.length; p++) {
			System.out.println(ob[p]);
		}
		
		//iterating with for each loop 
		for(Object e : ob) {
			System.out.println(e);
		}
		
		//declaring array with literals way 
		Object emp[] = {"Tom", 30, 23.44};
		System.out.println(emp.length);
		
		for(Object e: emp) {
			System.out.println("employee info " + e);
		}
		
		
		
		

		
	}

}