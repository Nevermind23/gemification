package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.model.StatisticsData */
public final class StatisticsData implements Parcelable {
    public static final Parcelable.Creator<StatisticsData> CREATOR = new C14739a();

    /* renamed from: d */
    private final long f42755d;

    /* renamed from: e */
    private final boolean f42756e;

    /* renamed from: f */
    private final Number f42757f;

    /* renamed from: g */
    private final Number f42758g;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.model.StatisticsData$a */
    public static final class C14739a implements Parcelable.Creator {
        /* renamed from: a */
        public final StatisticsData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new StatisticsData(parcel.readLong(), parcel.readInt() != 0, (Number) parcel.readSerializable(), (Number) parcel.readSerializable());
        }

        /* renamed from: b */
        public final StatisticsData[] newArray(int i) {
            return new StatisticsData[i];
        }
    }

    public StatisticsData(long j, boolean z, Number number, Number number2) {
        C41536l.m120489i(number, "fullAmount");
        C41536l.m120489i(number2, "currentAmount");
        this.f42755d = j;
        this.f42756e = z;
        this.f42757f = number;
        this.f42758g = number2;
    }

    /* renamed from: a */
    public final Number mo41158a() {
        return this.f42758g;
    }

    /* renamed from: b */
    public final Number mo41159b() {
        return this.f42757f;
    }

    /* renamed from: d */
    public final long mo41160d() {
        return this.f42755d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo41162e() {
        return this.f42756e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticsData)) {
            return false;
        }
        StatisticsData statisticsData = (StatisticsData) obj;
        return this.f42755d == statisticsData.f42755d && this.f42756e == statisticsData.f42756e && C41536l.m120484d(this.f42757f, statisticsData.f42757f) && C41536l.m120484d(this.f42758g, statisticsData.f42758g);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f42755d) * 31;
        boolean z = this.f42756e;
        if (z) {
            z = true;
        }
        return ((((a + (z ? 1 : 0)) * 31) + this.f42757f.hashCode()) * 31) + this.f42758g.hashCode();
    }

    public String toString() {
        long j = this.f42755d;
        boolean z = this.f42756e;
        Number number = this.f42757f;
        Number number2 = this.f42758g;
        return "StatisticsData(packageId=" + j + ", isSolo=" + z + ", fullAmount=" + number + ", currentAmount=" + number2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f42755d);
        parcel.writeInt(this.f42756e ? 1 : 0);
        parcel.writeSerializable(this.f42757f);
        parcel.writeSerializable(this.f42758g);
    }
}
