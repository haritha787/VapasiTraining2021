package com.company;
public class Student{
       int RollNumber;
       int Marks;
       String Name;

       Student()
       {
           this.Name="Default";

       }

       Student(int Rollnumbervalue, String Namevalue, int Marksvalue)
       {
             this.RollNumber=Rollnumbervalue;
             this.Name=Namevalue;
             this.Marks=Marksvalue;

       }

      void checkifStudentPassedorFailed(int marks)
       {
              if(marks<35)
              {
                     System.out.println("the student has failed with marks "+marks);
              }else
              {
                     System.out.println("the student has passed with marks "+marks);
              }
       }


}
