package EmmaTasks;

import java.util.Scanner;

public class SameLetters {
    public static boolean SameLetters(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] letterCount = new int[26]; //initializing an array that contains the same amount of letters as the alphabet

        for (int i = 0; i < a.length(); i++) {
            letterCount[a.charAt(i) - 'a']++;
            letterCount[b.charAt(i) - 'a']--;
        }

        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your first word: ");
        String a = input.next();
        System.out.println("enter your second word:");
        String b = input.next();

        System.out.println();
        System.out.println("are these the same? true or false: "+ SameLetters(a, b));

    }
}