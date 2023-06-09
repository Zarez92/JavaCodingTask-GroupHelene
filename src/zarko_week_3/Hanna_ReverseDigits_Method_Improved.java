package zarko_week_3;


public class Hanna_ReverseDigits_Method_Improved {

    public static int reverseDigits(int num) {
        String num1 = Integer.toString(num);
        String result = "-";

        for (int i = num1.length() - 1; i >= 0; i--) {
            result += num1.charAt(i);
        }

        if (num < 0) {
            System.out.println(result.substring(0, result.length() - 1));
        } else {
            System.out.println(result);
        }

        return (num);
    }



    public static void main(String[] args) {

        reverseDigits(-1000);

    }


}





