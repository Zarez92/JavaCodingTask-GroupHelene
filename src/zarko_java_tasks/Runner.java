package zarko_java_tasks;

import zarko_java_tasks.week_2.ConsecutiveNumbers;

import static zarko_java_tasks.week_1.DivisionWithoutOperator.division;
import static zarko_java_tasks.week_1.Fin_Ra.FIN_RA;
import static zarko_java_tasks.week_1.OddOrEven.ISOddOrEven;
import static zarko_java_tasks.week_2.ConsecutiveNumbers.consecutiveNumbers;
import static zarko_java_tasks.week_2.Zarko_DivisibleBy3_5_15.divisibleBy3_5_15;
import static zarko_java_tasks.week_2.Zarko_SwapVariables.swapVariables;
import static zarko_java_tasks.week_3.Zarko_PrimeNumber.primeNumber;
import static zarko_java_tasks.week_3.Zarko_ReverseNegativeNumbers.reverseNegativeNumbers;
import static zarko_java_tasks.week_4.RemoveDuplicates.removeDuplicates;
import static zarko_java_tasks.week_4.SameLetters.sameLetters;
import static zarko_java_tasks.week_4.Zarko_FreqOfCharacters.freqOfCharacters;

public class Runner {

    /**
     * Hello Team!
     * This class will be used to test methods after we finish tasks from each Week
     */

    public static void main(String[] args) {

        System.out.println("Week_1 Tasks:____________________________");


        FIN_RA(1);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        division(51, 6);
        System.out.println("-----------------------------------------");
        ISOddOrEven(6);


        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Week_2 Tasks:____________________________");


        consecutiveNumbers();
        System.out.println("-----------------------------------------");
        divisibleBy3_5_15();
        System.out.println("-----------------------------------------");
        swapVariables(10,15);


        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Week_3 Tasks:____________________________");


        primeNumber(10);
        System.out.println();
        reverseNegativeNumbers(-53);


        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Week_4 Tasks:____________________________");

        removeDuplicates("sdfsdfsdfdddsdss");
        System.out.println(sameLetters("abc", "cba"));
        freqOfCharacters("zzzzzaaaarrrkko");

    }
}
