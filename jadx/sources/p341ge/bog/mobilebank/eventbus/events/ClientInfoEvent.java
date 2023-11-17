package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.events.ClientInfoEvent */
public class ClientInfoEvent extends RootEvent {
    private boolean handled;
    private ClientInfoWrapper userInfo;

    public ClientInfoWrapper getUserInfo() {
        return this.userInfo;
    }

    public boolean isHandled() {
        return this.handled;
    }

    public void setHandled(boolean z) {
        this.handled = z;
    }

    public void setUserInfo(ClientInfoWrapper clientInfoWrapper) {
        this.userInfo = clientInfoWrapper;
    }
}
