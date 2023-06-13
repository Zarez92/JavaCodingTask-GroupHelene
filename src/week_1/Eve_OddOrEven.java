package week_1;

public class Eve_OddOrEven {
    public static void main(String[] args) {
        int myNumber = 7;
        String result = identifyOddEven(myNumber);
        System.out.println(result);


    }
    public static String identifyOddEven( int number ) {
        return  number%2==0 ? "Even" : "odd" ;
    }

    /*public static String identifyingOddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

     */


}