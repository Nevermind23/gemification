package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import g91.C32343x;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p615tg.C17962c;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel */
public final class InsuranceInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<InsuranceInfoUiModel> CREATOR = new C20936a();

    /* renamed from: d */
    private final double f56264d;

    /* renamed from: e */
    private final String f56265e;

    /* renamed from: f */
    private final RateTypeUiModel f56266f;

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel$a */
    public static final class C20936a implements Parcelable.Creator {
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

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel$b */
    public /* synthetic */ class C20937b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56267a;

        static {
            int[] iArr = new int[RateTypeUiModel.values().length];
            try {
                iArr[RateTypeUiModel.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f56267a = iArr;
        }
    }

    public InsuranceInfoUiModel(double d, String str, RateTypeUiModel rateTypeUiModel) {
        C41536l.m120489i(rateTypeUiModel, "rateType");
        this.f56264d = d;
        this.f56265e = str;
        this.f56266f = rateTypeUiModel;
    }

    /* renamed from: a */
    public final String mo49815a() {
        if (C20937b.f56267a[this.f56266f.ordinal()] == 1) {
            C17962c cVar = C17962c.f51156a;
            BigDecimal l = C32343x.m95463l(this.f56264d);
            String str = this.f56265e;
            C41536l.m120486f(str);
            return cVar.mo45632a(l, str);
        }
        double d = this.f56264d;
        return d + "%";
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
        return Double.compare(this.f56264d, insuranceInfoUiModel.f56264d) == 0 && C41536l.m120484d(this.f56265e, insuranceInfoUiModel.f56265e) && this.f56266f == insuranceInfoUiModel.f56266f;
    }

    public int hashCode() {
        int a = Double.doubleToLongBits(this.f56264d) * 31;
        String str = this.f56265e;
        return ((a + (str == null ? 0 : str.hashCode())) * 31) + this.f56266f.hashCode();
    }

    public String toString() {
        double d = this.f56264d;
        String str = this.f56265e;
        RateTypeUiModel rateTypeUiModel = this.f56266f;
        return "InsuranceInfoUiModel(rate=" + d + ", rateCcy=" + str + ", rateType=" + rateTypeUiModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f56264d);
        parcel.writeString(this.f56265e);
        this.f56266f.writeToParcel(parcel, i);
    }
}
