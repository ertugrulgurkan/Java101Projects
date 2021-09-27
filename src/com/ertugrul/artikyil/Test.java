package com.ertugrul.artikyil;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;
        System.out.println("Merhaba, Artık Yıl Hesaplama Programına Hoşgeldiniz.");
        System.out.println("Lütfen bir yıl giriniz: ");
        yil = scanner.nextInt();

        if (yil % 4 == 0)
            if (yil % 100 == 0)
                if (yil % 400 == 0)
                    System.out.println(yil + " bir artık yıldır !");
                else
                    System.out.println(yil + " bir artık yıl değildir !");
            else
                System.out.println(yil + " bir artık yıldır !");
        else
            System.out.println(yil + " bir artık yıl değildir !");

    }
}