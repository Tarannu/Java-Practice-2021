package com.company;

import java.io.CharArrayReader;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name="tarannum";

        String output="";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(i%2==0){
                ch= Character.toUpperCase(ch);
                output+=ch;

            }else{
                output+=ch;
            }

        }

        System.out.println("name is without substring "+output);
        output="";
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(i%2==0){
                output+=name.substring(i,i+1).toUpperCase();

            }else{
                output+=name.substring(i,i+1);
            }

        }
        System.out.println("name using substring "+output);
    }
}
