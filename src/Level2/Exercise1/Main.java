package Level2.Exercise1;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        System.out.println("The phone with brand " + smartphone.getBrand() +
                ", model " + smartphone.getModel() + " is...");
        smartphone.dial("93 123 45 67");
        smartphone.ringAlarm();
        smartphone.takePicture();
    }
}
