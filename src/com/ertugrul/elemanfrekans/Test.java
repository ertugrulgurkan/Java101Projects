package com.ertugrul.elemanfrekans;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int eleman = input.nextInt();
        int[] liste = new int[eleman];

        for (int i = 0; i < eleman; i++) {
            System.out.print((i + 1) + ". elemanı giriniz: ");
            liste[i] = input.nextInt();
        }

        System.out.print("Dizinin elemanları: ");
        for (int i : liste) System.out.print(i + "  ");
        System.out.println();

        Arrays.sort(liste);
        int tekrar = 0;
        for (int i = 0; i < eleman; ++i) {
            for (int j = 0; j < eleman; j++) {
                if (liste[i] == liste[j]) tekrar++;
                if (liste[j] > liste[i]) break;
            }
            System.out.println(liste[i] + " sayısı " + tekrar + " kere tekrar edilmiştir.");
            i += tekrar - 1;
            tekrar = 0;
        }
    }
}
