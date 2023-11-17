package p469io.reactivex.observers;

import ed1.C40756v;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import yd1.C43362g;

/* renamed from: io.reactivex.observers.a */
public abstract class C41380a implements C40756v, C41205b {
    final AtomicReference<C41205b> upstream = new AtomicReference<>();

    public final void dispose() {
        C41498c.m120371a(this.upstream);
    }

    public final boolean isDisposed() {
        return this.upstream.get() == C41498c.DISPOSED;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(C41205b bVar) {
        if (C43362g.m124406c(this.upstream, bVar, getClass())) {
            onStart();
        }
    }
}
