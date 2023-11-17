package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCommissionUiModel */
public final class DebitCardCommissionUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardCommissionUiModel> CREATOR = new C14210a();
    private final BigDecimal comAmount;
    private final String comCcy;
    private final boolean newAccPackage;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCommissionUiModel$a */
    public static final class C14210a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardCommissionUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardCommissionUiModel((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final DebitCardCommissionUiModel[] newArray(int i) {
            return new DebitCardCommissionUiModel[i];
        }
    }

    public DebitCardCommissionUiModel(BigDecimal bigDecimal, String str, boolean z) {
        this.comAmount = bigDecimal;
        this.comCcy = str;
        this.newAccPackage = z;
    }

    public static /* synthetic */ DebitCardCommissionUiModel copy$default(DebitCardCommissionUiModel debitCardCommissionUiModel, BigDecimal bigDecimal, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = debitCardCommissionUiModel.comAmount;
        }
        if ((i & 2) != 0) {
            str = debitCardCommissionUiModel.comCcy;
        }
        if ((i & 4) != 0) {
            z = debitCardCommissionUiModel.newAccPackage;
        }
        return debitCardCommissionUiModel.copy(bigDecimal, str, z);
    }

    public final BigDecimal component1() {
        return this.comAmount;
    }

    public final String component2() {
        return this.comCcy;
    }

    public final boolean component3() {
        return this.newAccPackage;
    }

    public final DebitCardCommissionUiModel copy(BigDecimal bigDecimal, String str, boolean z) {
        return new DebitCardCommissionUiModel(bigDecimal, str, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardCommissionUiModel)) {
            return false;
        }
        DebitCardCommissionUiModel debitCardCommissionUiModel = (DebitCardCommissionUiModel) obj;
        return C41536l.m120484d(this.comAmount, debitCardCommissionUiModel.comAmount) && C41536l.m120484d(this.comCcy, debitCardCommissionUiModel.comCcy) && this.newAccPackage == debitCardCommissionUiModel.newAccPackage;
    }

    public final BigDecimal getComAmount() {
        return this.comAmount;
    }

    public final String getComCcy() {
        return this.comCcy;
    }

    public final boolean getNewAccPackage() {
        return this.newAccPackage;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.comAmount;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.comCcy;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.newAccPackage;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        BigDecimal bigDecimal = this.comAmount;
        String str = this.comCcy;
        boolean z = this.newAccPackage;
        return "DebitCardCommissionUiModel(comAmount=" + bigDecimal + ", comCcy=" + str + ", newAccPackage=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeSerializable(this.comAmount);
        parcel.writeString(this.comCcy);
        parcel.writeInt(this.newAccPackage ? 1 : 0);
    }
}
