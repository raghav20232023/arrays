package com.example4;

import java.util.Scanner;

public class checkArrayAscending {

    public static void main(String[] args){

        System.out.println("program to check if array entered by the user is sorted in ascending order or not: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array : ");
        int size = sc.nextInt();

        int array1 [] = new int[size];  //array definition

        System.out.println("enter the elements of array : ");
        //input loop
        for (int i = 0; i<size; i++){
            System.out.print("enter element no "+i+" : ");
            array1[i] = sc.nextInt();

        }

        //output loop
        System.out.println("the elements of the given array are : ");
        for (int i = 0; i<size; i++){
            System.out.print("element no "+i+" is : "+ array1[i]);
            System.out.println();
        }

        boolean isAscending = true; //initialising a boolean variable isAscending and setting it to true

        for(int i = 0; i<array1.length - 1; i++) {
            // see that limiting condition is array1.length -1
            //this is so because in if condition we have used array[i+1}
            //if the limiting condition was instead set as array1.length , then array1[i+1]
            //would exceed the upper bound of the allowed maximum index i.e. array1.length
            // it would throw out of bounds error
            if (array1[i] > array1[i+1]){
                isAscending = false;
            }
        }

        if (isAscending){   //simply writing isAscending means if isAscending is True
            System.out.println("the given array is in ascending order");
        }
        else {
            System.out.println("the given array is not in ascending order");
        }
    }
}
