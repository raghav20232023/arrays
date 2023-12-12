package com.example4;

//problem statement
// take an array as input from the user.
// search for a given number x and print the index at which it occurs
//linear search algorithm

import java.util.Scanner;

public class linearSearchAlgorithm {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();

        int array3 [] = new int[size];

        //input loop
        System.out.println("enter the elements of array : ");
        for (int i = 0; i<size; i++){
            System.out.print("enter element no "+i+" : ");
            array3[i] = sc.nextInt();
        }

        //output loop
        System.out.println("the elements of the given array are : ");
        for (int i = 0; i<size; i++){
            System.out.print("element no "+i+" is : "+ array3[i]);
            System.out.println();
        }

        System.out.println("enter the number x to be searched : ");
        int number = sc.nextInt();

        for (int i = 0; i < size; i++){ //search loop   //linear search algorithm
            if (array3[i] == number){
                System.out.println("element "+number+" found at index "+i);
            }
        }
    }

}
