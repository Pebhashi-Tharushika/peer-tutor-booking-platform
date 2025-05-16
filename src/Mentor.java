public class Mentor extends User{
    private String department;
    private String expertise;
    private int yearsOfExperience;

    public Mentor(String name, String department, String expertise, int yearsOfExperience) {
        super(name);
        this.department = department;
        this.expertise = expertise;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    String getRole() {
        return "Mentor";
    }

    @Override
    public String toString() {
        return "Mentor[ID=" + getId() + ", Name=" + getName() +
               ", Expertise=" + expertise + ", Department=" + department + ", Years Of Experience=" + yearsOfExperience + ']';
    }
}
