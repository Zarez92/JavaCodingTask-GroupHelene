package zarko_java_tasks;

import java.util.Arrays;

public class Zarko_ReverseNegativeNumbers {


    public static int reverseNegativeNumbers(int a) {

        String res = "-";

        String convert = String.valueOf(a);

        for (int i = convert.length() - 1; i >= 0; i--) {
            res += convert.charAt(i);
        }

        if (a < 0) {
            System.out.println((res.substring(0, res.length() - 1)));
        } else {
            System.out.println((res).substring(1));
        }

        return a;

    }




    public static void main(String[] args) {

        reverseNegativeNumbers(-1234560);

    }


}