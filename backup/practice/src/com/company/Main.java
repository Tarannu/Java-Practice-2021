package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int[] a=new int[]{1,2,3,4,5};
        int[] b=new int[]{1,2,3,4,5};

        int[] result=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            result[2*i]=a[i];
            result[(2*i)+1]=b[i];
        }
        System.out.println(result);
    }
}
