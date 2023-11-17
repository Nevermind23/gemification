package p341ge.bog.mobilebank.p975ui.wizard.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;

/* renamed from: ge.bog.mobilebank.ui.wizard.model.offers.CardSelectorWizardCardUIModel */
public final class CardSelectorWizardCardUIModel implements Parcelable {
    public static final Parcelable.Creator<CardSelectorWizardCardUIModel> CREATOR = new C35895a();

    /* renamed from: d */
    private final String f86836d;

    /* renamed from: e */
    private final String f86837e;

    /* renamed from: f */
    private final String f86838f;

    /* renamed from: g */
    private final String f86839g;

    /* renamed from: h */
    private final CardExternalFile f86840h;

    /* renamed from: ge.bog.mobilebank.ui.wizard.model.offers.CardSelectorWizardCardUIModel$a */
    public static final class C35895a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardSelectorWizardCardUIModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardSelectorWizardCardUIModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), CardExternalFile.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final CardSelectorWizardCardUIModel[] newArray(int i) {
            return new CardSelectorWizardCardUIModel[i];
        }
    }

    public CardSelectorWizardCardUIModel(String str, String str2, String str3, String str4, CardExternalFile cardExternalFile) {
        C41536l.m120489i(str, "lastFour");
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(cardExternalFile, "cardExternalFile");
        this.f86836d = str;
        this.f86837e = str2;
        this.f86838f = str3;
        this.f86839g = str4;
        this.f86840h = cardExternalFile;
    }

    /* renamed from: a */
    public final CardExternalFile mo88143a() {
        return this.f86840h;
    }

    /* renamed from: b */
    public final String mo88144b() {
        return this.f86839g;
    }

    /* renamed from: d */
    public final String mo88145d() {
        return this.f86838f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo88147e() {
        return this.f86836d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSelectorWizardCardUIModel)) {
            return false;
        }
        CardSelectorWizardCardUIModel cardSelectorWizardCardUIModel = (CardSelectorWizardCardUIModel) obj;
        return C41536l.m120484d(this.f86836d, cardSelectorWizardCardUIModel.f86836d) && C41536l.m120484d(this.f86837e, cardSelectorWizardCardUIModel.f86837e) && C41536l.m120484d(this.f86838f, cardSelectorWizardCardUIModel.f86838f) && C41536l.m120484d(this.f86839g, cardSelectorWizardCardUIModel.f86839g) && C41536l.m120484d(this.f86840h, cardSelectorWizardCardUIModel.f86840h);
    }

    /* renamed from: f */
    public final String mo88149f() {
        return this.f86837e;
    }

    public int hashCode() {
        int hashCode = ((this.f86836d.hashCode() * 31) + this.f86837e.hashCode()) * 31;
        String str = this.f86838f;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f86839g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f86840h.hashCode();
    }

    public String toString() {
        String str = this.f86836d;
        String str2 = this.f86837e;
        String str3 = this.f86838f;
        String str4 = this.f86839g;
        CardExternalFile cardExternalFile = this.f86840h;
        return "CardSelectorWizardCardUIModel(lastFour=" + str + ", subProductCode=" + str2 + ", cardNameKey=" + str3 + ", cardName=" + str4 + ", cardExternalFile=" + cardExternalFile + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f86836d);
        parcel.writeString(this.f86837e);
        parcel.writeString(this.f86838f);
        parcel.writeString(this.f86839g);
        this.f86840h.writeToParcel(parcel, i);
    }
}
