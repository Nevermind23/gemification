package wh0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import vh0.C29075a;
import vh0.C29076b;
import vh0.C29079e;

/* renamed from: wh0.s */
public final class C29412s {

    /* renamed from: a */
    private final C29079e f74501a;

    public C29412s(C29079e eVar) {
        C41536l.m120489i(eVar, "purchaseRepository");
        this.f74501a = eVar;
    }

    /* renamed from: a */
    public final void mo69252a(long j, String str, boolean z, C29075a aVar, String str2, C29076b bVar, BigDecimal bigDecimal, Long l, Long l2) {
        BigDecimal bigDecimal2;
        long j2;
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(aVar, "design");
        C41536l.m120489i(bVar, "flowMode");
        C29079e eVar = this.f74501a;
        if (bigDecimal == null) {
            bigDecimal2 = BigDecimal.ZERO;
        } else {
            bigDecimal2 = bigDecimal;
        }
        C41536l.m120488h(bigDecimal2, "giveAwayAmount ?: BigDecimal.ZERO");
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        eVar.mo67753h(j, str, z, aVar, str2, bVar, bigDecimal2, j2, l2);
    }
}
