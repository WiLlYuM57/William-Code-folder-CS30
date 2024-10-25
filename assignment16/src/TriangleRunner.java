//Area of a triangle 
//William Schmidt
//mr fox 
//computer science 30 
import java.util.Scanner;
import java.lang.Math;
public class TriangleRunner {
    public static void main(String[] args) throws Exception {
    Scanner mytri = new Scanner(System.in);
    System.out.println("what is the length of side A of the triangle?");
    double a = mytri.nextInt();
    System.out.println("what is the side length of side B of the triangle?");
    double b = mytri.nextInt();
    System.out.println("what is the side length of side C of the triangle?");
    double c = mytri.nextInt();
    Triangle test = new Triangle(a,b,c);
    double s = test.calcP()/2.0;
    double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.printf("%.2f", A);
    }
}
