package section7;

public class Mitsubishi extends Car {
    public Mitsubishi(String name, int cylinders) {
        super("Mitsubishi", 4);
    }

    @Override
    public String startEngine() {
        return("The Mitsibushi engine is starting");
    }

    @Override
    public String accelerate() {
        return("Ths Mitsubishi is accelerating");
    }
}
