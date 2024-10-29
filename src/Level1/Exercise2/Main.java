package Level1.Exercise2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(200);

        Car.brake();
        car.brake();
        car.accelerate();

        System.out.println("Brand (static final): " + Car.BRAND);
        System.out.println("Model (static): " + Car.model);
        System.out.println("Power (final): " + car.power);
    }
}
