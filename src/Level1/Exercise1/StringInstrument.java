package Level1.Exercise1;

public class StringInstrument extends Instrument {

    static {
        System.out.println("Static initialization block of StringInstrument class - Class is being loaded");
    }

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing");
    }
}
