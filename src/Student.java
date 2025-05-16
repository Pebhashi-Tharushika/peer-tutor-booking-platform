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
        return super.toString() + "\b, Graduation Year=" + graduationYear + ", Major=" + major + ']';
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
