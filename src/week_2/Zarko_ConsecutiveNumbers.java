package week_2;

public class Zarko_ConsecutiveNumbers {


    public static void ConsecutiveNumbers() {

        int N = 1;

        for (; N <= 24; N++) {

            if (N <= 0) {
                System.err.println("Invalid number: " + N + "\nNumber cannot be zero or negative number!");
                System.exit(1);
            }

            boolean codility = N % 2 == 0;
            boolean test = N % 3 == 0;
            boolean coders = N % 5 == 0;


            if (codility && test && !(coders)) {
                System.out.println(N + " --> CodilityTest");
            } else if (codility && coders && !(test)) {
                System.out.println(N + " --> CodilityCoders");
            } else if (test && coders && !(codility)) {
                System.out.println(N + " --> TestCoders");
            } else if (codility) {
                System.out.println(N + " --> Codility");
            } else if (test) {
                System.out.println(N + " --> Test");
            } else if (coders) {
                System.out.println(N + " --> Coders");
            } else {
                System.out.println(N);
            }

        }


    }


    public static void main(String[] args) {


        ConsecutiveNumbers();


    }


}
/*
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.

If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N — 24:
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

 */