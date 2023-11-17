package p341ge.bog.mobilebank.cleanarch.moneytransfers.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract */
public final class RemittanceCreditInfoContract implements Parcelable {
    public static final Parcelable.Creator<RemittanceCreditInfoContract> CREATOR = new C21167a();

    /* renamed from: d */
    private final boolean f56851d;

    /* renamed from: e */
    private final String f56852e;

    /* renamed from: f */
    private final String f56853f;

    /* renamed from: g */
    private final String f56854g;

    /* renamed from: h */
    private final String f56855h;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract$a */
    public static final class C21167a implements Parcelable.Creator {
        /* renamed from: a */
        public final RemittanceCreditInfoContract createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RemittanceCreditInfoContract(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final RemittanceCreditInfoContract[] newArray(int i) {
            return new RemittanceCreditInfoContract[i];
        }
    }

    public RemittanceCreditInfoContract(boolean z, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "confirmationContractLogo");
        C41536l.m120489i(str2, "denyContractLogo");
        C41536l.m120489i(str3, "confirmationContractText");
        C41536l.m120489i(str4, "denyContractText");
        this.f56851d = z;
        this.f56852e = str;
        this.f56853f = str2;
        this.f56854g = str3;
        this.f56855h = str4;
    }

    /* renamed from: a */
    public final String mo53047a() {
        return this.f56852e;
    }

    /* renamed from: b */
    public final String mo53048b() {
        return this.f56854g;
    }

    /* renamed from: d */
    public final String mo53049d() {
        return this.f56853f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo53051e() {
        return this.f56855h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemittanceCreditInfoContract)) {
            return false;
        }
        RemittanceCreditInfoContract remittanceCreditInfoContract = (RemittanceCreditInfoContract) obj;
        return this.f56851d == remittanceCreditInfoContract.f56851d && C41536l.m120484d(this.f56852e, remittanceCreditInfoContract.f56852e) && C41536l.m120484d(this.f56853f, remittanceCreditInfoContract.f56853f) && C41536l.m120484d(this.f56854g, remittanceCreditInfoContract.f56854g) && C41536l.m120484d(this.f56855h, remittanceCreditInfoContract.f56855h);
    }

    /* renamed from: f */
    public final boolean mo53053f() {
        return this.f56851d;
    }

    public int hashCode() {
        boolean z = this.f56851d;
        if (z) {
            z = true;
        }
        return ((((((((z ? 1 : 0) * true) + this.f56852e.hashCode()) * 31) + this.f56853f.hashCode()) * 31) + this.f56854g.hashCode()) * 31) + this.f56855h.hashCode();
    }

    public String toString() {
        boolean z = this.f56851d;
        String str = this.f56852e;
        String str2 = this.f56853f;
        String str3 = this.f56854g;
        String str4 = this.f56855h;
        return "RemittanceCreditInfoContract(showContract=" + z + ", confirmationContractLogo=" + str + ", denyContractLogo=" + str2 + ", confirmationContractText=" + str3 + ", denyContractText=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f56851d ? 1 : 0);
        parcel.writeString(this.f56852e);
        parcel.writeString(this.f56853f);
        parcel.writeString(this.f56854g);
        parcel.writeString(this.f56855h);
    }
}
