package week_1;

public class Eve_DivisionWithoutOperator {

    //Write a method that can divide two numbers without using division operator



    public static void devides(int devidend, int divider) {
        if(divider==0) {
            System.out.println("Invalid Number");

        }
        System.out.print(devidend +" devided by "+divider +" is: ");
        int quotient = 0;
        while(devidend >= divider) {
            devidend -= divider;
            quotient++;
        }
        System.out.println(quotient+" and remainder is "+devidend);

    }
}
/*This method takes two integer parameters dividend and divisor,
 and returns the quotient of their division. It first checks for a divide-by-zero error.
 The loop subtracts the divider from the dividend as many times as possible while keeping the result non-negative,
 and updates the quotient accordingly.
 */


