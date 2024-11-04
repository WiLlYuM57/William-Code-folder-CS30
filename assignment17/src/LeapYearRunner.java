//Name -William Schmidt 
//Date - 10/30/2024
//Lab  - cs 30
import static java.lang.System.*; 
import java.util.Scanner;
public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("what year do you want to test?");	
		double year = keyboard.nextInt();
		
		LeapYear test = new LeapYear();
		test.isLeapYear(year);
		test.check(year);
	}	
}