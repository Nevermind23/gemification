package wa0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p202p0.C7540f;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;

/* renamed from: wa0.g */
public final class C29255g implements C7540f {

    /* renamed from: e */
    public static final C29256a f74320e = new C29256a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final DepositSubmissionNavData f74321a;

    /* renamed from: b */
    private final AccumulateOnSpecificDateModel f74322b;

    /* renamed from: c */
    private final AccumulateOnPaymentModel f74323c;

    /* renamed from: d */
    private final long f74324d;

    /* renamed from: wa0.g$a */
    public static final class C29256a {
        private C29256a() {
        }

        public /* synthetic */ C29256a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29255g mo69103a(Bundle bundle) {
            C41536l.m120489i(bundle, "bundle");
            bundle.setClassLoader(C29255g.class.getClassLoader());
            if (bundle.containsKey("nav_data")) {
                Class<Parcelable> cls = Parcelable.class;
                Class<DepositSubmissionNavData> cls2 = DepositSubmissionNavData.class;
                Class<Serializable> cls3 = Serializable.class;
                if (cls.isAssignableFrom(cls2) || cls3.isAssignableFrom(cls2)) {
                    DepositSubmissionNavData depositSubmissionNavData = (DepositSubmissionNavData) bundle.get("nav_data");
                    if (depositSubmissionNavData == null) {
                        throw new IllegalArgumentException("Argument \"nav_data\" is marked as non-null but was passed a null value.");
                    } else if (bundle.containsKey("sto_data")) {
                        Class<AccumulateOnSpecificDateModel> cls4 = AccumulateOnSpecificDateModel.class;
                        if (cls.isAssignableFrom(cls4) || cls3.isAssignableFrom(cls4)) {
                            AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = (AccumulateOnSpecificDateModel) bundle.get("sto_data");
                            if (accumulateOnSpecificDateModel == null) {
                                throw new IllegalArgumentException("Argument \"sto_data\" is marked as non-null but was passed a null value.");
                            } else if (bundle.containsKey("cas_data")) {
                                Class<AccumulateOnPaymentModel> cls5 = AccumulateOnPaymentModel.class;
                                if (cls.isAssignableFrom(cls5) || cls3.isAssignableFrom(cls5)) {
                                    AccumulateOnPaymentModel accumulateOnPaymentModel = (AccumulateOnPaymentModel) bundle.get("cas_data");
                                    if (accumulateOnPaymentModel == null) {
                                        throw new IllegalArgumentException("Argument \"cas_data\" is marked as non-null but was passed a null value.");
                                    } else if (bundle.containsKey("src_acct_key")) {
                                        return new C29255g(depositSubmissionNavData, accumulateOnSpecificDateModel, accumulateOnPaymentModel, bundle.getLong("src_acct_key"));
                                    } else {
                                        throw new IllegalArgumentException("Required argument \"src_acct_key\" is missing and does not have an android:defaultValue");
                                    }
                                } else {
                                    String name = cls5.getName();
                                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                                }
                            } else {
                                throw new IllegalArgumentException("Required argument \"cas_data\" is missing and does not have an android:defaultValue");
                            }
                        } else {
                            String name2 = cls4.getName();
                            throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                    } else {
                        throw new IllegalArgumentException("Required argument \"sto_data\" is missing and does not have an android:defaultValue");
                    }
                } else {
                    String name3 = cls2.getName();
                    throw new UnsupportedOperationException(name3 + " must implement Parcelable or Serializable or must be an Enum.");
                }
            } else {
                throw new IllegalArgumentException("Required argument \"nav_data\" is missing and does not have an android:defaultValue");
            }
        }
    }

    public C29255g(DepositSubmissionNavData depositSubmissionNavData, AccumulateOnSpecificDateModel accumulateOnSpecificDateModel, AccumulateOnPaymentModel accumulateOnPaymentModel, long j) {
        C41536l.m120489i(depositSubmissionNavData, "navData");
        C41536l.m120489i(accumulateOnSpecificDateModel, "stoData");
        C41536l.m120489i(accumulateOnPaymentModel, "casData");
        this.f74321a = depositSubmissionNavData;
        this.f74322b = accumulateOnSpecificDateModel;
        this.f74323c = accumulateOnPaymentModel;
        this.f74324d = j;
    }

    public static final C29255g fromBundle(Bundle bundle) {
        return f74320e.mo69103a(bundle);
    }

    /* renamed from: a */
    public final AccumulateOnPaymentModel mo69096a() {
        return this.f74323c;
    }

    /* renamed from: b */
    public final DepositSubmissionNavData mo69097b() {
        return this.f74321a;
    }

    /* renamed from: c */
    public final long mo69098c() {
        return this.f74324d;
    }

    /* renamed from: d */
    public final AccumulateOnSpecificDateModel mo69099d() {
        return this.f74322b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29255g)) {
            return false;
        }
        C29255g gVar = (C29255g) obj;
        return C41536l.m120484d(this.f74321a, gVar.f74321a) && C41536l.m120484d(this.f74322b, gVar.f74322b) && C41536l.m120484d(this.f74323c, gVar.f74323c) && this.f74324d == gVar.f74324d;
    }

    public int hashCode() {
        return (((((this.f74321a.hashCode() * 31) + this.f74322b.hashCode()) * 31) + this.f74323c.hashCode()) * 31) + C7397t.m28148a(this.f74324d);
    }

    public String toString() {
        DepositSubmissionNavData depositSubmissionNavData = this.f74321a;
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = this.f74322b;
        AccumulateOnPaymentModel accumulateOnPaymentModel = this.f74323c;
        long j = this.f74324d;
        return "CombinedOfferSecondStepFragmentArgs(navData=" + depositSubmissionNavData + ", stoData=" + accumulateOnSpecificDateModel + ", casData=" + accumulateOnPaymentModel + ", srcAcctKey=" + j + ")";
    }
}
