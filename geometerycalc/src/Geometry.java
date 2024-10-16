public class Geometry {
    // Perimeter of a rectangle
    public void perimeter(double rectlength, double rectwidth) {
    double perimeter = rectlength*rectwidth;
    System.out.println("the perimeter is " + perimeter);    
    }
    // Surface area of a cube
    public void surfaceArea(double cubelength) {
    double surfacearea = 6*(cubelength*cubelength);
        System.out.println("The surface area is " + surfacearea);
    }
    // Area of a circle
    public void circleArea(double radius) {
        double circleArea = Math.PI*(radius*radius);
        System.out.println("the area of the circle is " + circleArea);
    }
}