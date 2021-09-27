package com.ertugrul.havasicaklik;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the heat value");
        heat = scanner.nextInt();
        if (heat > 25) {
            System.out.println("You can go swimming");
        } else if (heat >= 5) {
            if (heat <= 15)
                System.out.println("You can go to the cinema");
            if (heat >= 10)
                System.out.println("You can go to the picnic");
        } else {
            System.out.println("You can go to the skiing");
        }
    }
}
