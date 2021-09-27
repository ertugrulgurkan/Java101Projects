package com.ertugrul.manav;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam = 0;
        int kiloarmut, kiloelma, kilodomates, kilomuz, kilopatlican;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut kaç kilo:");
        kiloarmut = scanner.nextInt();
        System.out.println("Elma kaç kilo:");
        kiloelma = scanner.nextInt();
        System.out.println("Domates kaç kilo:");
        kilodomates = scanner.nextInt();
        System.out.println("Muz kaç kilo:");
        kilomuz = scanner.nextInt();
        System.out.println("Patlıcan kaç kilo:");
        kilopatlican = scanner.nextInt();

        toplam = (armut * kiloarmut) + (domates * kilodomates) + (elma * kiloelma) + (muz * kilomuz) + (patlican * kilopatlican);
        System.out.println("Toplam tutar : " + toplam);
    }
}
