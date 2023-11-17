package p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositFeatureUiModel */
public final class DepositFeatureUiModel implements Parcelable {
    public static final Parcelable.Creator<DepositFeatureUiModel> CREATOR = new C22991a();

    /* renamed from: d */
    private final String f60474d;

    /* renamed from: e */
    private final String f60475e;

    /* renamed from: f */
    private final String f60476f;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositFeatureUiModel$a */
    public static final class C22991a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositFeatureUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DepositFeatureUiModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DepositFeatureUiModel[] newArray(int i) {
            return new DepositFeatureUiModel[i];
        }
    }

    public DepositFeatureUiModel(String str, String str2, String str3) {
        this.f60474d = str;
        this.f60475e = str2;
        this.f60476f = str3;
    }

    /* renamed from: a */
    public final String mo57204a() {
        return this.f60476f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositFeatureUiModel)) {
            return false;
        }
        DepositFeatureUiModel depositFeatureUiModel = (DepositFeatureUiModel) obj;
        return C41536l.m120484d(this.f60474d, depositFeatureUiModel.f60474d) && C41536l.m120484d(this.f60475e, depositFeatureUiModel.f60475e) && C41536l.m120484d(this.f60476f, depositFeatureUiModel.f60476f);
    }

    public int hashCode() {
        String str = this.f60474d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60475e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60476f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f60474d;
        String str2 = this.f60475e;
        String str3 = this.f60476f;
        return "DepositFeatureUiModel(lookupName=" + str + ", lookupValue=" + str2 + ", dictionaryKey=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60474d);
        parcel.writeString(this.f60475e);
        parcel.writeString(this.f60476f);
    }
}
