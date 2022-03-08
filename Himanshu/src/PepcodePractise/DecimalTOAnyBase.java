package PepcodePractise;

import java.util.Scanner;

public class DecimalTOAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enetr base");
        int b = sc.nextInt();
        DecimalToAnyBase(n, b);
    }

    public static void DecimalToAnyBase(int n, int b) {
        int quot = n;
        int r = 0;
        String set = "";
        while (quot != 0) {
            r = quot % b;
            quot = quot / b;
            set = r + set;
        }
        System.out.println(set);
    }
}

