package Class9;

public class Task {
    public static void main(String[] args) {
        //print only eve numbers from this array

        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row < 3; row++) {//for row->(int row=0; row< numbers.length; row++)
            for (int col = 0; col < 4; col++) { // for col ->(int col=0; col<numbers[row].length; col++) numbers[row]=>(gives us the complete 1D array
                if (numbers[row][col] % 2 == 0) {  //(numbers[row][col] % 2 !== 0) only odd numbers
                    System.out.print(numbers[row][col] + " ");
                }

            }
            System.out.println();

        }
    }
}
