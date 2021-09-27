package com.ertugrul.twopower;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 4 == 0 || i % 5 == 0) toplam += i;
        }
        System.out.println(sayi + " sayısına kadar 4'ün ve 5'in kuvvetler toplamı: " + toplam);
    }
}
