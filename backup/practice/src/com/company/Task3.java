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
        //task 2
        int sum=0;

        for(int i=0;i<10;i++){
            System.out.println("Enter number for 10 number sum");
            int sum1=sc.nextInt();
            sum+=sum1;

        }
        System.out.println("current sum is "+sum);
        System.out.println("the average is "+sum/10);

        //task 3
        System.out.println("enter month integer");
        int month=sc.nextInt();
        String s="";
        for(int i=1;i<=12;i++){

            if(month==1){
                s="Month is January and days are 31 ";
            }
            else if(month==2){
                s="Month is February and days are 28 ";
            }else if(month==3){
               s="Month is March and days are 31 ";
            }else if(month==4){
                s="Month is April and days are 30 ";
            }else if(month==5){
                s="Month is May and days are 31 ";
            }else if(month==6){
               s="Month is June and days are 30 ";
            }else if(month==7){
                s="Month is July and days are 31 ";
            }else if(month==8){
                s="Month is August and days are 31 ";
            }else if(month==9){
               s="Month is September and days are 30";
            }else if(month==10){
               s="Month is October and days are 31 ";
            }else if(month==11){
                s="Month is November and days are 30 ";
            }else if(month==12){
                s="Month is December and days are 31 ";
            }
            else System.out.println("Invalid input");
        }
        System.out.println(s);

        //task 5
        System.out.println("enter number to count digits");
        long digit=sc.nextLong();
        int count=0;

        while(digit!=0){
            digit/=10;
            count++;

        }
        System.out.println("Number of digits in that number is "+count);

        //task 6
        System.out.println("Enter three numbers to determine increasing or decreasing");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        String result="";
        for(int i=0;i<=3;i++){
            if(num1<num2 && num2<num3 && num1<num3){
                result="Increasing";

            } else if(num1>num2 && num2>num3 && num1>num3){
                result="Decreasing";
            } else result="Neither increasing nor decreasing";

        }
        System.out.println(result);
        task 7
        same as finding month number in previous for loop just in february year will be divided by leap year or 4

        //task 8
        System.out.println("Enter to verify leap year");
        int year=sc.nextInt();


            if(year%4==0) System.out.println("It is a leap year");
            else System.out.println("it is Not a leap year");
        //task 9
        System.out.println("Input number of rows for a right triangle");
        int row=sc.nextInt();
        String triangle="";
        for(int i=1;i<=row;i++){
            triangle+=i;
            System.out.println(triangle);

        }

        //task 10
        System.out.println("Input number of rows for a right triangle");
        int rowP=sc.nextInt();
        String triangleP="";
//        for(int i=1;i<=rowP;i++){
//
//            int c=1;
//
//            for(int j=1;j<=i;j++){
//                System.out.println(c);
//                c=c*(i-j)/j;
//                triangleP+=c;
//            }
//
//            System.out.println();
//
//        }
        int[][] arr=new int[rowP][rowP];
        for(int i=0;i<rowP;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    arr[i][j]=1;
                }
                else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.println(arr[i][j]);
            }
            System.out.println(" ");
        }
        //task 11
        System.out.println("enter two decimal number to determine two decimal places");
        float dec1=sc.nextFloat();
        float dec2=sc.nextFloat();


            dec1*=100;
            dec2*=100;
            int a1=(int)dec1;
            int b1=(int)dec2;
            if(a1==b1){
                System.out.println("same decimals upto to 2");
            }else System.out.println("Not same decimals");



    }



}
