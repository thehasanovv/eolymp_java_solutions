package from_5000_to_5999;

import java.util.Scanner;

public class TheLastDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();

        System.out.println(number % 10);
    }
}
