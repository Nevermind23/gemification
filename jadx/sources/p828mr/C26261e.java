package p828mr;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;
import p888sr.C28256b;

/* renamed from: mr.e */
public final class C26261e {

    /* renamed from: a */
    private final C28256b f66558a;

    /* renamed from: b */
    private final LoanOfferCard f66559b;

    /* renamed from: c */
    private final boolean f66560c;

    public C26261e(C28256b bVar, LoanOfferCard loanOfferCard, boolean z) {
        C41536l.m120489i(bVar, "decision");
        C41536l.m120489i(loanOfferCard, "card");
        this.f66558a = bVar;
        this.f66559b = loanOfferCard;
        this.f66560c = z;
    }

    /* renamed from: a */
    public final LoanOfferCard mo65387a() {
        return this.f66559b;
    }

    /* renamed from: b */
    public final boolean mo65388b() {
        return this.f66560c;
    }

    /* renamed from: c */
    public final C28256b mo65389c() {
        return this.f66558a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26261e)) {
            return false;
        }
        C26261e eVar = (C26261e) obj;
        return C41536l.m120484d(this.f66558a, eVar.f66558a) && C41536l.m120484d(this.f66559b, eVar.f66559b) && this.f66560c == eVar.f66560c;
    }

    public int hashCode() {
        int hashCode = ((this.f66558a.hashCode() * 31) + this.f66559b.hashCode()) * 31;
        boolean z = this.f66560c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C28256b bVar = this.f66558a;
        LoanOfferCard loanOfferCard = this.f66559b;
        boolean z = this.f66560c;
        return "LoanDecisionOptions(decision=" + bVar + ", card=" + loanOfferCard + ", continueToPreContract=" + z + ")";
    }
}
