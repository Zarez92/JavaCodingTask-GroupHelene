package zarko_java_tasks.week_4;

public class Zarko_FreqOfCharacters {

    /**
     ➡️ String -- Frequency of Characters

     Write a return method that can find the frequency of characters
     Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String freqOfCharacters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int freq = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    freq++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += freq;

        }
        System.out.println(result);
        return result;


    }


}





