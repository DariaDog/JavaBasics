package class5;

import java.util.Scanner;

public class WhatNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a number");
        double num = scanner.nextDouble();



        if(num>=1 && num<=10){
            System.out.println("Your number is small");
        } else if(num>=11 && num<=100){
            System.out.println("Your number is medium");


        }else if(num>=101 && num<=1000){
            System.out.println(" Your number is large");
        }else{
            System.out.println("Too big number");
        }
    }
}