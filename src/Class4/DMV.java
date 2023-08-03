package Class4;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is "+name);

        Scanner scanner2=new Scanner(System.in);
        System.out.println("Please enter your age");
        double age = scanner.nextDouble();
        if(age>18){
            System.out.println("You will get a driver's license");
        }else{
            System.out.println("You will get a learner's permit");
        }

    }
}
