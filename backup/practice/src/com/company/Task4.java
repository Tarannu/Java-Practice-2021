package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a string of words to count the smallest word");
//        String words=sc.next();
//        String[] arrOfStr=words.split(" ");
        int min=999;
//        for(String a:arrOfStr){
//
//            if(a.length()<min){
//                min=a.length();
//
//            }
//
//
//        }
//        System.out.println(min);
//        int[] sumArr=new int[]{1,2,3,4,5,6,7,8,9,10};
//        int sum=0;
//        min=999;
//        int max=0;
//        for(int i:sumArr){
//            if(i<min){
//                min=i;
//            }
//            if(i>max){
//                max=i;
//            }
//        }
//        for(int i=0;i<=sumArr.length-1;i++){
//            if(i!=min && i!=max){
//                sum+=i;
//            }
//        }
//        System.out.println("Sum leaving min and max is "+sum);

        String spaceRemove="Hi My Space needs to be removed";
        spaceRemove=spaceRemove.replaceAll("\\s","");
        System.out.println(spaceRemove);

        String unique="Monstone";
        boolean result=true;
        char[] arrUnique=unique.toCharArray();
        Arrays.sort(arrUnique);
        for(int i=0;i<arrUnique.length-1;i++){

            if(arrUnique[i]==arrUnique[i+1]) result=false;

        }

        System.out.println(result);

        StringBuilder sb=new StringBuilder("Hello Hi");
        sb.reverse();
        System.out.println(sb);
        //task 5
        int[] evenOdd=new int[]{23,25,75,87,47,1,91,51,2};
        int countEven=0;
        int countOdd=0;
        int max=0;
        int resultant=0;
        String oddOrEven="";
        for(int i=0;i<evenOdd.length;i++){
            if(evenOdd[i]%2!=0) countOdd++;
            else countEven++;
            if(countEven>max){
                max=countEven;
                oddOrEven="even";
            }else if(countOdd>max) {
                max=countOdd;
                oddOrEven="odd";

            }
        }
        for(int i=0;i<evenOdd.length;i++){
            if(oddOrEven=="odd") {
               if(evenOdd[i]%2==0) resultant=evenOdd[i];
            }else if(oddOrEven=="even"){
                if(evenOdd[i]%2!=0){
                    resultant=evenOdd[i];
                }
            }
        }
        System.out.println("Returning even or odd based on majority even or odd"+resultant);

        String swapLetters="heLLo WOrld";
        StringBuffer strBuffer=new StringBuffer(swapLetters.length());
        for(int i=0;i<swapLetters.length();i++){
            char c=swapLetters.charAt(i);
            if(Character.isUpperCase(c)){
                c=Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                c=Character.toUpperCase(c);
            }
            strBuffer.append(c);
        }
        System.out.println("changed upper case and lower case before is "+swapLetters+" after "+strBuffer);

        String braces="{{([ ) ] }}";
        int countBraces=0;

        for(int i=0;i<braces.length();i++){
            char c=braces.charAt(i);
            if (c == '('){
                countBraces++;
                if(c==')') countBraces--;
            }
            if(c=='{'){
                countBraces++;
                if(c=='}') countBraces--;
            }
            if(c=='['){
                countBraces++;
                if(c==']') countBraces--;
            }

        }
        if(countBraces!=0) System.out.println("Invalid braces");
        else System.out.println("valid braces");


    }
}
