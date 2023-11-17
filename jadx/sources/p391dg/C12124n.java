package p391dg;

import ge1.C41084a;
import of1.C41944z;
import p640vf.C18329d;
import p653wf.C18583l;

/* renamed from: dg.n */
public final class C12124n implements C41084a {

    /* renamed from: a */
    private final C12122l f35621a;

    /* renamed from: b */
    private final C41084a f35622b;

    public C12124n(C12122l lVar, C41084a aVar) {
        this.f35621a = lVar;
        this.f35622b = aVar;
    }

    /* renamed from: a */
    public static C12124n m44472a(C12122l lVar, C41084a aVar) {
        return new C12124n(lVar, aVar);
    }

    /* renamed from: c */
    public static C41944z m44473c(C12122l lVar, C18583l lVar2) {
        return (C41944z) C18329d.m62676c(lVar.mo32312b(lVar2), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C41944z get() {
        return m44473c(this.f35621a, (C18583l) this.f35622b.get());
    }
}
