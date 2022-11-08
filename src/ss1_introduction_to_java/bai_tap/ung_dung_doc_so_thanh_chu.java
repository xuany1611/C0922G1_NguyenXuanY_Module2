package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] asrg) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println(" nhập vào số");
        number= scanner.nextInt();
        switch (number){
            case 1:
                System.out.println(" Một");
                break;
            case 2:
                System.out.println(" Hai");
                break;
            case 3:
                System.out.println(" Ba");
                break;
            case 4:
                System.out.println(" Bốn");
                break;
            case 5:
                System.out.println(" Năm");
                break;
            case 6:
                System.out.println(" Sáu");
                break;
            case 7:
                System.out.println(" Bảy");
                break;
            case 8:
                System.out.println(" Tám");
                break;
            case 9:
                System.out.println(" Chính");
                break;
            case 10:
                System.out.println(" Mười");
                break;
            default:
                System.out.println(" Ngoài khả năng");
        }

    }
}
