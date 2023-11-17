package va0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;

/* renamed from: va0.p */
public final class C29021p {

    /* renamed from: a */
    private final DepositSubmissionNavData f73984a;

    /* renamed from: b */
    private final AccumulateOnPaymentModel f73985b;

    /* renamed from: c */
    private final AccumulateOnSpecificDateModel f73986c;

    /* renamed from: d */
    private final long f73987d;

    public C29021p(DepositSubmissionNavData depositSubmissionNavData, AccumulateOnPaymentModel accumulateOnPaymentModel, AccumulateOnSpecificDateModel accumulateOnSpecificDateModel, long j) {
        C41536l.m120489i(depositSubmissionNavData, "navData");
        C41536l.m120489i(accumulateOnPaymentModel, "accumulateOnPaymentModel");
        C41536l.m120489i(accumulateOnSpecificDateModel, "accumulateOnSpecificDateModel");
        this.f73984a = depositSubmissionNavData;
        this.f73985b = accumulateOnPaymentModel;
        this.f73986c = accumulateOnSpecificDateModel;
        this.f73987d = j;
    }

    /* renamed from: a */
    public final AccumulateOnPaymentModel mo68877a() {
        return this.f73985b;
    }

    /* renamed from: b */
    public final AccumulateOnSpecificDateModel mo68878b() {
        return this.f73986c;
    }

    /* renamed from: c */
    public final DepositSubmissionNavData mo68879c() {
        return this.f73984a;
    }

    /* renamed from: d */
    public final long mo68880d() {
        return this.f73987d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29021p)) {
            return false;
        }
        C29021p pVar = (C29021p) obj;
        return C41536l.m120484d(this.f73984a, pVar.f73984a) && C41536l.m120484d(this.f73985b, pVar.f73985b) && C41536l.m120484d(this.f73986c, pVar.f73986c) && this.f73987d == pVar.f73987d;
    }

    public int hashCode() {
        return (((((this.f73984a.hashCode() * 31) + this.f73985b.hashCode()) * 31) + this.f73986c.hashCode()) * 31) + C7397t.m28148a(this.f73987d);
    }

    public String toString() {
        DepositSubmissionNavData depositSubmissionNavData = this.f73984a;
        AccumulateOnPaymentModel accumulateOnPaymentModel = this.f73985b;
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = this.f73986c;
        long j = this.f73987d;
        return "OpenSecondStepModel(navData=" + depositSubmissionNavData + ", accumulateOnPaymentModel=" + accumulateOnPaymentModel + ", accumulateOnSpecificDateModel=" + accumulateOnSpecificDateModel + ", srcAcctKey=" + j + ")";
    }
}
