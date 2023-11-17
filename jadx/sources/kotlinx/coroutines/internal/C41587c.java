package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0611b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.c */
public abstract class C41587c extends C41624w {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f97776a = AtomicReferenceFieldUpdater.newUpdater(C41587c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C41585b.f97774a;

    /* renamed from: a */
    public C41587c mo96355a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo96356c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C41585b.f97774a) {
            obj2 = mo96358e(mo95255g(obj));
        }
        mo96357d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo96357d(Object obj, Object obj2);

    /* renamed from: e */
    public final Object mo96358e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C41585b.f97774a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C0611b.m2366a(f97776a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: f */
    public long mo96359f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo95255g(Object obj);
}
