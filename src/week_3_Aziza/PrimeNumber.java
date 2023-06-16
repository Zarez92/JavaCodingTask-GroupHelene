package week_3_Aziza;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, the number is not prime
            }
        }

        return true; // Number is prime
    }

    public static void main(String[] args) {
        int num = 22;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
