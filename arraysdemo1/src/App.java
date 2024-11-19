public class App {
    public static void main(String[] args) throws Exception {
        //declrare the array
        //int[] scores = null;
        //String[] names = null;
        //create or Initalize the array.
        //scores = new int[10];
        //names = new String[10];
        //assign values of array.
         //list of data(solution set)
         String[] names = {"Wolf","sutter","cook","fox","golden","x","v","b","k","d"};
         int[]scores ={9000,7001,1337,2048,4096};
        //individual positions 
        names[0] = "wolf";
        scores[0] = 9000;
        //array length property 
        System.out.println("Socres length is " + names.length);
        System.out.println(scores[5]);
        //output in reverse order
        for (int i = 0; i < names.length; i++){
            System.out.println(i +") "+ names[i];
            
        }
    }
}
