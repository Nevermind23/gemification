package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextContainerUiModel */
public final class DebitCardTextContainerUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardTextContainerUiModel> CREATOR = new C14221a();

    /* renamed from: d */
    private final DebitCardTextsUiModel f41715d;

    /* renamed from: e */
    private final DebitCardTextsUiModel f41716e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextContainerUiModel$a */
    public static final class C14221a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardTextContainerUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            DebitCardTextsUiModel debitCardTextsUiModel = null;
            DebitCardTextsUiModel createFromParcel = parcel.readInt() == 0 ? null : DebitCardTextsUiModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                debitCardTextsUiModel = DebitCardTextsUiModel.CREATOR.createFromParcel(parcel);
            }
            return new DebitCardTextContainerUiModel(createFromParcel, debitCardTextsUiModel);
        }

        /* renamed from: b */
        public final DebitCardTextContainerUiModel[] newArray(int i) {
            return new DebitCardTextContainerUiModel[i];
        }
    }

    public DebitCardTextContainerUiModel(DebitCardTextsUiModel debitCardTextsUiModel, DebitCardTextsUiModel debitCardTextsUiModel2) {
        this.f41715d = debitCardTextsUiModel;
        this.f41716e = debitCardTextsUiModel2;
    }

    /* renamed from: a */
    public final DebitCardTextsUiModel mo39614a() {
        return this.f41716e;
    }

    /* renamed from: b */
    public final DebitCardTextsUiModel mo39615b() {
        return this.f41715d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardTextContainerUiModel)) {
            return false;
        }
        DebitCardTextContainerUiModel debitCardTextContainerUiModel = (DebitCardTextContainerUiModel) obj;
        return C41536l.m120484d(this.f41715d, debitCardTextContainerUiModel.f41715d) && C41536l.m120484d(this.f41716e, debitCardTextContainerUiModel.f41716e);
    }

    public int hashCode() {
        DebitCardTextsUiModel debitCardTextsUiModel = this.f41715d;
        int i = 0;
        int hashCode = (debitCardTextsUiModel == null ? 0 : debitCardTextsUiModel.hashCode()) * 31;
        DebitCardTextsUiModel debitCardTextsUiModel2 = this.f41716e;
        if (debitCardTextsUiModel2 != null) {
            i = debitCardTextsUiModel2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        DebitCardTextsUiModel debitCardTextsUiModel = this.f41715d;
        DebitCardTextsUiModel debitCardTextsUiModel2 = this.f41716e;
        return "DebitCardTextContainerUiModel(plasticCard=" + debitCardTextsUiModel + ", digitalCard=" + debitCardTextsUiModel2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        DebitCardTextsUiModel debitCardTextsUiModel = this.f41715d;
        if (debitCardTextsUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            debitCardTextsUiModel.writeToParcel(parcel, i);
        }
        DebitCardTextsUiModel debitCardTextsUiModel2 = this.f41716e;
        if (debitCardTextsUiModel2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        debitCardTextsUiModel2.writeToParcel(parcel, i);
    }
}
