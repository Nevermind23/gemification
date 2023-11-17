package p791iu;

import com.github.mikephil.charting.utils.Utils;
import ed1.C40762x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p782hu.C25065a;
import p782hu.C25066b;
import p862pv.C27622a;
import ue1.C43075l;

/* renamed from: iu.b */
public final class C25258b {

    /* renamed from: a */
    private final C27622a f64853a;

    /* renamed from: iu.b$a */
    static final class C25259a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C25259a f64854d = new C25259a();

        C25259a() {
            super(1);
        }

        /* renamed from: a */
        public final C25065a invoke(List list) {
            Object obj;
            C25065a a;
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
            if (offerInfo == null || (a = C25066b.m80021a(offerInfo)) == null) {
                return new C25065a(Utils.DOUBLE_EPSILON, (String) null, false, 3, (DefaultConstructorMarker) null);
            }
            return a;
        }
    }

    public C25258b(C27622a aVar) {
        C41536l.m120489i(aVar, "offersRepository");
        this.f64853a = aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C40762x m80363c(C25258b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return bVar.mo63775b(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C25065a m80364d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25065a) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo63775b(boolean z) {
        C40762x A = this.f64853a.mo66997M0(z).mo94996P().mo95062A(new C25257a(C25259a.f64854d));
        C41536l.m120488h(A, "offersRepository.getOffe…le = false)\n            }");
        return A;
    }
}
