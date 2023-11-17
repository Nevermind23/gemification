package p121ia;

import ge1.C41084a;
import p339z9.C9270e;
import p640vf.C18329d;

/* renamed from: ia.d */
public final class C6623d implements C41084a {

    /* renamed from: a */
    private final C6620a f20131a;

    public C6623d(C6620a aVar) {
        this.f20131a = aVar;
    }

    /* renamed from: a */
    public static C6623d m26026a(C6620a aVar) {
        return new C6623d(aVar);
    }

    /* renamed from: c */
    public static C9270e m26027c(C6620a aVar) {
        return (C9270e) C18329d.m62676c(aVar.mo20647c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9270e get() {
        return m26027c(this.f20131a);
    }
}
