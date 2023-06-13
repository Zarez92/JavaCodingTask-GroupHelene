package zarko_java_tasks;

public class Zarko_SwapVariables {


public static void swapVariables(int a, int b){

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("After swapping:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);


}

    public static void main(String[] args) {
        swapVariables(-10,-15);
    }

    }



