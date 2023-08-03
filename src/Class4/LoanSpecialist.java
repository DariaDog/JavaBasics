package Class4;

import java.util.Scanner;

public class LoanSpecialist {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the loan amount");
        double loan=scanner.nextDouble();

        if(loan<=200000){
            System.out.println("Your loan is approved");

        }else{
            System.out.println("Sorry, your loan is not approved");
        }




    }
}
