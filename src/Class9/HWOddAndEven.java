package Class9;

public class HWOddAndEven {
    public static void main(String[] args) {
        int [][] nums={{78,33,45,90},
                       {11,10,87,56},
                       {22,33,77,99}};

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if(nums[row][col]%2==0){
                    System.out.print(nums[row][col]+" ");



                }


            }
            System.out.println();

        }
    }
}
