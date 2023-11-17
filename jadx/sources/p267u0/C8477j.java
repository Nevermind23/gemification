package p267u0;

import kotlin.jvm.internal.C41536l;
import p318y0.C9008m;

/* renamed from: u0.j */
public abstract class C8477j extends C8463e0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8477j(C8503w wVar) {
        super(wVar);
        C41536l.m120489i(wVar, "database");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo21824i(C9008m mVar, Object obj);

    /* renamed from: j */
    public final int mo23746j(Object obj) {
        C9008m b = mo23725b();
        try {
            mo21824i(b, obj);
            return b.mo23676O();
        } finally {
            mo23727h(b);
        }
    }
}
