package p341ge.bog.mobilebank.eventbus.event;

/* renamed from: ge.bog.mobilebank.eventbus.event.UsernameSaveEvent */
public class UsernameSaveEvent {
    private String mUsername;

    public UsernameSaveEvent(String str) {
        this.mUsername = str;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public void setUsername(String str) {
        this.mUsername = str;
    }
}
