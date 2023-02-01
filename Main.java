import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.File;
public class Main{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>(50000000);
        long time1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
            list.add((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        long time2=System.currentTimeMillis();
        long calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to put 50,000,000 elements in the array list");

        Vector<Integer> vector = new Vector<>(50000000);
        time1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
            vector.add((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        time2=System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to put 50,000,000 elements in the vector");

        Integer[] array = new Integer[50000000];
        time1 = System.currentTimeMillis();
        for(int i =0; i<50000000;i++){
        array[i] = ((int)(Math.random() * (Integer.MAX_VALUE + 1)));
        }
        time2=System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to put 50,000,000 elements in the array");

        time1 = System.currentTimeMillis();
        Collections.sort(list);
        time2 = System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to sort the Array List");

        time1 = System.currentTimeMillis();
        Collections.sort(vector);
        time2 = System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to sort the Vector");

        time1 = System.currentTimeMillis();
        Arrays.sort(array);
        time2 = System.currentTimeMillis();
        calcTime = time2 - time1;
        System.out.println("It took " + calcTime + " milliseconds to sort the Array");
    }
}