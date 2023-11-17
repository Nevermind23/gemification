package p881ru;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;

/* renamed from: ru.n */
public final class C28106n {

    /* renamed from: a */
    private final C28094c f71457a;

    public C28106n(C28094c cVar) {
        C41536l.m120489i(cVar, "repository");
        this.f71457a = cVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C40762x m86558c(C28106n nVar, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        return nVar.mo67641b(z, l);
    }

    /* renamed from: a */
    public final C40762x mo67640a(boolean z) {
        return m86558c(this, z, (Long) null, 2, (Object) null);
    }

    /* renamed from: b */
    public final C40762x mo67641b(boolean z, Long l) {
        return this.f71457a.mo50088j1(z, l);
    }
}
