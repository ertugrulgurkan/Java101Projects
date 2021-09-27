package com.ertugrul.asalsayi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int sayi, bolen=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i=2; i<=sayi;i++){
            for(int j=2; j<=i; j++){
                if (i%j==0) bolen++;
            }
            if (bolen>1) bolen=0;
            else {
                System.out.print(i + " ");
                bolen=0;
            }
        }
    }
}
