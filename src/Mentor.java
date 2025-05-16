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
        return super.toString() + "\b, Department=" + department + ", Expertise=" + expertise + ", Years Of Experience=" + yearsOfExperience + ']';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
