package ss2_vong_lap_trong_java.bai_tap;

public class hien_thi_cac_snt_nho_hon_100 {
    public static void main(String[] args) {
        boolean check = true;

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
            check = true;
        }
    }
}