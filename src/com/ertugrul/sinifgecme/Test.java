package com.ertugrul.sinifgecme;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("matematik notunuz : ");
        mat = inp.nextInt();

        System.out.println("fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.println("kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.println("turkce notunuz : ");
        turkce = inp.nextInt();

        System.out.println("tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.println("muzik notunuz : ");
        muzik = inp.nextInt();
        double toplam = 0;
        if (mat > 0 && mat < 100)
            toplam += mat;
        if (fizik > 0 && fizik < 100)
            toplam += fizik;
        if (kimya > 0 && kimya < 100)
            toplam += kimya;
        if (turkce > 0 && turkce < 100)
            toplam += turkce;
        if (tarih > 0 && tarih < 100)
            toplam += tarih;
        if (muzik > 0 && muzik < 100)
            toplam += muzik;

        double sonuc = toplam / 6;
        if (sonuc <= 55) {
            System.out.println("sınıfta kaldınız:(");
        } else {
            System.out.println("sınıfı geçtiniz :)");
        }
    }
}
