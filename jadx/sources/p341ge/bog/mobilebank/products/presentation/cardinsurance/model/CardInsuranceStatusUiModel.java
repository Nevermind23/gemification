package p341ge.bog.mobilebank.products.presentation.cardinsurance.model;

import android.os.Parcel;
import android.os.Parcelable;
import ez0.C31901f;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.helper.ImageSource;

/* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusUiModel */
public final class CardInsuranceStatusUiModel extends CardInsuranceStatusAdapterItem {
    public static final Parcelable.Creator<CardInsuranceStatusUiModel> CREATOR = new C33884a();

    /* renamed from: d */
    private final long f82483d;

    /* renamed from: e */
    private final String f82484e;

    /* renamed from: f */
    private final String f82485f;

    /* renamed from: g */
    private final C31901f f82486g;

    /* renamed from: h */
    private final ImageSource f82487h;

    /* renamed from: i */
    private final String f82488i;

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusUiModel$a */
    public static final class C33884a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardInsuranceStatusUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardInsuranceStatusUiModel(parcel.readLong(), parcel.readString(), parcel.readString(), C31901f.valueOf(parcel.readString()), (ImageSource) parcel.readParcelable(CardInsuranceStatusUiModel.class.getClassLoader()), parcel.readString());
        }

        /* renamed from: b */
        public final CardInsuranceStatusUiModel[] newArray(int i) {
            return new CardInsuranceStatusUiModel[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInsuranceStatusUiModel(long j, String str, String str2, C31901f fVar, ImageSource imageSource, String str3) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(str, "cardTitle");
        C41536l.m120489i(str2, "cardMaskedNo");
        C41536l.m120489i(fVar, "insuranceStatus");
        C41536l.m120489i(imageSource, "image");
        C41536l.m120489i(str3, "cardSuProductCode");
        this.f82483d = j;
        this.f82484e = str;
        this.f82485f = str2;
        this.f82486g = fVar;
        this.f82487h = imageSource;
        this.f82488i = str3;
    }

    /* renamed from: a */
    public final long mo82055a() {
        return this.f82483d;
    }

    /* renamed from: b */
    public final String mo82056b() {
        return this.f82485f;
    }

    /* renamed from: d */
    public final String mo82057d() {
        return this.f82488i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo82059e() {
        return this.f82484e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInsuranceStatusUiModel)) {
            return false;
        }
        CardInsuranceStatusUiModel cardInsuranceStatusUiModel = (CardInsuranceStatusUiModel) obj;
        return this.f82483d == cardInsuranceStatusUiModel.f82483d && C41536l.m120484d(this.f82484e, cardInsuranceStatusUiModel.f82484e) && C41536l.m120484d(this.f82485f, cardInsuranceStatusUiModel.f82485f) && this.f82486g == cardInsuranceStatusUiModel.f82486g && C41536l.m120484d(this.f82487h, cardInsuranceStatusUiModel.f82487h) && C41536l.m120484d(this.f82488i, cardInsuranceStatusUiModel.f82488i);
    }

    /* renamed from: f */
    public final ImageSource mo82061f() {
        return this.f82487h;
    }

    /* renamed from: g */
    public final C31901f mo82062g() {
        return this.f82486g;
    }

    public int hashCode() {
        return (((((((((C7397t.m28148a(this.f82483d) * 31) + this.f82484e.hashCode()) * 31) + this.f82485f.hashCode()) * 31) + this.f82486g.hashCode()) * 31) + this.f82487h.hashCode()) * 31) + this.f82488i.hashCode();
    }

    public String toString() {
        long j = this.f82483d;
        String str = this.f82484e;
        String str2 = this.f82485f;
        C31901f fVar = this.f82486g;
        ImageSource imageSource = this.f82487h;
        String str3 = this.f82488i;
        return "CardInsuranceStatusUiModel(cardId=" + j + ", cardTitle=" + str + ", cardMaskedNo=" + str2 + ", insuranceStatus=" + fVar + ", image=" + imageSource + ", cardSuProductCode=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f82483d);
        parcel.writeString(this.f82484e);
        parcel.writeString(this.f82485f);
        parcel.writeString(this.f82486g.name());
        parcel.writeParcelable(this.f82487h, i);
        parcel.writeString(this.f82488i);
    }
}
