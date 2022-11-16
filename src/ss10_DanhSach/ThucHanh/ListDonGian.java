package ss10_DanhSach.ThucHanh;

import java.util.Arrays;

public class ListDonGian {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public void Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length/2;
        elements= Arrays.copyOf(elements,newSize);
    }

}
