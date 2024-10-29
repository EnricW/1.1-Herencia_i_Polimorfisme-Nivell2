package Level2.Exercise1;

public class Smartphone extends Phone implements Watch, Camera {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void ringAlarm() {
        System.out.println("Alarm is ringing");
    }

    public void takePicture() {
        System.out.println("Taking a picture");
    }
}
