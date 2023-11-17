package p606sl;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: sl.d */
public final class C17838d {

    /* renamed from: a */
    private final Long f50759a;

    /* renamed from: b */
    private final C17837c f50760b;

    /* renamed from: c */
    private final C17852r f50761c;

    /* renamed from: d */
    private final C17840f f50762d;

    /* renamed from: e */
    private final C17841g f50763e;

    /* renamed from: f */
    private final List f50764f;

    /* renamed from: g */
    private final C17851q f50765g;

    public C17838d(Long l, C17837c cVar, C17852r rVar, C17840f fVar, C17841g gVar, List list, C17851q qVar) {
        this.f50759a = l;
        this.f50760b = cVar;
        this.f50761c = rVar;
        this.f50762d = fVar;
        this.f50763e = gVar;
        this.f50764f = list;
        this.f50765g = qVar;
    }

    /* renamed from: a */
    public final C17837c mo45445a() {
        return this.f50760b;
    }

    /* renamed from: b */
    public final Long mo45446b() {
        return this.f50759a;
    }

    /* renamed from: c */
    public final C17851q mo45447c() {
        return this.f50765g;
    }

    /* renamed from: d */
    public final List mo45448d() {
        return this.f50764f;
    }

    /* renamed from: e */
    public final C17840f mo45449e() {
        return this.f50762d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17838d)) {
            return false;
        }
        C17838d dVar = (C17838d) obj;
        return C41536l.m120484d(this.f50759a, dVar.f50759a) && C41536l.m120484d(this.f50760b, dVar.f50760b) && C41536l.m120484d(this.f50761c, dVar.f50761c) && C41536l.m120484d(this.f50762d, dVar.f50762d) && C41536l.m120484d(this.f50763e, dVar.f50763e) && C41536l.m120484d(this.f50764f, dVar.f50764f) && C41536l.m120484d(this.f50765g, dVar.f50765g);
    }

    public int hashCode() {
        Long l = this.f50759a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        C17837c cVar = this.f50760b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C17852r rVar = this.f50761c;
        int hashCode3 = (hashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        C17840f fVar = this.f50762d;
        int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        C17841g gVar = this.f50763e;
        int hashCode5 = (hashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List list = this.f50764f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        C17851q qVar = this.f50765g;
        if (qVar != null) {
            i = qVar.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        Long l = this.f50759a;
        C17837c cVar = this.f50760b;
        C17852r rVar = this.f50761c;
        C17840f fVar = this.f50762d;
        C17841g gVar = this.f50763e;
        List list = this.f50764f;
        C17851q qVar = this.f50765g;
        return "BnplDetails(loanKey=" + l + ", lndDetails=" + cVar + ", plnDetails=" + rVar + ", schedule=" + fVar + ", invoice=" + gVar + ", repaymentAccounts=" + list + ", mmsDetails=" + qVar + ")";
    }
}
