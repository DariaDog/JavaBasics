package review2;

import java.util.Scanner;

public class HomeWorkReplit {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1 = scanner.next();
        String word2 =scanner.next();

        System.out.println("Please enter two numbers");
        double int1 = scanner.nextDouble();
        double int2 = scanner.nextDouble();

        if ((int1==int2) && (word1.equals(word2))){
            System.out.println("AND");
        }else if ((int1>=int2) || (word1.equals(word2))){
            System.out.println("OR");
        }else{
            System.out.println("NONE");
        }
    }
}
