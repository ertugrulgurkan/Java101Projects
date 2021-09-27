package com.ertugrul.dairealani;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        final double pi = 3.14;
        int yaricap, aci;
        double alan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("dairenin yaricap degerini giriniz : ");
        yaricap = scanner.nextInt();
        System.out.println("dairenin acisini giriniz : ");
        aci = scanner.nextInt();
        while (aci < 0 || aci > 360) {
            System.out.println("aci degerleri yanliş. Tekrar giriniz : ");
            aci = scanner.nextInt();
        }
        while (yaricap < 0) {
            System.out.println("yaricap degerleri yanlis. Tekrar giriniz : ");
            yaricap = scanner.nextInt();
        }
        alan = (pi * yaricap * yaricap * aci) / 360;
        System.out.println("dairenin alani : " + alan);
    }
}
