import java.util.Vector;
import java.util.ArrayList;
public class Main{
    public static void main(String [] args){
        ArrayList<Integer> List = new ArrayList<>();
        Integer[] Array = new Integer[50000000];
        Vector<Integer> Vector = new Vector<>();
        long time1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
            List.add((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        long time2=System.currentTimeMillis();
        long listTime = time2 - time1;
        System.out.println("It took " + listTime + " milliseconds to put 50,000,000 elements in the array list");

        long vectorTime1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
            Vector.add((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        long vectorTime2=System.currentTimeMillis();
        long vectorTime = vectorTime2 - vectorTime1;
        System.out.println("It took " + vectorTime + " milliseconds to put 50,000,000 elements in the vector");

        long arrayTime1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
        Array[i] = ((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        long arrayTime2=System.currentTimeMillis();
        long arrayTime = arrayTime2 - arrayTime1;
        System.out.println("It took " + arrayTime + " milliseconds to put 50,000,000 elements in the array");


    }
}