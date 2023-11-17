package tk0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;

/* renamed from: tk0.c */
public final class C28448c {

    /* renamed from: a */
    private final Client f72251a;

    public C28448c(Client client) {
        C41536l.m120489i(client, "client");
        this.f72251a = client;
    }

    /* renamed from: a */
    public final boolean mo68076a() {
        ClientInfoWrapper userInfo = this.f72251a.getUserInfo();
        if (userInfo != null) {
            return userInfo.isRBClient();
        }
        return false;
    }
}
