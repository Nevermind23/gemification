package p341ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model.CardChooserData */
public final class CardChooserData implements Parcelable {
    public static final Parcelable.Creator<CardChooserData> CREATOR = new C34401a();

    /* renamed from: d */
    private final List f83358d;

    /* renamed from: e */
    private final BigDecimal f83359e;

    /* renamed from: f */
    private final String f83360f;

    /* renamed from: g */
    private final String f83361g;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model.CardChooserData$a */
    public static final class C34401a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardChooserData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CardUiModel.CREATOR.createFromParcel(parcel));
            }
            return new CardChooserData(arrayList, (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CardChooserData[] newArray(int i) {
            return new CardChooserData[i];
        }
    }

    public CardChooserData(List list, BigDecimal bigDecimal, String str, String str2) {
        C41536l.m120489i(list, "cards");
        C41536l.m120489i(bigDecimal, "inputAmount");
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "selectedCardId");
        this.f83358d = list;
        this.f83359e = bigDecimal;
        this.f83360f = str;
        this.f83361g = str2;
    }

    /* renamed from: a */
    public final List mo82881a() {
        return this.f83358d;
    }

    /* renamed from: b */
    public final String mo82882b() {
        return this.f83360f;
    }

    /* renamed from: d */
    public final BigDecimal mo82883d() {
        return this.f83359e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo82885e() {
        return this.f83361g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardChooserData)) {
            return false;
        }
        CardChooserData cardChooserData = (CardChooserData) obj;
        return C41536l.m120484d(this.f83358d, cardChooserData.f83358d) && C41536l.m120484d(this.f83359e, cardChooserData.f83359e) && C41536l.m120484d(this.f83360f, cardChooserData.f83360f) && C41536l.m120484d(this.f83361g, cardChooserData.f83361g);
    }

    public int hashCode() {
        return (((((this.f83358d.hashCode() * 31) + this.f83359e.hashCode()) * 31) + this.f83360f.hashCode()) * 31) + this.f83361g.hashCode();
    }

    public String toString() {
        List list = this.f83358d;
        BigDecimal bigDecimal = this.f83359e;
        String str = this.f83360f;
        String str2 = this.f83361g;
        return "CardChooserData(cards=" + list + ", inputAmount=" + bigDecimal + ", ccy=" + str + ", selectedCardId=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<CardUiModel> list = this.f83358d;
        parcel.writeInt(list.size());
        for (CardUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.f83359e);
        parcel.writeString(this.f83360f);
        parcel.writeString(this.f83361g);
    }
}
