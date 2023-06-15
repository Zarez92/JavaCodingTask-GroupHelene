package week_3;

public class Eve_ReverseNegativeNumber {
    /*Write a return method that can reverse digits of a negative number and return it as int
    Input: -35  output: -53

     */
    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(-10));
    }
}
