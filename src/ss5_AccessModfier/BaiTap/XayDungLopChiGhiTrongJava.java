package ss5_AccessModfier.BaiTap;

public class XayDungLopChiGhiTrongJava {
    public String name="john";
    public String classes="C02";

    public XayDungLopChiGhiTrongJava(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public XayDungLopChiGhiTrongJava(){

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
