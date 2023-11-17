package p341ge.bog.mobilebank.cardapplications.presentation.model.insurance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.insurance.DebitCardInsuranceFeeUiModel */
public final class DebitCardInsuranceFeeUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardInsuranceFeeUiModel> CREATOR = new C14240a();

    /* renamed from: d */
    private final double f41839d;

    /* renamed from: e */
    private final String f41840e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.insurance.DebitCardInsuranceFeeUiModel$a */
    public static final class C14240a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardInsuranceFeeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardInsuranceFeeUiModel(parcel.readDouble(), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardInsuranceFeeUiModel[] newArray(int i) {
            return new DebitCardInsuranceFeeUiModel[i];
        }
    }

    public DebitCardInsuranceFeeUiModel(double d, String str) {
        C41536l.m120489i(str, "insuranceType");
        this.f41839d = d;
        this.f41840e = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardInsuranceFeeUiModel)) {
            return false;
        }
        DebitCardInsuranceFeeUiModel debitCardInsuranceFeeUiModel = (DebitCardInsuranceFeeUiModel) obj;
        return Double.compare(this.f41839d, debitCardInsuranceFeeUiModel.f41839d) == 0 && C41536l.m120484d(this.f41840e, debitCardInsuranceFeeUiModel.f41840e);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f41839d) * 31) + this.f41840e.hashCode();
    }

    public String toString() {
        double d = this.f41839d;
        String str = this.f41840e;
        return "DebitCardInsuranceFeeUiModel(fee=" + d + ", insuranceType=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f41839d);
        parcel.writeString(this.f41840e);
    }
}
