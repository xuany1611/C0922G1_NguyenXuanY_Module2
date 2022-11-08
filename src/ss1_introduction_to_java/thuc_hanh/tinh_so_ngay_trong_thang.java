package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" tháng nào bạn muốn đếm ngày ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.print(" tháng 2 có 28 hoặc 29 ngày");
                break;
            case 3:
                System.out.print(" tháng 3 có 31 ngày ");
                break;
            case 4:
                System.out.print(" tháng 4 có 30 ngày ");
                break;
            case 5:
                System.out.print(" tháng 5 có 31 ngày");
                break;
            default:
                System.out.print(" không tìm thấy kết quả");
        }
    }
}
