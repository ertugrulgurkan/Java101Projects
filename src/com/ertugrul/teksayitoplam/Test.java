package com.ertugrul.teksayitoplam;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam=0;

        while(true){
            System.out.print("Bir Sayı Girin: ");
            int sayi = input.nextInt();
            if (sayi%4==0) toplam+=sayi;
            else if (sayi%2==0) continue;
            else break;
        }

        System.out.println("Girilen sayılardan 4'e bölünen sayıların toplamı: " + toplam);
    }
}
