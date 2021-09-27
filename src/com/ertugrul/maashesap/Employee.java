package com.ertugrul.maashesap;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(double salary){
        if(salary>1000) return salary*0.03;
        return 0;
    }

    int bonus(){
        if (workHours>40) return (workHours-40)*30;
        return 0;
    }

    double raiseSalary(){
        if (2021-hireYear<10) return salary*0.05;
        else if (2021-hireYear>9 && 2021-hireYear<20) return salary*0.1;
        else if (2021-hireYear>19) return salary*0.15;
        else return 0;
    }

    void bastir(){
        System.out.println("Adı: " + name
                + "\nMaaşı: " + salary
                + "\nÇalışma Saati: " + workHours
                + "\nBaşlangıç Yılı: " + hireYear
                + "\nVergi: " + tax(salary)
                + "\nBonus: " + bonus()
                + "\nVergi ve Bonuslar ile Toplam Maaş: " + (salary-tax(salary)+bonus())
                + "\nMaaş Artışı: " + raiseSalary()
                + "\nYeni Maaş: " + (salary+raiseSalary())
                + "\nVergi ve Bonuslar ile Yeni Maaş: "
                + (salary+raiseSalary()-tax(salary+raiseSalary())+bonus())
        );
    }
}