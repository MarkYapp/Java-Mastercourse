package section7;

public class Room {
    private Dimensions dimensions;
    private String flooring;
    private Door door;
    private Chair chair;

    public Room(Dimensions dimensions, String flooring, Door door, Chair chair) {
        this.dimensions = dimensions;
        this.flooring = flooring;
        this.door = door;
        this.chair = chair;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getFlooring() {
        System.out.println("Flooring is " + flooring);
        return flooring;
    }

    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }

    public Door getDoor() {
        return door;
    }

    public Chair getChair() {
        return chair;
    }
}
