package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardBenefitUiModel */
public final class CardBenefitUiModel implements Parcelable {
    public static final Parcelable.Creator<CardBenefitUiModel> CREATOR = new C14200a();

    /* renamed from: d */
    private final long f41635d;

    /* renamed from: e */
    private final String f41636e;

    /* renamed from: f */
    private final String f41637f;

    /* renamed from: g */
    private final String f41638g;

    /* renamed from: h */
    private final String f41639h;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardBenefitUiModel$a */
    public static final class C14200a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardBenefitUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardBenefitUiModel(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CardBenefitUiModel[] newArray(int i) {
            return new CardBenefitUiModel[i];
        }
    }

    public CardBenefitUiModel(long j, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "objectType");
        C41536l.m120489i(str2, "objectCode");
        C41536l.m120489i(str3, "objectUrl");
        C41536l.m120489i(str4, "languageCode");
        this.f41635d = j;
        this.f41636e = str;
        this.f41637f = str2;
        this.f41638g = str3;
        this.f41639h = str4;
    }

    /* renamed from: a */
    public final String mo39378a() {
        return this.f41636e;
    }

    /* renamed from: b */
    public final String mo39379b() {
        return this.f41638g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBenefitUiModel)) {
            return false;
        }
        CardBenefitUiModel cardBenefitUiModel = (CardBenefitUiModel) obj;
        return this.f41635d == cardBenefitUiModel.f41635d && C41536l.m120484d(this.f41636e, cardBenefitUiModel.f41636e) && C41536l.m120484d(this.f41637f, cardBenefitUiModel.f41637f) && C41536l.m120484d(this.f41638g, cardBenefitUiModel.f41638g) && C41536l.m120484d(this.f41639h, cardBenefitUiModel.f41639h);
    }

    public int hashCode() {
        return (((((((C7397t.m28148a(this.f41635d) * 31) + this.f41636e.hashCode()) * 31) + this.f41637f.hashCode()) * 31) + this.f41638g.hashCode()) * 31) + this.f41639h.hashCode();
    }

    public String toString() {
        long j = this.f41635d;
        String str = this.f41636e;
        String str2 = this.f41637f;
        String str3 = this.f41638g;
        String str4 = this.f41639h;
        return "CardBenefitUiModel(id=" + j + ", objectType=" + str + ", objectCode=" + str2 + ", objectUrl=" + str3 + ", languageCode=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41635d);
        parcel.writeString(this.f41636e);
        parcel.writeString(this.f41637f);
        parcel.writeString(this.f41638g);
        parcel.writeString(this.f41639h);
    }
}
