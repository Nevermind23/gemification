package lk0;

import ek0.C20262b;
import g91.C32289b0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kk0.C25741a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l50.C25838r;
import m50.C26146d;
import n50.C26372c;
import o31.C37603j;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p669xh.C18763a;
import p863pw.C27637o;

/* renamed from: lk0.b */
public final class C26052b {

    /* renamed from: a */
    private final C26146d f66146a;

    public C26052b(C26146d dVar) {
        C41536l.m120489i(dVar, "mapper");
        this.f66146a = dVar;
    }

    /* renamed from: a */
    private final List m81698a(List list, Long l) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C25838r rVar = (C25838r) next;
            if (l == null || rVar.mo64574a() == l.longValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList<C25838r> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            if (((C25838r) next2).mo64590o()) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (C25838r c : arrayList2) {
            arrayList3.add(m81699c(c));
        }
        return arrayList3;
    }

    /* renamed from: c */
    private final C25741a m81699c(C25838r rVar) {
        String str;
        boolean z;
        CreditCardView.C13273e eVar;
        String fileUrl;
        ProductProperties.CardBackgroundInfoContainer cardBackgroundInfo = ProductProperties.getCardBackgroundInfo(rVar.mo64595t());
        CardExternalFile n = rVar.mo64589n();
        String str2 = null;
        if (n != null) {
            str = n.getFileUrl();
        } else {
            str = null;
        }
        int i = 0;
        if (str != null) {
            CardExternalFile n2 = rVar.mo64589n();
            C41536l.m120486f(n2);
            if (!n2.isDark()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = cardBackgroundInfo.isLightText;
        }
        CardExternalFile n3 = rVar.mo64589n();
        if (!(n3 == null || (fileUrl = n3.getFileUrl()) == null)) {
            str2 = C32289b0.m95091c(fileUrl);
        }
        String str3 = str2;
        String valueOf = String.valueOf(rVar.mo64591p());
        String valueOf2 = String.valueOf(rVar.mo64582h());
        String t = rVar.mo64595t();
        String l = rVar.mo64587l();
        String format = new SimpleDateFormat("MM/yy").format(new Date(rVar.mo64588m()));
        C18763a g = C37603j.m110584g(rVar.mo64576c());
        if (g == null) {
            g = C18763a.DIGITAL_CARD;
        }
        C18763a aVar = g;
        if (str3 == null) {
            i = cardBackgroundInfo.resId;
        }
        int i2 = i;
        String r = rVar.mo64593r();
        C41536l.m120486f(r);
        if (z) {
            eVar = CreditCardView.C13273e.WHITE;
        } else {
            eVar = CreditCardView.C13273e.BLACK;
        }
        C41536l.m120488h(format, "format(Date(card.expDate))");
        return new C25741a(valueOf, valueOf2, t, new CreditCardView.C13270b((String) null, l, (String) null, (String) null, format, aVar, i2, str3, false, false, eVar, r, 269, (DefaultConstructorMarker) null), rVar.mo64576c(), (C20262b) null, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final List mo64947b(C27637o oVar, Long l) {
        C41536l.m120489i(oVar, "cardsAndDetails");
        return m81698a(C26372c.m82438a(this.f66146a.mo65075c(oVar)), l);
    }
}
