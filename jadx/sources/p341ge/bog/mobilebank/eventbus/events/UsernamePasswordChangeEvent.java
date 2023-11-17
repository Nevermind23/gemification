package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.UsernamePasswordChangeEvent */
public class UsernamePasswordChangeEvent extends RootEvent {
    private static UsernamePasswordChangeEvent instance;
    private boolean changePassword;
    private boolean changeUsername;
    private boolean mustChangePassword;
    private String password;
    private String userName;

    public UsernamePasswordChangeEvent() {
        instance = this;
    }

    public static UsernamePasswordChangeEvent getInstance() {
        return instance;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean mustChangePassword() {
        return this.mustChangePassword;
    }

    public void setChangePassword(boolean z) {
        this.changePassword = z;
    }

    public void setChangeUsername(boolean z) {
        this.changeUsername = z;
    }

    public void setMustChangePassword(boolean z) {
        this.mustChangePassword = z;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public boolean shouldChangePassword() {
        return this.changePassword;
    }

    public boolean shouldChangeUsername() {
        return this.changeUsername;
    }
}
