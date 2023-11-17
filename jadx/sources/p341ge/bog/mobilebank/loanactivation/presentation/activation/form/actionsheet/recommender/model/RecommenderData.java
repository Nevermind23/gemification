package p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.recommender.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.recommender.model.RecommenderData */
public final class RecommenderData implements Parcelable {
    public static final Parcelable.Creator<RecommenderData> CREATOR = new C32443a();

    /* renamed from: d */
    private final double f79896d;

    /* renamed from: e */
    private final double f79897e;

    /* renamed from: f */
    private final String f79898f;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.recommender.model.RecommenderData$a */
    public static final class C32443a implements Parcelable.Creator {
        /* renamed from: a */
        public final RecommenderData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RecommenderData(parcel.readDouble(), parcel.readDouble(), parcel.readString());
        }

        /* renamed from: b */
        public final RecommenderData[] newArray(int i) {
            return new RecommenderData[i];
        }
    }

    public RecommenderData(double d, double d2, String str) {
        C41536l.m120489i(str, "ccy");
        this.f79896d = d;
        this.f79897e = d2;
        this.f79898f = str;
    }

    /* renamed from: a */
    public final String mo73234a() {
        return this.f79898f;
    }

    /* renamed from: b */
    public final double mo73235b() {
        return this.f79897e;
    }

    /* renamed from: d */
    public final double mo73236d() {
        return this.f79896d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommenderData)) {
            return false;
        }
        RecommenderData recommenderData = (RecommenderData) obj;
        return Double.compare(this.f79896d, recommenderData.f79896d) == 0 && Double.compare(this.f79897e, recommenderData.f79897e) == 0 && C41536l.m120484d(this.f79898f, recommenderData.f79898f);
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.f79896d) * 31) + Double.doubleToLongBits(this.f79897e)) * 31) + this.f79898f.hashCode();
    }

    public String toString() {
        double d = this.f79896d;
        double d2 = this.f79897e;
        String str = this.f79898f;
        return "RecommenderData(minAmount=" + d + ", maxAmount=" + d2 + ", ccy=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f79896d);
        parcel.writeDouble(this.f79897e);
        parcel.writeString(this.f79898f);
    }
}
