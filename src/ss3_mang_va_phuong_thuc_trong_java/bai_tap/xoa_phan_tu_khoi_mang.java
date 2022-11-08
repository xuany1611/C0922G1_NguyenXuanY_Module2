package ss3_mang_va_phuong_thuc_trong_java.bai_tap;


import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,0,0};
        Scanner input = new Scanner(System.in);
        System.out.print("nhập vào số muốn xóa: ");
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                for (int j = i; j < array.length -1 ; j++) {
                    array[j] = array[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
