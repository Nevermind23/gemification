package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData */
public final class InsuranceProviderData implements Parcelable {
    public static final Parcelable.Creator<InsuranceProviderData> CREATOR = new C32492a();

    /* renamed from: d */
    private final String f80095d;

    /* renamed from: e */
    private final String f80096e;

    /* renamed from: f */
    private final InsuranceInfoUiModel f80097f;

    /* renamed from: g */
    private final InsuranceInfoUiModel f80098g;

    /* renamed from: h */
    private boolean f80099h;

    /* renamed from: i */
    private final boolean f80100i;

    /* renamed from: j */
    private final boolean f80101j;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData$a */
    public static final class C32492a implements Parcelable.Creator {
        /* renamed from: a */
        public final InsuranceProviderData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            InsuranceInfoUiModel insuranceInfoUiModel = null;
            InsuranceInfoUiModel createFromParcel = parcel.readInt() == 0 ? null : InsuranceInfoUiModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                insuranceInfoUiModel = InsuranceInfoUiModel.CREATOR.createFromParcel(parcel);
            }
            return new InsuranceProviderData(readString, readString2, createFromParcel, insuranceInfoUiModel, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final InsuranceProviderData[] newArray(int i) {
            return new InsuranceProviderData[i];
        }
    }

    public InsuranceProviderData(String str, String str2, InsuranceInfoUiModel insuranceInfoUiModel, InsuranceInfoUiModel insuranceInfoUiModel2, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "title");
        this.f80095d = str;
        this.f80096e = str2;
        this.f80097f = insuranceInfoUiModel;
        this.f80098g = insuranceInfoUiModel2;
        this.f80099h = z;
        this.f80100i = z2;
        this.f80101j = z3;
    }

    /* renamed from: a */
    public final String mo73529a() {
        return this.f80095d;
    }

    /* renamed from: b */
    public final InsuranceInfoUiModel mo73530b() {
        return this.f80097f;
    }

    /* renamed from: d */
    public final InsuranceInfoUiModel mo73531d() {
        return this.f80098g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo73533e() {
        return this.f80096e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceProviderData)) {
            return false;
        }
        InsuranceProviderData insuranceProviderData = (InsuranceProviderData) obj;
        return C41536l.m120484d(this.f80095d, insuranceProviderData.f80095d) && C41536l.m120484d(this.f80096e, insuranceProviderData.f80096e) && C41536l.m120484d(this.f80097f, insuranceProviderData.f80097f) && C41536l.m120484d(this.f80098g, insuranceProviderData.f80098g) && this.f80099h == insuranceProviderData.f80099h && this.f80100i == insuranceProviderData.f80100i && this.f80101j == insuranceProviderData.f80101j;
    }

    /* renamed from: f */
    public final boolean mo73535f() {
        return this.f80099h;
    }

    /* renamed from: g */
    public final void mo73536g(boolean z) {
        this.f80099h = z;
    }

    public int hashCode() {
        int hashCode = ((this.f80095d.hashCode() * 31) + this.f80096e.hashCode()) * 31;
        InsuranceInfoUiModel insuranceInfoUiModel = this.f80097f;
        int i = 0;
        int hashCode2 = (hashCode + (insuranceInfoUiModel == null ? 0 : insuranceInfoUiModel.hashCode())) * 31;
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f80098g;
        if (insuranceInfoUiModel2 != null) {
            i = insuranceInfoUiModel2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f80099h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f80100i;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f80101j;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f80095d;
        String str2 = this.f80096e;
        InsuranceInfoUiModel insuranceInfoUiModel = this.f80097f;
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f80098g;
        boolean z = this.f80099h;
        boolean z2 = this.f80100i;
        boolean z3 = this.f80101j;
        return "InsuranceProviderData(id=" + str + ", title=" + str2 + ", lifeInsurance=" + insuranceInfoUiModel + ", paymentInsurance=" + insuranceInfoUiModel2 + ", isChecked=" + z + ", hasLifeInsuranceToggled=" + z2 + ", hasPaymentInsuranceToggled=" + z3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80095d);
        parcel.writeString(this.f80096e);
        InsuranceInfoUiModel insuranceInfoUiModel = this.f80097f;
        if (insuranceInfoUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            insuranceInfoUiModel.writeToParcel(parcel, i);
        }
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f80098g;
        if (insuranceInfoUiModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            insuranceInfoUiModel2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f80099h ? 1 : 0);
        parcel.writeInt(this.f80100i ? 1 : 0);
        parcel.writeInt(this.f80101j ? 1 : 0);
    }
}
