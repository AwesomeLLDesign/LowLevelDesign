package AlgoExpertProblems.Strings;

import java.util.*;

public class GenerateDocument {

    private static boolean generateDocument(String characters, String document){
        if (characters == null || document == null){
            return false;
        }
        Map<Character, Integer> charFrequencyInString = new HashMap<>();
        Map<Character, Integer> charFrequencyInDocument = new HashMap<>();

        for(Character ch: characters.toCharArray()){
            if(charFrequencyInString.containsKey(ch)){
                charFrequencyInString.put(ch,(charFrequencyInString.get(ch) + 1));
            }else{
                charFrequencyInString.put(ch,1);
            }
        }

        for(Character ch: document.toCharArray()){
            if(charFrequencyInDocument.containsKey(ch)){
                charFrequencyInDocument.put(ch,(charFrequencyInDocument.get(ch) + 1));
            }else{
                charFrequencyInDocument.put(ch,1);
            }
        }

        for (Map.Entry<Character,Integer> entry: charFrequencyInDocument.entrySet()){
            if (!charFrequencyInString.containsKey(entry.getKey()) || charFrequencyInString.get(entry.getKey()) < entry.getValue()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(generateDocument("abcabc","dbbcc"));
    }
}
