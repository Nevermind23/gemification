package p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTInstrument */
public final class GTInstrument implements Parcelable {
    public static final Parcelable.Creator<GTInstrument> CREATOR = new C23390a();

    /* renamed from: d */
    private final String f61150d;

    /* renamed from: e */
    private final String f61151e;

    /* renamed from: f */
    private final String f61152f;

    /* renamed from: g */
    private final String f61153g;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTInstrument$a */
    public static final class C23390a implements Parcelable.Creator {
        /* renamed from: a */
        public final GTInstrument createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new GTInstrument(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final GTInstrument[] newArray(int i) {
            return new GTInstrument[i];
        }
    }

    public GTInstrument(String str, String str2, String str3, String str4) {
        this.f61150d = str;
        this.f61151e = str2;
        this.f61152f = str3;
        this.f61153g = str4;
    }

    /* renamed from: a */
    public final String mo60127a() {
        return this.f61153g;
    }

    /* renamed from: b */
    public final String mo60128b() {
        return this.f61152f;
    }

    /* renamed from: d */
    public final String mo60129d() {
        return this.f61151e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTInstrument)) {
            return false;
        }
        GTInstrument gTInstrument = (GTInstrument) obj;
        return C41536l.m120484d(this.f61150d, gTInstrument.f61150d) && C41536l.m120484d(this.f61151e, gTInstrument.f61151e) && C41536l.m120484d(this.f61152f, gTInstrument.f61152f) && C41536l.m120484d(this.f61153g, gTInstrument.f61153g);
    }

    public int hashCode() {
        String str = this.f61150d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61151e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61152f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61153g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f61150d;
        String str2 = this.f61151e;
        String str3 = this.f61152f;
        String str4 = this.f61153g;
        return "GTInstrument(id=" + str + ", symbol=" + str2 + ", name=" + str3 + ", imageUrl=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f61150d);
        parcel.writeString(this.f61151e);
        parcel.writeString(this.f61152f);
        parcel.writeString(this.f61153g);
    }
}
