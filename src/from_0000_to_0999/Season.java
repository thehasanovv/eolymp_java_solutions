package from_0000_to_0999;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();

        switch (month) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
        }
    }
}
