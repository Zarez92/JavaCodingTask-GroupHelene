package week_2;

public class Eve_DivisibleBy3_5_15 {

     /*
        Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section.
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section.
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section.
EX:
Input: 100
Output: Divisible By 15 15 30 45 60 75 90
               Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
               Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
         */



        public static void main(String[] args) {
          /*  for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    System.out.println(i + " divisible by 3, 5, and 15.");
                } else if (i % 3 == 0) {
                    System.out.println(i + " divisible by 3 only.");
                } else if (i % 5 == 0) {
                    System.out.println(i + " divisible by 5 only.");
                }
            }
        }

           */



                    System.out.println("divisible by 15");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 15 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("\n\ndivisible by 5");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 5 == 0 && i % 15 != 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("\n\ndivisible by 3");
                    for (int i = 1; i <= 100; i++) {
                        if (i % 3 == 0 && i % 15 != 0) {
                            System.out.print(i + " ");
                        }
                    }
                }
            }


/*
Explanation:
The program prints three sections, each representing a different condition for divisibility.
- To find the numbers divisible by 15, the program uses a for loop to iterate through the numbers from 1 to 100.
It checks if each number is divisible by 15 using the modulus operator (%). If the number is divisible by 15,
it is printed to the console.
- To find the numbers divisible by 5 but not 15, the program uses another for loop.
It checks if each number is divisible by 5 but not 15 using the modulus operator.
If the number is divisible by 5 but not 15, it is printed to the console.
- To find the numbers divisible by 3 but not 15, the program uses the same approach as for the second section,
 but it checks for divisibility by 3 instead of 5.

Note that the '\n' character is used to insert new lines for better readability.
 */





