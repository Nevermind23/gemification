package tk0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;

/* renamed from: tk0.m */
public final class C28460m {

    /* renamed from: a */
    private final Client f72262a;

    public C28460m(Client client) {
        C41536l.m120489i(client, "client");
        this.f72262a = client;
    }

    /* renamed from: a */
    public final boolean mo68086a() {
        ClientInfoWrapper userInfo = this.f72262a.getUserInfo();
        return userInfo != null && userInfo.isRBClient();
    }
}
