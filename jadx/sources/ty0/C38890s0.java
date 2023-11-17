package ty0;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import sy0.C38606b;

/* renamed from: ty0.s0 */
public final class C38890s0 {

    /* renamed from: a */
    private final C38606b f92968a;

    public C38890s0(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92968a = bVar;
    }

    /* renamed from: a */
    public final C40734b mo92587a(String str, String str2, long j) {
        C41536l.m120489i(str, "route");
        C41536l.m120489i(str2, "contact");
        return this.f92968a.sendClientContractConfirmation(str, str2, j);
    }
}
