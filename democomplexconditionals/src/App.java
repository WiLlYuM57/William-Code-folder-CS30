public class App {
    public static void main(String[] args) throws Exception {
        int x = 4;
        int y = 5;
        // if else and else if.
        if (x<0) {
            System.out.println("x is negative");
        }
        else if (x == 0) {
            System.out.println("x is zero");
        }
        else  {
            System.out.println("x is positive");
        }
        // nested if and the and statement.
        if (x>0){
            if (x>y){
                System.out.println("x is positive and greater than" + y);
            }
        }
        if (x>0 && x>y) {
            System.out.println("x is pos+ and greater than " +y);
        }
        if (x<0){
            System.out.println("not a winner");
        }
        else if (x>5) {
            System.out.println("not a winner"); 
        }
        else{
            System.out.println("this is a winning number");
        }
        //equivilant
        if (x< 0|| x>5){
            System.out.println("not a winner");
        }
        else{
            System.out.println("winner");
        }
    }   


}
