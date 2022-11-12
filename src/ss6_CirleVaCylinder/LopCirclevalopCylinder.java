package ss6_CirleVaCylinder;

public class LopCirclevalopCylinder {
    protected double radius;
    protected String color;
    protected LopCirclevalopCylinder() {
    }
    public LopCirclevalopCylinder(double radius, String color) {
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
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "radius : "+ radius +
                " and color : " + color +
                " and area : " + getArea();
    }
}