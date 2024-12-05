public class loopstatsrunner {

    
    private int start, stop;

    public void setnums(int beg, int end){
        start = beg;
        stop = end;
    }
    
    public int OddCount(){
        int getoddcount = 0;
        for (int i = start; i <= stop; i++){
            if (i % 2 != 0){
                getoddcount++;
            }
        }
        return getoddcount;
    } 

    public int EvenCount(){
        int getevencount = 0;
        for (int i = start; i <= stop; i++){
            if (i % 2 == 0){
                getevencount++;
            }
        }
        return getevencount;

    }

    public int Total(){
       
        int gettotal = 0;
        for (int i = start; i <= stop; i++){
            gettotal +=i;
        }

        return gettotal;
    }

    public void print(){
        System.out.println("the odd count is " + OddCount());
        System.out.println("the even count is " + EvenCount());
        System.out.println("the total cont is " + Total());


    }
}
