package from_8000_to_8999;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
