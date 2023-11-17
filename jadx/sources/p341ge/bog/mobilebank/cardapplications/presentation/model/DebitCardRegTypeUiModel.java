package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p537nm.C17085g0;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel */
public final class DebitCardRegTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardRegTypeUiModel> CREATOR = new C14219a();

    /* renamed from: d */
    private final C17085g0 f41711d;

    /* renamed from: e */
    private final String f41712e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel$a */
    public static final class C14219a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardRegTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardRegTypeUiModel(C17085g0.valueOf(parcel.readString()), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardRegTypeUiModel[] newArray(int i) {
            return new DebitCardRegTypeUiModel[i];
        }
    }

    public DebitCardRegTypeUiModel(C17085g0 g0Var, String str) {
        C41536l.m120489i(g0Var, "regType");
        C41536l.m120489i(str, "dictionaryKey");
        this.f41711d = g0Var;
        this.f41712e = str;
    }

    /* renamed from: a */
    public final String mo39594a() {
        return this.f41712e;
    }

    /* renamed from: b */
    public final C17085g0 mo39595b() {
        return this.f41711d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardRegTypeUiModel)) {
            return false;
        }
        DebitCardRegTypeUiModel debitCardRegTypeUiModel = (DebitCardRegTypeUiModel) obj;
        return this.f41711d == debitCardRegTypeUiModel.f41711d && C41536l.m120484d(this.f41712e, debitCardRegTypeUiModel.f41712e);
    }

    public int hashCode() {
        return (this.f41711d.hashCode() * 31) + this.f41712e.hashCode();
    }

    public String toString() {
        C17085g0 g0Var = this.f41711d;
        String str = this.f41712e;
        return "DebitCardRegTypeUiModel(regType=" + g0Var + ", dictionaryKey=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41711d.name());
        parcel.writeString(this.f41712e);
    }
}
