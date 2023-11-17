package p842nv;

import ed1.C40762x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p852ov.C27090d;
import p862pv.C27622a;
import ue1.C43075l;

/* renamed from: nv.d */
public final class C26611d {

    /* renamed from: a */
    private final C27622a f67235a;

    /* renamed from: nv.d$a */
    static final class C26612a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26612a f67236d = new C26612a();

        C26612a() {
            super(1);
        }

        /* renamed from: a */
        public final C27090d invoke(List list) {
            Object obj;
            boolean z;
            C41536l.m120489i(list, "offers");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((OfferInfo) obj).getOfferScheme() == OfferInfo.C20999b.BNPL) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            OfferInfo offerInfo = (OfferInfo) obj;
            if (offerInfo != null) {
                return new C27090d(offerInfo.getOfferAmount(), offerInfo.getOfferCcy(), true);
            }
            return new C27090d((String) null, (String) null, false, 3, (DefaultConstructorMarker) null);
        }
    }

    public C26611d(C27622a aVar) {
        C41536l.m120489i(aVar, "offersRepository");
        this.f67235a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C27090d m83073c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27090d) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo65866b() {
        C40762x A = this.f67235a.mo66997M0(false).mo94996P().mo95062A(new C26610c(C26612a.f67236d));
        C41536l.m120488h(A, "offersRepository.getOffe…le = false)\n            }");
        return A;
    }
}
