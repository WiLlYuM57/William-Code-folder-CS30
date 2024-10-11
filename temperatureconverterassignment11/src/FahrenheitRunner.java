//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class FahrenheitRunner
{
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		Fahrenheit asd = new Fahrenheit();

		System.out.println("what is the temperature in celsius?");
		double c = keyboard.nextDouble();	
		System.out.println(asd.fahrencalculator(c));

		System.out.println("what is the temperature in Fahrenheit?");
		double f = keyboard.nextDouble();	
		System.out.println(asd.celcalculator(f));
		
	}
}