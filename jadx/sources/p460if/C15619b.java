package p460if;

import kotlin.jvm.internal.C41536l;
import of1.C41901i0;
import of1.C41944z;
import p460if.C15620c;
import p474jf.C15763a;

/* renamed from: if.b */
public final class C15619b implements C15620c.C15621a {

    /* renamed from: a */
    private final C41944z f44423a;

    /* renamed from: b */
    private final C15763a f44424b;

    public C15619b(C41944z zVar, C15763a aVar) {
        C41536l.m120490j(zVar, "okHttpClient");
        C41536l.m120490j(aVar, "requestFactory");
        this.f44423a = zVar;
        this.f44424b = aVar;
    }

    /* renamed from: a */
    public void mo42915a(C41901i0 i0Var) {
        C41536l.m120490j(i0Var, "webSocketListener");
        this.f44423a.mo97034C(this.f44424b.mo43168a(), i0Var);
    }
}
