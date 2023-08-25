package class5;

import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {

        //Write a program for user to enter his/hers birth month. Based on the month define the season.
        //Example: if user is born in March, April, May → season =”Spring”
        //if user is born in June, July, August →
        //season =”Summer”  etc …
        //At the end of the program we should see 1 output as “You were born is season ______”.

        Scanner birth = new Scanner(System.in);
        System.out.println("Please Enter your birth month");
        String birth1 = birth.next();

        if (birth1.equals("March") || birth1.equals("April") || birth1.equals("May")) {
            System.out.println("You were born is season Spring");
        } else if (birth1.equals("June") || birth1.equals("July") || birth1.equals("August")) {
            System.out.println("You were born is season Summer");
        } else if (birth1.equals("September") || birth1.equals("October") || birth1.equals("November")) {
            System.out.println("You were born is season Fall");
        } else {
            System.out.println("You were born is season Winter");


            //if(birthMonth.equalsIgnoreCase(anotherString"Mar"));
            // for don't care how word put upper ur lower case!!!
        }
    }
}