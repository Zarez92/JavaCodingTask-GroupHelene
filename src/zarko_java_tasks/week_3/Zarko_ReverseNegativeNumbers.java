package zarko_java_tasks.week_3;

public class Zarko_ReverseNegativeNumbers {

    /**
     Number - Reverse negative number

     Write a return method that can reverse digits of a negative number and return it as int
     Input: -35  output: -53
     */

    public static int reverseNegativeNumbers(int num) {

        String result = "-";

        String convert = String.valueOf(num);

        for (int i = convert.length() - 1; i >= 0; i--) {
            result += convert.charAt(i);
        }

        if (num < 0) {
            System.out.println((result.substring(0, result.length() - 1)));
        } else {
            System.out.println((result).substring(1));
        }

        return num;

    }


}