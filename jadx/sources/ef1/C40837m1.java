package ef1;

import he1.C41238w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ue1.C43075l;

/* renamed from: ef1.m1 */
final class C40837m1 extends C40851p1 {

    /* renamed from: i */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f96549i = AtomicIntegerFieldUpdater.newUpdater(C40837m1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: h */
    private final C43075l f96550h;

    public C40837m1(C43075l lVar) {
        this.f96550h = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo95134x((Throwable) obj);
        return C41238w.f97225a;
    }

    /* renamed from: x */
    public void mo95134x(Throwable th) {
        if (f96549i.compareAndSet(this, 0, 1)) {
            this.f96550h.invoke(th);
        }
    }
}
