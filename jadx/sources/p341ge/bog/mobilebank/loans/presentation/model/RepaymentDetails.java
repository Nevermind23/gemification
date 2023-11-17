package p341ge.bog.mobilebank.loans.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loans.presentation.model.RepaymentDetails */
public final class RepaymentDetails implements Parcelable {
    public static final Parcelable.Creator<RepaymentDetails> CREATOR = new C32686a();

    /* renamed from: d */
    private final String f80458d;

    /* renamed from: e */
    private final String f80459e;

    /* renamed from: ge.bog.mobilebank.loans.presentation.model.RepaymentDetails$a */
    public static final class C32686a implements Parcelable.Creator {
        /* renamed from: a */
        public final RepaymentDetails createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RepaymentDetails(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final RepaymentDetails[] newArray(int i) {
            return new RepaymentDetails[i];
        }
    }

    public RepaymentDetails(String str, String str2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "amount");
        this.f80458d = str;
        this.f80459e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepaymentDetails)) {
            return false;
        }
        RepaymentDetails repaymentDetails = (RepaymentDetails) obj;
        return C41536l.m120484d(this.f80458d, repaymentDetails.f80458d) && C41536l.m120484d(this.f80459e, repaymentDetails.f80459e);
    }

    public int hashCode() {
        return (this.f80458d.hashCode() * 31) + this.f80459e.hashCode();
    }

    public String toString() {
        String str = this.f80458d;
        String str2 = this.f80459e;
        return "RepaymentDetails(title=" + str + ", amount=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80458d);
        parcel.writeString(this.f80459e);
    }
}
