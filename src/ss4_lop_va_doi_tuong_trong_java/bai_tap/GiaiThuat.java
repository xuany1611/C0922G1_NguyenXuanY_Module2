package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class GiaiThuat {
    //Cho 1 mảng số nguyên chưa sắp xếp, hãy tìm các cặp số nguyên trong mảng đó sao cho chúng có tổng bằng 1 số nguyên cho trước
    //ví dụ:
    //Cho mảng arr = [8, 7, 2, 5, 3, 1]
    //Cho x = 10
    //Kết quả là [8, 2], [7, 3]
    public static void main(String[] args) {
        int[] array = {8, 7, 2, 5, 3};
        int x = 10;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == x) {
                    System  .out.println(array[i]+" "+array[j]);
                }
            }
        }
    }
}
