package p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.model;

import android.os.Parcel;
import android.os.Parcelable;
import ko0.C16521c;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.model.OfferProgressCardUiModel */
public final class OfferProgressCardUiModel implements Parcelable {
    public static final Parcelable.Creator<OfferProgressCardUiModel> CREATOR = new C15061a();

    /* renamed from: d */
    private final C16521c f43310d;

    /* renamed from: e */
    private final String f43311e;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.model.OfferProgressCardUiModel$a */
    public static final class C15061a implements Parcelable.Creator {
        /* renamed from: a */
        public final OfferProgressCardUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new OfferProgressCardUiModel(C16521c.valueOf(parcel.readString()), parcel.readString());
        }

        /* renamed from: b */
        public final OfferProgressCardUiModel[] newArray(int i) {
            return new OfferProgressCardUiModel[i];
        }
    }

    public OfferProgressCardUiModel(C16521c cVar, String str) {
        C41536l.m120489i(cVar, "type");
        C41536l.m120489i(str, "title");
        this.f43310d = cVar;
        this.f43311e = str;
    }

    /* renamed from: a */
    public final String mo42018a() {
        return this.f43311e;
    }

    /* renamed from: b */
    public final C16521c mo42019b() {
        return this.f43310d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferProgressCardUiModel)) {
            return false;
        }
        OfferProgressCardUiModel offerProgressCardUiModel = (OfferProgressCardUiModel) obj;
        return this.f43310d == offerProgressCardUiModel.f43310d && C41536l.m120484d(this.f43311e, offerProgressCardUiModel.f43311e);
    }

    public int hashCode() {
        return (this.f43310d.hashCode() * 31) + this.f43311e.hashCode();
    }

    public String toString() {
        C16521c cVar = this.f43310d;
        String str = this.f43311e;
        return "OfferProgressCardUiModel(type=" + cVar + ", title=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f43310d.name());
        parcel.writeString(this.f43311e);
    }
}
