public class RecursiveMethod {


    public static void main(String [] args) throws Exception{
        int i = 10, j = 12;
        for (;;) {
            if (i++ < j--)
                continue;
            else
                break;

        }
    }
}