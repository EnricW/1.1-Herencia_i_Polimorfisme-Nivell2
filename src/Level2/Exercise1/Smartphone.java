package Level2.Exercise1;

public class Smartphone extends Phone implements Watch, Camera {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void ringAlarm() {
        System.out.println("Alarm is ringing");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking a picture");
    }
}
