package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import pq0.C37941a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.RecommenderUiModel */
public final class RecommenderUiModel implements Parcelable, C37941a {
    public static final Parcelable.Creator<RecommenderUiModel> CREATOR = new C32481a();

    /* renamed from: d */
    private final double f80021d;

    /* renamed from: e */
    private final double f80022e;

    /* renamed from: f */
    private final String f80023f;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.RecommenderUiModel$a */
    public static final class C32481a implements Parcelable.Creator {
        /* renamed from: a */
        public final RecommenderUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RecommenderUiModel(parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        /* renamed from: b */
        public final RecommenderUiModel[] newArray(int i) {
            return new RecommenderUiModel[i];
        }
    }

    public RecommenderUiModel(double d, double d2, String str) {
        C41536l.m120489i(str, "loanCcy");
        this.f80021d = d;
        this.f80022e = d2;
        this.f80023f = str;
    }

    /* renamed from: a */
    public final String mo73396a() {
        return this.f80023f;
    }

    /* renamed from: b */
    public final double mo73397b() {
        return this.f80022e;
    }

    /* renamed from: d */
    public final double mo73398d() {
        return this.f80021d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommenderUiModel)) {
            return false;
        }
        RecommenderUiModel recommenderUiModel = (RecommenderUiModel) obj;
        return Double.compare(this.f80021d, recommenderUiModel.f80021d) == 0 && Double.compare(this.f80022e, recommenderUiModel.f80022e) == 0 && C41536l.m120484d(this.f80023f, recommenderUiModel.f80023f);
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.f80021d) * 31) + Double.doubleToLongBits(this.f80022e)) * 31) + this.f80023f.hashCode();
    }

    public String toString() {
        double d = this.f80021d;
        double d2 = this.f80022e;
        String str = this.f80023f;
        return "RecommenderUiModel(minLoanAmount=" + d + ", maxLoanAmount=" + d2 + ", loanCcy=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f80021d);
        parcel.writeDouble(this.f80022e);
        parcel.writeString(this.f80023f);
    }
}
