import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i <= 10; i++){
        int randomNum1 = (int)(Math.random() * 101); 
        int randomNum2 = (int)(Math.random() * 101); 
        System.out.println("Here are two random numbers: " + randomNum1 +" and " + randomNum2);
        if(randomNum1 > randomNum2){
            System.out.println("The biggest is " + randomNum1);
            System.out.println("The smallest is " + randomNum2);
        }
        if(randomNum2 > randomNum1){
            System.out.println("The biggest is " + randomNum2);
            System.out.println("The smallest is " + randomNum1);
        }
    }


    }
}
