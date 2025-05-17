public class Mentor extends User implements Notifiable{
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

    @Override
    public void notify(String message) {
        System.out.println("Notification for Mentor " + getName() + ": " + message);
    }
}
