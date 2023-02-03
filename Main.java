import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
public class Main{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
            list.add((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        long time2=System.currentTimeMillis();
        long calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to put 50,000,000 elements in the array list");
        time1 = System.currentTimeMillis();
        Collections.sort(list);
        time2=System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " ms to sort the Array List;");
        list.clear();

        Vector<Integer> vector = new Vector<>();
        time1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
            vector.add((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        time2=System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to put 50,000,000 elements in the vector");
        time1 = System.currentTimeMillis();
        Collections.sort(vector);
        time2 = System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to sort the Vector");
        vector.clear();

        Integer[] array = new Integer[50000000];
        time1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
            array[i] = ((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        time2=System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to put 50,000,000 elements in the array");
        time1 = System.currentTimeMillis();
        Arrays.sort(array);
        time2 = System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to sort the Array");
    }
}