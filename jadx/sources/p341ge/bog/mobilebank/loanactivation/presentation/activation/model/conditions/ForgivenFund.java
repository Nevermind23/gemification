package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import mq0.C37251a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ForgivenFund */
public final class ForgivenFund implements Parcelable {
    public static final Parcelable.Creator<ForgivenFund> CREATOR = new C32476a();

    /* renamed from: d */
    private final double f79970d;

    /* renamed from: e */
    private final C37251a f79971e;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ForgivenFund$a */
    public static final class C32476a implements Parcelable.Creator {
        /* renamed from: a */
        public final ForgivenFund createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ForgivenFund(parcel.readDouble(), C37251a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final ForgivenFund[] newArray(int i) {
            return new ForgivenFund[i];
        }
    }

    public ForgivenFund(double d, C37251a aVar) {
        C41536l.m120489i(aVar, "type");
        this.f79970d = d;
        this.f79971e = aVar;
    }

    /* renamed from: a */
    public final double mo73304a() {
        return this.f79970d;
    }

    /* renamed from: b */
    public final C37251a mo73305b() {
        return this.f79971e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForgivenFund)) {
            return false;
        }
        ForgivenFund forgivenFund = (ForgivenFund) obj;
        return Double.compare(this.f79970d, forgivenFund.f79970d) == 0 && this.f79971e == forgivenFund.f79971e;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f79970d) * 31) + this.f79971e.hashCode();
    }

    public String toString() {
        double d = this.f79970d;
        C37251a aVar = this.f79971e;
        return "ForgivenFund(amount=" + d + ", type=" + aVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f79970d);
        parcel.writeString(this.f79971e.name());
    }
}
