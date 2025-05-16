public class Mentor extends User{
    Mentor(String name) {
        super(name);
    }

    @Override
    String getRole() {
        return "Mentor";
    }
}
