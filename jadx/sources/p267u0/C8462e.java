package p267u0;

import kotlin.jvm.internal.C41536l;
import p318y0.C8999j;

/* renamed from: u0.e */
public final class C8462e implements C8999j.C9005c {

    /* renamed from: a */
    private final C8999j.C9005c f24054a;

    /* renamed from: b */
    private final C8443c f24055b;

    public C8462e(C8999j.C9005c cVar, C8443c cVar2) {
        C41536l.m120489i(cVar, "delegate");
        C41536l.m120489i(cVar2, "autoCloser");
        this.f24054a = cVar;
        this.f24055b = cVar2;
    }

    /* renamed from: b */
    public C8446d mo6928a(C8999j.C9002b bVar) {
        C41536l.m120489i(bVar, "configuration");
        return new C8446d(this.f24054a.mo6928a(bVar), this.f24055b);
    }
}
