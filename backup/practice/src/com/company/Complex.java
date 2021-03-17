package com.company;

public class Complex {
    double real;
    double img;

    Complex(double r,double i){
        this.real=r;
        this.img=i;
    }

    public static Complex sum(Complex c1,Complex c2){
        Complex temp=new Complex(0,0);

        temp.real= c1.real+ c2.real;
        temp.img=c1.img+ c2.img;
        return temp;
    }

}
