package ss5_AccessModfier.ThucHanh;

public class StaticProperty {
    // <access modifiers> <Kieu du lieu> <ten thuoc tinh>
    private String name;

    private String engine;

    private int numberOfClass;

    // constructor - phuong thuc khoi tao
    // phuong thuc khoi tao khong co tham so truyen vao

    // Phuong thuc khoi tao dung de khoi tao doi tuong danh cho class StaticProperty
    // Phuong thuc khoi tao co ten trung voi ten class
    // Phuong thuc khoi tao khong co kieu du lieu tra ve
    // Trong 1 class co the co 1-n phuong thuc khoi tao
    public StaticProperty() {}

    public StaticProperty(String name) {
        this.name = name;
    }

    public StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
    }
    public StaticProperty(int numberOfClass) {
        this.numberOfClass = numberOfClass;
    }

    public StaticProperty(String name, String engine, int numberOfClass) {
        this.name = name;
        this.engine = engine;
        this.numberOfClass = numberOfClass;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumberOfClass() {
        return numberOfClass;
    }

    public void setNumberOfClass(int numberOfClass) {
        this.numberOfClass = numberOfClass;
    }
}

