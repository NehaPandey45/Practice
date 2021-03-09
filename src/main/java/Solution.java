import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Solution {

    static ArrayList<Integer> stringArray =  new ArrayList<>();
    private static int myMethod(char str[], int n) {

        int bound = n - 1;
        IntStream.range(0, bound)
                .mapToObj(i -> String.format("%s%s", str[i], str[i + 1]))
                .forEachOrdered(subStr -> stringArray.add(Integer.parseInt(subStr)));
        return Collections.max(stringArray);
    }

    public static void main(String args[]) {
        String str = "5055252";
        char[] ch = new char[str.length()];

        IntStream.range(0, str.length())
                .forEachOrdered(i -> ch[i] = str.charAt(i));

        System.out.println( myMethod(ch, str.length()));
    }

}
