package week_1;

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
