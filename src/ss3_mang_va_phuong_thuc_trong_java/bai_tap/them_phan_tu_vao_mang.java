package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        int[] array = new int[10];

        int number = array.length;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(" nhập vào phần tử");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(" nhập phần tử muốn thêm");
        int X = Integer.parseInt(scanner.nextLine());

        System.out.println(" vị trí");
        int index = Integer.parseInt(scanner.nextLine());
        if (index > 0 && index < number) {
            System.out.println(Arrays.toString(array));
            for (int i = number - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println(" không thể thêm phần tử");
        }
    }
}

