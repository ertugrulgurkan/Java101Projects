package com.ertugrul.hipotenus;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] dizi = new int[3];
        int toplam = 0;
        double u, sonuc;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". kenarı giriniz : ");
            dizi[i] = scanner.nextInt();
        }
        for (int a : dizi)
            toplam += a;
        u = toplam / 2;

        sonuc = Math.sqrt(u * (u - dizi[0]) * (u - dizi[1]) * (u - dizi[2]));
        System.out.println("sonuç = " + sonuc);

    }
}
