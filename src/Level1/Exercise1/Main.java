package Level1.Exercise1;

public class Main {
    public static void main(String[] args) {
        WindInstrument flute = new WindInstrument("Flute", 250.0);
        flute.play();

        WindInstrument clarinet = new WindInstrument("Clarinet", 400.0);
        clarinet.play();

        StringInstrument violin = new StringInstrument("Violin", 500.0);
        violin.play();

        PercussionInstrument drum = new PercussionInstrument("Drum", 200.0);
        drum.play();
    }
}
