package com.ertugrul.kullanicigirisi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String userName, password;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        userName = sc.nextLine();

        System.out.println("Şifreniz: ");
        password = sc.nextLine();

        if (userName.equals("patika") && password.equals("java123"))
            System.out.println("Giriş Başarılı");
        else
            System.out.println("Bilgileriniz yanlış");

    }
}
