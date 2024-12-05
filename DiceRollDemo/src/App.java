import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Random rand = new Random();
        int numRolls; 
        int[] outcomes;
        int current; 
        System.out.println("How many dice do you want to roll?");
        numRolls = keys.nextInt();
        outcomes = new int[numRolls]; //create a position for each 
        for (int roll = 0; roll < numRolls; roll++){
            //rolling "two dice" - notw nextint(x) is a 
            //number from 0 < num < x
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            outcomes[roll] = dice1 + dice2; 
            System.out.println("Roll number" + roll + ": dice1 =" + dice1 + ",dice2 =" +dice2 + ": score = " + outcomes[roll] );
        }
        System.out.println("\n The Game Stats:");
        int total = 0;
        double  average = 0;
        for (int i = 0; i < numRolls; i++){
            total = total + outcomes[i];
        }
        average = (double)total/numRolls; 
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);


    }
}
