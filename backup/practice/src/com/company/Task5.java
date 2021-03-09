package com.company;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args){
        int[] duplicatesArr=new int[]{1,2,5,4,5,5,6,7,8};
        Arrays.sort(duplicatesArr);
        int j=0;
        for(int i=1;i<duplicatesArr.length-1;i++){
            if(duplicatesArr[j]!=duplicatesArr[i]){
                j++;
                duplicatesArr[j]=duplicatesArr[i];
            }
        }

        System.out.println("The length of the array after removing duplicates is "+(j+1));

        int[] largestElement=new int[]{1,2,5,8,10,11,6,7};
        int max=0;
        int secondMax=0;
        int min=999;
        int secondMin=999;

        for(int i=0;i<largestElement.length;i++){
            if(largestElement[i]>max){
                max=largestElement[i];
            }// max=11;
            if(largestElement[i]<min){
                min=largestElement[i];
            }

        }
        for(int i=0;i<largestElement.length;i++){
            if(largestElement[i]<max && largestElement[i]>secondMax){
                secondMax=largestElement[i];
            }
            if(largestElement[i]>min && largestElement[i]<secondMin){
                secondMin=largestElement[i];
            }
        }
        System.out.println("The second max number is "+secondMax);
        System.out.println("the second min "+secondMin);

        int[][] matric1=new int[][]{{1,2},{2,5}};
        int[][] matric2=new int[][]{{5,6},{7,8}};
        int[][] sum= new int[2][2];
        System.out.println(" matric sum is");
        for(int i=0;i<matric1.length;i++){
            for(j=0;j<matric1[0].length;j++){
                sum[i][j]=matric1[i][j]+matric2[i][j];
                System.out.println(sum[i][j]+" ");
            }
            System.out.println();

        }

        int[] zeroArr=new int[]{1,2,0,5,6,0,7,8,0,10,11};

        j=0;
        for(int i=0;i<zeroArr.length;i++){
            if(zeroArr[i]!=0){
                zeroArr[j++]=zeroArr[i];
            }
        }
        for(int i=j;i<zeroArr.length;i++){
            zeroArr[i]=0;

        }
        System.out.println("after moving zeros to end");
        for(int i=0;i<zeroArr.length;i++) {
            System.out.println(zeroArr[i]);
        }
        int[] newArr=new int[]{1,2,3,4,5};

        max=0;
        min=999;
        int sumMaxMin=0;
        for(int i=0;i<newArr.length;i++) {
            if (newArr[i] > max) {
                max = newArr[i];
            }// max=11;
            if (newArr[i] < min) {
                min = newArr[i];
            }
            sumMaxMin=min+max;

        }
        System.out.println("the min max sum is "+sumMaxMin);

        //removing duplicate elements already done above

        int[] sampleArr=new int[]{1,2,4,5,6};
        int target=6;
        int[] elements=new int[2];

        for(int i=0;i<sampleArr.length-1;i++){
            for(j=i+1;j<sampleArr.length-1;j++){
                if(sampleArr[j]==target-sampleArr[i]){
                    elements[0]=sampleArr[i];
                    elements[1]=sampleArr[j];
                }
            }
        }
        System.out.println("The elements for the target sum is "+elements[0]+" & "+elements[1]);








    }

}
