package com.ertugrul.fibonacci;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int ilkSayi=0, ikinciSayi=1, ucuncuSayi=1, eleman;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir Fibonacci Serisi olsun: ");
        eleman = input.nextInt();

        if (eleman<1) System.out.println("Hatalı bir sayı girdiniz.");
        else {
            for (int i=1; i<=eleman;i++){
                System.out.print(ilkSayi + " ");
                ucuncuSayi=ilkSayi+ikinciSayi;
                ilkSayi=ikinciSayi;
                ikinciSayi=ucuncuSayi;
            }
        }
    }
}