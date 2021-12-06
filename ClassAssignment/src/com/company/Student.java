package com.company;

import java.util.Scanner;

public class Student {
    static int numberOfStudents;
     Student() {
          numberOfStudents++;
     }

     public static void main(String[] args)
     {

                 Student student1=new Student();

                 System.out.println("number of students" + Student.numberOfStudents);

         }




}
