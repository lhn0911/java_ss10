package ss10;

class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        if (name == null || name.isEmpty() || id == null || id.isEmpty() || gpa < 0 || gpa > 4.0) {
            throw new IllegalArgumentException("Du lieu khong hop le");
        }
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getDetails() {
        return "Ten: " + name + ", ID: " + id + ", GPA: " + gpa;
    }
}

class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        if (researchTopic == null || researchTopic.isEmpty() || supervisorName == null || supervisorName.isEmpty()) {
            throw new IllegalArgumentException("Du lieu khong hop le");
        }
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", De tai: " + researchTopic + ", GVHD: " + supervisorName;
    }
}

public class Bai7 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Nam", "SV001", 3.5),
                new GraduateStudent("Linh", "SV002", 3.8, "Tri tue nhan tao", "TS. An"),
                new Student("Minh", "SV003", 2.9),
                new GraduateStudent("Hoa", "SV004", 3.7, "Khoa hoc du lieu", "PGS. Binh")
        };

        for (Student student : students) {
            System.out.println(student.getDetails());
        }
    }
}
