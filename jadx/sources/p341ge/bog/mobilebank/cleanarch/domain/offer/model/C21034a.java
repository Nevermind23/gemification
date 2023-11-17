package p341ge.bog.mobilebank.cleanarch.domain.offer.model;

import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p852ov.C27088c;
import p913uu.C28942h;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.a */
public final class C21034a {

    /* renamed from: a */
    public static final C21034a f56488a = new C21034a();

    /* renamed from: b */
    private static final Map f56489b;

    /* renamed from: c */
    private static final Map f56490c = C41340p0.m119902b(C41344r0.m119931m(C41233s.m119492a(OfferProductCode.C21000AC.f56467f, C28942h.values()), C41233s.m119492a(OfferProductCode.C21010EC.f56472f, C28942h.values()), C41233s.m119492a(OfferProductCode.C21017LC.f56476f, C28942h.values())), C21035a.f56491d);

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.a$a */
    static final class C21035a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21035a f56491d = new C21035a();

        C21035a() {
            super(1);
        }

        /* renamed from: a */
        public final C28942h[] invoke(OfferProductCode offerProductCode) {
            C41536l.m120489i(offerProductCode, "it");
            return new C28942h[0];
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.offer.model.a$b */
    static final class C21036b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21036b f56492d = new C21036b();

        C21036b() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(OfferProductCode offerProductCode) {
            C41536l.m120489i(offerProductCode, "it");
            return C41341q.m119907j();
        }
    }

    static {
        OfferProductCode.C21008CL cl = OfferProductCode.C21008CL.f56471f;
        C27088c cVar = C27088c.PARALLEL_LOAN;
        C27088c cVar2 = C27088c.BOG_AND_OTHER_BANK_REFINANCING_LOAN;
        C27088c cVar3 = C27088c.BOG_REFINANCING_LOAN;
        f56489b = C41340p0.m119902b(C41344r0.m119931m(C41233s.m119492a(cl, C41341q.m119910m(cVar, cVar2, cVar3)), C41233s.m119492a(OfferProductCode.C21023RL.f56479f, C41341q.m119910m(cVar, cVar2, cVar3)), C41233s.m119492a(OfferProductCode.C21012EL.f56473f, C41341q.m119910m(cVar, cVar3)), C41233s.m119492a(OfferProductCode.C21004BE.f56469f, C41341q.m119910m(cVar, cVar2, cVar3)), C41233s.m119492a(OfferProductCode.C21002BA.f56468f, C41341q.m119910m(cVar, cVar2, cVar3)), C41233s.m119492a(OfferProductCode.C21021PL.f56478f, C41341q.m119907j())), C21036b.f56492d);
    }

    private C21034a() {
    }

    /* renamed from: a */
    public static final List m68055a(OfferProductCode offerProductCode) {
        C41536l.m120489i(offerProductCode, "productCode");
        Object[] objArr = (Object[]) C41344r0.m119929k(f56490c, offerProductCode);
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(((C28942h) obj).mo68796b());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List m68056b(OfferProductCode offerProductCode) {
        C41536l.m120489i(offerProductCode, "productCode");
        return (List) C41344r0.m119929k(f56489b, offerProductCode);
    }
}
