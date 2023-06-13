package zarko_java_tasks;

public class Zarko_DivisibleBy3_5_15 {


    public static void DivisibleBy3_5_15() {

        String NumsDevBy15 = "Divisible by 15: ";
        String NumsDevBy5 = "Divisible by 5: ";
        String NumsDevBy3 = "Divisible by 3: ";
        int i = 1;

        for (; i < 101; i++) {

            boolean divisibleBy15 = i % 3 == 0 && i % 5 == 0 && i % 15 == 0;

            if (divisibleBy15) {
                NumsDevBy15 +="["+ i +"]";
            } else if (i % 5 == 0 && !(divisibleBy15)) {
                NumsDevBy5 += "["+ i +"]";
            } else if (i % 3 == 0 && !(divisibleBy15)) {
                NumsDevBy3 +="["+ i +"]";
            }

        }

        System.out.println(NumsDevBy15);
        System.out.println(NumsDevBy5);
        System.out.println(NumsDevBy3);

    }

    public static void main(String[] args) {
        DivisibleBy3_5_15();
    }
}
