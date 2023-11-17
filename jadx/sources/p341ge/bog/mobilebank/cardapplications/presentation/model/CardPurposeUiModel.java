package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p537nm.C17091j;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardPurposeUiModel */
public final class CardPurposeUiModel implements Parcelable {
    public static final Parcelable.Creator<CardPurposeUiModel> CREATOR = new C14203a();

    /* renamed from: d */
    private final C17091j f41648d;

    /* renamed from: e */
    private final String f41649e;

    /* renamed from: f */
    private final LookupUiModel f41650f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardPurposeUiModel$a */
    public static final class C14203a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardPurposeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardPurposeUiModel(C17091j.valueOf(parcel.readString()), parcel.readString(), (LookupUiModel) parcel.readParcelable(CardPurposeUiModel.class.getClassLoader()));
        }

        /* renamed from: b */
        public final CardPurposeUiModel[] newArray(int i) {
            return new CardPurposeUiModel[i];
        }
    }

    public CardPurposeUiModel(C17091j jVar, String str, LookupUiModel lookupUiModel) {
        C41536l.m120489i(jVar, "purpose");
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(lookupUiModel, "lookup");
        this.f41648d = jVar;
        this.f41649e = str;
        this.f41650f = lookupUiModel;
    }

    /* renamed from: a */
    public final C17091j mo39414a() {
        return this.f41648d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardPurposeUiModel)) {
            return false;
        }
        CardPurposeUiModel cardPurposeUiModel = (CardPurposeUiModel) obj;
        return this.f41648d == cardPurposeUiModel.f41648d && C41536l.m120484d(this.f41649e, cardPurposeUiModel.f41649e) && C41536l.m120484d(this.f41650f, cardPurposeUiModel.f41650f);
    }

    public int hashCode() {
        return (((this.f41648d.hashCode() * 31) + this.f41649e.hashCode()) * 31) + this.f41650f.hashCode();
    }

    public String toString() {
        C17091j jVar = this.f41648d;
        String str = this.f41649e;
        LookupUiModel lookupUiModel = this.f41650f;
        return "CardPurposeUiModel(purpose=" + jVar + ", dictionaryKey=" + str + ", lookup=" + lookupUiModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41648d.name());
        parcel.writeString(this.f41649e);
        parcel.writeParcelable(this.f41650f, i);
    }
}
