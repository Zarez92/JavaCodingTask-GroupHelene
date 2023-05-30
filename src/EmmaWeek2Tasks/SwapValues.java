package EmmaWeek2Tasks;

public class SwapValues {
    public static void main(String[] args) {
        int x = 10,
                y = 20;
        System.out.println("x = " + x); //output should be 10
        System.out.println("y = " +y);//output should be 20

        //swapping values:
        x = x + y; //reassigning both values to x temporarily
        y = x - y;
        x = x - y;


        System.out.println("x = " + x); //output should be 20
        System.out.println("y = " +y);//output should be 10


    }
}
