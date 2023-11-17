package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardSmallImageUiModel */
public final class CardSmallImageUiModel implements Parcelable {
    public static final Parcelable.Creator<CardSmallImageUiModel> CREATOR = new C14206a();

    /* renamed from: d */
    private final boolean f41662d;

    /* renamed from: e */
    private final String f41663e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardSmallImageUiModel$a */
    public static final class C14206a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardSmallImageUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardSmallImageUiModel(parcel.readInt() != 0, parcel.readString());
        }

        /* renamed from: b */
        public final CardSmallImageUiModel[] newArray(int i) {
            return new CardSmallImageUiModel[i];
        }
    }

    public CardSmallImageUiModel(boolean z, String str) {
        this.f41662d = z;
        this.f41663e = str;
    }

    /* renamed from: a */
    public final String mo39453a() {
        return this.f41663e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSmallImageUiModel)) {
            return false;
        }
        CardSmallImageUiModel cardSmallImageUiModel = (CardSmallImageUiModel) obj;
        return this.f41662d == cardSmallImageUiModel.f41662d && C41536l.m120484d(this.f41663e, cardSmallImageUiModel.f41663e);
    }

    public int hashCode() {
        boolean z = this.f41662d;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f41663e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.f41662d;
        String str = this.f41663e;
        return "CardSmallImageUiModel(isDark=" + z + ", fileUrl=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f41662d ? 1 : 0);
        parcel.writeString(this.f41663e);
    }
}
