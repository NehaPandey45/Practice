import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;

public class Socks {

    private static int socksCounter(int[] arr)
    {
        int count = 0;
        int counter = 0;

        for(int i =0; i < arr.length; i++ ){
            count = 1;

            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            }

            if(count % 2 == 0){
                counter ++;
            }
        }

        return counter ++;
    }

    public static void main(String args[]){
       int[] socks = new int[]{10,20,10,20,30,10,20,30,20};

        final int i = socksCounter(socks);
        System.out.println("Total number of socks found are: "+i);

    }




}
