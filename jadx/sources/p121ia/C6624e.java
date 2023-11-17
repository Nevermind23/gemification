package p121ia;

import ge1.C41084a;
import p327y9.C9142b;
import p640vf.C18329d;

/* renamed from: ia.e */
public final class C6624e implements C41084a {

    /* renamed from: a */
    private final C6620a f20132a;

    public C6624e(C6620a aVar) {
        this.f20132a = aVar;
    }

    /* renamed from: a */
    public static C6624e m26029a(C6620a aVar) {
        return new C6624e(aVar);
    }

    /* renamed from: c */
    public static C9142b m26030c(C6620a aVar) {
        return (C9142b) C18329d.m62676c(aVar.mo20648d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9142b get() {
        return m26030c(this.f20132a);
    }
}
