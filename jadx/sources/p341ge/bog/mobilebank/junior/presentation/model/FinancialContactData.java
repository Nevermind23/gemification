package p341ge.bog.mobilebank.junior.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.junior.presentation.model.FinancialContactData */
public final class FinancialContactData implements Parcelable {
    public static final Parcelable.Creator<FinancialContactData> CREATOR = new C24675a();

    /* renamed from: d */
    private final String f63542d;

    /* renamed from: e */
    private final String f63543e;

    /* renamed from: f */
    private final long f63544f;

    /* renamed from: ge.bog.mobilebank.junior.presentation.model.FinancialContactData$a */
    public static final class C24675a implements Parcelable.Creator {
        /* renamed from: a */
        public final FinancialContactData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new FinancialContactData(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* renamed from: b */
        public final FinancialContactData[] newArray(int i) {
            return new FinancialContactData[i];
        }
    }

    public FinancialContactData(String str, String str2, long j) {
        C41536l.m120489i(str, "contact");
        C41536l.m120489i(str2, "operationReference");
        this.f63542d = str;
        this.f63543e = str2;
        this.f63544f = j;
    }

    /* renamed from: a */
    public final long mo63048a() {
        return this.f63544f;
    }

    /* renamed from: b */
    public final String mo63049b() {
        return this.f63542d;
    }

    /* renamed from: d */
    public final String mo63050d() {
        return this.f63543e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialContactData)) {
            return false;
        }
        FinancialContactData financialContactData = (FinancialContactData) obj;
        return C41536l.m120484d(this.f63542d, financialContactData.f63542d) && C41536l.m120484d(this.f63543e, financialContactData.f63543e) && this.f63544f == financialContactData.f63544f;
    }

    public int hashCode() {
        return (((this.f63542d.hashCode() * 31) + this.f63543e.hashCode()) * 31) + C7397t.m28148a(this.f63544f);
    }

    public String toString() {
        String str = this.f63542d;
        String str2 = this.f63543e;
        long j = this.f63544f;
        return "FinancialContactData(contact=" + str + ", operationReference=" + str2 + ", childClientKey=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f63542d);
        parcel.writeString(this.f63543e);
        parcel.writeLong(this.f63544f);
    }
}
