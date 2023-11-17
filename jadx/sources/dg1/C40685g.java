package dg1;

import kotlin.jvm.internal.C41536l;

/* renamed from: dg1.g */
public abstract class C40685g implements C40705x {

    /* renamed from: d */
    private final C40705x f96337d;

    public C40685g(C40705x xVar) {
        C41536l.m120489i(xVar, "delegate");
        this.f96337d = xVar;
    }

    /* renamed from: C */
    public C40669a0 mo94673C() {
        return this.f96337d.mo94673C();
    }

    public void close() {
        this.f96337d.close();
    }

    public void flush() {
        this.f96337d.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f96337d + ')';
    }

    /* renamed from: x1 */
    public void mo21301x1(C40672b bVar, long j) {
        C41536l.m120489i(bVar, "source");
        this.f96337d.mo21301x1(bVar, j);
    }
}
