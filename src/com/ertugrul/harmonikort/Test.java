package com.ertugrul.harmonikort;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double harmonikSeri=0, harmonikOrtalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısı: ");
        int eleman = input.nextInt();
        int[] dizi = new int[eleman];

        for (int i=0; i<dizi.length;i++){
            System.out.print("Dizinin " + (i+1) + ". elemanı: ");
            dizi[i] = input.nextInt();
            harmonikSeri+=(double)1/dizi[i];
        }
        harmonikOrtalama = eleman/harmonikSeri;
        System.out.println("Oluşturduğunuz dizinin harmonik toplamı: " + harmonikOrtalama);
    }
}
