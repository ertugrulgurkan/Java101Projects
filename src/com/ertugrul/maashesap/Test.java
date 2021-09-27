package com.ertugrul.maashesap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String name;
        double salary;
        int workHours;
        int hireYear;
        Scanner input = new Scanner(System.in);

        System.out.print("İsminiz: ");
        name = input.nextLine();
        System.out.print("Maaşınız: ");
        salary = input.nextDouble();
        System.out.print("Haftalık Çalışma Saatiniz: ");
        workHours = input.nextInt();
        System.out.print("İşe Giriş Yılınız: ");
        hireYear = input.nextInt();

        System.out.println();
        Employee kisi = new Employee(name,salary,workHours,hireYear);
        kisi.bastir();
    }
}
