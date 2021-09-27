package com.ertugrul.palindromikkelime;

import java.util.Scanner;

public class Test {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = input.nextLine();
        if (isPalindrome(kelime)) System.out.println("Girdiğiniz kelime palindromiktir.");
        else System.out.println("Girdiğiniz kelime palindromik değildir!");
    }
}