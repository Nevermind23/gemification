package rh0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.giftcards.data.model.GiveAwayGiftCardRequestModel;
import vh0.C29075a;
import vh0.C29078d;

/* renamed from: rh0.d */
public final class C28037d {
    /* renamed from: a */
    public final GiveAwayGiftCardRequestModel mo67577a(C29078d dVar, long j) {
        long j2;
        String str;
        C41536l.m120489i(dVar, "model");
        Long k = dVar.mo68946k();
        if (k != null) {
            j2 = k.longValue();
        } else {
            j2 = -1;
        }
        long j3 = j2;
        String s = dVar.mo68954s();
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char charAt = s.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "filterTo(StringBuilder(), predicate).toString()");
        Long h = dVar.mo68942h();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        String p = dVar.mo68951p();
        C29075a g = dVar.mo68941g();
        if (g != null) {
            str = g.mo68928a();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new GiveAwayGiftCardRequestModel(j, j3, sb2, h, valueOf, p, str);
    }
}
