package com.ertugrul.dizisirala;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int eleman = input.nextInt();
        int[] liste = new int[eleman];

        for (int i=0; i<eleman;i++){
            System.out.print((i+1) + ". elemanı giriniz: ");
            liste[i] = input.nextInt();
        }

        Arrays.sort(liste);
        System.out.print("Dizinin elemanları: ");
        for (int i: liste) System.out.print(i + "  ");

    }
}
