package sef.module3.sample;

public class MethodSample {

	public void greet(){
		System.out.println("Hello!");
	}
	public static void myNumbers(int i)
	{

		String numText = "";
		switch (i)
		{
			case 1:
				numText = "ONE";
				break;
			case 2:
				numText = "TWO";
				break;
			case 3:
				numText = "THREE";
				break;
			case 4:
				numText = "FOUR";
				break;
			case 5:
				numText = "FIVE";
				break;
			case 6:
				numText = "SIX";
				break;
			case 7:
				numText = "SEVEN";
				break;
			case 8:
				numText = "EIGHT";
				break;
			case 9:
				numText = "NINE";
				break;
			case 10:
				numText = "TEN";
				break;
			default:
				numText = "NUMBER " + i;
		}
		System.out.println(numText);
	}
	public static void greet(String name){
		System.out.println("Hello " + name + "!");
	}
	
	public int sum(int x, int y){
		return x + y;
	}
	
	public static void main(String arg[]){
		MethodSample.myNumbers(8);
		MethodSample.myNumbers(9);
		MethodSample.myNumbers(10);

		MethodSample sample = new MethodSample();
		
		MethodSample.greet("Java Student");
		greet("Java Teacher");
		sample.greet();
		System.out.println("The sum of 1 and 2 is " + sample.sum(1, 2));
		
	}
}
