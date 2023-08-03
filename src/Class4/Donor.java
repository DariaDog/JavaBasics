package Class4;

public class Donor {
    public static void main(String[] args) {
        double age=19;
        double weight=100;

        if(age>18){
            System.out.println("You are eligible");
            if(weight>110){
                System.out.println("You are eligible for donate");
            }else{
                System.out.println("We can not accept you");
            }
        }else{
            System.out.println("You can not be a donor");
        }
    }
}
