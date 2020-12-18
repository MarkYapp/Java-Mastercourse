package section7.Room;

public class Chair {
    private int width;
    private int height;
    private String color;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public Chair(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void moveChair() {
        System.out.println("Chair was moved");
    }
}
