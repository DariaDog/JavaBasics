package Review3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your first boolean value true/false ");
            boolean value = scanner.nextBoolean();
        System.out.println("Please enter your first boolean value true/false");
            boolean value2=scanner.nextBoolean();

            if(value&&value2){
                System.out.println("Both values are true");
            }else{
                System.out.println("Both values are not true");
            }
    }
}
