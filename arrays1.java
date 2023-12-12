package com.example4;
//this is a basic program that illustrates the use of arrays in java.
//in this program we will define an array, and retrieve the elements of an array using different ways.

public class arrays1 {

    public static void main(String[] args){

        //int [] marks = new int[3]
        int marks[] = new int[3];   //defining an array with three elements
        // it doesnt matter whether [] comes before or after marks.
        //both forms are acceptable

        //storing elements in the array
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        //manually printing out each individual element in the array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //in case of many elements in an array, the above approach is not useful
        //when we have many elements, we simply iterate through the elements of the list
        //using for loop, as illustrated below:

        for (int i=0; i<3; i++){
            System.out.println(marks[i]);

        }

        int numbers[] = {97,98,95}; //we can directly also define arrays like this instead of
        //listing out individual statements of index after the array object definition


    }



}
