package com.ertugrul.mukkemmelsayi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı gitiniz: ");
        sayi = input.nextInt();

        if (sayi == 1) System.out.println("1 sayısı mükemmel bir sayı değildir!");
        else if (sayi < 1) System.out.println("Hatalı bir sayı girdiniz!");
        else {
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) toplam += i;
            }
            if (sayi == toplam) System.out.println(sayi + " sayısı mükemmel bir sayıdır.");
            else System.out.println(sayi + " sayısı mükemmel bir sayı değildir!");
        }
    }
}
