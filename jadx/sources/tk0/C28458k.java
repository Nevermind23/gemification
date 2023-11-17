package tk0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;

/* renamed from: tk0.k */
public final class C28458k {

    /* renamed from: a */
    private final Client f72259a;

    public C28458k(Client client) {
        C41536l.m120489i(client, "client");
        this.f72259a = client;
    }

    /* renamed from: a */
    public final boolean mo68084a() {
        ClientInfoWrapper userInfo = this.f72259a.getUserInfo();
        return userInfo != null && userInfo.isSolo();
    }
}
