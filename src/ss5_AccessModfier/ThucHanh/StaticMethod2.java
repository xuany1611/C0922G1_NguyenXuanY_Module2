package ss5_AccessModfier.ThucHanh;

public class StaticMethod2 {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(111,"Dung");
        StaticMethod s2 = new StaticMethod(11,"Phong");
        StaticMethod s3 = new StaticMethod(1,"Kanh");
        s1.display();
        s2.display();
        s3.display();
    }
}
