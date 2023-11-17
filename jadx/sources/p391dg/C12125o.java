package p391dg;

import ge1.C41084a;
import of1.C41944z;
import p348ag.C9854a;
import p640vf.C18329d;
import p652we.C18544f;
import p653wf.C18583l;

/* renamed from: dg.o */
public final class C12125o implements C41084a {

    /* renamed from: a */
    private final C12122l f35623a;

    /* renamed from: b */
    private final C41084a f35624b;

    /* renamed from: c */
    private final C41084a f35625c;

    /* renamed from: d */
    private final C41084a f35626d;

    public C12125o(C12122l lVar, C41084a aVar, C41084a aVar2, C41084a aVar3) {
        this.f35623a = lVar;
        this.f35624b = aVar;
        this.f35625c = aVar2;
        this.f35626d = aVar3;
    }

    /* renamed from: a */
    public static C12125o m44475a(C12122l lVar, C41084a aVar, C41084a aVar2, C41084a aVar3) {
        return new C12125o(lVar, aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C18544f m44476c(C12122l lVar, C9854a aVar, C18583l lVar2, C41944z zVar) {
        return (C18544f) C18329d.m62676c(lVar.mo32313c(aVar, lVar2, zVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C18544f get() {
        return m44476c(this.f35623a, (C9854a) this.f35624b.get(), (C18583l) this.f35625c.get(), (C41944z) this.f35626d.get());
    }
}
