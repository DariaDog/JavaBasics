package class5;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your grade");
        int score = scanner.nextInt();

        if(score>=90){
            System.out.println("A");
        }else if(score>70 && score<90){
            System.out.println("B");
        }else if(score>=50 && score<70){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
        }
    }

