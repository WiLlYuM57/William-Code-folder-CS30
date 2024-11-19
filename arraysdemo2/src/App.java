import java.util.Scanner;
public class App {

    private static Scanner inp = new Scanner(System.in);
    private static int[] nums = null; //Declare the array. 

    public void main(String[] args) throws Exception { 
        System.out.println("How many numkbers would you like to input?");
        int SIZE = inp.nextInt();
        nums = new int[SIZE];
        for (int i = 0; i < nums.length; i++){
            System.out.println("please enter an integer:");
            nums[i] = inp.nextInt();
        }
       printArr();
       //double the array elements.
       for(int i = 0; i < nums.length; i++){
        nums[i] = nums[i] * 2; 
       }
       printArr();
    }
    private static void printArr(){
        System.out.println("Your lisdt of numbers is ");
         for (int i = 0; i < nums.length-1; i++){
        System.out.print(nums[i] + ", "); 
        //output the last value WITH  a new line.
        System.out.println(nums[nums.length-1] +".");
         }
    }
}
