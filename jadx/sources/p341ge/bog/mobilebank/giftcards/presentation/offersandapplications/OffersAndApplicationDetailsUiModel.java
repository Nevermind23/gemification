package p341ge.bog.mobilebank.giftcards.presentation.offersandapplications;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationDetailsUiModel */
public final class OffersAndApplicationDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<OffersAndApplicationDetailsUiModel> CREATOR = new C24299a();

    /* renamed from: d */
    private final String f62806d;

    /* renamed from: e */
    private final BigDecimal f62807e;

    /* renamed from: f */
    private final String f62808f;

    /* renamed from: g */
    private final String f62809g;

    /* renamed from: h */
    private final String f62810h;

    /* renamed from: i */
    private final boolean f62811i;

    /* renamed from: j */
    private final String f62812j;

    /* renamed from: k */
    private final long f62813k;

    /* renamed from: l */
    private final String f62814l;

    /* renamed from: m */
    private final String f62815m;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.OffersAndApplicationDetailsUiModel$a */
    public static final class C24299a implements Parcelable.Creator {
        /* renamed from: a */
        public final OffersAndApplicationDetailsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new OffersAndApplicationDetailsUiModel(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final OffersAndApplicationDetailsUiModel[] newArray(int i) {
            return new OffersAndApplicationDetailsUiModel[i];
        }
    }

    public OffersAndApplicationDetailsUiModel(String str, BigDecimal bigDecimal, String str2, String str3, String str4, boolean z, String str5, long j, String str6, String str7) {
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str2, "validityDate");
        C41536l.m120489i(str3, "storeName");
        C41536l.m120489i(str4, "infoText");
        C41536l.m120489i(str5, "expirationDate");
        C41536l.m120489i(str6, "giftText");
        C41536l.m120489i(str7, "sender");
        this.f62806d = str;
        this.f62807e = bigDecimal;
        this.f62808f = str2;
        this.f62809g = str3;
        this.f62810h = str4;
        this.f62811i = z;
        this.f62812j = str5;
        this.f62813k = j;
        this.f62814l = str6;
        this.f62815m = str7;
    }

    /* renamed from: a */
    public final BigDecimal mo61977a() {
        return this.f62807e;
    }

    /* renamed from: b */
    public final String mo61978b() {
        return this.f62812j;
    }

    /* renamed from: d */
    public final long mo61979d() {
        return this.f62813k;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo61981e() {
        return this.f62811i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersAndApplicationDetailsUiModel)) {
            return false;
        }
        OffersAndApplicationDetailsUiModel offersAndApplicationDetailsUiModel = (OffersAndApplicationDetailsUiModel) obj;
        return C41536l.m120484d(this.f62806d, offersAndApplicationDetailsUiModel.f62806d) && C41536l.m120484d(this.f62807e, offersAndApplicationDetailsUiModel.f62807e) && C41536l.m120484d(this.f62808f, offersAndApplicationDetailsUiModel.f62808f) && C41536l.m120484d(this.f62809g, offersAndApplicationDetailsUiModel.f62809g) && C41536l.m120484d(this.f62810h, offersAndApplicationDetailsUiModel.f62810h) && this.f62811i == offersAndApplicationDetailsUiModel.f62811i && C41536l.m120484d(this.f62812j, offersAndApplicationDetailsUiModel.f62812j) && this.f62813k == offersAndApplicationDetailsUiModel.f62813k && C41536l.m120484d(this.f62814l, offersAndApplicationDetailsUiModel.f62814l) && C41536l.m120484d(this.f62815m, offersAndApplicationDetailsUiModel.f62815m);
    }

    /* renamed from: f */
    public final String mo61983f() {
        return this.f62814l;
    }

    /* renamed from: g */
    public final String mo61984g() {
        return this.f62806d;
    }

    /* renamed from: h */
    public final String mo61985h() {
        return this.f62815m;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f62806d.hashCode() * 31) + this.f62807e.hashCode()) * 31) + this.f62808f.hashCode()) * 31) + this.f62809g.hashCode()) * 31) + this.f62810h.hashCode()) * 31;
        boolean z = this.f62811i;
        if (z) {
            z = true;
        }
        return ((((((((hashCode + (z ? 1 : 0)) * 31) + this.f62812j.hashCode()) * 31) + C7397t.m28148a(this.f62813k)) * 31) + this.f62814l.hashCode()) * 31) + this.f62815m.hashCode();
    }

    /* renamed from: i */
    public final String mo61987i() {
        return this.f62809g;
    }

    /* renamed from: j */
    public final String mo61988j() {
        return this.f62808f;
    }

    public String toString() {
        String str = this.f62806d;
        BigDecimal bigDecimal = this.f62807e;
        String str2 = this.f62808f;
        String str3 = this.f62809g;
        String str4 = this.f62810h;
        boolean z = this.f62811i;
        String str5 = this.f62812j;
        long j = this.f62813k;
        String str6 = this.f62814l;
        String str7 = this.f62815m;
        return "OffersAndApplicationDetailsUiModel(phoneNumber=" + str + ", amount=" + bigDecimal + ", validityDate=" + str2 + ", storeName=" + str3 + ", infoText=" + str4 + ", giftCardSeen=" + z + ", expirationDate=" + str5 + ", giftCardId=" + j + ", giftText=" + str6 + ", sender=" + str7 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f62806d);
        parcel.writeSerializable(this.f62807e);
        parcel.writeString(this.f62808f);
        parcel.writeString(this.f62809g);
        parcel.writeString(this.f62810h);
        parcel.writeInt(this.f62811i ? 1 : 0);
        parcel.writeString(this.f62812j);
        parcel.writeLong(this.f62813k);
        parcel.writeString(this.f62814l);
        parcel.writeString(this.f62815m);
    }
}
