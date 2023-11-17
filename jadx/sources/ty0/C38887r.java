package ty0;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import sy0.C38606b;

/* renamed from: ty0.r */
public final class C38887r {

    /* renamed from: a */
    private final C38606b f92965a;

    public C38887r(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92965a = bVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40762x m113705b(C38887r rVar, String str, Long l, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return rVar.mo92585a(str, l);
    }

    /* renamed from: a */
    public final C40762x mo92585a(String str, Long l) {
        C40762x contract;
        C41536l.m120489i(str, "contractType");
        if (l == null || (contract = this.f92965a.getContract(str, l.longValue())) == null) {
            return this.f92965a.getContract(str);
        }
        return contract;
    }
}
