import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int stop )
            {
                if (stop % 3 == 1 && stop % 4 == 1 && stop % 5 == 1 &&  stop % 6 == 1){
                    return true;
                }
                return false;
                 
            }
            
    public static int kewlsd(int stop){
        int count = 0;

        for ( int i = 6; i < stop; i++){
            if(isCoolNumber(i)==true){
                count++;
            }
        }
        return count;
    }
    
}