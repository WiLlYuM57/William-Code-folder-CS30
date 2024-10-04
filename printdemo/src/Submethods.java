public class Submethods {
    private double ans = 0;

    public void calc(int a, int b) {
    ans = (a*b)/1.79683424;
    }

    public void output() {
        System.out.println(ans);
        System.out.printf("%-8.3f",ans);

        /*
         *  %f - real/decimal number 
         *  %d - integer 
         * %c - character value 
         * %s - string vlaue 
         */

    }
}