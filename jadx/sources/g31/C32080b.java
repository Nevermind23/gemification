package g31;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.Client;

/* renamed from: g31.b */
public final class C32080b {

    /* renamed from: a */
    private final Client f78921a;

    public C32080b(Client client) {
        C41536l.m120489i(client, "client");
        this.f78921a = client;
    }

    /* renamed from: a */
    public final boolean mo72555a() {
        return this.f78921a.isAuthorized();
    }
}
