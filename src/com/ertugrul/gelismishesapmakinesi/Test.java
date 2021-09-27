package com.ertugrul.gelismishesapmakinesi;

import java.util.Scanner;

public class Test {

    static void plus() {
        int sayi, toplam=0, dongu;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nKaç sayı toplayacaksınız: ");
        dongu = scan.nextInt();
        for (int i=1;i<=dongu;i++){
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Toplama sonucu: " + toplam);
    }

    static void minus() {
        int sayi1, sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı girin: ");
        sayi1 = scan.nextInt();
        System.out.print("2. sayıyı girin: ");
        sayi2 = scan.nextInt();
        System.out.print("Çıkarma sonucu: " + (sayi1-sayi2));
    }

    static void times() {
        int sayi, carpim=1, dongu;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nKaç sayı çarpacaksınız: ");
        dongu = scan.nextInt();
        for (int i=1;i<=dongu;i++){
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = scan.nextInt();
            carpim*=sayi;
        }
        System.out.println("Çarpma sonucu: " + carpim);
    }

    static void divided() {
        int sayi1, sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı girin: ");
        sayi1 = scan.nextInt();
        System.out.print("2. sayıyı girin: ");
        sayi2 = scan.nextInt();
        System.out.print("Bölme sonucu: " + ((double)sayi1/sayi2));
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + "! Sonucu: " + result);
    }

    static void mod(){
        int sayi1, sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı girin: ");
        sayi1 = scan.nextInt();
        System.out.print("2. sayıyı girin: ");
        sayi2 = scan.nextInt();
        System.out.print(sayi1 + "%" + sayi2 + "sonucu: " + (sayi1%sayi2) );
    }

    static void alanHesabi(){
        int sayi1, sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin 1. kenarı: ");
        sayi1 = scan.nextInt();
        System.out.print("Dikdörtgenin 2. kenarı: ");
        sayi2 = scan.nextInt();
        System.out.print("Dikdörtgenin alanı: " + (sayi1*sayi2));
        System.out.println("Dikdörtgenin çevresi: " + (2*(sayi1+sayi2)));
    }

    public static void main(String[] args) {
        int select;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("1. Toplama\t\t2. Çıkarma\t\t3. Çarpma\n4. Bölme\t\t5. Üslü Sayı\t6. Faktöriyel\n" +
                    "7. Mod Alma\t\t8. Dikdörtgen Alan ve Çevre Hesabı\n0. Çıkış");
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alanHesabi();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
