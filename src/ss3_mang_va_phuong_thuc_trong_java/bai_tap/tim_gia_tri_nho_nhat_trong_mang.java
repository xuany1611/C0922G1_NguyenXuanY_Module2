package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[][] numbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng của mảng:");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số cột của mảng:");
        int col = Integer.parseInt(sc.nextLine());
        numbers = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhập phần t cột " + i + " hàng " + j + " :");
                numbers[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int min = numbers[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (min > numbers[i][j]) {
                    min = numbers[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("phần ử nhỏ nhất của mảng: " + min);
        System.out.println("vị trí nhỏ nhất của mảng: " + "hàng " + x + " cột " + y);
    }
}

