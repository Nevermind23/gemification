package p341ge.bog.mobilebank.cleanarch.presentation.offer.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p913uu.C28942h;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel */
public final class CreditOfferLimitUiModel implements Parcelable {
    public static final Parcelable.Creator<CreditOfferLimitUiModel> CREATOR = new C21987a();

    /* renamed from: d */
    private final C28942h f58489d;

    /* renamed from: e */
    private final String f58490e;

    /* renamed from: f */
    private final OfferProductCode f58491f;

    /* renamed from: g */
    private final String f58492g;

    /* renamed from: h */
    private final String f58493h;

    /* renamed from: i */
    private final String f58494i;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.offer.model.CreditOfferLimitUiModel$a */
    public static final class C21987a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditOfferLimitUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CreditOfferLimitUiModel(C28942h.valueOf(parcel.readString()), parcel.readString(), (OfferProductCode) parcel.readParcelable(CreditOfferLimitUiModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CreditOfferLimitUiModel[] newArray(int i) {
            return new CreditOfferLimitUiModel[i];
        }
    }

    public CreditOfferLimitUiModel(C28942h hVar, String str, OfferProductCode offerProductCode, String str2, String str3, String str4) {
        C41536l.m120489i(hVar, "operationType");
        C41536l.m120489i(str, "cardCcy");
        C41536l.m120489i(offerProductCode, "limitCategory");
        C41536l.m120489i(str2, "cardLimit");
        this.f58489d = hVar;
        this.f58490e = str;
        this.f58491f = offerProductCode;
        this.f58492g = str2;
        this.f58493h = str3;
        this.f58494i = str4;
    }

    /* renamed from: a */
    public final String mo54628a() {
        return this.f58490e;
    }

    /* renamed from: b */
    public final String mo54629b() {
        return this.f58492g;
    }

    /* renamed from: d */
    public final OfferProductCode mo54630d() {
        return this.f58491f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C28942h mo54632e() {
        return this.f58489d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOfferLimitUiModel)) {
            return false;
        }
        CreditOfferLimitUiModel creditOfferLimitUiModel = (CreditOfferLimitUiModel) obj;
        return this.f58489d == creditOfferLimitUiModel.f58489d && C41536l.m120484d(this.f58490e, creditOfferLimitUiModel.f58490e) && C41536l.m120484d(this.f58491f, creditOfferLimitUiModel.f58491f) && C41536l.m120484d(this.f58492g, creditOfferLimitUiModel.f58492g) && C41536l.m120484d(this.f58493h, creditOfferLimitUiModel.f58493h) && C41536l.m120484d(this.f58494i, creditOfferLimitUiModel.f58494i);
    }

    /* renamed from: f */
    public final String mo54634f() {
        return this.f58494i;
    }

    public int hashCode() {
        int hashCode = ((((((this.f58489d.hashCode() * 31) + this.f58490e.hashCode()) * 31) + this.f58491f.hashCode()) * 31) + this.f58492g.hashCode()) * 31;
        String str = this.f58493h;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58494i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        C28942h hVar = this.f58489d;
        String str = this.f58490e;
        OfferProductCode offerProductCode = this.f58491f;
        String str2 = this.f58492g;
        String str3 = this.f58493h;
        String str4 = this.f58494i;
        return "CreditOfferLimitUiModel(operationType=" + hVar + ", cardCcy=" + str + ", limitCategory=" + offerProductCode + ", cardLimit=" + str2 + ", titleDictionaryKey=" + str3 + ", titleDictionaryKeyValue=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f58489d.name());
        parcel.writeString(this.f58490e);
        parcel.writeParcelable(this.f58491f, i);
        parcel.writeString(this.f58492g);
        parcel.writeString(this.f58493h);
        parcel.writeString(this.f58494i);
    }
}
