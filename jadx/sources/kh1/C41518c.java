package kh1;

import kotlin.jvm.internal.C41536l;

/* renamed from: kh1.c */
public abstract class C41518c {

    /* renamed from: a */
    private C41517b f97689a;

    public C41518c(C41517b bVar) {
        C41536l.m120489i(bVar, "level");
        this.f97689a = bVar;
    }

    /* renamed from: a */
    private final boolean m120426a(C41517b bVar) {
        return this.f97689a.compareTo(bVar) <= 0;
    }

    /* renamed from: c */
    private final void m120427c(C41517b bVar, String str) {
        if (m120426a(bVar)) {
            mo96283g(bVar, str);
        }
    }

    /* renamed from: b */
    public final void mo96284b(String str) {
        C41536l.m120489i(str, "msg");
        m120427c(C41517b.DEBUG, str);
    }

    /* renamed from: d */
    public final void mo96285d(String str) {
        C41536l.m120489i(str, "msg");
        m120427c(C41517b.ERROR, str);
    }

    /* renamed from: e */
    public final void mo96286e(String str) {
        C41536l.m120489i(str, "msg");
        m120427c(C41517b.INFO, str);
    }

    /* renamed from: f */
    public final boolean mo96287f(C41517b bVar) {
        C41536l.m120489i(bVar, "lvl");
        if (this.f97689a.compareTo(bVar) <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public abstract void mo96283g(C41517b bVar, String str);
}
