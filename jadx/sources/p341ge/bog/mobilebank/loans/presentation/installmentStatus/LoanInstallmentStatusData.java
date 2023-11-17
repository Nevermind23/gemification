package p341ge.bog.mobilebank.loans.presentation.installmentStatus;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusData */
public final class LoanInstallmentStatusData implements Parcelable {
    public static final Parcelable.Creator<LoanInstallmentStatusData> CREATOR = new C32676a();

    /* renamed from: d */
    private final String f80430d;

    /* renamed from: e */
    private final String f80431e;

    /* renamed from: f */
    private final String f80432f;

    /* renamed from: ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusData$a */
    public static final class C32676a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoanInstallmentStatusData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new LoanInstallmentStatusData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LoanInstallmentStatusData[] newArray(int i) {
            return new LoanInstallmentStatusData[i];
        }
    }

    public LoanInstallmentStatusData(String str, String str2, String str3) {
        C41536l.m120489i(str, "loanStatus");
        C41536l.m120489i(str2, "loanNo");
        this.f80430d = str;
        this.f80431e = str2;
        this.f80432f = str3;
    }

    /* renamed from: a */
    public final String mo74292a() {
        return this.f80431e;
    }

    /* renamed from: b */
    public final String mo74293b() {
        return this.f80430d;
    }

    /* renamed from: d */
    public final String mo74294d() {
        return this.f80432f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanInstallmentStatusData)) {
            return false;
        }
        LoanInstallmentStatusData loanInstallmentStatusData = (LoanInstallmentStatusData) obj;
        return C41536l.m120484d(this.f80430d, loanInstallmentStatusData.f80430d) && C41536l.m120484d(this.f80431e, loanInstallmentStatusData.f80431e) && C41536l.m120484d(this.f80432f, loanInstallmentStatusData.f80432f);
    }

    public int hashCode() {
        int hashCode = ((this.f80430d.hashCode() * 31) + this.f80431e.hashCode()) * 31;
        String str = this.f80432f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f80430d;
        String str2 = this.f80431e;
        String str3 = this.f80432f;
        return "LoanInstallmentStatusData(loanStatus=" + str + ", loanNo=" + str2 + ", merchantPhone=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80430d);
        parcel.writeString(this.f80431e);
        parcel.writeString(this.f80432f);
    }
}
