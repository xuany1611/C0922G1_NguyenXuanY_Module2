package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào chiều rộng ");
        double width = scanner.nextDouble();
        System.out.println(" nhập vào chiều cao");
        double height = scanner.nextDouble();
        LopHinhChuNhat lopHinhChuNhat= new LopHinhChuNhat( width,height);
        System.out.println("your retangle \n "+ lopHinhChuNhat.display());
        System.out.println(" perimeter of the  Retangle: "+ lopHinhChuNhat.getPerimeter());
        System.out.println(" area of the Retangle : "+ lopHinhChuNhat.getArea());
    }

}
