package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopFan {
    public static final int Slow = 1;
    public static final int Medium = 2;
    public static final int Fast = 3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = " red";

    public XayDungLopFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()==true) {
            return "XayDungLopFlam{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "XayDungLopFlam{" +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }
}
