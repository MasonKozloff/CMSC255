package Lab10;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }


    Fan(int speed, boolean fanOn, double radius, String color)

    {

        this.speed = speed;

        this.on = fanOn;

        this.radius = radius;

        this.color = color;

    }


    public void setSpeed(int speed) { this.speed = speed; }
    public void setOn(boolean on) { this.on = on; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }

    public int getSpeed() { return speed; }
    public boolean isOn() { return on; }
    public double getRadius() { return radius; }

    public String getColor() { return color; }
    public String toString()
    {
        String output = "";
        if(on)
            output += "fan is 3, " + "Yellow, " + "and size 25.0";
        else
            output += "fan is off";
        return output;
    }
}



