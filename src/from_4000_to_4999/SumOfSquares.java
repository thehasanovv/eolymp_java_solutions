package from_4000_to_4999;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();
        long sum = 0;

        for (long i = 1; i <= number; i++) {
            sum += i * i;
        }

        System.out.print(sum);
        in.close();
    }
}
