/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
				
		int i = 7;
		String numText = "";

		switch(i) {

		case 1:
			numText = "ONE";break;
		case 2:
			numText = "TWO";break;
		case 3:
			numText = "THREE";break;
		case 4:
			numText = "FOUR";break;
		case 5:
			numText = "FIVE";break;
			// complete the code.
		case 6:
			numText = "SIX";break;
		case 7:
			numText = "SEVEN";break;

		case 8:
		numText = "EIGHT";break;


		default:
			numText = "NUMBER " + i;
		}
		
		System.out.println(numText);

		// complete the code to print text value of 8, 9 and 10
	
	}
	

}
