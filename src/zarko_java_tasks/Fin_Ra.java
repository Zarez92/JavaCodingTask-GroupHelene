package zarko_java_tasks;

public class Fin_Ra extends RuntimeException {

    /*
    3️⃣  Numbers -- FINRA
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void FIN_RA(int num) {

        if (num > 30 || num < 0) {

            throw new IndexOutOfBoundsException("Choose the number between 1 to 30");

        }

        for (; num <= 30; num++) {

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print( num+"-->FINRA |");
            } else if (num % 3 == 0) {
                System.out.print(num+"-->FIN |");
            } else if (num % 5 == 0) {
                System.out.print(num+"-->RA |");
            } else {
                System.out.print(num + " | ");
            }



        }

    }

    public static void main(String[] args) {
        FIN_RA(1);


    }


}