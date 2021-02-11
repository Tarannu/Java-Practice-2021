package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=10;
        int b=12;
        int temp=0;
        System.out.println("before swapping numbers are "+a+" "+b);
        //swapping using third variable
        temp=a;
        a=b;
        b=temp;
        System.out.println("swapped numbers are "+a+" "+b);
        //swapping using no variable;
        a=10;
        b=12;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("without using swap "+a+" "+b);
        //scanner output
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer number 1");
        int inp1=sc.nextInt();
        System.out.println("the inpput byt the user is "+inp1);

        //
        System.out.println("enter interger number 2 ");
        int inp2=sc.nextInt();
        int z=inp1+inp2;
        int result=z+30;
        System.out.println("Adding the inputs is "+z+" then adding 30 to it result is "+result);



    }
}
