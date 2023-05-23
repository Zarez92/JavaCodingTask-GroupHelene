package week_1;

public class OddOrEven {


    public static void ISOddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " Even");
        } else {
            System.out.println(num + " Odd");
        }

    }

    public static void main(String[] args) {
        ISOddOrEven(5);
       ISOddOrEven(6);
    }

}


/*
  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

 */