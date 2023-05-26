package week_1;

import zarko_week_2.Zarko_ConsecutiveNumbers;
import zarko_week_2.Zarko_DivisibleBy3_5_15;
import zarko_week_2.Zarko_SwapVariables;

import static week_1.DivisionWithoutOperator.division;
import static week_1.Fin_Ra.FIN_RA;
import static week_1.OddOrEven.ISOddOrEven;
import static zarko_week_2.Zarko_ConsecutiveNumbers.ConsecutiveNumbers;

public class Runner {

    /**
     * Hello Team!
     * This class will be used to test methods after we finish tasks from Week_1
     */

    public static void main(String[] args) {

/**
 * Week_1
 */
        System.out.println("Week_1");
        FIN_RA(1);
        System.out.println();
        System.out.println("-----------------------------------------");

        division(51,6);
        System.out.println("-----------------------------------------");

        ISOddOrEven(5);
        System.out.println("-----------------------------------------");

/**
 * Week_2
 */
        System.out.println("Week_2");
        Zarko_SwapVariables.swapVariables(10,20);
        System.out.println("-----------------------------------------");

        Zarko_DivisibleBy3_5_15.DivisibleBy3_5_15();
        System.out.println("-----------------------------------------");

        Zarko_ConsecutiveNumbers.ConsecutiveNumbers();
        System.out.println("-----------------------------------------");





    }
}
