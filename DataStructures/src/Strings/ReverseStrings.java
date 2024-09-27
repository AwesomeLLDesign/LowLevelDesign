package Strings;

public class ReverseStrings {

    public static void main(String... args) {
        String name = "lalitSharma";
        String even = "even";
        String anaGram = "adda";
        System.out.println("the reverse for lalitSharma is : " + reverseString(name));
        System.out.println("the reverse for even is : " + reverseString(even));
        System.out.println("the reverse for adda is : " + reverseString(anaGram));
        System.out.println("the reverse for emptyString is : " + reverseString(""));

    }

    public static StringBuffer reverseString(String input) {
        int size = input.length();
        char[] arr = input.toCharArray();
        StringBuffer output = new StringBuffer();
        if(size == 0){
            return output;
        }
        int i = 0, j = size - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(char character : arr){
            output.append(character);
        }
        return output;
    }
}
