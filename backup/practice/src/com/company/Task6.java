package com.company;

public class Task6 {
    public static void main(String[] args) {

        Complex c1 = new Complex(5.5, 4);
        Complex c2 = new Complex(1.2, 3.5);
        Complex temp = Complex.sum(c1, c2);

        System.out.println("Sum is " + temp.real + " + " + temp.img + "i");

        Employee one = new Employee("Paul", 1991, 5000, "10317 sw");
        Employee two = new Employee("Siam", 1995, 6000, "Miami");
        Employee three = new Employee("Tara", 1996, 7000, "Ohio");

        Employee tmp=Employee.print(one,two,three);
        System.out.println("the employee names are "+tmp.name+" the addresses are "+tmp.address);


    }
}