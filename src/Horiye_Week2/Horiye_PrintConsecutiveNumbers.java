package Horiye_Week2;

public class Horiye_PrintConsecutiveNumbers {
    public static void printNumber(int N) {


        for (int i=1;i<=N;i++){
            String output ="";

            if (i%2==0){
                output+="Codility";

            }
            if (i%3==0){
                output+="Test";
            }
            if (i%5==0){
                output+="Coders";

            }
            if (output.isEmpty()){
                System.out.println(i);
            }else {
                System.out.println(output);
            }



        }
    }

    public static void main(String[] args) {
        int N=24;
        printNumber(N);
    }
}
