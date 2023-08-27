package Class11;

public class E2StringMethods {
    public static void main(String[] args) {
        String str = "Batch 17 is A great.";
         int count=0;
        for (int i = 0; i < str.length(); i++) {    //so this is running through each element and the  .charAt will check these elements?

            if(str.charAt(i)=='a'){      // ||str.charAt(i)=='A'
                count++;
            }
            }
        System.out.println(count);

        }
    }

