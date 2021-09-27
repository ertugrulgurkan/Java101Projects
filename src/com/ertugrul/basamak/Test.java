package com.ertugrul.basamak;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int girilenSayi, mod, kalan, toplam = 0;
        Scanner input = new Scanner((System.in));
        System.out.print("Bir sayı giriniz: ");
        girilenSayi = input.nextInt();
        kalan = girilenSayi;

        while (kalan != 0) {
            mod = kalan % 10;
            kalan /= 10;
            toplam += mod;
        }
        System.out.println(girilenSayi + "sayısının basamak sayılarının toplamı: " + toplam);
    }
}