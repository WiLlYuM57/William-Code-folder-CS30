import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner (System.in);
        int option = 0;
        System.out.println("please select a number");
        option = inp.nextInt();
        if (option == 7) {
            System.out.println("you selected 7, cool!");
        }
        else if (option == 6){
            System.out.println("you selcted 6, cool!");
        }
        else if (option == 5){
            System.out.println("you selcted 6, cool!");
        }
        else {
            System.out.println("you picked a wierd number");
        }
    }
}