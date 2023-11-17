package p121ia;

import ge1.C41084a;
import p327y9.C9142b;
import p640vf.C18329d;

/* renamed from: ia.h */
public final class C6627h implements C41084a {

    /* renamed from: a */
    private final C6620a f20135a;

    public C6627h(C6620a aVar) {
        this.f20135a = aVar;
    }

    /* renamed from: a */
    public static C6627h m26038a(C6620a aVar) {
        return new C6627h(aVar);
    }

    /* renamed from: c */
    public static C9142b m26039c(C6620a aVar) {
        return (C9142b) C18329d.m62676c(aVar.mo20651g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9142b get() {
        return m26039c(this.f20135a);
    }
}
