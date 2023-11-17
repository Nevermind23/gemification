package p391dg;

import ge1.C41084a;
import p348ag.C9856c;
import p640vf.C18329d;
import p652we.C18544f;

/* renamed from: dg.m */
public final class C12123m implements C41084a {

    /* renamed from: a */
    private final C12122l f35619a;

    /* renamed from: b */
    private final C41084a f35620b;

    public C12123m(C12122l lVar, C41084a aVar) {
        this.f35619a = lVar;
        this.f35620b = aVar;
    }

    /* renamed from: a */
    public static C12123m m44469a(C12122l lVar, C41084a aVar) {
        return new C12123m(lVar, aVar);
    }

    /* renamed from: c */
    public static C9856c m44470c(C12122l lVar, C18544f fVar) {
        return (C9856c) C18329d.m62676c(lVar.mo32311a(fVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9856c get() {
        return m44470c(this.f35619a, (C18544f) this.f35620b.get());
    }
}
