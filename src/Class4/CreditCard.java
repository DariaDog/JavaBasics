package Class4;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card? Yes/No");
        String card=scanner.next();
        if(card.equals("Yes")){
            System.out.println("Congratulation");

            Scanner scanner2=new Scanner(System.in);
            System.out.println("What balance in your card?");
            double balance=scanner.nextDouble();

            if (balance>1000){
                System.out.println("Pay off Immediately");
            }else{
                System.out.println("You can spend more");
            }
        }else if(card.equals("No")){
            System.out.println("You can apply for a credit card");
        }
    }
}
