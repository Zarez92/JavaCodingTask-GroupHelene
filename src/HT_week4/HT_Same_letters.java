package HT_week4;

import java.util.Arrays;

public class HT_Same_letters {


    public static boolean sameLetters(String letters1,String letters2){
        char[] array1=letters1.toCharArray();
        char[] array2=letters2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }

    public static void main(String[] args) {
        String letters1 = "ania";
        String letters2= "niaa";

        System.out.println(sameLetters(letters1,letters2));
    }




}
/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

*/