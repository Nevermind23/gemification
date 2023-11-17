package androidx.lifecycle;

import androidx.lifecycle.C1562c;
import androidx.lifecycle.C1593j;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C1606m {

    /* renamed from: d */
    private final Object f4531d;

    /* renamed from: e */
    private final C1562c.C1563a f4532e;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4531d = obj;
        this.f4532e = C1562c.f4559c.mo4844c(obj.getClass());
    }

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        this.f4532e.mo4846a(qVar, aVar, this.f4531d);
    }
}
