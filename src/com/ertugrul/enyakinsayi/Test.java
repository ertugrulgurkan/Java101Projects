package com.ertugrul.enyakinsayi;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int[] dizi = {15,12,788,1,-1,-778,2,0,-55,40,33,1000,102,-90,-93,20};
        System.out.print("\nDizi: ");
        for (int i=0; i<dizi.length;i++){
            if (i==0) System.out.print("{"+ dizi[i] + ", ");
            else if(i==dizi.length-1) System.out.println(dizi[i] + "}");
            else System.out.print(dizi[i] + ", ");
        }

        Arrays.sort(dizi);
        int min=dizi[0], max=dizi[dizi.length-1];
        for (int i=0; i<dizi.length;i++){
            if (dizi[i]>sayi){
                max=dizi[i];
                if (sayi<dizi[0]) min=dizi[0];
                else if(sayi==dizi[i-1]) min=dizi[i-2];
                else min=dizi[i-1];
                break;
            }
            else{
                min=dizi[dizi.length-1];
            }
        }

        System.out.println("Girilen sayı: " + sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);

    }
}
