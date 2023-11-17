package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel */
public final class ProviderInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<ProviderInfoUiModel> CREATOR = new C32489a();

    /* renamed from: d */
    private final InsuranceInfoUiModel f80068d;

    /* renamed from: e */
    private final InsuranceInfoUiModel f80069e;

    /* renamed from: f */
    private final String f80070f;

    /* renamed from: g */
    private final String f80071g;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel$a */
    public static final class C32489a implements Parcelable.Creator {
        /* renamed from: a */
        public final ProviderInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            InsuranceInfoUiModel insuranceInfoUiModel = null;
            InsuranceInfoUiModel createFromParcel = parcel.readInt() == 0 ? null : InsuranceInfoUiModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                insuranceInfoUiModel = InsuranceInfoUiModel.CREATOR.createFromParcel(parcel);
            }
            return new ProviderInfoUiModel(createFromParcel, insuranceInfoUiModel, parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ProviderInfoUiModel[] newArray(int i) {
            return new ProviderInfoUiModel[i];
        }
    }

    public ProviderInfoUiModel(InsuranceInfoUiModel insuranceInfoUiModel, InsuranceInfoUiModel insuranceInfoUiModel2, String str, String str2) {
        C41536l.m120489i(str, "providerId");
        C41536l.m120489i(str2, "providerName");
        this.f80068d = insuranceInfoUiModel;
        this.f80069e = insuranceInfoUiModel2;
        this.f80070f = str;
        this.f80071g = str2;
    }

    /* renamed from: a */
    public final InsuranceInfoUiModel mo73482a() {
        return this.f80069e;
    }

    /* renamed from: b */
    public final InsuranceInfoUiModel mo73483b() {
        return this.f80068d;
    }

    /* renamed from: d */
    public final String mo73484d() {
        return this.f80070f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo73486e() {
        return this.f80071g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderInfoUiModel)) {
            return false;
        }
        ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) obj;
        return C41536l.m120484d(this.f80068d, providerInfoUiModel.f80068d) && C41536l.m120484d(this.f80069e, providerInfoUiModel.f80069e) && C41536l.m120484d(this.f80070f, providerInfoUiModel.f80070f) && C41536l.m120484d(this.f80071g, providerInfoUiModel.f80071g);
    }

    public int hashCode() {
        InsuranceInfoUiModel insuranceInfoUiModel = this.f80068d;
        int i = 0;
        int hashCode = (insuranceInfoUiModel == null ? 0 : insuranceInfoUiModel.hashCode()) * 31;
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f80069e;
        if (insuranceInfoUiModel2 != null) {
            i = insuranceInfoUiModel2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f80070f.hashCode()) * 31) + this.f80071g.hashCode();
    }

    public String toString() {
        InsuranceInfoUiModel insuranceInfoUiModel = this.f80068d;
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f80069e;
        String str = this.f80070f;
        String str2 = this.f80071g;
        return "ProviderInfoUiModel(paymentInsuranceInfo=" + insuranceInfoUiModel + ", lifeInsuranceInfo=" + insuranceInfoUiModel2 + ", providerId=" + str + ", providerName=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        InsuranceInfoUiModel insuranceInfoUiModel = this.f80068d;
        if (insuranceInfoUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            insuranceInfoUiModel.writeToParcel(parcel, i);
        }
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f80069e;
        if (insuranceInfoUiModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            insuranceInfoUiModel2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f80070f);
        parcel.writeString(this.f80071g);
    }
}
