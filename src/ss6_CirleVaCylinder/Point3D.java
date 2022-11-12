package ss6_CirleVaCylinder;

public class Point3D {
    protected float z = 0.0f;
    private float y;
    private float x;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super();
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXyz() {
        float[] arrXyz = {this.x, this.y, this.z};
        return arrXyz;
    }

    public void setXyz(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }

    public void setX(int i) {
    }

    public long[] getXy() {
        return new long[0];
    }

    public void setY(int i) {
    }

    public void setXy(int i, int i1) {
    }
}
