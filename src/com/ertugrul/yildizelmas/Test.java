package com.ertugrul.yildizelmas;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = klavye.nextInt();
        n -= 1;

        for (int i = 0; i <= n; i++) {
            printEt(n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            printEt(n, i);
        }
    }

    private static void printEt(int n, int i) {
        for (int j = 0; j < (n - i); j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i + 1); k++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
