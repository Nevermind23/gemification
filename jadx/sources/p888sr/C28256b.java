package p888sr;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.Summary;

/* renamed from: sr.b */
public final class C28256b {

    /* renamed from: a */
    private final LimitLoanDecisionDetails f71711a;

    /* renamed from: b */
    private final Summary f71712b;

    /* renamed from: c */
    private final List f71713c;

    /* renamed from: d */
    private final List f71714d;

    /* renamed from: e */
    private final List f71715e;

    /* renamed from: f */
    private final List f71716f;

    /* renamed from: g */
    private final int f71717g;

    /* renamed from: h */
    private final List f71718h;

    public C28256b(LimitLoanDecisionDetails limitLoanDecisionDetails, Summary summary, List list, List list2, List list3, List list4, int i, List list5) {
        C41536l.m120489i(limitLoanDecisionDetails, "details");
        C41536l.m120489i(summary, "summary");
        C41536l.m120489i(list, "loanAmounts");
        C41536l.m120489i(list2, "refinanceInfo");
        C41536l.m120489i(list3, "paramInfo");
        C41536l.m120489i(list4, "scheduleInfo");
        C41536l.m120489i(list5, "providerInfo");
        this.f71711a = limitLoanDecisionDetails;
        this.f71712b = summary;
        this.f71713c = list;
        this.f71714d = list2;
        this.f71715e = list3;
        this.f71716f = list4;
        this.f71717g = i;
        this.f71718h = list5;
    }

    /* renamed from: a */
    public final LimitLoanDecisionDetails mo67818a() {
        return this.f71711a;
    }

    /* renamed from: b */
    public final boolean mo67819b() {
        return C28257c.m86852a(this.f71715e, "R");
    }

    /* renamed from: c */
    public final boolean mo67820c() {
        return C28257c.m86852a(this.f71715e, "B", PensionStatusResult.STATUS_INACTIVE);
    }

    /* renamed from: d */
    public final List mo67821d() {
        return this.f71718h;
    }

    /* renamed from: e */
    public final List mo67822e() {
        return this.f71714d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28256b)) {
            return false;
        }
        C28256b bVar = (C28256b) obj;
        return C41536l.m120484d(this.f71711a, bVar.f71711a) && C41536l.m120484d(this.f71712b, bVar.f71712b) && C41536l.m120484d(this.f71713c, bVar.f71713c) && C41536l.m120484d(this.f71714d, bVar.f71714d) && C41536l.m120484d(this.f71715e, bVar.f71715e) && C41536l.m120484d(this.f71716f, bVar.f71716f) && this.f71717g == bVar.f71717g && C41536l.m120484d(this.f71718h, bVar.f71718h);
    }

    /* renamed from: f */
    public final int mo67824f() {
        return this.f71717g;
    }

    /* renamed from: g */
    public final List mo67825g() {
        return this.f71716f;
    }

    /* renamed from: h */
    public final Summary mo67826h() {
        return this.f71712b;
    }

    public int hashCode() {
        return (((((((((((((this.f71711a.hashCode() * 31) + this.f71712b.hashCode()) * 31) + this.f71713c.hashCode()) * 31) + this.f71714d.hashCode()) * 31) + this.f71715e.hashCode()) * 31) + this.f71716f.hashCode()) * 31) + this.f71717g) * 31) + this.f71718h.hashCode();
    }

    /* renamed from: i */
    public final boolean mo67828i() {
        return C28257c.m86852a(this.f71715e, "C", PensionStatusResult.STATUS_INACTIVE, "Y");
    }

    /* renamed from: j */
    public final boolean mo67829j() {
        return C28257c.m86852a(this.f71715e, "B");
    }

    public String toString() {
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f71711a;
        Summary summary = this.f71712b;
        List list = this.f71713c;
        List list2 = this.f71714d;
        List list3 = this.f71715e;
        List list4 = this.f71716f;
        int i = this.f71717g;
        List list5 = this.f71718h;
        return "LimitLoanDecisionUiModel(details=" + limitLoanDecisionDetails + ", summary=" + summary + ", loanAmounts=" + list + ", refinanceInfo=" + list2 + ", paramInfo=" + list3 + ", scheduleInfo=" + list4 + ", responseCode=" + i + ", providerInfo=" + list5 + ")";
    }
}
