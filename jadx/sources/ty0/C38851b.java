package ty0;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import sy0.C38606b;

/* renamed from: ty0.b */
public final class C38851b {

    /* renamed from: a */
    private final C38606b f92929a;

    public C38851b(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92929a = bVar;
    }

    /* renamed from: a */
    public final C40734b mo92560a(String str, boolean z) {
        String str2;
        C41536l.m120489i(str, "accKey");
        C38606b bVar = this.f92929a;
        if (z) {
            str2 = "Y";
        } else {
            str2 = "N";
        }
        return bVar.changeProductDefault("ACCOUNT", str, str2);
    }
}
