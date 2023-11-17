package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.shared.helper.ImageSource;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel */
public final class PiggyBankAccountUiModel implements Parcelable {
    public static final Parcelable.Creator<PiggyBankAccountUiModel> CREATOR = new C33113a();

    /* renamed from: d */
    private final CasAccountUiModel f81104d;

    /* renamed from: e */
    private final ImageSource f81105e;

    /* renamed from: f */
    private final boolean f81106f;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel$a */
    public static final class C33113a implements Parcelable.Creator {
        /* renamed from: a */
        public final PiggyBankAccountUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PiggyBankAccountUiModel(CasAccountUiModel.CREATOR.createFromParcel(parcel), (ImageSource) parcel.readParcelable(PiggyBankAccountUiModel.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final PiggyBankAccountUiModel[] newArray(int i) {
            return new PiggyBankAccountUiModel[i];
        }
    }

    public PiggyBankAccountUiModel(CasAccountUiModel casAccountUiModel, ImageSource imageSource, boolean z) {
        C41536l.m120489i(casAccountUiModel, "account");
        C41536l.m120489i(imageSource, "image");
        this.f81104d = casAccountUiModel;
        this.f81105e = imageSource;
        this.f81106f = z;
    }

    /* renamed from: a */
    public final CasAccountUiModel mo75157a() {
        return this.f81104d;
    }

    /* renamed from: b */
    public final ImageSource mo75158b() {
        return this.f81105e;
    }

    /* renamed from: d */
    public final boolean mo75159d() {
        return this.f81106f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiggyBankAccountUiModel)) {
            return false;
        }
        PiggyBankAccountUiModel piggyBankAccountUiModel = (PiggyBankAccountUiModel) obj;
        return C41536l.m120484d(this.f81104d, piggyBankAccountUiModel.f81104d) && C41536l.m120484d(this.f81105e, piggyBankAccountUiModel.f81105e) && this.f81106f == piggyBankAccountUiModel.f81106f;
    }

    public int hashCode() {
        int hashCode = ((this.f81104d.hashCode() * 31) + this.f81105e.hashCode()) * 31;
        boolean z = this.f81106f;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        CasAccountUiModel casAccountUiModel = this.f81104d;
        ImageSource imageSource = this.f81105e;
        boolean z = this.f81106f;
        return "PiggyBankAccountUiModel(account=" + casAccountUiModel + ", image=" + imageSource + ", isSelected=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f81104d.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f81105e, i);
        parcel.writeInt(this.f81106f ? 1 : 0);
    }
}
