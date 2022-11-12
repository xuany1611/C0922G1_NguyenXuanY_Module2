package ss6_CirleVaCylinder;

public class Cylinder {
    private double radius;
    private String color;

    public Cylinder() {
    }

    public Cylinder(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * this.radius * Math.PI;
    }
    @Override
    public String toString(){
        return "A circle with radius=" + this.getRadius() + " and color " + this.getColor();
    }
}
