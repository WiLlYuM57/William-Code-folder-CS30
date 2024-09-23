import java.util.Scanner;  //imports the scanner class into our program

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        System.out.print("enter an integer: ");
        int num = keys.nextInt();

        System.out.println("you chose the number " + num);
        System.out.print("what is your name? ");
        String name = keys.nextLine();
        System.out.println("You entered: " + name);
        
    }
}
