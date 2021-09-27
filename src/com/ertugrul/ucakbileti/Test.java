package com.ertugrul.ucakbileti;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yolcuMesafe,yolcuYasi;
        double yolcuMesafeUcret = 0.10,yolcuToplamUcret;


        System.out.println("Merhaba, Uçak Bileti Fiyat Hesaplama Programına Hoşgeldiniz.");

        System.out.println("Lütfen yaşınızı giriniz: ");
        yolcuYasi = scanner.nextInt();
        if(yolcuYasi>0){
            System.out.println("Lütfen mesafeyi giriniz (km cinsinden): ");
            yolcuMesafe = scanner.nextInt();
            if(yolcuMesafe>1){
                System.out.println("Lütfen Uçuşunuzu Seçiniz:");
                System.out.println("1- Gidiş-Dönüş\n2- Tek Yön");

                short yolcuTipi = scanner.nextShort();

                switch (yolcuTipi){
                    case 1:
                        yolcuToplamUcret=(yolcuMesafeUcret*yolcuMesafe);
                        System.out.println("Uçuş: Gidiş-Dönüş\nYolcu Yaşı: "+yolcuYasi+"\nYolcu Gidilecek Mesafe: "+yolcuMesafe+"\nYol Ücreti: "+yolcuToplamUcret);
                        if(yolcuYasi<12){
                            yolcuToplamUcret = (yolcuToplamUcret-(yolcuToplamUcret/100*20))/2;
                            yolcuToplamUcret += yolcuToplamUcret;
                            System.out.println("Yolcu Tip İndirimi: %20\nYolcu Yaş İndirimi: %50\nYolcu Toplam Ücret: "+yolcuToplamUcret);
                        }
                        else if(yolcuYasi>=12&&yolcuYasi<24){
                            yolcuToplamUcret = (yolcuToplamUcret-(yolcuToplamUcret/100*10));
                            yolcuToplamUcret = (yolcuToplamUcret-(yolcuToplamUcret/100*20));
                            yolcuToplamUcret += yolcuToplamUcret;
                            System.out.println("Yolcu Tip İndirimi: %20\nYolcu Yaş İndirimi: %10\nYolcu Toplam Ücret: "+yolcuToplamUcret);
                        }
                        else if(yolcuYasi>65){
                            yolcuToplamUcret = (yolcuToplamUcret-(yolcuToplamUcret/100*30));
                            yolcuToplamUcret = (yolcuToplamUcret-(yolcuToplamUcret/100*20));
                            yolcuToplamUcret += yolcuToplamUcret;
                            System.out.println("Yolcu Tip İndirimi: %20\nYolcu Yaş İndirimi: %30\nYolcu Toplam Ücret: "+yolcuToplamUcret);
                        }
                        else{
                            yolcuToplamUcret = (yolcuToplamUcret-(yolcuToplamUcret/100*20));
                            yolcuToplamUcret += yolcuToplamUcret;
                            System.out.println("Yolcu Tip İndirimi: %20\nYolcu Toplam Ücret: "+yolcuToplamUcret);
                        }
                        break;
                    case 2:
                        yolcuToplamUcret=(yolcuMesafeUcret*yolcuMesafe);
                        System.out.println("Uçuş: Gidiş-Dönüş\nYolcu Yaşı: "+yolcuYasi+"\nYolcu Gidilecek Mesafe: "+yolcuMesafe+"\nYol Ücreti: "+yolcuToplamUcret);
                        if(yolcuYasi<12){
                            yolcuToplamUcret = (yolcuToplamUcret)/2;
                            System.out.println("Yolcu Yaş İndirimi: %50\nYolcu Toplam Ücret: "+yolcuToplamUcret);
                        }
                        else if(yolcuYasi>=12&&yolcuYasi<24){
                            yolcuToplamUcret = (yolcuToplamUcret-(yolcuToplamUcret/100*10));
                            System.out.println("Yolcu Yaş İndirimi: %10\nYolcu Toplam Ücret: "+yolcuToplamUcret);
                        }
                        else if(yolcuYasi>65){
                            yolcuToplamUcret = (yolcuToplamUcret-(yolcuToplamUcret/100*30));
                            System.out.println("Yolcu Yaş İndirimi: %30\nYolcu Toplam Ücret: "+yolcuToplamUcret);
                        }
                        else{
                            System.out.println("Yolcu Toplam Ücret: "+yolcuToplamUcret);
                        }
                        break;
                    default:
                        System.out.println("Lütfen seçeneğinizi kontrol edin.");
                        break;
                }
            }
            else{
                System.out.println("Gideceğiniz mesafe 0'dan küçük olamaz.");
            }
        }
        else{
            System.out.println("Yaşınız 0'dan küçük olamaz.");
        }


    }
}