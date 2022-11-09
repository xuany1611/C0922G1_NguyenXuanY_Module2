package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;


public class LopHinhChuNhat {
    double width, height;


    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return " Rectangge{" + " width= " + width + ", height = " + height + "}";
    }
}
