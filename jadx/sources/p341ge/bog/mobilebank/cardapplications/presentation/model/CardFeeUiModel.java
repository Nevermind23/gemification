package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel */
public final class CardFeeUiModel extends OrderCardFeesAdapterUiModel {
    public static final Parcelable.Creator<CardFeeUiModel> CREATOR = new C14202a();

    /* renamed from: d */
    private final String f41645d;

    /* renamed from: e */
    private final double f41646e;

    /* renamed from: f */
    private final String f41647f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel$a */
    public static final class C14202a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardFeeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardFeeUiModel(parcel.readString(), parcel.readDouble(), parcel.readString());
        }

        /* renamed from: b */
        public final CardFeeUiModel[] newArray(int i) {
            return new CardFeeUiModel[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardFeeUiModel(String str, double d, String str2) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "ccy");
        this.f41645d = str;
        this.f41646e = d;
        this.f41647f = str2;
    }

    /* renamed from: a */
    public final double mo39402a() {
        return this.f41646e;
    }

    /* renamed from: b */
    public final String mo39403b() {
        return this.f41647f;
    }

    /* renamed from: d */
    public final String mo39404d() {
        return this.f41645d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardFeeUiModel)) {
            return false;
        }
        CardFeeUiModel cardFeeUiModel = (CardFeeUiModel) obj;
        return C41536l.m120484d(this.f41645d, cardFeeUiModel.f41645d) && Double.compare(this.f41646e, cardFeeUiModel.f41646e) == 0 && C41536l.m120484d(this.f41647f, cardFeeUiModel.f41647f);
    }

    public int hashCode() {
        return (((this.f41645d.hashCode() * 31) + Double.doubleToLongBits(this.f41646e)) * 31) + this.f41647f.hashCode();
    }

    public String toString() {
        String str = this.f41645d;
        double d = this.f41646e;
        String str2 = this.f41647f;
        return "CardFeeUiModel(title=" + str + ", amount=" + d + ", ccy=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41645d);
        parcel.writeDouble(this.f41646e);
        parcel.writeString(this.f41647f);
    }
}
