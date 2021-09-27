package com.ertugrul.maxmin;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sayi, buyukSayi, kucukSayi, girilenSayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayi = input.nextInt();

        System.out.print("1. sayıyı giriniz: ");
        buyukSayi = input.nextInt();
        kucukSayi = buyukSayi;

        for (int i = 2; i <= sayi; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            girilenSayi = input.nextInt();
            if (girilenSayi <= kucukSayi) kucukSayi = girilenSayi;
            if (girilenSayi >= buyukSayi) buyukSayi = girilenSayi;
        }

        System.out.println("Girilen sayıların en büyüğü: " + buyukSayi);
        System.out.println("Girilen sayıların en küçüğü: " + kucukSayi);
    }
}
