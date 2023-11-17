package dg1;

import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.h */
public abstract class C40686h implements C40707z {

    /* renamed from: d */
    private final C40707z f96338d;

    public C40686h(C40707z zVar) {
        C41536l.m120489i(zVar, "delegate");
        this.f96338d = zVar;
    }

    /* renamed from: C */
    public C40669a0 mo94678C() {
        return this.f96338d.mo94678C();
    }

    /* renamed from: a */
    public final C40707z mo94828a() {
        return this.f96338d;
    }

    public void close() {
        this.f96338d.close();
    }

    /* renamed from: g */
    public long mo21305g(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "sink");
        return this.f96338d.mo21305g(bVar, j);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f96338d + ')';
    }
}
