package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p674xm.C18805i;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel */
public final class DebitCardReceiveTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardReceiveTypeUiModel> CREATOR = new C14217a();

    /* renamed from: d */
    private final C18805i f41705d;

    /* renamed from: e */
    private final String f41706e;

    /* renamed from: f */
    private final LookupUiModel f41707f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel$a */
    public static final class C14217a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardReceiveTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardReceiveTypeUiModel(C18805i.valueOf(parcel.readString()), parcel.readString(), (LookupUiModel) parcel.readParcelable(DebitCardReceiveTypeUiModel.class.getClassLoader()));
        }

        /* renamed from: b */
        public final DebitCardReceiveTypeUiModel[] newArray(int i) {
            return new DebitCardReceiveTypeUiModel[i];
        }
    }

    public DebitCardReceiveTypeUiModel(C18805i iVar, String str, LookupUiModel lookupUiModel) {
        C41536l.m120489i(iVar, "debitCardReceiveType");
        C41536l.m120489i(str, "dictionaryKey");
        C41536l.m120489i(lookupUiModel, "lookup");
        this.f41705d = iVar;
        this.f41706e = str;
        this.f41707f = lookupUiModel;
    }

    /* renamed from: a */
    public final C18805i mo39572a() {
        return this.f41705d;
    }

    /* renamed from: b */
    public final String mo39573b() {
        return this.f41706e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardReceiveTypeUiModel)) {
            return false;
        }
        DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel = (DebitCardReceiveTypeUiModel) obj;
        return this.f41705d == debitCardReceiveTypeUiModel.f41705d && C41536l.m120484d(this.f41706e, debitCardReceiveTypeUiModel.f41706e) && C41536l.m120484d(this.f41707f, debitCardReceiveTypeUiModel.f41707f);
    }

    public int hashCode() {
        return (((this.f41705d.hashCode() * 31) + this.f41706e.hashCode()) * 31) + this.f41707f.hashCode();
    }

    public String toString() {
        C18805i iVar = this.f41705d;
        String str = this.f41706e;
        LookupUiModel lookupUiModel = this.f41707f;
        return "DebitCardReceiveTypeUiModel(debitCardReceiveType=" + iVar + ", dictionaryKey=" + str + ", lookup=" + lookupUiModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41705d.name());
        parcel.writeString(this.f41706e);
        parcel.writeParcelable(this.f41707f, i);
    }
}
