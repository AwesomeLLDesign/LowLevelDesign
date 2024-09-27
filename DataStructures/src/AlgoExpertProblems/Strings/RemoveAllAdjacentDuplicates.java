package AlgoExpertProblems.Strings;

public class RemoveAllAdjacentDuplicates {

    public static void main(String[] args) {
        System.out.println(remove("abccbccba"));
    }

    private static String remove(String s) {
        if (s == null || s.length() < 1) return s;

        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length;
        boolean matchFlag = false;
        int changedLength = 0;
        while(true) {
            while (start < end) {
                if (sb.length() == 0) {
                    sb.append(charArray[start]);
                    start++;
                    //TODO acaaabbbcacdddd
                } else {
                    char topCharacter = sb.charAt(sb.length() - 1);
                    if (topCharacter == charArray[start]) {
                        matchFlag = true;
                        start++;
                    } else {
                        if (matchFlag) {
                            sb.deleteCharAt(sb.length() - 1);
                            sb.append(charArray[start]);
                            matchFlag = false;
                            start++;
                        } else {
                            sb.append(charArray[start]);
                            start++;
                        }
                    }
                }
            }
            if (matchFlag) {
                sb.deleteCharAt(sb.length() - 1);
                matchFlag = false;
            }
            if(changedLength != sb.toString().length()){
                changedLength = sb.toString().length();
                start = 0;
                end = changedLength;
            }else{
                break;
            }
            charArray = sb.toString().toCharArray();
            sb = new StringBuilder();
        }
        return sb.toString();
    }
}
