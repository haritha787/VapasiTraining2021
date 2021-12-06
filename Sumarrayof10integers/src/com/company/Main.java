//package com.company;

public class Main {

    public static void main(String[] args) {
	// add sum of 10 integers in array
        int arr[]={1,2,3,4,5,6,7,78,100,99};
        int sum=0;
        sum=addarrayof10integers(arr);
        System.out.println("Sumof array of 10 integers "+sum);

    }
    static int addarrayof10integers(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
}
