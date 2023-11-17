package fe1;

import ed1.C40742i;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43362g;

/* renamed from: fe1.a */
public abstract class C40940a implements C40742i, C41205b {

    /* renamed from: d */
    final AtomicReference f96706d = new AtomicReference();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47174a() {
        ((C43108c) this.f96706d.get()).mo94357l(Long.MAX_VALUE);
    }

    /* renamed from: b */
    public final void mo27070b(C43108c cVar) {
        if (C43362g.m124407d(this.f96706d, cVar, getClass())) {
            mo47174a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo95331c(long j) {
        ((C43108c) this.f96706d.get()).mo94357l(j);
    }

    public final void dispose() {
        C43259d.m124218a(this.f96706d);
    }

    public final boolean isDisposed() {
        return this.f96706d.get() == C43259d.CANCELLED;
    }
}
