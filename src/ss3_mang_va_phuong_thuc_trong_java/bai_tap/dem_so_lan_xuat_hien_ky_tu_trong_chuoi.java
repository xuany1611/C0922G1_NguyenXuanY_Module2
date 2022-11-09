package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class dem_so_lan_xuat_hien_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        String inputString;
        char charter;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string");
        inputString = scanner.nextLine();
        System.out.println("enter your chart");
        charter = scanner.next().charAt(0);

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == charter) {
                count++;
            }
        }
        System.out.println("chart include string " + count + " time");


    }
}
