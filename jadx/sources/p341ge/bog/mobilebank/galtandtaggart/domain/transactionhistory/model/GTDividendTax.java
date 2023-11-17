package p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividendTax */
public final class GTDividendTax implements Parcelable {
    public static final Parcelable.Creator<GTDividendTax> CREATOR = new C23389a();

    /* renamed from: d */
    private final String f61148d;

    /* renamed from: e */
    private final String f61149e;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTDividendTax$a */
    public static final class C23389a implements Parcelable.Creator {
        /* renamed from: a */
        public final GTDividendTax createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new GTDividendTax(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final GTDividendTax[] newArray(int i) {
            return new GTDividendTax[i];
        }
    }

    public GTDividendTax(String str, String str2) {
        this.f61148d = str;
        this.f61149e = str2;
    }

    /* renamed from: a */
    public final String mo60116a() {
        return this.f61148d;
    }

    /* renamed from: b */
    public final String mo60117b() {
        return this.f61149e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTDividendTax)) {
            return false;
        }
        GTDividendTax gTDividendTax = (GTDividendTax) obj;
        return C41536l.m120484d(this.f61148d, gTDividendTax.f61148d) && C41536l.m120484d(this.f61149e, gTDividendTax.f61149e);
    }

    public int hashCode() {
        String str = this.f61148d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61149e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f61148d;
        String str2 = this.f61149e;
        return "GTDividendTax(rate=" + str + ", type=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f61148d);
        parcel.writeString(this.f61149e);
    }
}
