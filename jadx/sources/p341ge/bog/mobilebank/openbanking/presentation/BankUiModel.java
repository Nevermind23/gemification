package p341ge.bog.mobilebank.openbanking.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.BankUiModel */
public final class BankUiModel implements Parcelable {
    public static final Parcelable.Creator<BankUiModel> CREATOR = new C33306a();

    /* renamed from: d */
    private final String f81413d;

    /* renamed from: e */
    private final String f81414e;

    /* renamed from: f */
    private final String f81415f;

    /* renamed from: g */
    private final boolean f81416g;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.BankUiModel$a */
    public static final class C33306a implements Parcelable.Creator {
        /* renamed from: a */
        public final BankUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BankUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final BankUiModel[] newArray(int i) {
            return new BankUiModel[i];
        }
    }

    public BankUiModel(String str, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "bankId");
        C41536l.m120489i(str2, "bankName");
        C41536l.m120489i(str3, "bankCode");
        this.f81413d = str;
        this.f81414e = str2;
        this.f81415f = str3;
        this.f81416g = z;
    }

    /* renamed from: a */
    public final String mo79091a() {
        return this.f81415f;
    }

    /* renamed from: b */
    public final String mo79092b() {
        return this.f81413d;
    }

    /* renamed from: d */
    public final String mo79093d() {
        return this.f81414e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo79095e() {
        return this.f81416g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankUiModel)) {
            return false;
        }
        BankUiModel bankUiModel = (BankUiModel) obj;
        return C41536l.m120484d(this.f81413d, bankUiModel.f81413d) && C41536l.m120484d(this.f81414e, bankUiModel.f81414e) && C41536l.m120484d(this.f81415f, bankUiModel.f81415f) && this.f81416g == bankUiModel.f81416g;
    }

    public int hashCode() {
        int hashCode = ((((this.f81413d.hashCode() * 31) + this.f81414e.hashCode()) * 31) + this.f81415f.hashCode()) * 31;
        boolean z = this.f81416g;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f81413d;
        String str2 = this.f81414e;
        String str3 = this.f81415f;
        boolean z = this.f81416g;
        return "BankUiModel(bankId=" + str + ", bankName=" + str2 + ", bankCode=" + str3 + ", isActive=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81413d);
        parcel.writeString(this.f81414e);
        parcel.writeString(this.f81415f);
        parcel.writeInt(this.f81416g ? 1 : 0);
    }
}
