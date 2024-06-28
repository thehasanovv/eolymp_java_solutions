package from_7000_to_7999;

import java.util.Scanner;

public class ChangeMaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        for (int i = 0; i < n; i++) {
            if (array[i] == max) array[i] = min;
            else if (array[i] == min) array[i] = max;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }


    }
}
