package class5;

import java.util.Scanner;

public class CountrySwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your country");
        String country = scanner.nextLine();
   //country=country.toLowerCase();

        switch (country){
            case "USA":
                System.out.println("English");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            case "Iceland":
                System.out.println("Icelandic");
                break;
            case "Australia":
                System.out.println("English");
                break;

            default:
                System.out.println("Wrong day");
        }



        }
    }

