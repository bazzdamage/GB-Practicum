package gb.base;

import java.util.Scanner;

public class Find_Divider {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Please enter Dividend: ");
        int num = user_input.nextInt();
        String total = "";

        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                total = i + " " + total;
            }
        }
        System.out.println(total);
    }
}
