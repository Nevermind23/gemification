package rh0;

import f51.C31925a;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.giftcards.data.model.PurchaseGiftCardRequestModel;
import vh0.C29075a;
import vh0.C29078d;
import xh0.C29796l;

/* renamed from: rh0.e */
public final class C28038e {
    /* renamed from: a */
    public final PurchaseGiftCardRequestModel mo67578a(C29078d dVar, long j) {
        Long l;
        BigDecimal bigDecimal;
        String str;
        long j2;
        BigDecimal bigDecimal2;
        Long i;
        C41536l.m120489i(dVar, "model");
        if (dVar.mo68958v()) {
            l = Long.valueOf(j);
        } else {
            l = dVar.mo68942h();
        }
        Long l2 = l;
        String s = dVar.mo68954s();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < s.length(); i2++) {
            char charAt = s.charAt(i2);
            if (!C40405b.m116978c(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        String d = dVar.mo68937d();
        if (d != null) {
            bigDecimal = new BigDecimal(String.valueOf(Double.parseDouble(d)));
        } else {
            bigDecimal = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal3 = bigDecimal;
        C41536l.m120488h(bigDecimal3, "model.amount?.toDouble()…imal() ?: BigDecimal.ZERO");
        C29075a g = dVar.mo68941g();
        Long l3 = null;
        if (g != null) {
            str = g.mo68928a();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String a = C31925a.m94278a(dVar.mo68951p());
        long q = dVar.mo68952q();
        if (dVar.mo68957u()) {
            l3 = Long.valueOf(dVar.mo68940f());
        }
        Long l4 = l3;
        C29796l t = dVar.mo68955t();
        if (t == null || (i = t.mo70029i()) == null) {
            j2 = -1;
        } else {
            j2 = i.longValue();
        }
        String d2 = dVar.mo68937d();
        if (d2 != null) {
            bigDecimal2 = new BigDecimal(String.valueOf(Double.parseDouble(d2)));
        } else {
            bigDecimal2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        C41536l.m120488h(bigDecimal4, "model.amount?.toDouble()…imal() ?: BigDecimal.ZERO");
        return new PurchaseGiftCardRequestModel(l2, (String) null, sb2, (Long) null, bigDecimal3, "GEL", str, a, q, l4, j2, bigDecimal4, "GEL", (Long) null, j, 8202, (DefaultConstructorMarker) null);
    }
}
