package HT_week1;


    public class HT_DivisionWithoutOperator {

        public void devides(int num1, int num2) {
            if(num2==0) {
                System.out.println("Invalid Number");
                return;
            }
            System.out.print(num1 +" devid by "+num2 +" is: ");
            int count =0;
            while(num1 >= num2) {
                num1 -= num2;
                count++;
            }
            System.out.println(count+" and remainder is "+num1);
        }

}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */