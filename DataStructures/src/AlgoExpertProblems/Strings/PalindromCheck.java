package AlgoExpertProblems.Strings;

public class PalindromCheck {

    private boolean palindromeCheck(String str) {

        int length = str.length();
        int start = 0, end = (length - 1);
        boolean checkPalindormFlag = true;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)){
                checkPalindormFlag =false;
                break;
            }
            start++;
            end--;
        }

        return checkPalindormFlag;
    }

    public static void main(String[] args) {
        String str = "abababa";
        PalindromCheck palindromCheck = new PalindromCheck();
        System.out.println("The string is palindorm " + palindromCheck.palindromeCheck(str));
    }
}
