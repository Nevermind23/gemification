package p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividend */
public final class GTDividend implements Parcelable {
    public static final Parcelable.Creator<GTDividend> CREATOR = new C23388a();

    /* renamed from: d */
    private final String f61145d;

    /* renamed from: e */
    private final String f61146e;

    /* renamed from: f */
    private final String f61147f;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividend$a */
    public static final class C23388a implements Parcelable.Creator {
        /* renamed from: a */
        public final GTDividend createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new GTDividend(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final GTDividend[] newArray(int i) {
            return new GTDividend[i];
        }
    }

    public GTDividend(String str, String str2, String str3) {
        this.f61145d = str;
        this.f61146e = str2;
        this.f61147f = str3;
    }

    /* renamed from: a */
    public final String mo60104a() {
        return this.f61146e;
    }

    /* renamed from: b */
    public final String mo60105b() {
        return this.f61147f;
    }

    /* renamed from: d */
    public final String mo60106d() {
        return this.f61145d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTDividend)) {
            return false;
        }
        GTDividend gTDividend = (GTDividend) obj;
        return C41536l.m120484d(this.f61145d, gTDividend.f61145d) && C41536l.m120484d(this.f61146e, gTDividend.f61146e) && C41536l.m120484d(this.f61147f, gTDividend.f61147f);
    }

    public int hashCode() {
        String str = this.f61145d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61146e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61147f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f61145d;
        String str2 = this.f61146e;
        String str3 = this.f61147f;
        return "GTDividend(type=" + str + ", amountPerShare=" + str2 + ", taxCode=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f61145d);
        parcel.writeString(this.f61146e);
        parcel.writeString(this.f61147f);
    }
}
