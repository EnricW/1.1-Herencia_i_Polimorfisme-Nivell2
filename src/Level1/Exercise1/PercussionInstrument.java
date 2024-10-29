package Level1.Exercise1;

public class PercussionInstrument extends Instrument {

    static {
        System.out.println("Static initialization block of PercussionInstrument class - Class is being loaded");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }
}
