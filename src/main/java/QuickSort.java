public class QuickSort {

    private static int arr[] = {5, 9, 4, 6, 5, 3};

    public static void main(String args[]) {


        // int pivot = arr[];
    }

    private static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {

        }
    }

    private static void partition(int arr[], int begin, int end) {
        int pivot = arr[end]; //3

        int i = begin - 1; //0

        for (int j = begin; j < end; j++) { // 9,4,6,5
            if (arr[j] <= pivot) {
                i++;

            }
        }
    }

}
