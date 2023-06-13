package zarko_java_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Zarko_PrimeNumber {


    public static void primeNumber(int num) {


        for (int i = 2; i <= num; i++) {

            ArrayList<Integer> prime = new ArrayList<>(Arrays.asList(i));

            for (int i1 = 2; i1 < i; i1++) {

                int I1 = i1;
                prime.removeIf(p -> p % I1 == 0);
            }

            for (Integer eachPrime : prime) {
               System.out.print(eachPrime + " ");
            }
           //  System.out.print(prime.toString().substring(0, prime.toString().length() - 1).replace("[",""));
        }//



    }



    public static void main(String[] args) {

        primeNumber(50);

    }
}


