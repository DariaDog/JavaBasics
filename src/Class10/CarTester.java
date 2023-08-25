package Class10;

public class CarTester {
    public static void main(String[] args) {
        Car lexus=new Car();
        lexus.name="Lexus";
        lexus.color="Space";
        lexus.price=51500;
        lexus.model="RX 450h";

        System.out.println(lexus.name);
        System.out.println(lexus.color);
        System.out.println(lexus.price);
        System.out.println(lexus.model);

        lexus.steeringWheel();
        lexus.autoCruise();

    }
}
