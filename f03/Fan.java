public class Fan {
    enum Power {
        LOW,
        MEDIUM,
        HIGH
    }

    private Power power;
    private boolean isOn;
    private String color;



    /*
        Constructors
     */

    public Fan() {
        this.power = Power.LOW;
        this.isOn = false;
        this.color = "#ffffff";
    }



    /*
        Getters and Setters
     */

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println("power: " + fan.getPower());
        System.out.println("is on: " + fan.isOn());
        System.out.println("color: " + fan.getColor());

        System.out.println("");

        fan.setOn(true);
        fan.power = Power.HIGH;

        System.out.println("power: " + fan.getPower());
        System.out.println("is on: " + fan.isOn());
        System.out.println("color: " + fan.getColor());
    }
}
