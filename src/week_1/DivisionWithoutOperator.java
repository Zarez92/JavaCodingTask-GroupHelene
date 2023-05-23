package week_1;

public class DivisionWithoutOperator {

    /*
    2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
     */

    public static void division(int a, int b) {

        int count = 0;

        if (a <= 0 || b <= 0){
            System.err.println("Invalid number");
            System.exit(1);
        }

        while (a >= b) {


            a -= b;
            count++;
        }
        System.out.println("Result is: "+count + " with remainder ." + a);


    }

    public static void main(String[] args) {
        division(-55,5);
    }
/*
45-9=36 1st
36-9=27 2nd
27--9=18 3rd
18-9=9 4th
9-9=0
 */


}
