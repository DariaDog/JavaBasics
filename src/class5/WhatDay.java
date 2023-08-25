package class5;

import java.util.Scanner;

public class WhatDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = 5;



        if(day>=1 && day<=5){
            System.out.println("Weekdays");
        } else if(day==65 || day==7){
            System.out.println("Weekends");


        }else{
            System.out.println("Invalid Day");
        }
    }
}