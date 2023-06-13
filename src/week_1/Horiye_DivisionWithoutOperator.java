package week_1;

import static week_1.DivisionWithoutOperator.division;

public class Horiye_DivisionWithoutOperator {

        public void divisionWithoutOperator( int n1, int n2){
            if (n2 == 0) {
                System.out.println("Invalid Number");
                return;
            }
            System.out.print(n1 + " devid by " + n2 + " is: ");
            int count = 0;
            while (n1 >= n2) {
                n1 -= n2;
                count++;
            }
            System.out.println(count + " and remainder is " + n1);


        }

    public static void main(String[] args) {

    }
    }





















