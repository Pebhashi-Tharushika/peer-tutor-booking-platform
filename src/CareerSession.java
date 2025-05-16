public class CareerSession extends Session {
    private String coachingTopic;

    public CareerSession(Student student, Mentor mentor, String dateTime, String coachingTopic) {
        super(student, mentor, dateTime);
        this.coachingTopic = coachingTopic;
    }

    public String getCoachingTopic() {
        return coachingTopic;
    }

    public void setCoachingTopic(String coachingTopic) {
        this.coachingTopic = coachingTopic;
    }

    @Override
    public String getType() {
        return "Career Coaching";
    }

    @Override
    public String getDetails() {
        return toString();
    }

    @Override
    public String toString() {
        return "Session#" + getSessionId() + " (" + getType() + ") [Student: " + getStudent().getName() +
                ", Mentor: " + getMentor().getName() +
                ", coachingTopic: " + getCoachingTopic() +
                "]";
    }
}
