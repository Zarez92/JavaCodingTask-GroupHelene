package week_1;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {


        Scanner number = new Scanner(System.in);
        System.out.println("Enter number from 1 to 30");
        int num = number.nextInt();

        if (num % 3 == 0) {
            System.out.println("Fin");
        } else if (num % 5 == 0) {
            System.out.println("Ra");
        } else if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("Finra");
        } else {
            System.out.println(num);
        }


        number.close();
    }


}
/*
Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
- for numbers which are multiple of 3 print "FIN" instead of the number,
- for numbers which are multiple of 5, print "RA" instead of the number,
- and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.


1. I created scanner to read the input from the keyword
2. I asked the user to enter a number between 1 and 30.
3. Next line reads an integer input from the user.
4.The following if-else statements check various conditions.
5. We are checking if the number is divisible by 3,5 and 15 (i.e., there is no remainder when divided by given number).
6.This is the default case, which means none of the above conditions were met. In this case, it simply prints the entered number itself.
7.Last line closes the Scanner object
 */
