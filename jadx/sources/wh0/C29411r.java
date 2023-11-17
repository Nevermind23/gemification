package wh0;

import kotlin.jvm.internal.C41536l;
import vh0.C29079e;
import xh0.C29790g;

/* renamed from: wh0.r */
public final class C29411r {

    /* renamed from: a */
    private final C29079e f74500a;

    public C29411r(C29079e eVar) {
        C41536l.m120489i(eVar, "purchaseRepository");
        this.f74500a = eVar;
    }

    /* renamed from: b */
    public static /* synthetic */ void m89500b(C29411r rVar, String str, boolean z, Long l, C29790g gVar, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        rVar.mo69251a(str, z, l, gVar, str2);
    }

    /* renamed from: a */
    public final void mo69251a(String str, boolean z, Long l, C29790g gVar, String str2) {
        long j;
        C41536l.m120489i(str, "amount");
        C41536l.m120489i(str2, "afterPurchaseDays");
        C29079e eVar = this.f74500a;
        if (l != null) {
            j = l.longValue();
        } else {
            j = System.currentTimeMillis();
        }
        eVar.mo67747b(str, z, j, gVar, str2);
    }
}
