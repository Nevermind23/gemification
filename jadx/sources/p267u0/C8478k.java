package p267u0;

import kotlin.jvm.internal.C41536l;
import p318y0.C9008m;

/* renamed from: u0.k */
public abstract class C8478k extends C8463e0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8478k(C8503w wVar) {
        super(wVar);
        C41536l.m120489i(wVar, "database");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo21746i(C9008m mVar, Object obj);

    /* renamed from: j */
    public final void mo23747j(Iterable iterable) {
        C41536l.m120489i(iterable, "entities");
        C9008m b = mo23725b();
        try {
            for (Object i : iterable) {
                mo21746i(b, i);
                b.mo23675D0();
            }
        } finally {
            mo23727h(b);
        }
    }

    /* renamed from: k */
    public final void mo23748k(Object obj) {
        C9008m b = mo23725b();
        try {
            mo21746i(b, obj);
            b.mo23675D0();
        } finally {
            mo23727h(b);
        }
    }
}
