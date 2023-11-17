package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.ExchangePointsData */
public final class ExchangePointsData implements Parcelable {
    public static final Parcelable.Creator<ExchangePointsData> CREATOR = new C33100a();

    /* renamed from: d */
    private final String f81011d;

    /* renamed from: e */
    private final String f81012e;

    /* renamed from: f */
    private final String f81013f;

    /* renamed from: g */
    private final String f81014g;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.ExchangePointsData$a */
    public static final class C33100a implements Parcelable.Creator {
        /* renamed from: a */
        public final ExchangePointsData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ExchangePointsData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ExchangePointsData[] newArray(int i) {
            return new ExchangePointsData[i];
        }
    }

    public ExchangePointsData(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "fromPoints");
        C41536l.m120489i(str2, "fromPointsGel");
        C41536l.m120489i(str3, "toPoints");
        C41536l.m120489i(str4, "toPointsGel");
        this.f81011d = str;
        this.f81012e = str2;
        this.f81013f = str3;
        this.f81014g = str4;
    }

    /* renamed from: a */
    public final String mo74978a() {
        return this.f81011d;
    }

    /* renamed from: b */
    public final String mo74979b() {
        return this.f81012e;
    }

    /* renamed from: d */
    public final String mo74980d() {
        return this.f81013f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo74982e() {
        return this.f81014g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangePointsData)) {
            return false;
        }
        ExchangePointsData exchangePointsData = (ExchangePointsData) obj;
        return C41536l.m120484d(this.f81011d, exchangePointsData.f81011d) && C41536l.m120484d(this.f81012e, exchangePointsData.f81012e) && C41536l.m120484d(this.f81013f, exchangePointsData.f81013f) && C41536l.m120484d(this.f81014g, exchangePointsData.f81014g);
    }

    public int hashCode() {
        return (((((this.f81011d.hashCode() * 31) + this.f81012e.hashCode()) * 31) + this.f81013f.hashCode()) * 31) + this.f81014g.hashCode();
    }

    public String toString() {
        String str = this.f81011d;
        String str2 = this.f81012e;
        String str3 = this.f81013f;
        String str4 = this.f81014g;
        return "ExchangePointsData(fromPoints=" + str + ", fromPointsGel=" + str2 + ", toPoints=" + str3 + ", toPointsGel=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81011d);
        parcel.writeString(this.f81012e);
        parcel.writeString(this.f81013f);
        parcel.writeString(this.f81014g);
    }
}
