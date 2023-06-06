package week_2;

public class Eve_PrintConsecutiveNumbers {

    /*
    Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words
     Codility, Test and Coders in this given order.
  For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest
   and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17

     */



    public static void main(String[] args) {
        printNumbersWithRules(50);
    }

    public static void printNumbersWithRules(int n) {
        for (int i = 1; i <= n; i++) {
            String output = "";
            if (i % 2 == 0) {
                output += "codility";
            }
            if (i % 3 == 0) {
                output += "test";
            }
            if (i % 5 == 0) {
                output += "coders";
            }
            if (output.isEmpty()) {
                output = Integer.toString(i);
            }
            System.out.println(output);
        }
    }

/*
We loop from `1` to `n` and for each number, we check if it's divisible by `2`, `3` or `5`,
 and we concatenate the respective strings to the `output` variable.
 If `output` is still empty after all checks, we just set it to the string representation of the number.

Finally, we print `output` on a separate line using `System.out.println()`.
 */

}
