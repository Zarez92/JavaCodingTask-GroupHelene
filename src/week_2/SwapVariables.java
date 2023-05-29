package week_2;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        System.out.println("X is "+x+", Y is "+y);

        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("X is "+x+", Y is "+y);







    }
}
