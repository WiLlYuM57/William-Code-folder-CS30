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
        kewl.isCoolNumber(stop);
        kewl.kewlsd(stop);
		System.out.println( CoolNumbers.isCoolNumber(250) + " cool numbers between 6 - " + 250);

    
    }
}
