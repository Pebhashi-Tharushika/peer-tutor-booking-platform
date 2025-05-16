public class SubjectSession extends Session {
    private String subjectName;

    public SubjectSession(User user) {
        super(user);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
