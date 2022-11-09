package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public String dixplay() {
        if (getDiscriminant() < 0) {
            return "phương trình vô nghiệm ";
        } else if (getDiscriminant() == 0) {
            return "phương trình có nghiệm kép " + getRoots11();
        } else {
            return "phương trình có hai nghiệm " + getRoots12() + getRoots11();
        }
    }

    public double getRoots11() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoots12() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

}

