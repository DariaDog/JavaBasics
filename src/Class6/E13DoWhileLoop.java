package Class6;

import java.util.Scanner;

public class E13DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int input;

        System.out.println("please Enter a number and -1 to terminate");
        input = scanner.nextInt();
        System.out.println("You have entered "+input);
        while (input != -1) {
            System.out.println("please Enter a number and -1 to terminate");
            input = scanner.nextInt();
            System.out.println("You have entered " + input);
        }
    }
}
