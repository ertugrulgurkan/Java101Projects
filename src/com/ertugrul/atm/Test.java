package com.ertugrul.atm;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, usernameDogruMu, passwordDogruMu;
        int toplamBakiye = 1500;

        System.out.print("Kullanıcı Adınız Ne Olsun: ");
        username = input.nextLine();
        System.out.print("Şifreniz Ne Olsun: ");
        password = input.nextLine();
        System.out.println();

        boolean dongu1 = true, dongu2 = true, dongu3 = true;

        System.out.println("Merhaba, Kodluyoruz Bankası'na hoşgeldiniz. Lütfen giriş yapınız.");

        while (dongu3) {
            System.out.println("1. Giriş\n2. Çıkış Yap");
            System.out.print("Bir Seçim Yapınız: ");
            int secim = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (secim) {
                case 1: {
                    System.out.print("Kullanıcı Adınız: ");
                    usernameDogruMu = input.nextLine();
                    System.out.print("Şifreniz: ");
                    passwordDogruMu = input.nextLine();
                    if (usernameDogruMu.equals(username) && passwordDogruMu.equals(password)) {
                        System.out.println("\nMerhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                        dongu3 = false;
                    } else {
                        System.out.println("Hatalı Giriş Yaptınız!\n");
                    }
                }
                break;

                case 2: {
                    System.out.println("Çıkış yapılıyor.");
                    dongu1 = false;
                    dongu2 = false;
                    dongu3 = false;
                }
                break;
            }
        }

        while (dongu1) {
            System.out.println("1. Şifre Değiştirin\n2. Para Yatırma\n3. Para Çekme\n4. Bakiye Sorgulama\n5. Çıkış Yap");
            System.out.print("Bir Seçim Yapınız: ");
            int secim = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (secim) {
                case 1: {
                    System.out.print("Yeni Şifrenizi Giriniz: ");
                    passwordDogruMu = input.nextLine();
                    while (dongu2) {
                        if (passwordDogruMu.equals(password)) {
                            System.out.print("Eski Şifrenizi Girdiniz. Yeni Bir Şifre Giriniz: ");
                            passwordDogruMu = input.nextLine();
                        } else {
                            password = passwordDogruMu;
                            System.out.println("Yeni Şifreniz Oluşturuldu.\n");
                            dongu2 = false;
                        }
                    }
                }
                break;

                case 2: {
                    System.out.print("Ne Kadar Para Yatıracaksınız?: ");
                    toplamBakiye += input.nextInt();
                    System.out.println("Paranız Yatırıldı.\n");
                }
                break;

                case 3: {
                    System.out.print("Ne Kadar Para Çekeceksiniz?: ");
                    int cekilecekTutar = input.nextInt();
                    if (cekilecekTutar > toplamBakiye) System.out.println("Bakiyeniz Yetersiz!\n");
                    else {
                        System.out.println("Paranızı Alabilirsiniz.\n");
                        toplamBakiye -= cekilecekTutar;
                    }
                }
                break;

                case 4: {
                    System.out.println("Bakiyeniz: " + toplamBakiye + "\n");
                }
                break;

                case 5: {
                    System.out.println("Çıkış yapılıyor.");
                    dongu1 = false;
                }
                break;
            }
        }
    }

}