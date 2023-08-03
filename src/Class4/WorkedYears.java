package Class4;

import java.util.Scanner;

public class WorkedYears {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your worked years");
        double workedYears=scanner.nextDouble();

        if (workedYears>=5){
            System.out.println("Congrats! You are eligible for the bonus ");
            Scanner scanner2=new Scanner(System.in);
            System.out.println("What is your salary?");
            double salary=scanner.nextDouble();

            if(salary>50000){
                System.out.println("Your bonus will be 5000");
            }else{
                System.out.println("Your bonus will be 3000");
            }
        }else{
            System.out.println("Sorry, no bonus in this year");
        }

    }
}
