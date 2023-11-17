package p391dg;

import ge1.C41084a;
import p433gg.C15276a;
import p640vf.C18329d;
import p667xf.C18742r0;

/* renamed from: dg.f */
public final class C12116f implements C41084a {

    /* renamed from: a */
    private final C12111a f35612a;

    /* renamed from: b */
    private final C41084a f35613b;

    public C12116f(C12111a aVar, C41084a aVar2) {
        this.f35612a = aVar;
        this.f35613b = aVar2;
    }

    /* renamed from: a */
    public static C12116f m44447a(C12111a aVar, C41084a aVar2) {
        return new C12116f(aVar, aVar2);
    }

    /* renamed from: c */
    public static C15276a m44448c(C12111a aVar, C18742r0 r0Var) {
        return (C15276a) C18329d.m62676c(aVar.mo32295e(r0Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C15276a get() {
        return m44448c(this.f35612a, (C18742r0) this.f35613b.get());
    }
}
