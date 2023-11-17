package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.LogInEvent */
public class LogInEvent extends RootEvent {
    private boolean isNewLogin;
    private boolean themeChanged;

    public boolean isNewLogin() {
        return this.isNewLogin;
    }

    public boolean isThemeChanged() {
        return this.themeChanged;
    }

    public void setNewLogin(boolean z) {
        this.isNewLogin = z;
    }

    public void setThemeChanged(boolean z) {
        this.themeChanged = z;
    }
}
