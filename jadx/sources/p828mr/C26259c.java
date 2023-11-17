package p828mr;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.Summary;

/* renamed from: mr.c */
public final class C26259c {

    /* renamed from: a */
    private final LimitLoanDecisionDetails f66548a;

    /* renamed from: b */
    private final Summary f66549b;

    /* renamed from: c */
    private final List f66550c;

    /* renamed from: d */
    private final List f66551d;

    /* renamed from: e */
    private final List f66552e;

    /* renamed from: f */
    private final List f66553f;

    /* renamed from: g */
    private final int f66554g;

    /* renamed from: h */
    private final List f66555h;

    public C26259c(LimitLoanDecisionDetails limitLoanDecisionDetails, Summary summary, List list, List list2, List list3, List list4, int i, List list5) {
        C41536l.m120489i(limitLoanDecisionDetails, "details");
        C41536l.m120489i(summary, "summary");
        C41536l.m120489i(list, "loanAmounts");
        C41536l.m120489i(list2, "refinanceInfo");
        C41536l.m120489i(list3, "paramInfo");
        C41536l.m120489i(list4, "scheduleInfo");
        C41536l.m120489i(list5, "providerInfo");
        this.f66548a = limitLoanDecisionDetails;
        this.f66549b = summary;
        this.f66550c = list;
        this.f66551d = list2;
        this.f66552e = list3;
        this.f66553f = list4;
        this.f66554g = i;
        this.f66555h = list5;
    }

    /* renamed from: a */
    public final LimitLoanDecisionDetails mo65371a() {
        return this.f66548a;
    }

    /* renamed from: b */
    public final List mo65372b() {
        return this.f66550c;
    }

    /* renamed from: c */
    public final List mo65373c() {
        return this.f66552e;
    }

    /* renamed from: d */
    public final List mo65374d() {
        return this.f66555h;
    }

    /* renamed from: e */
    public final List mo65375e() {
        return this.f66551d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26259c)) {
            return false;
        }
        C26259c cVar = (C26259c) obj;
        return C41536l.m120484d(this.f66548a, cVar.f66548a) && C41536l.m120484d(this.f66549b, cVar.f66549b) && C41536l.m120484d(this.f66550c, cVar.f66550c) && C41536l.m120484d(this.f66551d, cVar.f66551d) && C41536l.m120484d(this.f66552e, cVar.f66552e) && C41536l.m120484d(this.f66553f, cVar.f66553f) && this.f66554g == cVar.f66554g && C41536l.m120484d(this.f66555h, cVar.f66555h);
    }

    /* renamed from: f */
    public final int mo65377f() {
        return this.f66554g;
    }

    /* renamed from: g */
    public final List mo65378g() {
        return this.f66553f;
    }

    /* renamed from: h */
    public final Summary mo65379h() {
        return this.f66549b;
    }

    public int hashCode() {
        return (((((((((((((this.f66548a.hashCode() * 31) + this.f66549b.hashCode()) * 31) + this.f66550c.hashCode()) * 31) + this.f66551d.hashCode()) * 31) + this.f66552e.hashCode()) * 31) + this.f66553f.hashCode()) * 31) + this.f66554g) * 31) + this.f66555h.hashCode();
    }

    public String toString() {
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f66548a;
        Summary summary = this.f66549b;
        List list = this.f66550c;
        List list2 = this.f66551d;
        List list3 = this.f66552e;
        List list4 = this.f66553f;
        int i = this.f66554g;
        List list5 = this.f66555h;
        return "LimitLoanDecision(details=" + limitLoanDecisionDetails + ", summary=" + summary + ", loanAmounts=" + list + ", refinanceInfo=" + list2 + ", paramInfo=" + list3 + ", scheduleInfo=" + list4 + ", responseCode=" + i + ", providerInfo=" + list5 + ")";
    }
}
