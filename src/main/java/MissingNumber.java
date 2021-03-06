import java.util.stream.IntStream;

public class MissingNumber {

    //expected O/P
    //Output: 0-4
    //        7-8
    //        10-89
    //        91-98

    /**
     * Algo - Logic
     *
     * 1. Sort the array {5,6,9,90,99,100,850,900};
     * 2. start from 0 and compare each element with the first number and add the number in other arrayList if not found
     */
    private static int a[] = {9, 6, 900, 850, 5, 90, 100, 99};
    private static int temp;
    private static int resultArr[] = new int[100];
    private static int indexResultArr = 0;
    private static int baseArr[] = IntStream.range(0, 99).toArray();

    public static void main(String args[]) {

        //sorting array in ascending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("neha");
        //finding missing number
        for(int j = 0; j < a.length; j++){
           for(int i=0; i < baseArr.length; i++){
                if(a[j] == baseArr[i]){
                   return;
                }else{
                    resultArr[indexResultArr] = baseArr[i];
                    System.out.println(resultArr[indexResultArr]);
                    indexResultArr++;
                }
            }




        }


    }
}
