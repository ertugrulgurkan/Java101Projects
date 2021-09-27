package com.ertugrul.palindrom;

import java.util.Scanner;

public class Test {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (isPalindrom(sayi)) System.out.println(sayi + " palindromdur.");
        else System.out.println(sayi + " palindrom değildir!");
    }
}
