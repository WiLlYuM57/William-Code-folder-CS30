
public class Triangle
{
	//instance variables
   private int sideA, sideB, sideC;
   public Triangle()
   {
      setSides(0,0,0);
   }

   public Triangle(int a, int b, int c)
   {
      

   }

   public void setSides(int a, int b, int c)
   {
   	sideA=a;
   	sideB=b;
   	sideC=c;
   }

   public void print()
   {
   	System.out.println(sideA + sideB + sideC);
   }
}