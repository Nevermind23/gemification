package p034c3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import p243s2.C8140s;
import p320y2.C9035a;
import p320y2.C9041b;

/* renamed from: c3.e */
public final class C2246e implements C9041b {

    /* renamed from: a */
    private final List f6977a;

    /* renamed from: b */
    private final int f6978b;

    public C2246e(List list) {
        this(list, 0);
    }

    /* renamed from: a */
    public void mo7191a(C9035a.C9038c cVar, Executor executor, C9035a.C9036a aVar) {
        if (this.f6978b < this.f6977a.size()) {
            ((C9035a) this.f6977a.get(this.f6978b)).mo84a(cVar, new C2246e(this.f6977a, this.f6978b + 1), executor, aVar);
            return;
        }
        throw new IllegalStateException();
    }

    public void dispose() {
        for (C9035a dispose : this.f6977a) {
            dispose.dispose();
        }
    }

    private C2246e(List list, int i) {
        if (i <= list.size()) {
            this.f6977a = new ArrayList((Collection) C8140s.m30754b(list, "interceptors == null"));
            this.f6978b = i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
