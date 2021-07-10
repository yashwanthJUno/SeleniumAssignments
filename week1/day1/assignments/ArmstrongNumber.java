package week1.day1.assignments;



public class ArmstrongNumber {

	

	/*

	 * Goal: To find whether a number is an Armstrong number or not

	 * 

	 * inputs: 153

	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153

	 * 

	 * Shortcuts:

	 * 1) Print : type: syso, followed by: ctrl + space + enter

	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter

	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter

	 *   

	 * What are my learnings from this code?

	 * 1)

	 * 2)

	 * 3) 

	 * 

	 */

	

	public static void main(String[] args) {

		

		// Declare your input

			int originalno = 153;
			int remainder = 0;
            int quotient = 0;
			int new_num=originalno;
            int calculate =0;
	        while (new_num != 0)
	        {
	            remainder = new_num % 10;
	            calculate = calculate+(remainder*remainder*remainder);
	            new_num = new_num/10;
	            System.out.println(remainder+"  "+calculate+"     "+new_num);
	        }

	        if(calculate == originalno) {
	            System.out.println("The given Number is Armstrong Number" + originalno); }
	        else
		{  
			System.out.println(" it's not an Armstrong Number  "+originalno);
		}

	}

			// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)

		
		

			// Assign input into variable original 

		

		

			// Use loop to calculate: use while loop to set condition until the number greater than 0

		

			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

			

			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)

			

			// Within loop: Add calculated with the cube of remainder & assign it to calculated

			
				

			// Check whether calculated and original are same

		

			//When it matches print it as Armstrong number


		



		

		

		

		



	}



}
