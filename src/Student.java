public class Student extends User {
    private int graduationYear;
    private String major;

    public Student(String name, int graduationYear, String major) {
        super(name);
        this.graduationYear = graduationYear;
        this.major = major;
    }

    @Override
    String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student[ID=" + getId() + ", Name=" + getName() + ", GraduationYear=" + graduationYear + ", Major=" + major + "]";
    }

}
