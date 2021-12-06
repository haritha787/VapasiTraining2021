package com.company;

public class Application {
   //use default and parameterised constructors to create objects and print the states of that object
    public static void main(String[] args) {
        Student studentDB1= new Student();
        System.out.println("For default constructor: "+"Marks is "+studentDB1.Marks+" Name is "+studentDB1.Name+" Rollnumber is "+studentDB1.RollNumber);
        studentDB1.checkifStudentPassedorFailed(studentDB1.Marks);
        Student studentDB2= new Student(23,"Param",10);
        System.out.println("For Param constructor: "+"Marks is "+studentDB2.Marks+" Name is "+studentDB2.Name+" Rollnumber is "+studentDB2.RollNumber);
        studentDB1.checkifStudentPassedorFailed(studentDB2.Marks);

        studentDB1.Name="Haritha";
        studentDB1.RollNumber=3333;
        studentDB1.Marks=60;

        studentDB2.Name="Laxmi";
        studentDB2.RollNumber=4444;
        studentDB2.Marks=100;
        System.out.println("For default constructor override: "+"Marks is "+studentDB1.Marks+" Name is "+studentDB1.Name+" Rollnumber is "+studentDB1.RollNumber);
        studentDB1.checkifStudentPassedorFailed(studentDB1.Marks);
        System.out.println("For default constructor override: "+"Marks is "+studentDB2.Marks+" Name is "+studentDB2.Name+" Rollnumber is "+studentDB2.RollNumber);
        studentDB1.checkifStudentPassedorFailed(studentDB2.Marks);
    }

}
