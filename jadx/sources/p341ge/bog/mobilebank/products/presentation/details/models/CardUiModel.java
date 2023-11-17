package p341ge.bog.mobilebank.products.presentation.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;

/* renamed from: ge.bog.mobilebank.products.presentation.details.models.CardUiModel */
public final class CardUiModel implements Parcelable {
    public static final Parcelable.Creator<CardUiModel> CREATOR = new C34247a();

    /* renamed from: d */
    private final String f83112d;

    /* renamed from: e */
    private final String f83113e;

    /* renamed from: f */
    private final String f83114f;

    /* renamed from: g */
    private final String f83115g;

    /* renamed from: h */
    private final String f83116h;

    /* renamed from: i */
    private final String f83117i;

    /* renamed from: j */
    private final boolean f83118j;

    /* renamed from: k */
    private final CardInsSecCardModel f83119k;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.models.CardUiModel$a */
    public static final class C34247a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (CardInsSecCardModel) parcel.readParcelable(CardUiModel.class.getClassLoader()));
        }

        /* renamed from: b */
        public final CardUiModel[] newArray(int i) {
            return new CardUiModel[i];
        }
    }

    public CardUiModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z, CardInsSecCardModel cardInsSecCardModel) {
        C41536l.m120489i(str, "cardId");
        C41536l.m120489i(str2, "name");
        C41536l.m120489i(str3, "lastForDigits");
        C41536l.m120489i(str4, "expireDate");
        C41536l.m120489i(str5, "cardType");
        C41536l.m120489i(str6, "cardBackgroundUrl");
        this.f83112d = str;
        this.f83113e = str2;
        this.f83114f = str3;
        this.f83115g = str4;
        this.f83116h = str5;
        this.f83117i = str6;
        this.f83118j = z;
        this.f83119k = cardInsSecCardModel;
    }

    /* renamed from: a */
    public final String mo82608a() {
        return this.f83117i;
    }

    /* renamed from: b */
    public final String mo82609b() {
        return this.f83112d;
    }

    /* renamed from: d */
    public final CardInsSecCardModel mo82610d() {
        return this.f83119k;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo82612e() {
        return this.f83116h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardUiModel)) {
            return false;
        }
        CardUiModel cardUiModel = (CardUiModel) obj;
        return C41536l.m120484d(this.f83112d, cardUiModel.f83112d) && C41536l.m120484d(this.f83113e, cardUiModel.f83113e) && C41536l.m120484d(this.f83114f, cardUiModel.f83114f) && C41536l.m120484d(this.f83115g, cardUiModel.f83115g) && C41536l.m120484d(this.f83116h, cardUiModel.f83116h) && C41536l.m120484d(this.f83117i, cardUiModel.f83117i) && this.f83118j == cardUiModel.f83118j && C41536l.m120484d(this.f83119k, cardUiModel.f83119k);
    }

    /* renamed from: f */
    public final String mo82614f() {
        return this.f83115g;
    }

    /* renamed from: g */
    public final String mo82615g() {
        return this.f83114f;
    }

    /* renamed from: h */
    public final String mo82616h() {
        return this.f83113e;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f83112d.hashCode() * 31) + this.f83113e.hashCode()) * 31) + this.f83114f.hashCode()) * 31) + this.f83115g.hashCode()) * 31) + this.f83116h.hashCode()) * 31) + this.f83117i.hashCode()) * 31;
        boolean z = this.f83118j;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        CardInsSecCardModel cardInsSecCardModel = this.f83119k;
        return i + (cardInsSecCardModel == null ? 0 : cardInsSecCardModel.hashCode());
    }

    /* renamed from: i */
    public final boolean mo82618i() {
        return this.f83118j;
    }

    public String toString() {
        String str = this.f83112d;
        String str2 = this.f83113e;
        String str3 = this.f83114f;
        String str4 = this.f83115g;
        String str5 = this.f83116h;
        String str6 = this.f83117i;
        boolean z = this.f83118j;
        CardInsSecCardModel cardInsSecCardModel = this.f83119k;
        return "CardUiModel(cardId=" + str + ", name=" + str2 + ", lastForDigits=" + str3 + ", expireDate=" + str4 + ", cardType=" + str5 + ", cardBackgroundUrl=" + str6 + ", isDark=" + z + ", cardInsSecCardModel=" + cardInsSecCardModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f83112d);
        parcel.writeString(this.f83113e);
        parcel.writeString(this.f83114f);
        parcel.writeString(this.f83115g);
        parcel.writeString(this.f83116h);
        parcel.writeString(this.f83117i);
        parcel.writeInt(this.f83118j ? 1 : 0);
        parcel.writeParcelable(this.f83119k, i);
    }
}
