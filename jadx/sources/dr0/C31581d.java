package dr0;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p842nv.C26615g;
import ue1.C43075l;

/* renamed from: dr0.d */
public final class C31581d {

    /* renamed from: a */
    private final C26615g f78157a;

    /* renamed from: dr0.d$a */
    static final class C31582a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f78158d;

        /* renamed from: e */
        final /* synthetic */ String f78159e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31582a(String str, String str2) {
            super(1);
            this.f78158d = str;
            this.f78159e = str2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo invoke(java.util.List r7) {
            /*
                r6 = this;
                java.lang.String r0 = "offers"
                kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                java.lang.String r0 = r6.f78158d
                java.lang.String r1 = r6.f78159e
                java.util.Iterator r7 = r7.iterator()
            L_0x000d:
                boolean r2 = r7.hasNext()
                r3 = 0
                if (r2 == 0) goto L_0x003f
                java.lang.Object r2 = r7.next()
                r4 = r2
                ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r4 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r4
                ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductType r5 = r4.getProductType()
                if (r5 == 0) goto L_0x0025
                java.lang.String r3 = r5.mo52056a()
            L_0x0025:
                boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r0)
                if (r3 == 0) goto L_0x003b
                ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode r3 = r4.getProductCode()
                java.lang.String r3 = r3.mo51954a()
                boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r1)
                if (r3 == 0) goto L_0x003b
                r3 = 1
                goto L_0x003c
            L_0x003b:
                r3 = 0
            L_0x003c:
                if (r3 == 0) goto L_0x000d
                r3 = r2
            L_0x003f:
                ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r3 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r3
                if (r3 == 0) goto L_0x0044
                return r3
            L_0x0044:
                ge.bog.mobilebank.loanoffers.domain.model.OfferNotFoundException r7 = p341ge.bog.mobilebank.loanoffers.domain.model.OfferNotFoundException.f80142d
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: dr0.C31581d.C31582a.invoke(java.util.List):ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo");
        }
    }

    public C31581d(C26615g gVar) {
        C41536l.m120489i(gVar, "getOffersInfo");
        this.f78157a = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final OfferInfo m93691c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (OfferInfo) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo72003b(String str, String str2) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(str2, "productCode");
        C40762x A = C26615g.m83078c(this.f78157a, false, false, 3, (Object) null).mo94996P().mo95062A(new C31580c(new C31582a(str, str2)));
        C41536l.m120488h(A, "productType: String, pro…tFoundException\n        }");
        return A;
    }
}
