package p341ge.bog.mobilebank.cleanarch.presentation.commissions.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.model.UpcomingCommissionUIModel */
public final class UpcomingCommissionUIModel implements Parcelable {
    public static final Parcelable.Creator<UpcomingCommissionUIModel> CREATOR = new C21463a();

    /* renamed from: d */
    private final BigDecimal f57333d;

    /* renamed from: e */
    private final String f57334e;

    /* renamed from: f */
    private final String f57335f;

    /* renamed from: g */
    private final long f57336g;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.model.UpcomingCommissionUIModel$a */
    public static final class C21463a implements Parcelable.Creator {
        /* renamed from: a */
        public final UpcomingCommissionUIModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new UpcomingCommissionUIModel((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* renamed from: b */
        public final UpcomingCommissionUIModel[] newArray(int i) {
            return new UpcomingCommissionUIModel[i];
        }
    }

    public UpcomingCommissionUIModel(BigDecimal bigDecimal, String str, String str2, long j) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f57333d = bigDecimal;
        this.f57334e = str;
        this.f57335f = str2;
        this.f57336g = j;
    }

    /* renamed from: a */
    public final BigDecimal mo53543a() {
        return this.f57333d;
    }

    /* renamed from: b */
    public final String mo53544b() {
        return this.f57334e;
    }

    /* renamed from: d */
    public final long mo53545d() {
        return this.f57336g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo53547e() {
        return this.f57335f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingCommissionUIModel)) {
            return false;
        }
        UpcomingCommissionUIModel upcomingCommissionUIModel = (UpcomingCommissionUIModel) obj;
        return C41536l.m120484d(this.f57333d, upcomingCommissionUIModel.f57333d) && C41536l.m120484d(this.f57334e, upcomingCommissionUIModel.f57334e) && C41536l.m120484d(this.f57335f, upcomingCommissionUIModel.f57335f) && this.f57336g == upcomingCommissionUIModel.f57336g;
    }

    public int hashCode() {
        int hashCode = ((this.f57333d.hashCode() * 31) + this.f57334e.hashCode()) * 31;
        String str = this.f57335f;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.f57336g);
    }

    public String toString() {
        BigDecimal bigDecimal = this.f57333d;
        String str = this.f57334e;
        String str2 = this.f57335f;
        long j = this.f57336g;
        return "UpcomingCommissionUIModel(amount=" + bigDecimal + ", ccy=" + str + ", titleKey=" + str2 + ", dueDate=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f57333d);
        parcel.writeString(this.f57334e);
        parcel.writeString(this.f57335f);
        parcel.writeLong(this.f57336g);
    }
}
