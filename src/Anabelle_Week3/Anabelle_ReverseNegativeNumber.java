package Anabelle_Week3;

public class Anabelle_ReverseNegativeNumber {

    public static void reverseNegativeNumber(int num){
        if (num >= 0 ){
            System.err.println("Invalid number, please enter a negative number.");
            System.exit(1);
        }

        int reverse = 0;
        while (num < 0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        reverseNegativeNumber(-50);
    }
}
