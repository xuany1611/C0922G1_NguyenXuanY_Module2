package ss6_CirleVaCylinder;

import java.util.Arrays;

public class Point3D2 {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(10,12,13);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXy()));
        System.out.println(Arrays.toString(point3D.getXyz()));
        point3D.setX(5);
        point3D.setZ(6);
        point3D.setY(7);
        System.out.println(Arrays.toString(point3D.getXyz()));
        point3D.setXy(1,3);
        System.out.println(Arrays.toString(point3D.getXyz()));
        point3D.setXyz(1,2,3);
        System.out.println(Arrays.toString(point3D.getXyz()));

    }
}
