//package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number less than 31 ");
        int number = sc.nextInt();
        //int number= 15;
        if(number > 31)
        {
            System.out.print("You entered a wrong number greater than 31 ");
        }
        else {
            switch (number % 7) {
                case 0:

                    System.out.print("Day of the week Sunday ");
                    break;

                case 1:

                    System.out.print("Day of the week Monday ");
                    break;
                case 2:

                    System.out.print("Day of the week Tuesday ");
                    break;

                case 3:

                    System.out.print("Day of the week Wednesday ");
                    break;
                case 4:

                    System.out.print("Day of the week Thursday ");
                    break;

                case 5:

                    System.out.print("Day of the week Friday ");
                    break;
                case 6:

                    System.out.print("Day of the week Saturday ");
                    break;


                default:

                    System.out.print("Have a great day ");
                    break;
            }
        }
    }
}
