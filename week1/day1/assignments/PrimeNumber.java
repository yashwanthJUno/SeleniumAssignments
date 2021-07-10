package week1.day1.assignments;



public class PrimeNumber {

	

	/*

	 * Goal: To find whether a number is a Prime number or not

	 * 

	 * input: 13

	 * output: 13 is a Prime Number

	 * 

	 * Shortcuts:

	 * 1) Print : type: syso, followed by: ctrl + space + enter

	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter

	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter

	 *   

	 * What are my learnings from this code?

	 * 1) boolean condition checked.

	 * 2) Selection statements used inside the iterative statement.

	 * 3) break.

	 * 

	 */

	

	public static void main(String[] args) {



		// Declare an int Input and assign a value 13

		

		// Declare a boolean variable flag as false

		

		// Iterate from 2 to half of the input

		

			// Divide the input with each for loop variable and check the remainder

			

			// Set the flag as true when there is no remainder

				
			// break the iterator


		// Check the flag (Provide a condition)

		

			// Print 'Prime' when the condition matches

			

			// Print 'Not a Prime' when the condition doesn't match 
		 int inPut = 13;
	  boolean to_check = false;
	  int remainder =0;
	  
	  for(int i=2; i<=inPut/2; i++)
	  {
		  remainder = inPut%i;
		  //remainder = 0;
		 //System.out.println(remainder);
		 if(remainder==0)
		 {
			 to_check=true;
		 }
		 else
		 {
			 to_check=false;
			 //System.out.println("inside");
		 }	 
		 break;  
	  }
	  if(to_check==false)
		 {
			 System.out.println(inPut+" is a Prime Number");
		 }
		 else
		 {
			 System.out.println(inPut+" Not a Prime Number");
		 }



   }

}
