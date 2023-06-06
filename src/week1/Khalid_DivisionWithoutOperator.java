package week1;

public class Khalid_DivisionWithoutOperator {

    public static void divide(int num1, int num2) {

        if (num1 == 0 || num2 == 0){
            System.err.println("Invalid number");
            System.exit(1);
        }

        int count = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;
        }
        int result = count;

        System.out.println("result = " + result);


    }

    public static void main(String[] args) {
        divide(50,2);
    }
}

/*
2️⃣  Numbers -- Divide without / operator
        Write a method that can divide two numbers without using division operator.

 */

