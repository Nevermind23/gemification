package p341ge.bog.mobilebank.giftcards.presentation.details_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.details_sheet.GiftCardDetailsActionSheetUiModel */
public final class GiftCardDetailsActionSheetUiModel implements Parcelable {
    public static final Parcelable.Creator<GiftCardDetailsActionSheetUiModel> CREATOR = new C24210a();

    /* renamed from: d */
    private final String f62661d;

    /* renamed from: e */
    private final String f62662e;

    /* renamed from: f */
    private final BigDecimal f62663f;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details_sheet.GiftCardDetailsActionSheetUiModel$a */
    public static final class C24210a implements Parcelable.Creator {
        /* renamed from: a */
        public final GiftCardDetailsActionSheetUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new GiftCardDetailsActionSheetUiModel(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* renamed from: b */
        public final GiftCardDetailsActionSheetUiModel[] newArray(int i) {
            return new GiftCardDetailsActionSheetUiModel[i];
        }
    }

    public GiftCardDetailsActionSheetUiModel(String str, String str2, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "giftText");
        C41536l.m120489i(str2, "sender");
        C41536l.m120489i(bigDecimal, "amount");
        this.f62661d = str;
        this.f62662e = str2;
        this.f62663f = bigDecimal;
    }

    /* renamed from: a */
    public final BigDecimal mo61850a() {
        return this.f62663f;
    }

    /* renamed from: b */
    public final String mo61851b() {
        return this.f62661d;
    }

    /* renamed from: d */
    public final String mo61852d() {
        return this.f62662e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardDetailsActionSheetUiModel)) {
            return false;
        }
        GiftCardDetailsActionSheetUiModel giftCardDetailsActionSheetUiModel = (GiftCardDetailsActionSheetUiModel) obj;
        return C41536l.m120484d(this.f62661d, giftCardDetailsActionSheetUiModel.f62661d) && C41536l.m120484d(this.f62662e, giftCardDetailsActionSheetUiModel.f62662e) && C41536l.m120484d(this.f62663f, giftCardDetailsActionSheetUiModel.f62663f);
    }

    public int hashCode() {
        return (((this.f62661d.hashCode() * 31) + this.f62662e.hashCode()) * 31) + this.f62663f.hashCode();
    }

    public String toString() {
        String str = this.f62661d;
        String str2 = this.f62662e;
        BigDecimal bigDecimal = this.f62663f;
        return "GiftCardDetailsActionSheetUiModel(giftText=" + str + ", sender=" + str2 + ", amount=" + bigDecimal + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f62661d);
        parcel.writeString(this.f62662e);
        parcel.writeSerializable(this.f62663f);
    }
}
