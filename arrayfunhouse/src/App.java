import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
     // Array one 
    int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
    // Print the array for the user to view
		System.out.println(Arrays.toString(one));

		// Sum the values of positions listed (e.g. array[3] to array[6])
		System.out.println("sum of spots 3-6  =  " + getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + getSum(one,2,9));

		// Count the number of occurances of the number in the array
		System.out.println("# of 4s  =  " + getCount(one,4));
		System.out.println("# of 9s  =  " + getCount(one,9));










     //Array two 
    int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
    System.out.println("this is the second array" + Arrays.toString(two));

}
////////////////////Methods/functions//////////////////////////////////////////////
//getSum() will return the sum of the numbers from start to stop, not including stop
public static int getSum(int[] numArray, int start, int stop) {
    int counter = 0;
    for (int i = start; i <= stop; i++){
    counter = counter + numArray[i]; 
    }
    return counter; 
}


//getCount() will return number of times val is present
public static int getCount(int[] numArray, int val){
    int counter = 0;
    for (int i = 0; i <= numArray.length-1; i++){
        if(numArray[i] == val){
            counter++;
        }
    }
    return counter; 
}

//Remove val will replace the instance of particular numbers.
//Returns an entire array
// public static int[] removeVal(int[] numArray, int val)
// {
//     int counter = 0;
//     for(int i = counter;  i <= numArray.length; i++){
//         if( val = int[i] ){

//         }

//     }
//     return null;
// }

}