package section7.Room;

public class Door {
    private String color;
    private String openDirection;

    public Door(String color, String openDirection) {
        this.color = color;
        this.openDirection = openDirection;
    }

    public String getColor() {
        return color;
    }

    public String getOpenDirection() {
        return openDirection;
    }

    public void open() {
        System.out.println("Door was opened");
    }
}
