package ss5_AccessModfier.BaiTap;

public class XayDungLopChiGhiTrongJava2 {
    public static void main(String[] args) {
        XayDungLopChiGhiTrongJava xayDungLopChiGhiTrongJava = new XayDungLopChiGhiTrongJava("john", "C02");
        System.out.println(xayDungLopChiGhiTrongJava.getName());
        System.out.println(xayDungLopChiGhiTrongJava.getClasses());
        xayDungLopChiGhiTrongJava.setName("helo");
        xayDungLopChiGhiTrongJava.setClasses("helo123");
        System.out.println(xayDungLopChiGhiTrongJava.getName());
        System.out.println(xayDungLopChiGhiTrongJava.getClasses());
    }
}
