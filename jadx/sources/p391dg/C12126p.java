package p391dg;

import ge1.C41084a;
import of1.C41944z;
import p640vf.C18329d;
import p653wf.C18583l;
import p681yf.C18914a;

/* renamed from: dg.p */
public final class C12126p implements C41084a {

    /* renamed from: a */
    private final C12122l f35627a;

    /* renamed from: b */
    private final C41084a f35628b;

    /* renamed from: c */
    private final C41084a f35629c;

    public C12126p(C12122l lVar, C41084a aVar, C41084a aVar2) {
        this.f35627a = lVar;
        this.f35628b = aVar;
        this.f35629c = aVar2;
    }

    /* renamed from: a */
    public static C12126p m44478a(C12122l lVar, C41084a aVar, C41084a aVar2) {
        return new C12126p(lVar, aVar, aVar2);
    }

    /* renamed from: c */
    public static C18914a m44479c(C12122l lVar, C41944z zVar, C18583l lVar2) {
        return (C18914a) C18329d.m62676c(lVar.mo32314d(zVar, lVar2), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C18914a get() {
        return m44479c(this.f35627a, (C41944z) this.f35628b.get(), (C18583l) this.f35629c.get());
    }
}
