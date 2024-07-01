package from_8000_to_8999;

import java.util.Scanner;

public class SumAndAmount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] nums = input.split(" ");

        int count = nums.length;
        int sum = 0;

        for (String num : nums) {
            sum += Integer.parseInt(num);
        }

        System.out.println(count + " " + sum);
    }
}
