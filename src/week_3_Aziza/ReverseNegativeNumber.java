package week_3_Aziza;

public class ReverseNegativeNumber {
    public class NumberReverser {
        public int reverseNegativeNumber(int number) {
            boolean isNegative = number < 0;

            // Convert the number to positive for reversing the digits
            int positiveNumber = Math.abs(number);

            // Reverse the digits of the positive number
            int reversedNumber = 0;
            while (positiveNumber > 0) {
                int digit = positiveNumber % 10;
                reversedNumber = reversedNumber * 10 + digit;
                positiveNumber /= 10;
            }

            // Return the reversed number with the original sign
            return isNegative ? -reversedNumber : reversedNumber;
        }

        public void main(String[] args) {
            int num = -35;
            int reversedNum = reverseNegativeNumber(num);
            System.out.println("Reversed number: " + reversedNum);
        }
    }

}
