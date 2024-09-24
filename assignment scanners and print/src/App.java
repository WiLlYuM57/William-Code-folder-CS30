//Scanners and print 
//William Schmidt 
//Mr.Fox CS 30
//9/24/2024
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int intOne, intTwo; 
        System.out.print("Enter an number : ");
        intOne = keyboard.nextInt();
        System.out.print("Enter an number : ");
        intTwo = keyboard.nextInt();
        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);
        System.out.println("double one = " + (double) intOne);
        System.out.println("double two = " + (double) intTwo);
        System.out.println("intOne + intTwo = " + (intOne + intTwo));
        System.out.println("doubleone + doubletwo = " + ( (double) intOne +  (double) intTwo));

















    }
}
