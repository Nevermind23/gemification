package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p537nm.C17088i;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardClientCountryInfoUiModel */
public final class CardClientCountryInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<CardClientCountryInfoUiModel> CREATOR = new C14201a();

    /* renamed from: d */
    private final String f41640d;

    /* renamed from: e */
    private final C17088i f41641e;

    /* renamed from: f */
    private final String f41642f;

    /* renamed from: g */
    private final String f41643g;

    /* renamed from: h */
    private final boolean f41644h;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardClientCountryInfoUiModel$a */
    public static final class C14201a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardClientCountryInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardClientCountryInfoUiModel(parcel.readString(), C17088i.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final CardClientCountryInfoUiModel[] newArray(int i) {
            return new CardClientCountryInfoUiModel[i];
        }
    }

    public CardClientCountryInfoUiModel(String str, C17088i iVar, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "clientCountry");
        C41536l.m120489i(iVar, "cardOrderAgreementStatus");
        C41536l.m120489i(str2, "countryNameGe");
        C41536l.m120489i(str3, "countryNameEn");
        this.f41640d = str;
        this.f41641e = iVar;
        this.f41642f = str2;
        this.f41643g = str3;
        this.f41644h = z;
    }

    /* renamed from: a */
    public final C17088i mo39389a() {
        return this.f41641e;
    }

    /* renamed from: b */
    public final String mo39390b() {
        return this.f41643g;
    }

    /* renamed from: d */
    public final String mo39391d() {
        return this.f41642f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo39393e() {
        return this.f41644h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardClientCountryInfoUiModel)) {
            return false;
        }
        CardClientCountryInfoUiModel cardClientCountryInfoUiModel = (CardClientCountryInfoUiModel) obj;
        return C41536l.m120484d(this.f41640d, cardClientCountryInfoUiModel.f41640d) && this.f41641e == cardClientCountryInfoUiModel.f41641e && C41536l.m120484d(this.f41642f, cardClientCountryInfoUiModel.f41642f) && C41536l.m120484d(this.f41643g, cardClientCountryInfoUiModel.f41643g) && this.f41644h == cardClientCountryInfoUiModel.f41644h;
    }

    public int hashCode() {
        int hashCode = ((((((this.f41640d.hashCode() * 31) + this.f41641e.hashCode()) * 31) + this.f41642f.hashCode()) * 31) + this.f41643g.hashCode()) * 31;
        boolean z = this.f41644h;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f41640d;
        C17088i iVar = this.f41641e;
        String str2 = this.f41642f;
        String str3 = this.f41643g;
        boolean z = this.f41644h;
        return "CardClientCountryInfoUiModel(clientCountry=" + str + ", cardOrderAgreementStatus=" + iVar + ", countryNameGe=" + str2 + ", countryNameEn=" + str3 + ", showInstantCard=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41640d);
        parcel.writeString(this.f41641e.name());
        parcel.writeString(this.f41642f);
        parcel.writeString(this.f41643g);
        parcel.writeInt(this.f41644h ? 1 : 0);
    }
}
