package com.ertugrul.recursivemetot;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        geri(sayi,sayi);
    }

    private static void geri(int sabit, int sayi) {
        System.out.print(sayi + " ");
        sayi-=5;
        if (sayi<=0) ileri(sabit, sayi);
        else geri(sabit, sayi);
    }

    private static void ileri(int sabit, int sayi) {
        System.out.print(sayi + " ");
        sayi+=5;
        if (sayi==sabit+5) System.exit(0);
        else ileri(sabit,sayi);
    }
}
