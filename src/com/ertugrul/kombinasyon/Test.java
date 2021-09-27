package com.ertugrul.kombinasyon;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n, r, kombinasyon, fakN = 1, fakR = 1, fakDiger = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısı: ");
        n = input.nextInt();
        System.out.print("Bu kümeden oluşturulacak grupların eleman sayısı: ");
        r = input.nextInt();

        if (n >= r) {
            for (int i = n; i > 1; i--) fakN *= i;
            for (int i = r; i > 1; i--) fakR *= i;
            for (int i = (n - r); i > 1; i--) fakDiger *= i;
            kombinasyon = fakN / (fakR * fakDiger);
            System.out.println("C(n,r) = " + kombinasyon);
        } else System.out.println("Yanlış değerler girdiniz!");
    }
}
