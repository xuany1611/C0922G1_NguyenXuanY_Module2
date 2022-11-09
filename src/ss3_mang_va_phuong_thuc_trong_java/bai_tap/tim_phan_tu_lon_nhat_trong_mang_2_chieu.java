package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class tim_phan_tu_lon_nhat_trong_mang_2_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran: ");
        int hang = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        int cot = scanner.nextInt();
        int[][] array = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("nhap phan thu mang vi tri " + i + " ,  " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        int iMax = -1;
        int jMax = -1;
        int max = array[0][0];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (max <= array[i][j]) {
                    max = array[i][j];
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println("gia tri lon nhat trong mang la: " + max + " o vi tri: " + iMax + " , " + jMax);

    }
}
