package p341ge.bog.mobilebank.p2p.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.p2p.domain.model.MoneyTransferResponse */
public final class MoneyTransferResponse implements Parcelable {
    public static final Parcelable.Creator<MoneyTransferResponse> CREATOR = new C33485a();

    /* renamed from: d */
    private final double f81713d;

    /* renamed from: e */
    private final String f81714e;

    /* renamed from: f */
    private final double f81715f;

    /* renamed from: g */
    private final String f81716g;

    /* renamed from: h */
    private final String f81717h;

    /* renamed from: i */
    private final String f81718i;

    /* renamed from: j */
    private final String f81719j;

    /* renamed from: ge.bog.mobilebank.p2p.domain.model.MoneyTransferResponse$a */
    public static final class C33485a implements Parcelable.Creator {
        /* renamed from: a */
        public final MoneyTransferResponse createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new MoneyTransferResponse(parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final MoneyTransferResponse[] newArray(int i) {
            return new MoneyTransferResponse[i];
        }
    }

    public MoneyTransferResponse(double d, String str, double d2, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "comCcy");
        C41536l.m120489i(str3, "contactPhoneNumber");
        C41536l.m120489i(str4, "nomination");
        this.f81713d = d;
        this.f81714e = str;
        this.f81715f = d2;
        this.f81716g = str2;
        this.f81717h = str3;
        this.f81718i = str4;
        this.f81719j = str5;
    }

    /* renamed from: a */
    public final double mo79419a() {
        return this.f81713d;
    }

    /* renamed from: b */
    public final String mo79420b() {
        return this.f81714e;
    }

    /* renamed from: d */
    public final double mo79421d() {
        return this.f81715f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo79423e() {
        return this.f81716g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferResponse)) {
            return false;
        }
        MoneyTransferResponse moneyTransferResponse = (MoneyTransferResponse) obj;
        return Double.compare(this.f81713d, moneyTransferResponse.f81713d) == 0 && C41536l.m120484d(this.f81714e, moneyTransferResponse.f81714e) && Double.compare(this.f81715f, moneyTransferResponse.f81715f) == 0 && C41536l.m120484d(this.f81716g, moneyTransferResponse.f81716g) && C41536l.m120484d(this.f81717h, moneyTransferResponse.f81717h) && C41536l.m120484d(this.f81718i, moneyTransferResponse.f81718i) && C41536l.m120484d(this.f81719j, moneyTransferResponse.f81719j);
    }

    /* renamed from: f */
    public final String mo79425f() {
        return this.f81717h;
    }

    /* renamed from: g */
    public final String mo79426g() {
        return this.f81718i;
    }

    public int hashCode() {
        int a = ((((((((((Double.doubleToLongBits(this.f81713d) * 31) + this.f81714e.hashCode()) * 31) + Double.doubleToLongBits(this.f81715f)) * 31) + this.f81716g.hashCode()) * 31) + this.f81717h.hashCode()) * 31) + this.f81718i.hashCode()) * 31;
        String str = this.f81719j;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        double d = this.f81713d;
        String str = this.f81714e;
        double d2 = this.f81715f;
        String str2 = this.f81716g;
        String str3 = this.f81717h;
        String str4 = this.f81718i;
        String str5 = this.f81719j;
        return "MoneyTransferResponse(amount=" + d + ", ccy=" + str + ", comAmount=" + d2 + ", comCcy=" + str2 + ", contactPhoneNumber=" + str3 + ", nomination=" + str4 + ", contactName=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f81713d);
        parcel.writeString(this.f81714e);
        parcel.writeDouble(this.f81715f);
        parcel.writeString(this.f81716g);
        parcel.writeString(this.f81717h);
        parcel.writeString(this.f81718i);
        parcel.writeString(this.f81719j);
    }
}
