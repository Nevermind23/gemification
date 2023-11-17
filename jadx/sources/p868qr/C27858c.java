package p868qr;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo;

/* renamed from: qr.c */
public final class C27858c extends C27860e {

    /* renamed from: a */
    private final LimitLoanRefinanceInfo f70986a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27858c(LimitLoanRefinanceInfo limitLoanRefinanceInfo) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(limitLoanRefinanceInfo, "limitRefinanceInfo");
        this.f70986a = limitLoanRefinanceInfo;
    }

    /* renamed from: a */
    public final LimitLoanRefinanceInfo mo67374a() {
        return this.f70986a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27858c) && C41536l.m120484d(this.f70986a, ((C27858c) obj).f70986a);
    }

    public int hashCode() {
        return this.f70986a.hashCode();
    }

    public String toString() {
        LimitLoanRefinanceInfo limitLoanRefinanceInfo = this.f70986a;
        return "LimitRefinanceInfoItem(limitRefinanceInfo=" + limitLoanRefinanceInfo + ")";
    }
}
