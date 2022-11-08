package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print(" mời bạn nhập vào số tiền" );
        usd = sc.nextDouble();
        double quyDoi = usd * vnd;
        System.out.print(" giá trị VND" + quyDoi);
    }
}
