package ss5_AccessModfier.BaiTap;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";

    public AccessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
