package ss10_dsa_danh_sach.bai_tap.cai_dat_arraylist;

public class TestArraylist {
    public static class Student1{
        private int id;
        private String name;

        public Student1() {
        }

        public Student1(int id, String name) {
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



    }
    public static void main(String[] args) {
        Student1 a = new Student1(1, "vuong");
        Student1 b = new Student1(2, "ha");
        Student1 c = new Student1(3, "hi");
        Student1 d = new Student1(4, "hu");
        Student1 e = new Student1(5, "hoa");
        MyArrayList<Student1> student1MyArrayList = new MyArrayList<>();
        student1MyArrayList.add(a);
        student1MyArrayList.add(b);
        student1MyArrayList.add(c);
        student1MyArrayList.add(d);
        student1MyArrayList.add(e);
        student1MyArrayList.size();
        System.out.println(student1MyArrayList.size());
        System.out.println(student1MyArrayList.get(2).getName());
        System.out.println(student1MyArrayList.indexOf(c));
    }
}
