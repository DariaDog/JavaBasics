package Review4;

import java.util.Scanner;

public class Replit76 {
    public static void main(String [] args){
        String [] days= new String[7];
        Scanner scanner=new Scanner(System.in);
        for (int i =0; i<=7; i++) {
            System.out.println("Please enter day "+(i+1)+" of the week");
            days[i]=scanner.next();

        }

        for(int i=0; i<=7; i++){
            System.out.println(days[i]);
        }


    }
}
