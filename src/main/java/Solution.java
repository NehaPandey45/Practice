//import com.sun.tools.javac.util.ArrayUtils;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//
public class Solution {}
//    public static int minimumSwaps(List<Integer> popularity) {
//
//        int[] nums = popularity.stream().mapToInt(i -> i).toArray();
//        int n = array.length - 1;
//        int minSwaps = 0;
//        for (int i = 0; i < n; i++) {
//            if (i < array[i] - 1) {
//                swap(array, i, Math.min(n, array[i] - 1));
//                minSwaps++;
//                i--;
//            }
//        }
//        return minSwaps;
//    }
//
//    private static void swap(int[] array, int i, int j) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
//
//
//}
//
//    static int[] rotate(int[] array, int[] rotate)
//    {
//        int[] result = new int[rotate.length];
//        int index = 0;
//        int large = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > large) {
//                large = array[i];
//                index = i;
//            }
//        }
//        int len = array.length;
//        for (int i = 0; i < rotate.length; i++) {
//            int r = (index - (rotate[i]%len));
//            result[i] = (r>=0) ? r : (len+r);
//        }
//        return result;
//    }
//
//    static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate)
//    {
//        int[] nums = a.stream().mapToInt(i -> i).toArray();
//        int[] r = rotate.stream().mapToInt(i -> i).toArray();
//
//        int res[] = rotate(nums, r);
//
//        for(int i=0; i<res.length; i++)
//        {
//            System.out.println(r[i] + " = "+ res[i]);
//        }
//
//        List<Integer> list = new ArrayList<Integer>();
//        Collections.addAll(list, Arrays.stream(res).boxed().toArray(Integer[]::new));
//        return list;
//
//    }
//
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        int nums[] = {1, 2, 4, 3};
//        int r[] = {0,2};
//
//        int res[] = getMaxElementIndexes(nums, r);
//
//
//    }
//
//}
