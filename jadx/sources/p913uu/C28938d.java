package p913uu;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;

/* renamed from: uu.d */
public final class C28938d {

    /* renamed from: a */
    private final OfferProductCode f73830a;

    /* renamed from: b */
    private final long f73831b;

    /* renamed from: c */
    private final String f73832c;

    /* renamed from: d */
    private final String f73833d;

    /* renamed from: e */
    private final String f73834e;

    /* renamed from: f */
    private final String f73835f;

    /* renamed from: g */
    private final String f73836g;

    /* renamed from: h */
    private final List f73837h;

    /* renamed from: i */
    private final String f73838i;

    public C28938d(OfferProductCode offerProductCode, long j, String str, String str2, String str3, String str4, String str5, List list, String str6) {
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(str, "decisionScheme");
        C41536l.m120489i(str2, "operationType");
        C41536l.m120489i(str3, "cardLimit");
        C41536l.m120489i(str4, "templCode");
        C41536l.m120489i(str5, "ccy");
        C41536l.m120489i(list, "refinanceInfo");
        C41536l.m120489i(str6, "prodType");
        this.f73830a = offerProductCode;
        this.f73831b = j;
        this.f73832c = str;
        this.f73833d = str2;
        this.f73834e = str3;
        this.f73835f = str4;
        this.f73836g = str5;
        this.f73837h = list;
        this.f73838i = str6;
    }

    /* renamed from: a */
    public final String mo68737a() {
        return this.f73834e;
    }

    /* renamed from: b */
    public final String mo68738b() {
        return this.f73836g;
    }

    /* renamed from: c */
    public final long mo68739c() {
        return this.f73831b;
    }

    /* renamed from: d */
    public final String mo68740d() {
        return this.f73832c;
    }

    /* renamed from: e */
    public final OfferProductCode mo68741e() {
        return this.f73830a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28938d)) {
            return false;
        }
        C28938d dVar = (C28938d) obj;
        return C41536l.m120484d(this.f73830a, dVar.f73830a) && this.f73831b == dVar.f73831b && C41536l.m120484d(this.f73832c, dVar.f73832c) && C41536l.m120484d(this.f73833d, dVar.f73833d) && C41536l.m120484d(this.f73834e, dVar.f73834e) && C41536l.m120484d(this.f73835f, dVar.f73835f) && C41536l.m120484d(this.f73836g, dVar.f73836g) && C41536l.m120484d(this.f73837h, dVar.f73837h) && C41536l.m120484d(this.f73838i, dVar.f73838i);
    }

    /* renamed from: f */
    public final String mo68743f() {
        return this.f73833d;
    }

    /* renamed from: g */
    public final String mo68744g() {
        return this.f73838i;
    }

    /* renamed from: h */
    public final List mo68745h() {
        return this.f73837h;
    }

    public int hashCode() {
        return (((((((((((((((this.f73830a.hashCode() * 31) + C7397t.m28148a(this.f73831b)) * 31) + this.f73832c.hashCode()) * 31) + this.f73833d.hashCode()) * 31) + this.f73834e.hashCode()) * 31) + this.f73835f.hashCode()) * 31) + this.f73836g.hashCode()) * 31) + this.f73837h.hashCode()) * 31) + this.f73838i.hashCode();
    }

    /* renamed from: i */
    public final String mo68747i() {
        return this.f73835f;
    }

    public String toString() {
        OfferProductCode offerProductCode = this.f73830a;
        long j = this.f73831b;
        String str = this.f73832c;
        String str2 = this.f73833d;
        String str3 = this.f73834e;
        String str4 = this.f73835f;
        String str5 = this.f73836g;
        List list = this.f73837h;
        String str6 = this.f73838i;
        return "CreditCardPreContractRequestOptions(limitCategory=" + offerProductCode + ", decNo=" + j + ", decisionScheme=" + str + ", operationType=" + str2 + ", cardLimit=" + str3 + ", templCode=" + str4 + ", ccy=" + str5 + ", refinanceInfo=" + list + ", prodType=" + str6 + ")";
    }
}
