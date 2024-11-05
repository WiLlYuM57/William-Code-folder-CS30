// cool numbers
// William Schmidt
// 11/4/2024
import static java.lang.System.*;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner koolnum = new Scanner(System.in);
        CoolNumbers kewl = new CoolNumbers();
        System.out.println("pick a number you want to test up too.");
        int stop = koolnum.nextInt();
		System.out.println( CoolNumbers.kewlsd(stop) + " cool numbers between 6 - " + stop);

    
    }
}
