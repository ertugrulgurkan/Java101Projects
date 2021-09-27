package com.ertugrul.sayikadarort;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sayi, toplam = 0, toplamSayi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                toplam += i;
                toplamSayi++;
            }
        }

        if (toplamSayi == 0) System.out.print(sayi + " sayısına kadar 3'e ve 4'e bölünen yok.");
        else {
            double ortalama = (double) toplam / toplamSayi;
            System.out.println(sayi + " sayısına kadar 3'e ve 4'e bölünenlerin ortalaması: " + ortalama);
        }
    }
}
