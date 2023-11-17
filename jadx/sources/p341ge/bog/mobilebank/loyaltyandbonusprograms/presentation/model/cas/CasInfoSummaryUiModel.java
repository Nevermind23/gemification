package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.Amount;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasInfoSummaryUiModel */
public final class CasInfoSummaryUiModel implements Parcelable {
    public static final Parcelable.Creator<CasInfoSummaryUiModel> CREATOR = new C33104a();

    /* renamed from: d */
    private final String f81033d;

    /* renamed from: e */
    private final double f81034e;

    /* renamed from: f */
    private final double f81035f;

    /* renamed from: g */
    private final Amount f81036g;

    /* renamed from: h */
    private final Amount f81037h;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasInfoSummaryUiModel$a */
    public static final class C33104a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasInfoSummaryUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CasInfoSummaryUiModel(parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        /* renamed from: b */
        public final CasInfoSummaryUiModel[] newArray(int i) {
            return new CasInfoSummaryUiModel[i];
        }
    }

    public CasInfoSummaryUiModel(String str, double d, double d2) {
        C41536l.m120489i(str, "ccy");
        this.f81033d = str;
        this.f81034e = d;
        this.f81035f = d2;
        this.f81036g = new Amount(d, str);
        this.f81037h = new Amount(d2, str);
    }

    /* renamed from: a */
    public final String mo75029a() {
        return this.f81033d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasInfoSummaryUiModel)) {
            return false;
        }
        CasInfoSummaryUiModel casInfoSummaryUiModel = (CasInfoSummaryUiModel) obj;
        return C41536l.m120484d(this.f81033d, casInfoSummaryUiModel.f81033d) && Double.compare(this.f81034e, casInfoSummaryUiModel.f81034e) == 0 && Double.compare(this.f81035f, casInfoSummaryUiModel.f81035f) == 0;
    }

    public int hashCode() {
        return (((this.f81033d.hashCode() * 31) + Double.doubleToLongBits(this.f81034e)) * 31) + Double.doubleToLongBits(this.f81035f);
    }

    public String toString() {
        String str = this.f81033d;
        double d = this.f81034e;
        double d2 = this.f81035f;
        return "CasInfoSummaryUiModel(ccy=" + str + ", totalAmount=" + d + ", totalAmountAcct=" + d2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81033d);
        parcel.writeDouble(this.f81034e);
        parcel.writeDouble(this.f81035f);
    }
}
