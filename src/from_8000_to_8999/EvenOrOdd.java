package from_8000_to_8999;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if(number % 2 == 0) System.out.print("EVEN");
        else System.out.print("ODD");

        in.close();
    }
}
