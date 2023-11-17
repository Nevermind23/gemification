package ty0;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import sy0.C38606b;

/* renamed from: ty0.o0 */
public final class C38882o0 {

    /* renamed from: a */
    private final C38606b f92960a;

    public C38882o0(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92960a = bVar;
    }

    /* renamed from: a */
    public final C40734b mo92579a(String str) {
        C41536l.m120489i(str, "accKey");
        return this.f92960a.changeProductVisibility("ACCOUNT", str, "Y");
    }
}
