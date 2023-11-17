package p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData */
public final class InstallmentReversalCancelData implements Parcelable {
    public static final Parcelable.Creator<InstallmentReversalCancelData> CREATOR = new C32681a();

    /* renamed from: d */
    private final long f80442d;

    /* renamed from: e */
    private final String f80443e;

    /* renamed from: f */
    private final String f80444f;

    /* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData$a */
    public static final class C32681a implements Parcelable.Creator {
        /* renamed from: a */
        public final InstallmentReversalCancelData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new InstallmentReversalCancelData(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final InstallmentReversalCancelData[] newArray(int i) {
            return new InstallmentReversalCancelData[i];
        }
    }

    public InstallmentReversalCancelData(long j, String str, String str2) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "loanTypeText");
        this.f80442d = j;
        this.f80443e = str;
        this.f80444f = str2;
    }

    /* renamed from: a */
    public final long mo74309a() {
        return this.f80442d;
    }

    /* renamed from: b */
    public final String mo74310b() {
        return this.f80444f;
    }

    /* renamed from: d */
    public final String mo74311d() {
        return this.f80443e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentReversalCancelData)) {
            return false;
        }
        InstallmentReversalCancelData installmentReversalCancelData = (InstallmentReversalCancelData) obj;
        return this.f80442d == installmentReversalCancelData.f80442d && C41536l.m120484d(this.f80443e, installmentReversalCancelData.f80443e) && C41536l.m120484d(this.f80444f, installmentReversalCancelData.f80444f);
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f80442d) * 31) + this.f80443e.hashCode()) * 31) + this.f80444f.hashCode();
    }

    public String toString() {
        long j = this.f80442d;
        String str = this.f80443e;
        String str2 = this.f80444f;
        return "InstallmentReversalCancelData(loanKey=" + j + ", prodType=" + str + ", loanTypeText=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f80442d);
        parcel.writeString(this.f80443e);
        parcel.writeString(this.f80444f);
    }
}
