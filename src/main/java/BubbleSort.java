import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void main(String args[]){
       int arr[] = {30,10,20,60,70,88};

        bubbleSort(arr);

       for (int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
       }
    }

    private static void bubbleSort(int[] arr){
        final int n = arr.length;
        int temp = 0;

        for(int i = 0; i< n; i++){
            for(int j=0; j < n-i; j++){

                if(arr[i] < arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
    }
}
