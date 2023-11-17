package p341ge.bog.mobilebank.loans.presentation.repayment.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loans.presentation.repayment.model.RepaymentDetailsUiModel */
public final class RepaymentDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<RepaymentDetailsUiModel> CREATOR = new C32770a();

    /* renamed from: d */
    private final String f80591d;

    /* renamed from: e */
    private final String f80592e;

    /* renamed from: f */
    private final boolean f80593f;

    /* renamed from: ge.bog.mobilebank.loans.presentation.repayment.model.RepaymentDetailsUiModel$a */
    public static final class C32770a implements Parcelable.Creator {
        /* renamed from: a */
        public final RepaymentDetailsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RepaymentDetailsUiModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final RepaymentDetailsUiModel[] newArray(int i) {
            return new RepaymentDetailsUiModel[i];
        }
    }

    public RepaymentDetailsUiModel(String str, String str2, boolean z) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "text");
        this.f80591d = str;
        this.f80592e = str2;
        this.f80593f = z;
    }

    /* renamed from: a */
    public final String mo74459a() {
        return this.f80592e;
    }

    /* renamed from: b */
    public final String mo74460b() {
        return this.f80591d;
    }

    /* renamed from: d */
    public final boolean mo74461d() {
        return this.f80593f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepaymentDetailsUiModel)) {
            return false;
        }
        RepaymentDetailsUiModel repaymentDetailsUiModel = (RepaymentDetailsUiModel) obj;
        return C41536l.m120484d(this.f80591d, repaymentDetailsUiModel.f80591d) && C41536l.m120484d(this.f80592e, repaymentDetailsUiModel.f80592e) && this.f80593f == repaymentDetailsUiModel.f80593f;
    }

    public int hashCode() {
        int hashCode = ((this.f80591d.hashCode() * 31) + this.f80592e.hashCode()) * 31;
        boolean z = this.f80593f;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f80591d;
        String str2 = this.f80592e;
        boolean z = this.f80593f;
        return "RepaymentDetailsUiModel(title=" + str + ", text=" + str2 + ", isWarning=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80591d);
        parcel.writeString(this.f80592e);
        parcel.writeInt(this.f80593f ? 1 : 0);
    }
}
