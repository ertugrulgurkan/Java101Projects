package com.ertugrul.recursiveasal;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        System.out.println(asal(sayi, 2) ? sayi + " asaldır." : sayi + " asal değildir!");
    }

    static boolean asal(int sayi, int i) {
        if (sayi <= 2)
            return sayi == 2;
        if (sayi % i == 0)
            return false;
        if (i * i > sayi)
            return true;
        return asal(sayi, i + 1);
    }
}
