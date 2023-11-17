package p341ge.bog.mobilebank.qrwithdrawal.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount */
public final class AvailableAmount implements Parcelable {
    public static final Parcelable.Creator<AvailableAmount> CREATOR = new C34426a();

    /* renamed from: d */
    private final BigDecimal f83417d;

    /* renamed from: e */
    private final String f83418e;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount$a */
    public static final class C34426a implements Parcelable.Creator {
        /* renamed from: a */
        public final AvailableAmount createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new AvailableAmount((BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        /* renamed from: b */
        public final AvailableAmount[] newArray(int i) {
            return new AvailableAmount[i];
        }
    }

    public AvailableAmount(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(str, "ccy");
        this.f83417d = bigDecimal;
        this.f83418e = str;
    }

    /* renamed from: a */
    public final BigDecimal mo82943a() {
        return this.f83417d;
    }

    /* renamed from: b */
    public final String mo82944b() {
        return this.f83418e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableAmount)) {
            return false;
        }
        AvailableAmount availableAmount = (AvailableAmount) obj;
        return C41536l.m120484d(this.f83417d, availableAmount.f83417d) && C41536l.m120484d(this.f83418e, availableAmount.f83418e);
    }

    public int hashCode() {
        return (this.f83417d.hashCode() * 31) + this.f83418e.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f83417d;
        String str = this.f83418e;
        return "AvailableAmount(availableAmount=" + bigDecimal + ", ccy=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.f83417d);
        parcel.writeString(this.f83418e);
    }
}
