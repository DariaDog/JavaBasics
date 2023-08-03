package class3;

public class TemperatureCheck {
    public static void main(String[] args) {
        double temperature=25;

        if(temperature<32){ //25<32 true
            System.out.println("Water will freeze with temperature "+temperature);
        }else{
            System.out.println("Water will NOT freeze with temperature "+temperature);
        }

    }
}
