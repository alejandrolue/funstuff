package Tannenbaum;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of tree: ");
        int eingabe = sc.nextInt();

        for (int i = 0; i < eingabe; i++) {
            for (int j = 0; j < eingabe - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}

