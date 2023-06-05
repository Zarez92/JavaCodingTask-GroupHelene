package Anabelle_Week1;

import com.sun.security.jgss.GSSUtil;
import week_1.Eve_OddOrEven;

public class Anabelle_Odd_Or_Even {


        public static void isEvenOrOdd(int num){
            if (num % 2 == 0){
                System.out.println(num + " Even");
            } else {
                System.out.println(num + " Odd");
            }
        }

    public static void main(String[] args) {

        isEvenOrOdd(5);
        isEvenOrOdd(6);



    }

   /*
   1️⃣  Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
    */
}
