package class5;

import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your heights in inches");
        int heights = scanner.nextInt();

        if(heights<60){
            System.out.println("Short");
        } else if(heights>=60&&heights<=72){
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }
    }
}