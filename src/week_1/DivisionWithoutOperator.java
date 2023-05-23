package week_1;

public class DivisionWithoutOperator {

    /*
    2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
     */

    public static void division(int a, int b) {

        int count = 0;

        while (a >= b) {

            a -= b;
            count++;
        }
        System.out.println("Result is: "+count + " with remainder ." + a);


    }





}
