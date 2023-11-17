package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep;

import android.os.Bundle;
import android.os.Parcelable;
import da0.C19951e;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p202p0.C7593r;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.a */
public abstract class C22896a {

    /* renamed from: a */
    public static final C22898b f60284a = new C22898b((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.a$a */
    private static final class C22897a implements C7593r {

        /* renamed from: a */
        private final DepositSubmissionNavData f60285a;

        /* renamed from: b */
        private final AccumulateOnSpecificDateModel f60286b;

        /* renamed from: c */
        private final AccumulateOnPaymentModel f60287c;

        /* renamed from: d */
        private final long f60288d;

        /* renamed from: e */
        private final int f60289e = C19951e.action_first_step_to_second_step;

        public C22897a(DepositSubmissionNavData depositSubmissionNavData, AccumulateOnSpecificDateModel accumulateOnSpecificDateModel, AccumulateOnPaymentModel accumulateOnPaymentModel, long j) {
            C41536l.m120489i(depositSubmissionNavData, "navData");
            C41536l.m120489i(accumulateOnSpecificDateModel, "stoData");
            C41536l.m120489i(accumulateOnPaymentModel, "casData");
            this.f60285a = depositSubmissionNavData;
            this.f60286b = accumulateOnSpecificDateModel;
            this.f60287c = accumulateOnPaymentModel;
            this.f60288d = j;
        }

        /* renamed from: a */
        public int mo22014a() {
            return this.f60289e;
        }

        /* renamed from: b */
        public Bundle mo22015b() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<DepositSubmissionNavData> cls2 = DepositSubmissionNavData.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                DepositSubmissionNavData depositSubmissionNavData = this.f60285a;
                C41536l.m120487g(depositSubmissionNavData, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("nav_data", depositSubmissionNavData);
            } else if (cls3.isAssignableFrom(cls2)) {
                DepositSubmissionNavData depositSubmissionNavData2 = this.f60285a;
                C41536l.m120487g(depositSubmissionNavData2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("nav_data", (Serializable) depositSubmissionNavData2);
            } else {
                String name = cls2.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            Class<AccumulateOnSpecificDateModel> cls4 = AccumulateOnSpecificDateModel.class;
            if (cls.isAssignableFrom(cls4)) {
                AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = this.f60286b;
                C41536l.m120487g(accumulateOnSpecificDateModel, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("sto_data", accumulateOnSpecificDateModel);
            } else if (cls3.isAssignableFrom(cls4)) {
                AccumulateOnSpecificDateModel accumulateOnSpecificDateModel2 = this.f60286b;
                C41536l.m120487g(accumulateOnSpecificDateModel2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("sto_data", (Serializable) accumulateOnSpecificDateModel2);
            } else {
                String name2 = cls4.getName();
                throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
            }
            Class<AccumulateOnPaymentModel> cls5 = AccumulateOnPaymentModel.class;
            if (cls.isAssignableFrom(cls5)) {
                AccumulateOnPaymentModel accumulateOnPaymentModel = this.f60287c;
                C41536l.m120487g(accumulateOnPaymentModel, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("cas_data", accumulateOnPaymentModel);
            } else if (cls3.isAssignableFrom(cls5)) {
                AccumulateOnPaymentModel accumulateOnPaymentModel2 = this.f60287c;
                C41536l.m120487g(accumulateOnPaymentModel2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("cas_data", (Serializable) accumulateOnPaymentModel2);
            } else {
                String name3 = cls5.getName();
                throw new UnsupportedOperationException(name3 + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putLong("src_acct_key", this.f60288d);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22897a)) {
                return false;
            }
            C22897a aVar = (C22897a) obj;
            return C41536l.m120484d(this.f60285a, aVar.f60285a) && C41536l.m120484d(this.f60286b, aVar.f60286b) && C41536l.m120484d(this.f60287c, aVar.f60287c) && this.f60288d == aVar.f60288d;
        }

        public int hashCode() {
            return (((((this.f60285a.hashCode() * 31) + this.f60286b.hashCode()) * 31) + this.f60287c.hashCode()) * 31) + C7397t.m28148a(this.f60288d);
        }

        public String toString() {
            DepositSubmissionNavData depositSubmissionNavData = this.f60285a;
            AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = this.f60286b;
            AccumulateOnPaymentModel accumulateOnPaymentModel = this.f60287c;
            long j = this.f60288d;
            return "ActionFirstStepToSecondStep(navData=" + depositSubmissionNavData + ", stoData=" + accumulateOnSpecificDateModel + ", casData=" + accumulateOnPaymentModel + ", srcAcctKey=" + j + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.a$b */
    public static final class C22898b {
        private C22898b() {
        }

        public /* synthetic */ C22898b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7593r mo57029a(DepositSubmissionNavData depositSubmissionNavData, AccumulateOnSpecificDateModel accumulateOnSpecificDateModel, AccumulateOnPaymentModel accumulateOnPaymentModel, long j) {
            C41536l.m120489i(depositSubmissionNavData, "navData");
            C41536l.m120489i(accumulateOnSpecificDateModel, "stoData");
            C41536l.m120489i(accumulateOnPaymentModel, "casData");
            return new C22897a(depositSubmissionNavData, accumulateOnSpecificDateModel, accumulateOnPaymentModel, j);
        }
    }
}
