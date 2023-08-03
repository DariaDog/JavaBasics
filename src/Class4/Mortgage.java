package Class4;

public class Mortgage {
    public static void main(String[] args) {

        double mortgageRate=5.5;
        double mortgagePrice=350000;

        if(mortgageRate>4.5){
            System.out.println("will not buy a house");


            }else{
            System.out.println("considering buying");
            if(mortgagePrice>50000){
                System.out.println("user will take a loan");
        }else{
                System.out.println("User can pay cash");
            }
        }


    }
}
