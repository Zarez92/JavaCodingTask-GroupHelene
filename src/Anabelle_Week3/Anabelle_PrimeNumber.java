package Anabelle_Week3;

public class Anabelle_PrimeNumber {

    public static void primeNumber(int num){

        if (num % 2 == 0 && num % 3 == 0 && num % 4 == 0 && num % 5 == 0 ){
            System.out.println(num + " is not prime");
        }else {
            System.out.println(num + " is prime");
        }

    }

    public static void main(String[] args) {
        primeNumber(5);
    }

}
/*
 1) Numbers - Prime Number
    Write a method that can check if a number is prime or not
 */