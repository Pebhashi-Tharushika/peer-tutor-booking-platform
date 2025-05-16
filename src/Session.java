public abstract class Session {
    private static int nextSessionId = 1;
    private static int sessionId;
    private Student student;
    private Mentor mentor;
    private String dateTime;

    public Session(Student student, Mentor mentor, String dateTime) {
        this.student = student;
        this.mentor = mentor;
        this.dateTime = dateTime;
        this.sessionId = nextSessionId++;
    }

    public abstract String getType();

    public abstract String getDetails();

    public static int getSessionId() {
        return sessionId;
    }

    public Student getStudent() {
        return student;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Session#" + sessionId + " (" + getType() + " - " + getDetails() +
                ") [Student: " + student.getName() + ", Mentor: " + mentor.getName() + ", Date and Time: " + dateTime + "]";
    }

}
