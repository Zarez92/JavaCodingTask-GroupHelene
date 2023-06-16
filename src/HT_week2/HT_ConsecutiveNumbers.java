package HT_week2;

public class HT_ConsecutiveNumbers {

    public static void main(String[] args) {

        String result = "";
        int n = 24;

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0) {
                result += "CodilityTestCoders\n";
            } else if (i % 3 == 0 && i % 2 == 0) {
                result += "TestCodility\n";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += "TestCoders\n";
            } else if (i % 5 == 0 && i % 2 == 0) {
                result += "CodersCodility\n";
            } else if (i % 5 == 0) {
                result += "Coders\n";
            } else if (i % 3 == 0) {
                result += "Test\n";
            } else if (i % 2 == 0) {
                result += "Codility\n";
            }else{ result+=i+"\n";}


        }
        System.out.println(result);
    }
}