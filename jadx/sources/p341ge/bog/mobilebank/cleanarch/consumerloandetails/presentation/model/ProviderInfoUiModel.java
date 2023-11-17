package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel */
public final class ProviderInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<ProviderInfoUiModel> CREATOR = new C20939a();

    /* renamed from: d */
    private final InsuranceInfoUiModel f56276d;

    /* renamed from: e */
    private final InsuranceInfoUiModel f56277e;

    /* renamed from: f */
    private final String f56278f;

    /* renamed from: g */
    private final String f56279g;

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel$a */
    public static final class C20939a implements Parcelable.Creator {
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
        this.f56276d = insuranceInfoUiModel;
        this.f56277e = insuranceInfoUiModel2;
        this.f56278f = str;
        this.f56279g = str2;
    }

    /* renamed from: a */
    public final InsuranceInfoUiModel mo49843a() {
        return this.f56276d;
    }

    /* renamed from: b */
    public final InsuranceInfoUiModel mo49844b() {
        return this.f56277e;
    }

    /* renamed from: d */
    public final String mo49845d() {
        return this.f56278f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo49847e() {
        return this.f56279g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderInfoUiModel)) {
            return false;
        }
        ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) obj;
        return C41536l.m120484d(this.f56276d, providerInfoUiModel.f56276d) && C41536l.m120484d(this.f56277e, providerInfoUiModel.f56277e) && C41536l.m120484d(this.f56278f, providerInfoUiModel.f56278f) && C41536l.m120484d(this.f56279g, providerInfoUiModel.f56279g);
    }

    public int hashCode() {
        InsuranceInfoUiModel insuranceInfoUiModel = this.f56276d;
        int i = 0;
        int hashCode = (insuranceInfoUiModel == null ? 0 : insuranceInfoUiModel.hashCode()) * 31;
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f56277e;
        if (insuranceInfoUiModel2 != null) {
            i = insuranceInfoUiModel2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f56278f.hashCode()) * 31) + this.f56279g.hashCode();
    }

    public String toString() {
        InsuranceInfoUiModel insuranceInfoUiModel = this.f56276d;
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f56277e;
        String str = this.f56278f;
        String str2 = this.f56279g;
        return "ProviderInfoUiModel(incomeInsuranceInfo=" + insuranceInfoUiModel + ", lifeInsuranceInfo=" + insuranceInfoUiModel2 + ", providerId=" + str + ", providerName=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        InsuranceInfoUiModel insuranceInfoUiModel = this.f56276d;
        if (insuranceInfoUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            insuranceInfoUiModel.writeToParcel(parcel, i);
        }
        InsuranceInfoUiModel insuranceInfoUiModel2 = this.f56277e;
        if (insuranceInfoUiModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            insuranceInfoUiModel2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f56278f);
        parcel.writeString(this.f56279g);
    }
}
