package hd1;

import java.util.concurrent.atomic.AtomicReference;
import ld1.C41692b;

/* renamed from: hd1.d */
abstract class C41207d extends AtomicReference implements C41205b {
    private static final long serialVersionUID = 6537757548749041217L;

    C41207d(Object obj) {
        super(C41692b.m120934e(obj, "value is null"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo95665a(Object obj);

    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo95665a(andSet);
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
