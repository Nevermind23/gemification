package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardNicknameUiModel */
public final class DebitCardNicknameUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardNicknameUiModel> CREATOR = new C14213a();

    /* renamed from: d */
    private final String f41691d;

    /* renamed from: e */
    private final String f41692e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardNicknameUiModel$a */
    public static final class C14213a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardNicknameUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardNicknameUiModel(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardNicknameUiModel[] newArray(int i) {
            return new DebitCardNicknameUiModel[i];
        }
    }

    public DebitCardNicknameUiModel(String str, String str2) {
        C41536l.m120489i(str, "cardNickname");
        C41536l.m120489i(str2, "clientNickname");
        this.f41691d = str;
        this.f41692e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardNicknameUiModel)) {
            return false;
        }
        DebitCardNicknameUiModel debitCardNicknameUiModel = (DebitCardNicknameUiModel) obj;
        return C41536l.m120484d(this.f41691d, debitCardNicknameUiModel.f41691d) && C41536l.m120484d(this.f41692e, debitCardNicknameUiModel.f41692e);
    }

    public int hashCode() {
        return (this.f41691d.hashCode() * 31) + this.f41692e.hashCode();
    }

    public String toString() {
        String str = this.f41691d;
        String str2 = this.f41692e;
        return "DebitCardNicknameUiModel(cardNickname=" + str + ", clientNickname=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41691d);
        parcel.writeString(this.f41692e);
    }
}
