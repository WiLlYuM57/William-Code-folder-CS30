public class App {
    public static void main(String[] args) throws Exception {
        //counting loop
        // int num = 3;
        // while (num>0) {
        //     System.out.println(num);
        //     //num = num -1; num -1; equivilant
        //     num--;
        // }
        // //game loop or program loop 
        // boolean game = true; //trigger variable 
        // while (game) {
        //     //program code or game code or calculations 
        //     System.out.println("Hello Universe");

        //     //kill switch, play again method
        //     System.out.println("Do you want to play again?");
        //     String userinput = "no"; //getting use response 

        //     if (userinput.equals("no") ) {
        //         game = false; //trigger game to end 

            
        

        //standard for loop in java 
        //three conditions
        //for(where we start; where we end; step size)
        for(int i = 10; i>0; i--){
            System.out.println("the number is " + i);
        }
        //equivilant while 
        int x = 10;
        while (x>0){
            System.out.println("the number is " + x);
            x--;
        }

    }
}

