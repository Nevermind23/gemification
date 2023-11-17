package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem */
public final class TransferCurrencyUiItem implements Parcelable {
    public static final Parcelable.Creator<TransferCurrencyUiItem> CREATOR = new C21227a();

    /* renamed from: d */
    private final String f57002d;

    /* renamed from: e */
    private final BigDecimal f57003e;

    /* renamed from: f */
    private final BigDecimal f57004f;

    /* renamed from: g */
    private final BigDecimal f57005g;

    /* renamed from: h */
    private final BigDecimal f57006h;

    /* renamed from: i */
    private final BigDecimal f57007i;

    /* renamed from: j */
    private final String f57008j;

    /* renamed from: k */
    private final int f57009k;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem$a */
    public static final class C21227a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransferCurrencyUiItem createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new TransferCurrencyUiItem(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final TransferCurrencyUiItem[] newArray(int i) {
            return new TransferCurrencyUiItem[i];
        }
    }

    public TransferCurrencyUiItem(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2, int i) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(bigDecimal5, "totalAmount");
        C41536l.m120489i(str2, "ccyDictionaryKey");
        this.f57002d = str;
        this.f57003e = bigDecimal;
        this.f57004f = bigDecimal2;
        this.f57005g = bigDecimal3;
        this.f57006h = bigDecimal4;
        this.f57007i = bigDecimal5;
        this.f57008j = str2;
        this.f57009k = i;
    }

    /* renamed from: a */
    public final String mo53201a() {
        return this.f57002d;
    }

    /* renamed from: b */
    public final String mo53202b() {
        return this.f57008j;
    }

    /* renamed from: d */
    public final BigDecimal mo53203d() {
        return this.f57003e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BigDecimal mo53205e() {
        return this.f57005g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferCurrencyUiItem)) {
            return false;
        }
        TransferCurrencyUiItem transferCurrencyUiItem = (TransferCurrencyUiItem) obj;
        return C41536l.m120484d(this.f57002d, transferCurrencyUiItem.f57002d) && C41536l.m120484d(this.f57003e, transferCurrencyUiItem.f57003e) && C41536l.m120484d(this.f57004f, transferCurrencyUiItem.f57004f) && C41536l.m120484d(this.f57005g, transferCurrencyUiItem.f57005g) && C41536l.m120484d(this.f57006h, transferCurrencyUiItem.f57006h) && C41536l.m120484d(this.f57007i, transferCurrencyUiItem.f57007i) && C41536l.m120484d(this.f57008j, transferCurrencyUiItem.f57008j) && this.f57009k == transferCurrencyUiItem.f57009k;
    }

    /* renamed from: f */
    public final BigDecimal mo53207f() {
        return this.f57004f;
    }

    /* renamed from: g */
    public final BigDecimal mo53208g() {
        return this.f57006h;
    }

    /* renamed from: h */
    public final BigDecimal mo53209h() {
        return this.f57007i;
    }

    public int hashCode() {
        int hashCode = this.f57002d.hashCode() * 31;
        BigDecimal bigDecimal = this.f57003e;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f57004f;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f57005g;
        int hashCode4 = (hashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f57006h;
        if (bigDecimal4 != null) {
            i = bigDecimal4.hashCode();
        }
        return ((((((hashCode4 + i) * 31) + this.f57007i.hashCode()) * 31) + this.f57008j.hashCode()) * 31) + this.f57009k;
    }

    public String toString() {
        String str = this.f57002d;
        BigDecimal bigDecimal = this.f57003e;
        BigDecimal bigDecimal2 = this.f57004f;
        BigDecimal bigDecimal3 = this.f57005g;
        BigDecimal bigDecimal4 = this.f57006h;
        BigDecimal bigDecimal5 = this.f57007i;
        String str2 = this.f57008j;
        int i = this.f57009k;
        return "TransferCurrencyUiItem(ccy=" + str + ", rate=" + bigDecimal + ", remittanceRate=" + bigDecimal2 + ", rateDisplay=" + bigDecimal3 + ", remittanceRateDisplay=" + bigDecimal4 + ", totalAmount=" + bigDecimal5 + ", ccyDictionaryKey=" + str2 + ", orderId=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f57002d);
        parcel.writeSerializable(this.f57003e);
        parcel.writeSerializable(this.f57004f);
        parcel.writeSerializable(this.f57005g);
        parcel.writeSerializable(this.f57006h);
        parcel.writeSerializable(this.f57007i);
        parcel.writeString(this.f57008j);
        parcel.writeInt(this.f57009k);
    }
}
