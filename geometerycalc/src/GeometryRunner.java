// Name: William Schmidt 
// Date: 10/11/2024
// Program Name: Geometry calculator 
// Program Description: finds the area of a circle, the surface area of a cube and the perimeter of a rectangle
import java.util.Scanner;
public class GeometryRunner {
    public static void main(String[] args) throws Exception {
        Geometry calc = new Geometry();
        Scanner keys = new Scanner(System.in);
        System.out.println("Do you want to find the perimeter of a rectangle? The surface area of a cube? Or, the area of a circle?");
        int choice = keys.nextInt();
        if (choice == 1){
        System.out.println("What is the length of the rectangle?");
      double rectlength = keys.nextDouble();
        System.out.println("What is the width of the rectangle?");
        double rectwidth = keys.nextDouble();
        calc.perimeter(rectlength, rectwidth);
        }
        
        


    }
}