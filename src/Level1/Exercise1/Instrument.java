package Level1.Exercise1;

abstract class Instrument {
    private String name;
    private double price;

    {
        System.out.println("Instance initialization block of Instrument class");
    }

    static {
        System.out.println("Static initialization block of Instrument class - Class is being loaded");
    }

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void play();
}