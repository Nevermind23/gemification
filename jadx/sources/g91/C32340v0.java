package g91;

import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;

/* renamed from: g91.v0 */
public final class C32340v0 {

    /* renamed from: a */
    public static final C32340v0 f79773a = new C32340v0();

    /* renamed from: b */
    private static AccountLovEvent f79774b;

    private C32340v0() {
    }

    /* renamed from: a */
    public static final void m95375a() {
        f79774b = null;
    }

    /* renamed from: b */
    public static final AccountLovEvent m95376b() {
        return f79774b;
    }

    /* renamed from: c */
    public static final void m95377c(AccountLovEvent accountLovEvent) {
        if (accountLovEvent != null) {
            f79774b = accountLovEvent;
        }
    }
}
