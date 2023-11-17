package p523mm;

import c21.C31260a;
import ed1.C40762x;
import g91.C32289b0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p537nm.C17098o;
import p843nw.C26633o;
import p863pw.C27635m;
import p863pw.C27637o;
import ue1.C43079p;

/* renamed from: mm.y0 */
public final class C16796y0 {

    /* renamed from: a */
    private final C16767q f47069a;

    /* renamed from: b */
    private final C26633o f47070b;

    /* renamed from: mm.y0$a */
    static final class C16797a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C16797a f47071d = new C16797a();

        C16797a() {
            super(2);
        }

        /* renamed from: a */
        public final List invoke(List list, C27637o oVar) {
            C27635m mVar;
            String str;
            CardExternalFile s;
            CardExternalFile s2;
            String fileUrl;
            C41536l.m120489i(list, "cardAccounts");
            C41536l.m120489i(oVar, "cards");
            ArrayList<C17098o> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (C41536l.m120484d(((C17098o) next).mo44458g(), "GEL")) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (C17098o oVar2 : arrayList) {
                List list2 = (List) oVar.mo67167a().get(Long.valueOf(oVar2.mo44451a()));
                String str2 = null;
                if (list2 != null) {
                    mVar = (C27635m) C41358y.m120009Y(list2);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    str = mVar.mo67105E();
                } else {
                    str = null;
                }
                ProductProperties.CardBackgroundInfoContainer cardBackgroundInfo = ProductProperties.getCardBackgroundInfo(str);
                long a = oVar2.mo44451a();
                String b = oVar2.mo44452b();
                double parseDouble = Double.parseDouble(oVar2.mo44454d());
                String g = oVar2.mo44458g();
                int i = cardBackgroundInfo.resId;
                if (!(mVar == null || (s2 = mVar.mo67135s()) == null || (fileUrl = s2.getFileUrl()) == null)) {
                    str2 = C32289b0.m95091c(fileUrl);
                }
                String str3 = str2;
                String c = oVar2.mo44453c();
                boolean z = cardBackgroundInfo.isLightText;
                boolean z2 = false;
                if (!(mVar == null || (s = mVar.mo67135s()) == null || !s.isDark())) {
                    z2 = true;
                }
                arrayList2.add(new C31260a(a, b, parseDouble, g, i, str3, c, z, !z2, false));
            }
            return arrayList2;
        }
    }

    public C16796y0(C16767q qVar, C26633o oVar) {
        C41536l.m120489i(qVar, "getDebitCardAccounts");
        C41536l.m120489i(oVar, "getCardsAndDetails");
        this.f47069a = qVar;
        this.f47070b = oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m59262c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (List) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40762x mo43916b(String str, String str2) {
        C41536l.m120489i(str, "cardType");
        C41536l.m120489i(str2, "cardClass");
        C40762x T = C40762x.m118154T(C16767q.m59198b(this.f47069a, str, str2, false, 4, (Object) null), C26633o.m83102d(this.f47070b, false, 1, (Object) null).mo94996P(), new C16794x0(C16797a.f47071d));
        C41536l.m120488h(T, "zip(\n        getDebitCar…        }\n        }\n    }");
        return T;
    }
}
