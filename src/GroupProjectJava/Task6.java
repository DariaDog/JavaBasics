package GroupProjectJava;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int count=0;
        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                count++;
            }

        }
        if (count==2){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }

    }
}
