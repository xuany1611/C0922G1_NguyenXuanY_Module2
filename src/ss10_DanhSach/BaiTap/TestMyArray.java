package ss10_DanhSach.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class TestMyArray {
    public static class Student {
        private int id;
        private String name;


        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Student a = new Student(1, " Huy");
        Student b = new Student(1, " Huy");
        Student c = new Student(1, " Huy");
        Student d = new Student(1, " Huy");

        List<Student> studentMyArrayList = new ArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);

//        for (int i = 0; i < studentMyArrayList.size(); i++) {
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
        for (Student s : studentMyArrayList) {
            System.out.println(s.toString());
        }
    }
}
