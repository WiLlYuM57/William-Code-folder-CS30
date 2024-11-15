import java.util.Scanner;
public class loopstats {
    public static void main(String[] args) throws Exception {
        Scanner test = new Scanner(System.in);
        System.out.println("pick an integer you want to start from.");
        int beg = test.nextInt();
        System.out.println("pick a second number you want to end with.");
        int end = test.nextInt();
        loopstatsrunner williamiscoolsohotandsexy = new loopstatsrunner();

        williamiscoolsohotandsexy.setnums(beg, end);
        williamiscoolsohotandsexy.print();

    }
}
