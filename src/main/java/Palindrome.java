import java.text.ParseException;

class Palindrome {

    static String maximumPalinUsingKChanges(String str, int k)
    {
        char palin[] = str.toCharArray();
        String ans = "";

        int l = 0;
        int r = str.length() - 1;

        while (l < r) {

            // Replace left and right character by
            // maximum of both
            if (str.charAt(l) != str.charAt(r)) {
                palin[l] = palin[r] = (char)Math.min(
                        str.charAt(l), str.charAt(r));
                k--;
            }
            l++;
            r--;
        }

        l = 0;
        r = str.length() - 1;

        while (l <= r) {

            if (l == r) {
                if (k > 0) {
                    palin[l] = '0';
                }
            }

            if (palin[l] < '0') {

                if (palin[l] == str.charAt(l) && palin[r] == str.charAt(r)) {
                    palin[l] = palin[r] = '0';
                }

                else if (k >= 1 && (palin[l] != str.charAt(l) || palin[r] != str.charAt(r))) {
                    k--;
                    palin[l] = palin[r] = '0';
                }
            }
            l++;
            r--;
        }
        for (int i = 0; i < palin.length; i++)
            ans += palin[i];
        return ans;
    }

    // Driver code to test above methods
    public static void main(String[] args)
            throws ParseException
    {
        String str = "985412";
        int k = 4;
        System.out.println(
                maximumPalinUsingKChanges(str, k));
    }
}
// This code is contributed by 29ajaykumar