package EmmaTasks;

public class DivisbleBy3_5_15 {

    public static void main(String[] args) {

int[] divisibleBy3=new int[100];
int[] divisibleBy5=new int[100];
int[] divisibleBy15=new int[100];
        int divide3 = 0;
        int divide5 = 0;
        int divide15 = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleBy15[divide15] = i;
                divide15++;
            } else if (i % 3 == 0) {
                divisibleBy3[divide5] = i;
                divide5++;
            } else if (i % 5 == 0) {
                divisibleBy5[divide3] = i;
                divide3++;
            }
        }

        System.out.print("divisible by 15: ");
        for (int i = 0; i < divide15; i++) {
            System.out.print(divisibleBy15[i] + " ");
        }

        System.out.println();

        System.out.print("divisible by 5: ");
        for (int i = 0; i < divide5; i++) {
            System.out.print(divisibleBy5[i] + " ");
        }

        System.out.println();

        System.out.print("divisible by 3: ");
        for (int i = 0; i < divide3; i++) {
            System.out.print(divisibleBy3[i] + " ");
        }

    }
}
