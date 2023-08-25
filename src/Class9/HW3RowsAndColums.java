package Class9;

public class HW3RowsAndColums {
    public static void main(String[] args) {

        int [][] numbers={{45,24,56,89},
                          {77,66,44,55},
                          {90,40,20,50}};
        int sum=0;

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col <numbers[row].length ; col++) {
                sum=sum+numbers[row][col];

            }

        }
        System.out.println(sum);
    }
}
