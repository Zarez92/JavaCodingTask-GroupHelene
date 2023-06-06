package week_2;

public class Eve_SwapNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

/*
Explanation:

1. `a = a + b;` adds the values of `a` and `b` and stores the result in `a`.
At this point, `a` holds the sum of the original values of `a` and `b`.

2. `b = a - b;` subtracts the original value of `b` from the new value of `a`, which gives us the original value of `a`.
This value is then stored in `b`.

3. `a = a - b;` subtracts the original value of `a` from the new value of `a` (which is the sum of the original `a`
and `b` values, minus the original value of `b`). This gives us the original value of `b`, which is then stored in `a`.

After these three steps, the values of `a` and `b` have been swapped.
 */


}
