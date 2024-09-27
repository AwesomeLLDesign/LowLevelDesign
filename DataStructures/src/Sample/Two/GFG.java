package Sample.Two;

import java.io.*;

class GFG {

    public static String findMinNumberPattern(String str)
    {
        String ans = ""; // Minimum number following pattern

        int i = 0;
        int cur = 1; // cur val following pattern
        int dCount = 0; // Count of char 'D'
        while (i < str.length()) {

            char ch = str.charAt(i);

            // If 1st ch == 'I', incr and add to ans
            if (i == 0 && ch == 'I') {
                ans += cur;
                cur++;
            }

            // If cur char == 'D',
            // incr dCount as well, since we always
            // start counting for dCount from i+1
            if (ch == 'D') {
                dCount++;
            }

            int j = i + 1; // Count 'D' from i+1 index
            while (j < str.length()
                    && str.charAt(j) == 'D') {
                dCount++;
                j++;
            }

            int k = dCount;  // Store dCount
            while (dCount >= 0) {
                ans += (cur + dCount);
                dCount--;
            }

            cur += (k + 1); // Manages next cur val
            dCount = 0;
            i = j;
        }

        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println(findMinNumberPattern("DID"));
//        System.out.println(findMinNumberPattern("DIDIII"));
//        System.out.println(findMinNumberPattern("DDDIIDI"));
//        System.out.println(findMinNumberPattern("IDIDIID"));
//        System.out.println(findMinNumberPattern("DIIDIDD"));
//        System.out.println(findMinNumberPattern("IIDIDDD"));
    }
}

