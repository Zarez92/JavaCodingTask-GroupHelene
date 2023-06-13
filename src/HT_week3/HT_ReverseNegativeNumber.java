package HT_week3;

public class HT_ReverseNegativeNumber {
    public int reverseDigits(int num) {
        String num1 = Integer.toString(num);
        String result = "";

        for (int i = num1.length() - 1; i >= 0; i--) {
            result += num1.charAt(i);

        }
        int numResult = Integer.parseInt(result);
return (numResult*(-1));

    }
}
/*
2) Number - Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
 Input: -35  output: -53
 */