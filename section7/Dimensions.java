package section7;

public class Dimensions {
    private int width;
    private int length;

    public Dimensions(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getDepth() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void getArea() {
        System.out.println("Room area = " + width * length);
    }
}