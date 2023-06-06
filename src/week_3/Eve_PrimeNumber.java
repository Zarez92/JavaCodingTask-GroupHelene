package week_3;

public class Eve_PrimeNumber {

    /*
    Write a method that can check if a number is prime or not
    A prime number is a positive integer greater than 1 that is divisible only by 1 and itself.
    In other words,it is a number that has exactly two divisors, 1 and itself. For example, 2, 3, 5, 7, 11, and 13 are the first few prime numbers.
     */

    public static boolean primeNumber(int num){

        if(num <= 1){
            return false;
        }


        for (int i = 2; i < num ; i++) {
            if(num%i==0){
                return false;
            }else{

            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(3));
    }

}
