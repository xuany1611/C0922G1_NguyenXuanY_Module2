package ss2_vong_lap_trong_java.bai_tap;


public class hien_thi_20_snt {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (count <= 20) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
