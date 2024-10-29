package Level1.Exercise1;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Creating the first instance of WindInstrument:");
        WindInstrument flute = new WindInstrument("Flute", 250.0);
        flute.play();
        System.out.println();

        System.out.println("2. Creating a second instance of WindInstrument:");
        WindInstrument clarinet = new WindInstrument("Clarinet", 400.0);
        clarinet.play();
        System.out.println();

        System.out.println("3. Creating the first instance of StringInstrument:");
        StringInstrument violin = new StringInstrument("Violin", 500.0);
        violin.play();
        System.out.println();

        System.out.println("4. Creating the first instance of WindInstrument:");
        PercussionInstrument drum = new PercussionInstrument("Drum", 200.0);
        drum.play();
    }
}
