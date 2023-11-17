package p121ia;

import com.google.firebase.perf.config.RemoteConfigManager;
import ge1.C41084a;
import p640vf.C18329d;

/* renamed from: ia.f */
public final class C6625f implements C41084a {

    /* renamed from: a */
    private final C6620a f20133a;

    public C6625f(C6620a aVar) {
        this.f20133a = aVar;
    }

    /* renamed from: a */
    public static C6625f m26032a(C6620a aVar) {
        return new C6625f(aVar);
    }

    /* renamed from: c */
    public static RemoteConfigManager m26033c(C6620a aVar) {
        return (RemoteConfigManager) C18329d.m62676c(aVar.mo20649e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public RemoteConfigManager get() {
        return m26033c(this.f20133a);
    }
}
