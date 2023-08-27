package GroupProjectJava;

public class Task8 {
    public static void main(String[] args) {

        int[] numbers={12,45,74,57,329};

        int min=numbers[0];
        int max=numbers[0];

        for(int d:numbers){
            if(d<min){
                min=d;
            }
            for(int t:numbers){
                if(t>max){
                    max=t;
                }
            }

        }
        System.out.println("Minimum number is "+min);
        System.out.println("Maximum number is "+max);


    }
}
