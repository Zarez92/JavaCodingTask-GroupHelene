package zarko_java_tasks.week_4;

import java.util.*;

public class SameLetters {

    /**
     ➡️ String -- Same letters
     Write a return method that check if a string is build out of the same letters as another string.

     Ex: same("abc", "cab"); -> true
     same("abc", "abb"); -> false:
     */
    public static boolean sameLetters(String str1, String str2) {

        char[] lettersFrom_str1 = str1.toCharArray();
        char[] lettersFrom_str2 = str2.toCharArray();

        Arrays.sort(lettersFrom_str1);
        Arrays.sort(lettersFrom_str2);

       return Arrays.equals(lettersFrom_str1, lettersFrom_str2);

    }


}
