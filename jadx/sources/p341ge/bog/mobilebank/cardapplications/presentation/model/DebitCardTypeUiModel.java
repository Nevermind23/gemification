package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p537nm.C17075c0;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTypeUiModel */
public final class DebitCardTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardTypeUiModel> CREATOR = new C14223a();

    /* renamed from: d */
    private final C17075c0 f41729d;

    /* renamed from: e */
    private final String f41730e;

    /* renamed from: f */
    private final String f41731f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTypeUiModel$a */
    public static final class C14223a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardTypeUiModel(C17075c0.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardTypeUiModel[] newArray(int i) {
            return new DebitCardTypeUiModel[i];
        }
    }

    public DebitCardTypeUiModel(C17075c0 c0Var, String str, String str2) {
        C41536l.m120489i(c0Var, "debitCardType");
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(str2, "lookupValue");
        this.f41729d = c0Var;
        this.f41730e = str;
        this.f41731f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardTypeUiModel)) {
            return false;
        }
        DebitCardTypeUiModel debitCardTypeUiModel = (DebitCardTypeUiModel) obj;
        return this.f41729d == debitCardTypeUiModel.f41729d && C41536l.m120484d(this.f41730e, debitCardTypeUiModel.f41730e) && C41536l.m120484d(this.f41731f, debitCardTypeUiModel.f41731f);
    }

    public int hashCode() {
        return (((this.f41729d.hashCode() * 31) + this.f41730e.hashCode()) * 31) + this.f41731f.hashCode();
    }

    public String toString() {
        C17075c0 c0Var = this.f41729d;
        String str = this.f41730e;
        String str2 = this.f41731f;
        return "DebitCardTypeUiModel(debitCardType=" + c0Var + ", dictionaryKey=" + str + ", lookupValue=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41729d.name());
        parcel.writeString(this.f41730e);
        parcel.writeString(this.f41731f);
    }
}
