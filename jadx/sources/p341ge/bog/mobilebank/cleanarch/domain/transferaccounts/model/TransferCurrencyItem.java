package p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferCurrencyItem */
public final class TransferCurrencyItem implements Parcelable {
    public static final Parcelable.Creator<TransferCurrencyItem> CREATOR = new C21044a();

    /* renamed from: d */
    private final String f56531d;

    /* renamed from: e */
    private final BigDecimal f56532e;

    /* renamed from: f */
    private final BigDecimal f56533f;

    /* renamed from: g */
    private final BigDecimal f56534g;

    /* renamed from: h */
    private final BigDecimal f56535h;

    /* renamed from: i */
    private final BigDecimal f56536i;

    /* renamed from: j */
    private final String f56537j;

    /* renamed from: k */
    private final int f56538k;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferCurrencyItem$a */
    public static final class C21044a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransferCurrencyItem createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new TransferCurrencyItem(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final TransferCurrencyItem[] newArray(int i) {
            return new TransferCurrencyItem[i];
        }
    }

    public TransferCurrencyItem(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2, int i) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(bigDecimal5, "totalAmount");
        C41536l.m120489i(str2, "ccyDictionaryKey");
        this.f56531d = str;
        this.f56532e = bigDecimal;
        this.f56533f = bigDecimal2;
        this.f56534g = bigDecimal3;
        this.f56535h = bigDecimal4;
        this.f56536i = bigDecimal5;
        this.f56537j = str2;
        this.f56538k = i;
    }

    /* renamed from: a */
    public final String mo52187a() {
        return this.f56531d;
    }

    /* renamed from: b */
    public final String mo52188b() {
        return this.f56537j;
    }

    /* renamed from: d */
    public final int mo52189d() {
        return this.f56538k;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BigDecimal mo52191e() {
        return this.f56532e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferCurrencyItem)) {
            return false;
        }
        TransferCurrencyItem transferCurrencyItem = (TransferCurrencyItem) obj;
        return C41536l.m120484d(this.f56531d, transferCurrencyItem.f56531d) && C41536l.m120484d(this.f56532e, transferCurrencyItem.f56532e) && C41536l.m120484d(this.f56533f, transferCurrencyItem.f56533f) && C41536l.m120484d(this.f56534g, transferCurrencyItem.f56534g) && C41536l.m120484d(this.f56535h, transferCurrencyItem.f56535h) && C41536l.m120484d(this.f56536i, transferCurrencyItem.f56536i) && C41536l.m120484d(this.f56537j, transferCurrencyItem.f56537j) && this.f56538k == transferCurrencyItem.f56538k;
    }

    /* renamed from: f */
    public final BigDecimal mo52193f() {
        return this.f56534g;
    }

    /* renamed from: g */
    public final BigDecimal mo52194g() {
        return this.f56533f;
    }

    /* renamed from: h */
    public final BigDecimal mo52195h() {
        return this.f56535h;
    }

    public int hashCode() {
        int hashCode = this.f56531d.hashCode() * 31;
        BigDecimal bigDecimal = this.f56532e;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f56533f;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f56534g;
        int hashCode4 = (hashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f56535h;
        if (bigDecimal4 != null) {
            i = bigDecimal4.hashCode();
        }
        return ((((((hashCode4 + i) * 31) + this.f56536i.hashCode()) * 31) + this.f56537j.hashCode()) * 31) + this.f56538k;
    }

    /* renamed from: i */
    public final BigDecimal mo52197i() {
        return this.f56536i;
    }

    public String toString() {
        String str = this.f56531d;
        BigDecimal bigDecimal = this.f56532e;
        BigDecimal bigDecimal2 = this.f56533f;
        BigDecimal bigDecimal3 = this.f56534g;
        BigDecimal bigDecimal4 = this.f56535h;
        BigDecimal bigDecimal5 = this.f56536i;
        String str2 = this.f56537j;
        int i = this.f56538k;
        return "TransferCurrencyItem(ccy=" + str + ", rate=" + bigDecimal + ", remittanceRate=" + bigDecimal2 + ", rateDisplay=" + bigDecimal3 + ", remittanceRateDisplay=" + bigDecimal4 + ", totalAmount=" + bigDecimal5 + ", ccyDictionaryKey=" + str2 + ", orderId=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f56531d);
        parcel.writeSerializable(this.f56532e);
        parcel.writeSerializable(this.f56533f);
        parcel.writeSerializable(this.f56534g);
        parcel.writeSerializable(this.f56535h);
        parcel.writeSerializable(this.f56536i);
        parcel.writeString(this.f56537j);
        parcel.writeInt(this.f56538k);
    }
}
