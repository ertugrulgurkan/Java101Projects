package com.ertugrul.vucutkitleindeksi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy, kilo, sonuc;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy = scanner.nextDouble();
        System.out.println("\nLütgen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();
        sonuc = kilo / (boy * boy);
        System.out.println("sonucunuz : " + sonuc);
    }
}
