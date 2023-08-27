package GroupProjectJava;

public class Task9 {
    public static void main(String[] args) {

        int [] numbers={34,54,77,45,78,24};
        int temp=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }

            }

        }
        System.out.println("The second largest number is "+numbers[numbers.length-2]);

    }
}
