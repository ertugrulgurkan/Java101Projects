package com.ertugrul.kucuktenbuyuk;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int dizi[] = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz : ");
            dizi[i] = scanner.nextInt();
        }
        if ((dizi[0] > dizi[1]) && (dizi[0]) > dizi[2]) {
            if (dizi[1] > dizi[2])
                System.out.println("a>b>c");
            else {
                System.out.println("a>c>b");
            }
        }
        if ((dizi[1] > dizi[0]) && (dizi[1] > dizi[2])) {
            if (dizi[0] > dizi[2])
                System.out.println("b>a>c");
            else
                System.out.println("b>c>a");
        }
        if ((dizi[2] > dizi[1]) && (dizi[2] > dizi[0])) {
            if (dizi[2] > dizi[1])
                System.out.println("c>a>b");
            else
                System.out.println("c>b>a");
        }
    }
}
