package com.ertugrul.kdvhesapla;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double tutar, kdvOran = 0, kdvTutar, kdvliTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ücret tutarını giriniz : ");
        tutar = scanner.nextDouble();
        while (tutar < 0) {
            System.out.println("tutar değeri 0'dan küçük olamaz! yeni değer giriniz : ");
            tutar = scanner.nextDouble();
        }

        if (tutar >= 1000) {
            kdvOran = 0.08;
        } else if (tutar < 1000 && tutar > 0) {
            kdvOran = 0.18;
        }

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV Orani : " + kdvOran);
        System.out.println("KDV Tutari : " + kdvTutar);
        System.out.println("KDV'li tutar : " + kdvliTutar);
    }
}
