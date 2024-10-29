package Level1.Exercise1;

public class WindInstrument extends Instrument {

    static {
        System.out.println("Static initialization block of WindInstrument class - Class is being loaded");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }
}
