package Class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone apple=new Phone();
        apple.name="IPhone";
        apple.price=9990;
        apple.model="13Pro";

        System.out.println(apple.name);
        System.out.println(apple.price);
        System.out.println(apple.model);

        apple.call();
        apple.text();
        apple.apps();

        System.out.println();

        Phone pixel=new Phone();
        pixel.name="Google";
        pixel.price=2199;
        pixel.model="Pixel7";

        System.out.println(pixel.name);
        System.out.println(pixel.price);
        System.out.println(pixel.model);

        pixel.call();
        pixel.text();
        pixel.apps();


    }
}
