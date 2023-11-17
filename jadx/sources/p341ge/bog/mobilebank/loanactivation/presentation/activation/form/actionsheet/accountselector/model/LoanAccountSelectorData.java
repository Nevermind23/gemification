package p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import lq0.C37124a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData */
public final class LoanAccountSelectorData implements Parcelable {
    public static final Parcelable.Creator<LoanAccountSelectorData> CREATOR = new C32442a();

    /* renamed from: d */
    private final String f79893d;

    /* renamed from: e */
    private final C37124a f79894e;

    /* renamed from: f */
    private final Long f79895f;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData$a */
    public static final class C32442a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoanAccountSelectorData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new LoanAccountSelectorData(parcel.readString(), C37124a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final LoanAccountSelectorData[] newArray(int i) {
            return new LoanAccountSelectorData[i];
        }
    }

    public LoanAccountSelectorData(String str, C37124a aVar, Long l) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(aVar, "loanType");
        this.f79893d = str;
        this.f79894e = aVar;
        this.f79895f = l;
    }

    /* renamed from: a */
    public final String mo73222a() {
        return this.f79893d;
    }

    /* renamed from: b */
    public final C37124a mo73223b() {
        return this.f79894e;
    }

    /* renamed from: d */
    public final Long mo73224d() {
        return this.f79895f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanAccountSelectorData)) {
            return false;
        }
        LoanAccountSelectorData loanAccountSelectorData = (LoanAccountSelectorData) obj;
        return C41536l.m120484d(this.f79893d, loanAccountSelectorData.f79893d) && this.f79894e == loanAccountSelectorData.f79894e && C41536l.m120484d(this.f79895f, loanAccountSelectorData.f79895f);
    }

    public int hashCode() {
        int hashCode = ((this.f79893d.hashCode() * 31) + this.f79894e.hashCode()) * 31;
        Long l = this.f79895f;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.f79893d;
        C37124a aVar = this.f79894e;
        Long l = this.f79895f;
        return "LoanAccountSelectorData(ccy=" + str + ", loanType=" + aVar + ", selectedId=" + l + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f79893d);
        parcel.writeString(this.f79894e.name());
        Long l = this.f79895f;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }
}
