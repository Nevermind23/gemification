package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p674xm.C18803h;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardOrderTypeUiModel */
public final class DebitCardOrderTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardOrderTypeUiModel> CREATOR = new C14214a();

    /* renamed from: d */
    private final C18803h f41693d;

    /* renamed from: e */
    private final String f41694e;

    /* renamed from: f */
    private final String f41695f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardOrderTypeUiModel$a */
    public static final class C14214a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardOrderTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardOrderTypeUiModel(C18803h.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardOrderTypeUiModel[] newArray(int i) {
            return new DebitCardOrderTypeUiModel[i];
        }
    }

    public DebitCardOrderTypeUiModel(C18803h hVar, String str, String str2) {
        C41536l.m120489i(hVar, "debitCardOrderType");
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(str2, "lookupValue");
        this.f41693d = hVar;
        this.f41694e = str;
        this.f41695f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardOrderTypeUiModel)) {
            return false;
        }
        DebitCardOrderTypeUiModel debitCardOrderTypeUiModel = (DebitCardOrderTypeUiModel) obj;
        return this.f41693d == debitCardOrderTypeUiModel.f41693d && C41536l.m120484d(this.f41694e, debitCardOrderTypeUiModel.f41694e) && C41536l.m120484d(this.f41695f, debitCardOrderTypeUiModel.f41695f);
    }

    public int hashCode() {
        return (((this.f41693d.hashCode() * 31) + this.f41694e.hashCode()) * 31) + this.f41695f.hashCode();
    }

    public String toString() {
        C18803h hVar = this.f41693d;
        String str = this.f41694e;
        String str2 = this.f41695f;
        return "DebitCardOrderTypeUiModel(debitCardOrderType=" + hVar + ", dictionaryKey=" + str + ", lookupValue=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41693d.name());
        parcel.writeString(this.f41694e);
        parcel.writeString(this.f41695f);
    }
}
