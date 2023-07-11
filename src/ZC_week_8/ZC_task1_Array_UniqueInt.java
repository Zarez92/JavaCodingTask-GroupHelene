package ZC_week_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZC_task1_Array_UniqueInt {
    public static List<Integer> ArraySum0(int N) { //6
        List<Integer> randomNumbers = new ArrayList<>();

        // Generate randomNumbers from -N/2 to N/2  --> -3 to 3
        for (int i = 1; i <= N / 2; i++) {
            randomNumbers.add(i);             // 1 --  3
            randomNumbers.add(-i);            // -1 -- -3
        }

        // If N is odd, add 0 to the array
        if (N % 2 != 0) {
            randomNumbers.add(0);
        }

        Collections.sort(randomNumbers);
        return randomNumbers;
    }

    public static void main(String[] args) {
        int N = 13;
        List<Integer> result = ArraySum0(N);

        System.out.println(result);
    }


}
/*
 Array - N unique integers that sum up to 0
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers
 that sum up to 0.
The function can return any such array. For example, given N = 4,
the function could return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect
(because value 1 occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many
more correct answers).
 */