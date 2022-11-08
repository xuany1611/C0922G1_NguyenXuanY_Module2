package ss1_introduction_to_java.thuc_hanh;


import java.util.Scanner;

public class tinh_chi_so_can_nang_cua_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, heigth, bmi;
        System.out.print(" nhập số cân ");
        weight = scanner.nextDouble();
        System.out.print(" nhập chiều cao");
        heigth = scanner.nextDouble();
        bmi = weight / Math.pow(heigth, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf(bmi + "Thiếu cân ");
        } else if (bmi < 25) {
            System.out.printf(bmi + "Bình thường");
        } else if (bmi < 30) {
            System.out.printf(bmi + "Thừa cân ");
        } else {
            System.out.printf(bmi + " Quái vật");
        }
    }
}
