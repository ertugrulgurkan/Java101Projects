package com.ertugrul.hesapmakinesi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, secim, sonuc;
        System.out.println("sayi 1 girin : ");
        sayi1 = scanner.nextInt();
        System.out.println("sayi 2 girin : ");
        sayi2 = scanner.nextInt();
        System.out.println("secim girin : (1-4)");
        secim = scanner.nextInt();
        if (secim < 1 || secim > 4)
            secim = 1;
        switch (secim) {
            case 1:
                System.out.println("sonuc : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("sonuc : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("sonuc : " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("sonuc : " + (sayi1 / sayi2));
                break;
            default:
                break;
        }
    }
}
