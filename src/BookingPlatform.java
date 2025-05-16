import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingPlatform {
    private List<Mentor> mentors = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();
    private Map<Integer, User> integerUserMap = new HashMap<>();

    public static void main(String[] args) {

        Student user1 = new Student("Amal",2027,"IT");
        Mentor user2 = new Mentor("Kamal","Technology","IT",2);
        System.out.println(user1.toString());
        System.out.println(user2.toString());

        Session s1 = new SubjectSession(user1,user2,"01/07/2025 07:30 AM","Database");
        System.out.println(s1.toString());
        System.out.println(s1.getDetails());

        Session s2 = new CareerSession(user1,user2,"01/07/2025 07:30 AM","interview");
        System.out.println(s2.toString());
        System.out.println(s2.getDetails());
    }
}