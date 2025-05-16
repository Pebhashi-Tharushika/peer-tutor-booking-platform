public abstract class Session {
    private static int sessionId = 0;
    private User user;

    public Session(User user) {
        this.user = user;
        sessionId++;
    }

    public static int getSessionId() {
        return sessionId;
    }

    public static void setSessionId(int sessionId) {
        Session.sessionId = sessionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
