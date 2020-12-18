package section7.Room;

public class Light {
    private int brightness;
    private boolean adjustable;
    private boolean isOn;

    public Light(int brightness, boolean adjustable, boolean isOn) {
        this.brightness = brightness;
        this.adjustable = adjustable;
        this.isOn = isOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean getIsAdjustable() {
        return adjustable;
    }

    public boolean getIsOn() {
        System.out.println("Light is currently " + (isOn ? "on" : "off"));
        return isOn;
    }

    public void flipSwitch() {
        System.out.println("Flipping switch");
        toggleLight();
    }

    private void toggleLight() {
        this.isOn = !isOn;
        System.out.println("Light is " + (isOn ? "on" : "off"));
    }
}
