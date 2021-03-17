package com.company;

public class Employee {
    String name;
    int year;
    double salary;
    String address;

    Employee(String n,int y,double s,String a){

        this.name=n;
        this.year=y;
        this.salary=s;
        this.address=a;


    }

    public static Employee print(Employee one, Employee two, Employee three){
        Employee temp=new Employee("",0,0,"");
        temp.name=one.name+" "+two.name+" "+three.name;
        temp.address=one.address+" "+two.address+" "+three.address;

        return temp;
    }

}
