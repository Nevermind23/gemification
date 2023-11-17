package p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalSuccessData */
public final class InstallmentReversalSuccessData implements Parcelable {
    public static final Parcelable.Creator<InstallmentReversalSuccessData> CREATOR = new C32682a();

    /* renamed from: d */
    private final String f80445d;

    /* renamed from: e */
    private final String f80446e;

    /* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalSuccessData$a */
    public static final class C32682a implements Parcelable.Creator {
        /* renamed from: a */
        public final InstallmentReversalSuccessData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new InstallmentReversalSuccessData(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final InstallmentReversalSuccessData[] newArray(int i) {
            return new InstallmentReversalSuccessData[i];
        }
    }

    public InstallmentReversalSuccessData(String str, String str2) {
        C41536l.m120489i(str, "loanTypeText");
        C41536l.m120489i(str2, "reasonText");
        this.f80445d = str;
        this.f80446e = str2;
    }

    /* renamed from: a */
    public final String mo74321a() {
        return this.f80445d;
    }

    /* renamed from: b */
    public final String mo74322b() {
        return this.f80446e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentReversalSuccessData)) {
            return false;
        }
        InstallmentReversalSuccessData installmentReversalSuccessData = (InstallmentReversalSuccessData) obj;
        return C41536l.m120484d(this.f80445d, installmentReversalSuccessData.f80445d) && C41536l.m120484d(this.f80446e, installmentReversalSuccessData.f80446e);
    }

    public int hashCode() {
        return (this.f80445d.hashCode() * 31) + this.f80446e.hashCode();
    }

    public String toString() {
        String str = this.f80445d;
        String str2 = this.f80446e;
        return "InstallmentReversalSuccessData(loanTypeText=" + str + ", reasonText=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80445d);
        parcel.writeString(this.f80446e);
    }
}
