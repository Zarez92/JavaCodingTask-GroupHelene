package week_1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number ");
        int num = input.nextInt();
        System.out.println(num % 2 == 0 ? true : false);


    }
}
/*
  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"


1. I created scanner to read the input from the keyword
2. I asked the user to enter a number.
3. Next line reads an integer input from the user.
4.I used Ternary to check If the remainder is 0, it means num is divisible by 2(odd), and the condition evaluates to true.

 */