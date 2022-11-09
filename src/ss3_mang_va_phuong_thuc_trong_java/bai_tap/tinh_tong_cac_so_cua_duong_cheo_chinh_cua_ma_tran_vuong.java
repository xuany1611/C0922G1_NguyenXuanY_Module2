package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class tinh_tong_cac_so_cua_duong_cheo_chinh_cua_ma_tran_vuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character: ");
        String character = scanner.nextLine();

        int sizeStr = str.length() - 1;
        int count = 0;

        for (int i = 0; i < sizeStr; i++) {
            if (character.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Character " + character + " not appear in string " + str);
        } else System.out.println("Character: " + character.charAt(0) + " appear: " + count);

    }
}

