//William Schmidt 
//computerscience 30 ]
//mr. Fox 
//miles per hour 
import java.util.Scanner;
public class MPHrunner {
    public static void main(String[] args) throws Exception {
       
        Scanner userD = new Scanner(System.in);

       System.out.println("Enter the distance:");
        int distance = userD.nextInt();
       System.out.println("Enter the hours");
        int hours = userD.nextInt();
       System.out.println("Enter the minutes:");
       int minutes = userD.nextInt();

       Milesperhour MPH = new Milesperhour(distance,hours,minutes);
       MPH.calcMPH();

    }
}
