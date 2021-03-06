import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Practice {

    static ArrayList<Integer> stringArray =  new ArrayList<>();
    private static int myMethod(char str[], int n) {

        int bound = n - 1;
        IntStream.range(0, bound)
                .mapToObj(i -> String.format("%s%s", str[i], str[i + 1]))
                .forEachOrdered(subStr -> stringArray.add(Integer.parseInt(subStr)));
        return Collections.max(stringArray);
    }

    public static void main(String args[]) {
        String inputString = System.console().readLine();
        char[] ch = new char[inputString.length()];
        IntStream.range(0, inputString.length())
                .forEachOrdered(i -> ch[i] = inputString.charAt(i));

        System.out.println( myMethod(ch, inputString.length()));
    }

}
