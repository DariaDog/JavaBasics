package Class8;

public class T4Arrays {
    public static void main(String[] args) {

        int [] nums={10,77,25,56,60,20,-10,-5};
        int small=nums[0];


        for(int d:nums){
           if(d<small){
               small=d;
            }

        }
        System.out.println(small);


    }
}
