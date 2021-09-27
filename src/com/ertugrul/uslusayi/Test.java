package com.ertugrul.uslusayi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double usluSayi = 1;
        System.out.print("Üssü Alıncak Sayı: ");
        int sayi = input.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        int us = input.nextInt();

        for (int i = 0; i < us; i++) usluSayi *= sayi;
        System.out.println("Sonuç: " + usluSayi);
    }
}
