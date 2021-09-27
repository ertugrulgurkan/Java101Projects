package com.ertugrul.ogrencibilgi;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matSinav, int matSozlu, int fizSinav, int fizSozlu, int kimSinav, int kimSozlu) {

        if (matSinav >= 0 && matSinav <= 100) {
            this.mat.notSinav = matSinav;
        }

        if (matSozlu >= 0 && matSozlu <= 100) {
            this.mat.notSozlu = matSozlu;
        }

        if (fizSinav >= 0 && fizSinav <= 100) {
            this.fizik.notSinav = fizSinav;
        }

        if (fizSozlu >= 0 && fizSozlu <= 100) {
            this.fizik.notSozlu = fizSozlu;
        }

        if (kimSinav >= 0 && kimSinav <= 100) {
            this.kimya.notSinav = kimSinav;
        }

        if (kimSozlu >= 0 && kimSozlu <= 100) {
            this.kimya.notSozlu = kimSozlu;
        }

    }

    public void isPass() {
        if (this.mat.notSinav == 0 || this.fizik.notSinav == 0 || this.kimya.notSinav == 0 || this.mat.notSozlu == 0 || this.fizik.notSozlu == 0 || this.kimya.notSozlu == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ( (this.fizik.notSinav*0.8) + (this.fizik.notSozlu*0.2) + (this.kimya.notSinav*0.8)
                + (this.kimya.notSozlu*0.2) + (this.mat.notSinav*0.8) + (this.mat.notSozlu*0.2) ) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + ((this.mat.notSinav*0.8) + (this.mat.notSozlu*0.2)) );
        System.out.println("Fizik Notu : " + ((this.fizik.notSinav*0.8) + (this.fizik.notSozlu*0.2)) );
        System.out.println("Kimya Notu : " + ((this.kimya.notSinav*0.8) + (this.kimya.notSozlu*0.2)) );
    }

}