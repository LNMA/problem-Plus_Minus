package com.louay.project.problem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = fillAnArray(input);
        printFraction(arr);


    }

    public static int [] fillAnArray(Scanner input){
        System.out.print("please input number of element : ");
        int length = input.nextInt();
        int [] arr = new int[length];
        System.out.println("please input element value");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void printFraction(int [] arr){
        double positive = 0 ;
        double negative = 0 ;
        double zero = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0){
                positive++;
            }else {
                if (arr[i] < 0){
                    negative++;
                }else{
                    if (arr[i] == 0){
                        zero++;
                    }
                }
            }
        }

        System.out.printf("fraction of positive numbers : %6f \nfraction of negative numbers : %6f " +
                "\nfraction of zero numbers : %6f",positive/arr.length,negative/arr.length,zero/arr.length);
    }
}
