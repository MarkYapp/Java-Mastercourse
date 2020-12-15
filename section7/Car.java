package section7;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return("The car engine is starting");
    }

    public String accelerate() {
        return("The car is accelerating");
    }

    public String brake() {
        return("The car is braking");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


}






//class Ford {
//
//}
//
//class Holden {
//
//}