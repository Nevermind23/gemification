package tk0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.Client;

/* renamed from: tk0.j */
public final class C28456j {

    /* renamed from: b */
    public static final C28457a f72257b = new C28457a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Client f72258a;

    /* renamed from: tk0.j$a */
    public static final class C28457a {
        private C28457a() {
        }

        public /* synthetic */ C28457a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28456j(Client client) {
        C41536l.m120489i(client, "client");
        this.f72258a = client;
    }

    /* renamed from: a */
    public final boolean mo68083a() {
        return this.f72258a.getUserRestrictions().contains("HUB_BANKING_SERVICES");
    }
}
