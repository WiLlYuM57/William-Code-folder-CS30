//(c) A+ Computer Science
//www.apluscompsci.com

//Name - William Schmidt 
//Date - 10/8/2024
//Class - Computer science 30
//Lab  - Mr. Foxes room.
import java.util.Scanner; 
public class App
{
	public static void main( String[] args ){
        Scanner x = new Scanner(System.in);
        System.out.println("pick a number.");
        int num1 = x.nextInt();

        System.out.println("Pick another number.");
        int num2 = x.nextInt();

		runner test = new runner();				
		test.setNums(num1,num2);
		test.sum( );
		test.print();
		
		
				
	}
}