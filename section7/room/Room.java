package section7.room;

public class Room {
    private Dimensions dimensions;
    private String flooring;
    private Door door;
    private Chair chair;
    private Light light;

    public Room(Dimensions dimensions, String flooring, Door door, Chair chair, Light light) {
        this.dimensions = dimensions;
        this.flooring = flooring;
        this.door = door;
        this.chair = chair;
        this.light = light;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setFlooring(String flooring) {
        System.out.println("Setting flooring to: " + flooring);
        this.flooring = flooring;
    }

    public Door getDoor() {
        return door;
    }

    public Chair getChair() {
        return chair;
    }

    public String getFlooring() {
        System.out.println("Flooring is " + flooring);
        return flooring;
    }

    public void openDoor() {
        System.out.println("opening the door");
        door.open();
    }

    public Light getLight() {
        return light;
    }
}
