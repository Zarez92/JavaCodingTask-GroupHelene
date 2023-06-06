package week3;

public class Khalid_FrequencyOfCharacters {

    public static void frequencyOfCharacters(String n) {

        String result = " ";

        for (int j = 0; j < n.length() - 1; j++) {

            char ch = n.charAt(j);

            int count = 0;
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == ch) {
                    count++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }
            result += ch + "" + count;
        }
        System.out.println(result);


    }

    public static void main(String[] args) {
        frequencyOfCharacters("HHHHJJKKKLLLLL");
    }
}
/*
 3) String - Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */

