package Level1.Exercise2;

public class Car {
    public static final String BRAND = "SEAT";
    public static String model = "Ibiza";
    public final int power;

    public Car(int power) {
        this.power = power;
    }

    public static void brake() {
        System.out.println("The car is braking");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}
