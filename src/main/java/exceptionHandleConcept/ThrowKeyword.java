package exceptionHandleConcept;

public class ThrowKeyword {
	
	/**
	 * 
	 * @param args
	 * 
	 * the purpose of the ThrowKeyword to generate my iwn exception
	 * use case for this lets i have excell data sheet and im using this concept
	 * if my data is not avaialvle or data is null it will immediately throw the exception 
	 * or for example im trying to create generic function to get elements 
	 * and all the time im callimg that particular function
	 * and inside the function i have this method to throw the eception if the element not found in that case i will 
	 * get to know about that 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * note about finally block 
	 * 
	 * FinallyBlock is always used to use with exception hanling 
	 * it doesnt matter exception is coming or not finally block will always be executing 
	 * finally block always executing no matter what 
	 * but there only one case if we write 
	 * // System.exit(1); exit one means shotdown the jvm machine
	 * in this time before this code will execute but after this code wont execute it will shotdown
	 * 
	 * finally block is necessary to use with exception handling 
	 * alone its not working
	 * practical example of finally block is mostly used in data base connection closing concept
	 * 
	 */

	public static void main(String[] args) {

		String data = null;
		if (data == null) {
			try {
				throw new Exception("DATANOTFOUNDEXCEPTION");  // your exception name 
			} catch (Exception e) {
				System.out.println("some exception is coming....");  // your meassage
				e.printStackTrace();    // write this line to get proper info about exception
			}
		}

	}

}