package AlgoExpertProblems.Strings;

public class CaesarCipherEncryptor {

    private static String carsarCypherEncryptor(String str, int key){
        if(str == null || str.length() == 0 || key < 0)
            return " ";

        char[] output = new char[str.length()];
        char[] inputCharcters = str.toCharArray();
        key = key % 26;
        for(int i = 0; i < inputCharcters.length; i++){
            if('z' < inputCharcters[i] + key){
                output[i] = (char) ('a' + ((inputCharcters[i] + key) - ('z'))-1);
            }else{
                output[i] = (char) (inputCharcters[i] +  key);
            }
        }

        return new String(output);
    }

    public static void main(String[] args) {
        System.out.println("Output is : " + carsarCypherEncryptor("abc",52));
    }

}
