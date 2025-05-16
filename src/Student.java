public class Student extends User{

    Student(String name) {
        super(name);
    }

    @Override
    String getRole() {
        return "Student";
    }
}
