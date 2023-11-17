package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel */
public final class DebitCardCurrencyUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardCurrencyUiModel> CREATOR = new C14211a();

    /* renamed from: d */
    private final String f41679d;

    /* renamed from: e */
    private final long f41680e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel$a */
    public static final class C14211a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardCurrencyUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardCurrencyUiModel(parcel.readString(), parcel.readLong());
        }

        /* renamed from: b */
        public final DebitCardCurrencyUiModel[] newArray(int i) {
            return new DebitCardCurrencyUiModel[i];
        }
    }

    public DebitCardCurrencyUiModel(String str, long j) {
        C41536l.m120489i(str, "ccy");
        this.f41679d = str;
        this.f41680e = j;
    }

    /* renamed from: a */
    public final String mo39510a() {
        return this.f41679d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardCurrencyUiModel)) {
            return false;
        }
        DebitCardCurrencyUiModel debitCardCurrencyUiModel = (DebitCardCurrencyUiModel) obj;
        return C41536l.m120484d(this.f41679d, debitCardCurrencyUiModel.f41679d) && this.f41680e == debitCardCurrencyUiModel.f41680e;
    }

    public int hashCode() {
        return (this.f41679d.hashCode() * 31) + C7397t.m28148a(this.f41680e);
    }

    public String toString() {
        String str = this.f41679d;
        long j = this.f41680e;
        return "DebitCardCurrencyUiModel(ccy=" + str + ", linkId=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41679d);
        parcel.writeLong(this.f41680e);
    }
}
