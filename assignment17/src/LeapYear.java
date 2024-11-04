
import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	public boolean isLeapYear( double year ){
		if ((year % 4 == 0 && year % 100 != 0 )|| year % 400 ==0 ){
			return true;
		}
		else{
			return false;
		}
	}
	public void check(double year){
		if (isLeapYear(year)){
			System.out.println("this is a leap year!");
		}
		else{
			System.out.println("This is not a leap year!");
		}
	}
}

