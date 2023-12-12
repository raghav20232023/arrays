package com.example4;

//problem statement
//find the maximum and minimum number in an array of integers

import java.util.Scanner;

public class maxMinArray {
    public static void main(String[] args){

        System.out.println("program to find the maximum and minimum integer in an array ");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array : ");
        int size = sc.nextInt();

        int numbers[] = new int[size];  //array definition

        //input array
        System.out.println("enter the elements of array : ");
        for (int i = 0; i<size; i++){
            System.out.print("enter element no "+i+" : ");
            numbers[i] = sc.nextInt();
        }

        //output array
        System.out.println("the elements of the given array are : ");
        for (int i = 0; i<size; i++){
            System.out.println("element number "+i+" is : "+numbers[i]);
        }

        int max = Integer.MIN_VALUE;
        // above variable max stores the minimum value integer data type can hold
        //later it will be used to store the maximum value encountered in the array

        int min = Integer.MAX_VALUE;
        //above variable min stores the maximum value integer daya type can hold
        //later it will be used to store the minimum value encountered in the array

        for (int i = 0; i<numbers.length; i++){
            //for loop for iterating through the elements of array numbers
            //instead of using variable size, we can also use numbers.length to specify the size of array

            if (numbers[i] < min){
                min = numbers[i];
            }
            // first time the loop runs
            // it checks if given element is less than maximum value of integer datatype
            // if yes then it stores that integer (lets say imteger1) in min variable
            //next time the for loop runs it check
            // if another element's value is less than the min variable (integer1)
            //if yes then it updates the value of min variable to this new integer encountered
            //this is how by comparing again and again, it finds the minimum valued integer in the array

            if (numbers[i] > max){
                max = numbers[i];
            }
            // first time the loop runs
            // it checks if given element is more than minimum value of integer datatype
            // if yes then it stores that integer (lets say imteger1) in max variable
            //next time the for loop runs it check
            // if another element's value is greater than the max variable (integer1)
            //if yes then it updates the value of max variable to this new integer encountered
            //this is how by comparing again and again, it finds the maximum valued integer in the array
        }
        System.out.println("the maximum valued integer encountered in the array is : "+ max);
        System.out.println("the minimum valued integer encountered in the array is : "+ min);
    }
}