package Anabelle_Week2;

public class Anabelle_ConsecutiveNumbers {

        public static void consecutiveNumbers(int num) {

            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                    System.out.println("CodilityTestCoders");
                } else if (i % 2 == 0) {
                    System.out.println("Codility");
                } else if (i % 3 == 0) {
                    System.out.println("Test");
                } else if (i % 5 == 0) {
                    System.out.println("Coders");

                }else {
                    System.out.println(i);
                }
            }


            }

    public static void main(String[] args) {
        consecutiveNumbers(24);
    }
}
