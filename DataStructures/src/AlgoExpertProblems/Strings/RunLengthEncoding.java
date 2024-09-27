package AlgoExpertProblems.Strings;

public class RunLengthEncoding {

    private static String runLengthEncoding(String string) {

        if (string == null || string.length() == 0)
            return "";
        String outputString = "";
        char[] inputCharSequence = string.toCharArray();
        char[] newArray = new char[string.length() + 1];
        int curr = -1, prev = -1;
        int count = 0, index = 0;
        int i = 0;
        for (; i < inputCharSequence.length; i++) {

            newArray[i] = inputCharSequence[i];
        }
        newArray[i] = '=';
        do {
            curr++;
            if (prev != -1) {
                if (newArray[curr] == newArray[prev]) {
                    if (count == 9) {
                        outputString += (char) (count + '0');
                        outputString += newArray[prev];
                        count = 0;
                    }
                } else {
                    outputString += (char) (count + '0');
                    outputString += newArray[prev];
                    count = 0;
                }
            }
            prev = curr;
            count++;
            index++;
        } while (index < newArray.length);

        return outputString;
    }

    public static void main(String[] args) {
        System.out.println("The output of the character sequence is : " + runLengthEncoding("        "));
    }
}
