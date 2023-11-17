package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p674xm.C18807j;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRecipientTypeUiModel */
public final class DebitCardRecipientTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardRecipientTypeUiModel> CREATOR = new C14218a();

    /* renamed from: d */
    private final C18807j f41708d;

    /* renamed from: e */
    private final String f41709e;

    /* renamed from: f */
    private final LookupUiModel f41710f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRecipientTypeUiModel$a */
    public static final class C14218a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardRecipientTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardRecipientTypeUiModel(C18807j.valueOf(parcel.readString()), parcel.readString(), (LookupUiModel) parcel.readParcelable(DebitCardRecipientTypeUiModel.class.getClassLoader()));
        }

        /* renamed from: b */
        public final DebitCardRecipientTypeUiModel[] newArray(int i) {
            return new DebitCardRecipientTypeUiModel[i];
        }
    }

    public DebitCardRecipientTypeUiModel(C18807j jVar, String str, LookupUiModel lookupUiModel) {
        C41536l.m120489i(jVar, "recipientType");
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(lookupUiModel, "lookup");
        this.f41708d = jVar;
        this.f41709e = str;
        this.f41710f = lookupUiModel;
    }

    /* renamed from: a */
    public final String mo39583a() {
        return this.f41709e;
    }

    /* renamed from: b */
    public final C18807j mo39584b() {
        return this.f41708d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardRecipientTypeUiModel)) {
            return false;
        }
        DebitCardRecipientTypeUiModel debitCardRecipientTypeUiModel = (DebitCardRecipientTypeUiModel) obj;
        return this.f41708d == debitCardRecipientTypeUiModel.f41708d && C41536l.m120484d(this.f41709e, debitCardRecipientTypeUiModel.f41709e) && C41536l.m120484d(this.f41710f, debitCardRecipientTypeUiModel.f41710f);
    }

    public int hashCode() {
        return (((this.f41708d.hashCode() * 31) + this.f41709e.hashCode()) * 31) + this.f41710f.hashCode();
    }

    public String toString() {
        C18807j jVar = this.f41708d;
        String str = this.f41709e;
        LookupUiModel lookupUiModel = this.f41710f;
        return "DebitCardRecipientTypeUiModel(recipientType=" + jVar + ", dictionaryKey=" + str + ", lookup=" + lookupUiModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41708d.name());
        parcel.writeString(this.f41709e);
        parcel.writeParcelable(this.f41710f, i);
    }
}
