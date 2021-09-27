package com.ertugrul.recursiveuslu;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int taban, us;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayı: ");
        taban = input.nextInt();
        System.out.print("Üs: ");
        us = input.nextInt();
        System.out.println("Sonuç: " + pow(taban,us));
    }

    public static int pow(int taban, int us){
        if (us==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban*pow(taban,us-1);
    }
}
