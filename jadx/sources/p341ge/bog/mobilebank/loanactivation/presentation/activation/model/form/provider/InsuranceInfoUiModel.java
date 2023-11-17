package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider;

import android.os.Parcel;
import android.os.Parcelable;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel */
public final class InsuranceInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<InsuranceInfoUiModel> CREATOR = new C32487a();

    /* renamed from: d */
    private final double f80064d;

    /* renamed from: e */
    private final String f80065e;

    /* renamed from: f */
    private final RateTypeUiModel f80066f;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel$a */
    public static final class C32487a implements Parcelable.Creator {
        /* renamed from: a */
        public final InsuranceInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new InsuranceInfoUiModel(parcel.readDouble(), parcel.readString(), RateTypeUiModel.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final InsuranceInfoUiModel[] newArray(int i) {
            return new InsuranceInfoUiModel[i];
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel$b */
    public /* synthetic */ class C32488b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80067a;

        static {
            int[] iArr = new int[RateTypeUiModel.values().length];
            try {
                iArr[RateTypeUiModel.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f80067a = iArr;
        }
    }

    public InsuranceInfoUiModel(double d, String str, RateTypeUiModel rateTypeUiModel) {
        C41536l.m120489i(rateTypeUiModel, "rateType");
        this.f80064d = d;
        this.f80065e = str;
        this.f80066f = rateTypeUiModel;
    }

    /* renamed from: a */
    public final String mo73472a() {
        if (C32488b.f80067a[this.f80066f.ordinal()] == 1) {
            double d = this.f80064d;
            String str = this.f80065e;
            C41536l.m120486f(str);
            return C32343x.m95410Q(d, str, false, 2, (Object) null);
        }
        double d2 = this.f80064d;
        return d2 + " %";
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceInfoUiModel)) {
            return false;
        }
        InsuranceInfoUiModel insuranceInfoUiModel = (InsuranceInfoUiModel) obj;
        return Double.compare(this.f80064d, insuranceInfoUiModel.f80064d) == 0 && C41536l.m120484d(this.f80065e, insuranceInfoUiModel.f80065e) && this.f80066f == insuranceInfoUiModel.f80066f;
    }

    public int hashCode() {
        int a = Double.doubleToLongBits(this.f80064d) * 31;
        String str = this.f80065e;
        return ((a + (str == null ? 0 : str.hashCode())) * 31) + this.f80066f.hashCode();
    }

    public String toString() {
        double d = this.f80064d;
        String str = this.f80065e;
        RateTypeUiModel rateTypeUiModel = this.f80066f;
        return "InsuranceInfoUiModel(rate=" + d + ", rateCcy=" + str + ", rateType=" + rateTypeUiModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f80064d);
        parcel.writeString(this.f80065e);
        this.f80066f.writeToParcel(parcel, i);
    }
}
