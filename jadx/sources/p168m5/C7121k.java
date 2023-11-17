package p168m5;

import java.util.concurrent.Executor;
import p194o5.C7458b;
import p194o5.C7460d;

/* renamed from: m5.k */
public final class C7121k implements C7458b {

    /* renamed from: m5.k$a */
    private static final class C7122a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C7121k f21124a = new C7121k();
    }

    /* renamed from: a */
    public static C7121k m27465a() {
        return C7122a.f21124a;
    }

    /* renamed from: b */
    public static Executor m27466b() {
        return (Executor) C7460d.m28361c(C7120j.m27464a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return m27466b();
    }
}
