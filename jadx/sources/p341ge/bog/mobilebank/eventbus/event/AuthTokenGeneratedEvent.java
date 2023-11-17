package p341ge.bog.mobilebank.eventbus.event;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.event.AuthTokenGeneratedEvent */
public class AuthTokenGeneratedEvent extends RootEvent {
    private String mToken;

    public String getToken() {
        return this.mToken;
    }

    public void setToken(String str) {
        this.mToken = str;
    }
}
