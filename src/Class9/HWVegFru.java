package Class9;

public class HWVegFru {
    public static void main(String[] args) {

        String [][] grocery={{"Tomato","Bell Pepper","Cucumber","Beet"},
                {"Banana","Apple","Strawberry","Blueberry"},
                {"Sourcream","Milk","Cheese","Yogurt"},
                {"Cookies","Raffoello","Snickers","Chocolate"}
        };

        for (int row = 0; row < grocery.length; row++) {
            for (int col = 0; col < grocery[row].length; col++) {
                System.out.print(grocery[row][col]+" ");

            }
            System.out.println();


        }
        System.out.println();

        for(String [] row:grocery){
            for(String col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
