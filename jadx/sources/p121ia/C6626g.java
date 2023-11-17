package p121ia;

import com.google.firebase.perf.session.SessionManager;
import ge1.C41084a;
import p640vf.C18329d;

/* renamed from: ia.g */
public final class C6626g implements C41084a {

    /* renamed from: a */
    private final C6620a f20134a;

    public C6626g(C6620a aVar) {
        this.f20134a = aVar;
    }

    /* renamed from: a */
    public static C6626g m26035a(C6620a aVar) {
        return new C6626g(aVar);
    }

    /* renamed from: c */
    public static SessionManager m26036c(C6620a aVar) {
        return (SessionManager) C18329d.m62676c(aVar.mo20650f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public SessionManager get() {
        return m26036c(this.f20134a);
    }
}
