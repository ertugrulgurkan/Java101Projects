package com.ertugrul.ogrencibilgi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int notSinav;
    int notSozlu;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.notSinav = 0;
        this.notSozlu = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
}