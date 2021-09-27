package com.ertugrul.notortalama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz :");
        int matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz :");
        int fizik = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz :");
        int turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz :");
        int tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz :");
        int muzik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz :");
        int kimya = input.nextInt();

        int toplam = (matematik + fizik + turkce + tarih + muzik + kimya);
        double sonuc = toplam / 6.0;
        System.out.println("Not ortalaması : " + sonuc);

        String gectiKaldi = sonuc >= 60.0 ? "Geçti" : "Kaldı";
        System.out.println(gectiKaldi);
    }
}
