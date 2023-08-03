package Class4;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city = scanner.next();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Please enter temperature in your city");
        double temp=scanner.nextDouble();
        double convert= (temp-32)*5/9;
        System.out.println("The temperature in "+city+" "+"is "+convert);


    }
}
