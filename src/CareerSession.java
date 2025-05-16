public class CareerSession extends Session {
    private String coachingTopic;

    public CareerSession(User user) {
        super(user);
    }

    public String getCoachingTopic() {
        return coachingTopic;
    }

    public void setCoachingTopic(String coachingTopic) {
        this.coachingTopic = coachingTopic;
    }
}
