package from_8000_to_8999;

import java.util.Scanner;

public class Rectangle2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
