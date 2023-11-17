package p842nv;

import ed1.C40749p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p862pv.C27622a;
import ue1.C43075l;

/* renamed from: nv.g */
public final class C26615g {

    /* renamed from: a */
    private final C27622a f67239a;

    /* renamed from: nv.g$a */
    static final class C26616a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f67240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26616a(boolean z) {
            super(1);
            this.f67240d = z;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "offers");
            if (!this.f67240d) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((OfferInfo) next).getDisplayBannerOnHome()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    public C26615g(C27622a aVar) {
        C41536l.m120489i(aVar, "offersRepository");
        this.f67239a = aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C40749p m83078c(C26615g gVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return gVar.mo65869b(z, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m83079d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo65869b(boolean z, boolean z2) {
        C40749p k0 = this.f67239a.mo66997M0(z).mo95026k0(new C26614f(new C26616a(z2)));
        C41536l.m120488h(k0, "forHome: Boolean = false…else offers\n            }");
        return k0;
    }
}
