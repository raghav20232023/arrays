package com.example4;

//program to let user create an array by inputing its size and then the elements inside it

import java.util.Scanner;

public class arrays2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int size = sc.nextInt();    //user inputs the size of the array

        int numbers[] = new int[size];  //creating a user defined array with user defined size

        //if the elements of an array are not defined, by default each element of an array
        //is initialised with value 0

        //using for loop to input the elements in the array by the user
        System.out.println("enter the elements to be stored in array");
        for (int i=0; i<size; i++){
            System.out.print("enter element no "+ i+" ");
            numbers[i] = sc.nextInt();
        }

        //using for loop to output the elements in the array by the user
        System.out.println("elements entered in the array are as follows : ");
        for (int i = 0; i<size; i++){
            System.out.print("element no "+ i +" is : ");
            System.out.print(numbers[i]);
            System.out.println();
        }

    }
}
