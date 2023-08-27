package GroupProjectJava;

public class Task3 {
    public static void main(String[] args) {

        int [][] numbers={{5,7,8,4,3},
                          {3,4,5,6,7},
                          {1,4,6,8,9}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {

                if(numbers[row][col]%2==0){
                    System.out.print(numbers[row][col]+" ");
                }

            }

        }
    }
}
