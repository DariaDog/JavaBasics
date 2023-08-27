package GroupProjectJava;

public class Task1 {
    public static void main(String[] args) {

        int [] temp={32,25,27,20,29,30,33};


        int large=temp[0];
        int small=temp[0];


        for (int d:temp){
            if(d>large){
                large=d;

            }
            for(int s:temp){
                if(s<small){
                    small=s;
                }
            }

        }
        System.out.println("Highest temperature for the week "+ large);
        System.out.println("Lowest temperature for the week "+small);


    }
}
