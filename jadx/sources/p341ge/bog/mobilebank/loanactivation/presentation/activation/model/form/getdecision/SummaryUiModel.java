package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.SummaryUiModel */
public final class SummaryUiModel implements Parcelable {
    public static final Parcelable.Creator<SummaryUiModel> CREATOR = new C32486a();

    /* renamed from: d */
    private Double f80060d;

    /* renamed from: e */
    private String f80061e;

    /* renamed from: f */
    private Double f80062f;

    /* renamed from: g */
    private Double f80063g;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.SummaryUiModel$a */
    public static final class C32486a implements Parcelable.Creator {
        /* renamed from: a */
        public final SummaryUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Double d = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString = parcel.readString();
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                d = Double.valueOf(parcel.readDouble());
            }
            return new SummaryUiModel(valueOf, readString, valueOf2, d);
        }

        /* renamed from: b */
        public final SummaryUiModel[] newArray(int i) {
            return new SummaryUiModel[i];
        }
    }

    public SummaryUiModel(Double d, String str, Double d2, Double d3) {
        this.f80060d = d;
        this.f80061e = str;
        this.f80062f = d2;
        this.f80063g = d3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryUiModel)) {
            return false;
        }
        SummaryUiModel summaryUiModel = (SummaryUiModel) obj;
        return C41536l.m120484d(this.f80060d, summaryUiModel.f80060d) && C41536l.m120484d(this.f80061e, summaryUiModel.f80061e) && C41536l.m120484d(this.f80062f, summaryUiModel.f80062f) && C41536l.m120484d(this.f80063g, summaryUiModel.f80063g);
    }

    public int hashCode() {
        Double d = this.f80060d;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.f80061e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.f80062f;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f80063g;
        if (d3 != null) {
            i = d3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        Double d = this.f80060d;
        String str = this.f80061e;
        Double d2 = this.f80062f;
        Double d3 = this.f80063g;
        return "SummaryUiModel(intAmount=" + d + ", ccy=" + str + ", priAmount=" + d2 + ", fullAmount=" + d3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Double d = this.f80060d;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f80061e);
        Double d2 = this.f80062f;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.f80063g;
        if (d3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d3.doubleValue());
    }
}
