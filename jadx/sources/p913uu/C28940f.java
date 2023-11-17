package p913uu;

import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;

/* renamed from: uu.f */
public final class C28940f {

    /* renamed from: a */
    private C28939e f73854a;

    /* renamed from: b */
    private ArrayList f73855b;

    /* renamed from: c */
    private C28937c f73856c;

    /* renamed from: d */
    private Integer f73857d;

    public C28940f(C28939e eVar, ArrayList arrayList, C28937c cVar, Integer num) {
        this.f73854a = eVar;
        this.f73855b = arrayList;
        this.f73856c = cVar;
        this.f73857d = num;
    }

    /* renamed from: b */
    public static /* synthetic */ C28940f m88641b(C28940f fVar, C28939e eVar, ArrayList arrayList, C28937c cVar, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = fVar.f73854a;
        }
        if ((i & 2) != 0) {
            arrayList = fVar.f73855b;
        }
        if ((i & 4) != 0) {
            cVar = fVar.f73856c;
        }
        if ((i & 8) != 0) {
            num = fVar.f73857d;
        }
        return fVar.mo68767a(eVar, arrayList, cVar, num);
    }

    /* renamed from: a */
    public final C28940f mo68767a(C28939e eVar, ArrayList arrayList, C28937c cVar, Integer num) {
        return new C28940f(eVar, arrayList, cVar, num);
    }

    /* renamed from: c */
    public final C28939e mo68768c() {
        return this.f73854a;
    }

    /* renamed from: d */
    public final C28937c mo68769d() {
        return this.f73856c;
    }

    /* renamed from: e */
    public final ArrayList mo68770e() {
        return this.f73855b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28940f)) {
            return false;
        }
        C28940f fVar = (C28940f) obj;
        return C41536l.m120484d(this.f73854a, fVar.f73854a) && C41536l.m120484d(this.f73855b, fVar.f73855b) && C41536l.m120484d(this.f73856c, fVar.f73856c) && C41536l.m120484d(this.f73857d, fVar.f73857d);
    }

    /* renamed from: f */
    public final Integer mo68772f() {
        return this.f73857d;
    }

    public int hashCode() {
        C28939e eVar = this.f73854a;
        int i = 0;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        ArrayList arrayList = this.f73855b;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        C28937c cVar = this.f73856c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.f73857d;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        C28939e eVar = this.f73854a;
        ArrayList arrayList = this.f73855b;
        C28937c cVar = this.f73856c;
        Integer num = this.f73857d;
        return "CreditOfferDecision(cardInfo=" + eVar + ", refinanceInfo=" + arrayList + ", details=" + cVar + ", responseCode=" + num + ")";
    }
}
