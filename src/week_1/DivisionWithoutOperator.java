package week_1;

public class DivisionWithoutOperator {
<<<<<<< HEAD
    public static void main(String[] args) {
        int dividend = 12; // The number we want to divide
        int divisor = 3; // The number we want to divide by

        int quotient = divisionWithoutOperator(dividend, divisor);

        System.out.println("Quotient: " + quotient);
    }

    public static int divisionWithoutOperator(int dividend, int divisor) {
        int quotient = 0; // The result of the division

        while (dividend >= divisor) {
            dividend = dividend - divisor; // Subtract the divisor from the dividend
            quotient = quotient + 1; // Increase the quotient by 1
        }

        return quotient;
    }
}

/*

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        int dividend = 12; // The number we want to divide
        int divisor = 3; // The number we want to divide by

        int quotient = divisionWithoutOperator(dividend, divisor);

        System.out.println("Quotient: " + quotient);
    }

    public static int divisionWithoutOperator(int dividend, int divisor) {
        int quotient = 0; // The result of the division

        while (dividend >= divisor) {
            dividend = dividend - divisor; // Subtract the divisor from the dividend
            quotient = quotient + 1; // Increase the quotient by 1
        }

        return quotient;
    }
}
2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */
=======

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
>>>>>>> develop
