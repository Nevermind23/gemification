package wp0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: wp0.d */
public final class C39632d {

    /* renamed from: a */
    private final C39630b f94196a;

    /* renamed from: b */
    private final C39639j f94197b;

    /* renamed from: c */
    private final List f94198c;

    /* renamed from: d */
    private final List f94199d;

    /* renamed from: e */
    private final List f94200e;

    /* renamed from: f */
    private final List f94201f;

    /* renamed from: g */
    private final List f94202g;

    /* renamed from: h */
    private final Integer f94203h;

    public C39632d(C39630b bVar, C39639j jVar, List list, List list2, List list3, List list4, List list5, Integer num) {
        C41536l.m120489i(bVar, "details");
        C41536l.m120489i(jVar, "summary");
        C41536l.m120489i(list, "loanAmounts");
        C41536l.m120489i(list2, "refinanceInfo");
        C41536l.m120489i(list3, "paramInfo");
        C41536l.m120489i(list4, "scheduleInfo");
        C41536l.m120489i(list5, "providerInfo");
        this.f94196a = bVar;
        this.f94197b = jVar;
        this.f94198c = list;
        this.f94199d = list2;
        this.f94200e = list3;
        this.f94201f = list4;
        this.f94202g = list5;
        this.f94203h = num;
    }

    /* renamed from: a */
    public final C39630b mo93329a() {
        return this.f94196a;
    }

    /* renamed from: b */
    public final List mo93330b() {
        return this.f94200e;
    }

    /* renamed from: c */
    public final List mo93331c() {
        return this.f94202g;
    }

    /* renamed from: d */
    public final List mo93332d() {
        return this.f94199d;
    }

    /* renamed from: e */
    public final Integer mo93333e() {
        return this.f94203h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39632d)) {
            return false;
        }
        C39632d dVar = (C39632d) obj;
        return C41536l.m120484d(this.f94196a, dVar.f94196a) && C41536l.m120484d(this.f94197b, dVar.f94197b) && C41536l.m120484d(this.f94198c, dVar.f94198c) && C41536l.m120484d(this.f94199d, dVar.f94199d) && C41536l.m120484d(this.f94200e, dVar.f94200e) && C41536l.m120484d(this.f94201f, dVar.f94201f) && C41536l.m120484d(this.f94202g, dVar.f94202g) && C41536l.m120484d(this.f94203h, dVar.f94203h);
    }

    /* renamed from: f */
    public final List mo93335f() {
        return this.f94201f;
    }

    /* renamed from: g */
    public final C39639j mo93336g() {
        return this.f94197b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f94196a.hashCode() * 31) + this.f94197b.hashCode()) * 31) + this.f94198c.hashCode()) * 31) + this.f94199d.hashCode()) * 31) + this.f94200e.hashCode()) * 31) + this.f94201f.hashCode()) * 31) + this.f94202g.hashCode()) * 31;
        Integer num = this.f94203h;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        C39630b bVar = this.f94196a;
        C39639j jVar = this.f94197b;
        List list = this.f94198c;
        List list2 = this.f94199d;
        List list3 = this.f94200e;
        List list4 = this.f94201f;
        List list5 = this.f94202g;
        Integer num = this.f94203h;
        return "LimitLoanDecision(details=" + bVar + ", summary=" + jVar + ", loanAmounts=" + list + ", refinanceInfo=" + list2 + ", paramInfo=" + list3 + ", scheduleInfo=" + list4 + ", providerInfo=" + list5 + ", responseCode=" + num + ")";
    }
}
