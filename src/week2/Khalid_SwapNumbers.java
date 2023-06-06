package week2;

public class Khalid_SwapNumbers {

    public static void swapNumbers(int x, int y){

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        swapNumbers(4,70);
    }
}

