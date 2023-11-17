package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0611b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.p */
public class C41614p {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f97817a = AtomicReferenceFieldUpdater.newUpdater(C41614p.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C41614p(boolean z) {
        this._cur = new C41615q(8, z);
    }

    /* renamed from: a */
    public final boolean mo96400a(Object obj) {
        while (true) {
            C41615q qVar = (C41615q) this._cur;
            int a = qVar.mo96404a(obj);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C0611b.m2366a(f97817a, this, qVar, qVar.mo96408i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo96401b() {
        while (true) {
            C41615q qVar = (C41615q) this._cur;
            if (!qVar.mo96405d()) {
                C0611b.m2366a(f97817a, this, qVar, qVar.mo96408i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo96402c() {
        return ((C41615q) this._cur).mo96406f();
    }

    /* renamed from: d */
    public final Object mo96403d() {
        while (true) {
            C41615q qVar = (C41615q) this._cur;
            Object j = qVar.mo96409j();
            if (j != C41615q.f97821h) {
                return j;
            }
            C0611b.m2366a(f97817a, this, qVar, qVar.mo96408i());
        }
    }
}
