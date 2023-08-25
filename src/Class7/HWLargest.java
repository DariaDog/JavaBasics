package Class7;

public class HWLargest {
    public static void main(String[] args) {

        int[] numbers={55,37,90,36,12};

        int largest=numbers[0];
        for(int n:numbers){
            if(n>largest){
                largest=n;
            }
        }
        System.out.println(largest);




    }
}
