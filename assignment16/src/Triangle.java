
public class Triangle
{
	//instance variables
   private double sideA, sideB, sideC;
   public Triangle(double a, double b, double c)
   {
      sideA=a;
   	sideB=b;
   	sideC=c;

   }
   public double calcP(){
      double perimeter = sideA+sideB+sideC ;
      return perimeter;
   }

   public void print()
   {
   	System.out.println(sideA + sideB + sideC);
   }
}