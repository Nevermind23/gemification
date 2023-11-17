package p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.Details */
public final class Details implements Parcelable {
    public static final Parcelable.Creator<Details> CREATOR = new C34430a();

    /* renamed from: d */
    private final String f83445d;

    /* renamed from: e */
    private final String f83446e;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.Details$a */
    public static final class C34430a implements Parcelable.Creator {
        /* renamed from: a */
        public final Details createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new Details(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final Details[] newArray(int i) {
            return new Details[i];
        }
    }

    public Details(String str, String str2) {
        C41536l.m120489i(str, "headerKey");
        C41536l.m120489i(str2, "data");
        this.f83445d = str;
        this.f83446e = str2;
    }

    /* renamed from: a */
    public final String mo83005a() {
        return this.f83446e;
    }

    /* renamed from: b */
    public final String mo83006b() {
        return this.f83445d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Details)) {
            return false;
        }
        Details details = (Details) obj;
        return C41536l.m120484d(this.f83445d, details.f83445d) && C41536l.m120484d(this.f83446e, details.f83446e);
    }

    public int hashCode() {
        return (this.f83445d.hashCode() * 31) + this.f83446e.hashCode();
    }

    public String toString() {
        String str = this.f83445d;
        String str2 = this.f83446e;
        return "Details(headerKey=" + str + ", data=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f83445d);
        parcel.writeString(this.f83446e);
    }
}
