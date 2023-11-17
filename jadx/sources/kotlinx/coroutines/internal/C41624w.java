package kotlinx.coroutines.internal;

import ef1.C40832l0;

/* renamed from: kotlinx.coroutines.internal.w */
public abstract class C41624w {
    /* renamed from: a */
    public abstract C41587c mo96355a();

    /* renamed from: b */
    public final boolean mo96417b(C41624w wVar) {
        C41587c a;
        C41587c a2 = mo96355a();
        if (a2 == null || (a = wVar.mo96355a()) == null || a2.mo96359f() >= a.mo96359f()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Object mo96356c(Object obj);

    public String toString() {
        return C40832l0.m118329a(this) + '@' + C40832l0.m118330b(this);
    }
}
