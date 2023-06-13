package zarko_java_tasks;

import java.util.*;

public class SameLetters {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "bca";


        char[] firstString = s1.toCharArray();
        char[] secondString = s2.toCharArray();



        Arrays.sort(firstString);
        Arrays.sort(secondString);

        System.out.println(Arrays.equals(firstString, secondString));




    }








}
