package GroupProjectJava;

public class Task7 {
    public static void main(String[] args) {
        int n=10;
        int first=0;
        int second=1;

        System.out.println("Fibonacci series "+n);

        for (int i = 1; i <=n ; i++) {
            System.out.println(first+" ");

            int next=first+second;
            first=second;
            second=next;

        }

    }
}
