package gb.base;

import java.util.Scanner;

public class Dex2Bin {
    public static void main(String[] args) {

        Scanner user_input = new Scanner (System.in);
        System.out.println("Please enter INT: ");
        int num_dec = user_input.nextInt();
        // int num_dec = 50;
        int div = 2;

        String temp = "";

        while (num_dec >= div - 1) {
            temp = (num_dec%div) + temp;
            num_dec = num_dec/div;
        }
        System.out.println(temp);

    }
}
