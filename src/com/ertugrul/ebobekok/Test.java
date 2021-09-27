package com.ertugrul.ebobekok;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int ilkSayi, ikinciSayi, ebob = 1, ekok = 1, buyukSayi, kucukSayi;
        boolean dongu1 = true, dongu2 = true;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayı: ");
        ilkSayi = input.nextInt();
        System.out.print("İkinci Sayı: ");
        ikinciSayi = input.nextInt();

        buyukSayi = Math.max(ilkSayi, ikinciSayi);
        kucukSayi = Math.min(ilkSayi, ikinciSayi);

        while (dongu1) {
            if (ilkSayi % kucukSayi == 0 && ikinciSayi % kucukSayi == 0) {
                ebob = kucukSayi;
                dongu1 = false;
            }
            kucukSayi--;
        }

        while (dongu2) {
            if (buyukSayi % ilkSayi == 0 && buyukSayi % ikinciSayi == 0) {
                ekok = buyukSayi;
                dongu2 = false;
            }
            buyukSayi++;
        }

        System.out.println(ilkSayi + " ve " + ikinciSayi + " sayılarının EBOB'u: " + ebob);
        System.out.println(ilkSayi + " ve " + ikinciSayi + " sayılarının EKOK'u: " + ekok);
    }
}
