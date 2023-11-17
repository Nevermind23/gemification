package p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTAcquire */
public final class GTAcquire implements Parcelable {
    public static final Parcelable.Creator<GTAcquire> CREATOR = new C23387a();

    /* renamed from: d */
    private final String f61142d;

    /* renamed from: e */
    private final String f61143e;

    /* renamed from: f */
    private final String f61144f;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTAcquire$a */
    public static final class C23387a implements Parcelable.Creator {
        /* renamed from: a */
        public final GTAcquire createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new GTAcquire(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final GTAcquire[] newArray(int i) {
            return new GTAcquire[i];
        }
    }

    public GTAcquire(String str, String str2, String str3) {
        this.f61142d = str;
        this.f61143e = str2;
        this.f61144f = str3;
    }

    /* renamed from: a */
    public final String mo60093a() {
        return this.f61144f;
    }

    /* renamed from: b */
    public final String mo60094b() {
        return this.f61143e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTAcquire)) {
            return false;
        }
        GTAcquire gTAcquire = (GTAcquire) obj;
        return C41536l.m120484d(this.f61142d, gTAcquire.f61142d) && C41536l.m120484d(this.f61143e, gTAcquire.f61143e) && C41536l.m120484d(this.f61144f, gTAcquire.f61144f);
    }

    public int hashCode() {
        String str = this.f61142d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61143e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61144f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f61142d;
        String str2 = this.f61143e;
        String str3 = this.f61144f;
        return "GTAcquire(id=" + str + ", symbol=" + str2 + ", name=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f61142d);
        parcel.writeString(this.f61143e);
        parcel.writeString(this.f61144f);
    }
}
