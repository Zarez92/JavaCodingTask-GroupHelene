package week2;

public class Khalid_DivisibleNumbers {

    public static void divisbleNumbers(int num){



        if (num < 1 && num > 100){
            System.err.println("Invalid number");
            System.exit(1);
        }

        System.out.print("Divisible by 15: ");
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Divisible by 5: ");

        for (int i = 1; i <= 100; i++) {


            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println();

        System.out.print("Divisible by 3: ");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {

                System.out.print(i + " ");

            }
        }

    }


    public static void main(String[] args) {
        divisbleNumbers(9);
    }
}

