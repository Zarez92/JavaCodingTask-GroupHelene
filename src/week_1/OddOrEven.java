package week_1;

<<<<<<< HEAD
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number ");
        int num = input.nextInt();
        System.out.println(num % 2 == 0 ? true : false);


    }
}
=======
public class OddOrEven {

    public static void ISOddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " Even");
        } else {
            System.out.println(num + " Odd");
        }



    }

 /*   public static void main(String[] args) {
        ISOddOrEven(5);
       ISOddOrEven(6);

  */



    public static String OddOrEven( int num){
        String result = "";
        if (num % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(OddOrEven(15));
    }
}


>>>>>>> develop
/*
  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

<<<<<<< HEAD

1. I created scanner to read the input from the keyword
2. I asked the user to enter a number.
3. Next line reads an integer input from the user.
4.I used Ternary to check If the remainder is 0, it means num is divisible by 2(odd), and the condition evaluates to true.

 */
=======
 */

>>>>>>> develop
