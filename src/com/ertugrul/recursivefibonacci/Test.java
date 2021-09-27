package com.ertugrul.recursivefibonacci;

import java.util.Scanner;

public class Test {
    static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n <= 0) return 0;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();
        System.out.println("Fibonacci serisinin " + sayi + ". elemanı: " + fibo(sayi));
    }
}
