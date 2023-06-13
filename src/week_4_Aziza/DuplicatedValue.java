package week_4_Aziza;

import java.util.Scanner;

public class DuplicatedValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }
    public static String uniqueChars(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if(!unique.contains(""+ str.charAt(i))){
                unique=unique+str.charAt(i);
            }
        }
        return unique;
    }
}
