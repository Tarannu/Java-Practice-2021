package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for table");
        int calcNum=sc.nextInt();
        for(int i=0;i<=10;i++){
            int result=i*calcNum;
            System.out.println("The table of "+calcNum+" is "+i+" x "+calcNum+" = "+result);
        }
    }
}
