package com.company;

public class Main {
    //funtions to add two numbers and three numbers
    public static void main(String[] args) {

        int a=1;
        int b=2;
        int c=3;
        int addtwo=0;
        int addthree=0;
        addtwo=addnumber(a,b);
        addthree=addnumber(a,b,c);
        System.out.println("Sum of two numbers = "+addtwo);
        System.out.println("Sum of three numbers = "+addthree);
    }

    static int addnumber(int a,int b){

        int result=a+b;
        return result;
    }
    static int addnumber(int a,int b, int c){

        int result=a+b+c;
        return result;
    }

}
