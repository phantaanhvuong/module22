package demo_mvc.entity;

public class Student extends Person {
    private int classId;
    public Student() {
    }

    public Student(int classId) {
        this.classId = classId;
    }

    public Student(int id, String name, int classId) {
        super(id, name);
        this.classId = classId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

}
