package from_8000_to_8999;

import java.util.Scanner;

public class Rectangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        for (int i = 0; i < a; i++) {
            for (int j = 1; j < b; j++) {
                System.out.print("#");
            }
            System.out.println("#");
        }
    }
}
