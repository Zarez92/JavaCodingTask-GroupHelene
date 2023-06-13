package Horiye_Week2;

public class Horiye_SwapNumbers {
    public static void main(String[] args) {
        int a=5,b=6;
        System.out.println("Before swap:\na= " + a +"\nb="+ b);
        a = a ^b;
        b= a ^ b;
        a = a ^ b;
        System.out.println("\n\nAfter swap:\na= " + a + "\nb = " +b);
    }
}
