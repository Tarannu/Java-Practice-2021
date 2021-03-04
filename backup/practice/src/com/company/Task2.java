package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("entering task 2");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to proceed");
        int number=sc.nextInt();
        if(number%3==0 && number%5==0){
            System.out.println("Consult add java training");
        } else if(number%5==0){
            System.out.println("Java Training");
        }else if(number%3==0 ){
            System.out.println("Consult add ");

        }else System.out.println("neither divisible by 3 nor 5");
    int result = 0;
        System.out.println("please enter the numbers for calulator number 1");
        int a= sc.nextInt();
        System.out.println("please enter the numbers for calulator number 2");
        int b=sc.nextInt();
        System.out.println("please enter task for calculator");
        String input1=sc.next();

        switch (input1){
            case "addition":
                result=a+b;
                break;
            case "subtraction":
                result=a-b;
                break;
            case "division":
                result=a/b;
                break;
            case "multiplication":
                result=a*b;
                break;
            case "Average":
                result=a+b/2;
                break;
            default:
                System.out.println("no task assigned");

        }
        System.out.println("Result is "+result);
        if(result<0) System.out.println("oops the number out put is negative");
        // task 2 number 3 flowchart
        System.out.println("please enter the numbers for average number 1");
        int d= sc.nextInt();
        System.out.println("please enter the numbers for average number 2");
        int e=sc.nextInt();
        System.out.println("please enter the numbers for average number 2");
        int f=sc.nextInt();
        int avg=d+e+f/3;
        System.out.println("average is "+avg);
        if(avg>d && avg>e && avg>f){
            System.out.println("avergae is greater than number1, number 2 and number3");

        } else if(avg>d && avg>e) System.out.println("Average is greater than number 1 and number 2");
        else if(avg>d && avg>f) System.out.println("Average is greater than number 1 and number 3");
        else if(avg>e && avg>f) System.out.println("Avergae is greater han number 2 and number 3");
        else if(avg>d) System.out.println("Average is just greater than number1");
        else if(avg>e) System.out.println("Average is just greater than number 2");
        else if(avg>f) System.out.println("Average is just greater than number3");

        task 3 number 4
        System.out.println("Enter number to determine positive or negative");
        int num=sc.nextInt();
        while(num<=5){
            System.out.println("the number is "+num);
            if(num<0) {
                System.out.println("Its over ");
                break;
            } else System.out.println("Good Going");
            num++;
        }

        for(int i=0;i<=6;i++){
            if(i==3 || i==6) continue;
            System.out.println("Number stream from 0 to 6 is "+i);
        }

         even or odd
        int evenOdd=4;
        if(evenOdd%2!=0) System.out.println("New");
        else if(evenOdd%2==0 && evenOdd>=2 && evenOdd<=5) System.out.println("OLD");
        else if(evenOdd%2==0 && evenOdd>=6 && evenOdd<=30) System.out.println("NEW");
        else if(evenOdd%2==0 && evenOdd>30) System.out.println("OLD");

        double num1=10.02000000000;
        System.out.println("Task 7");
        if(num1==0) System.out.println("zero");
        else if(num1>0) System.out.println("positive");
        else if(num1<0) System.out.println("negative");
        if(Math.abs(num1)<1) System.out.println("number is small");
        else if(Math.abs(num1)>1000000) System.out.println("Number is larger");

        //task 8
        char[] random=new char[]{'r','a','n','d','o','m'};
        System.out.println("enter to check for same character");
        char u=sc.next().toLowerCase().charAt(0);
        for(int i=0;i<random.length-1;i++){

            if(u==random[i]) System.out.println("Found same character");
            else System.out.println("Not Found");

        }



    }
}
