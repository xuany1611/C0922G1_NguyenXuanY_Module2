package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào số a");
        double a = scanner.nextDouble();
        System.out.println(" nhập vào số b");
        double b = scanner.nextDouble();
        System.out.println(" nhập vào số c");
        double c = scanner.nextDouble();
        QuadraticEquation QuadraticEquation2 = new QuadraticEquation(a, b, c);
        System.out.println(QuadraticEquation2.dixplay());
    }
}
