package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferModel */
public final class CombinedOfferModel implements Parcelable {
    public static final Parcelable.Creator<CombinedOfferModel> CREATOR = new C22854a();

    /* renamed from: d */
    private final String f60214d;

    /* renamed from: e */
    private final BigDecimal f60215e;

    /* renamed from: f */
    private final Long f60216f;

    /* renamed from: g */
    private final String f60217g;

    /* renamed from: h */
    private final String f60218h;

    /* renamed from: i */
    private final Integer f60219i;

    /* renamed from: j */
    private final boolean f60220j;

    /* renamed from: k */
    private final BigDecimal f60221k;

    /* renamed from: l */
    private final Long f60222l;

    /* renamed from: m */
    private final boolean f60223m;

    /* renamed from: n */
    private final BigDecimal f60224n;

    /* renamed from: o */
    private final Long f60225o;

    /* renamed from: p */
    private final int f60226p;

    /* renamed from: q */
    private final BigDecimal f60227q;

    /* renamed from: r */
    private final String f60228r;

    /* renamed from: s */
    private final String f60229s;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferModel$a */
    public static final class C22854a implements Parcelable.Creator {
        /* renamed from: a */
        public final CombinedOfferModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CombinedOfferModel(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CombinedOfferModel[] newArray(int i) {
            return new CombinedOfferModel[i];
        }
    }

    public CombinedOfferModel(String str, BigDecimal bigDecimal, Long l, String str2, String str3, Integer num, boolean z, BigDecimal bigDecimal2, Long l2, boolean z2, BigDecimal bigDecimal3, Long l3, int i, BigDecimal bigDecimal4, String str4, String str5) {
        this.f60214d = str;
        this.f60215e = bigDecimal;
        this.f60216f = l;
        this.f60217g = str2;
        this.f60218h = str3;
        this.f60219i = num;
        this.f60220j = z;
        this.f60221k = bigDecimal2;
        this.f60222l = l2;
        this.f60223m = z2;
        this.f60224n = bigDecimal3;
        this.f60225o = l3;
        this.f60226p = i;
        this.f60227q = bigDecimal4;
        this.f60228r = str4;
        this.f60229s = str5;
    }

    /* renamed from: a */
    public final Long mo56931a() {
        return this.f60216f;
    }

    /* renamed from: b */
    public final BigDecimal mo56932b() {
        return this.f60215e;
    }

    /* renamed from: d */
    public final BigDecimal mo56933d() {
        return this.f60221k;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo56935e() {
        return this.f60218h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedOfferModel)) {
            return false;
        }
        CombinedOfferModel combinedOfferModel = (CombinedOfferModel) obj;
        return C41536l.m120484d(this.f60214d, combinedOfferModel.f60214d) && C41536l.m120484d(this.f60215e, combinedOfferModel.f60215e) && C41536l.m120484d(this.f60216f, combinedOfferModel.f60216f) && C41536l.m120484d(this.f60217g, combinedOfferModel.f60217g) && C41536l.m120484d(this.f60218h, combinedOfferModel.f60218h) && C41536l.m120484d(this.f60219i, combinedOfferModel.f60219i) && this.f60220j == combinedOfferModel.f60220j && C41536l.m120484d(this.f60221k, combinedOfferModel.f60221k) && C41536l.m120484d(this.f60222l, combinedOfferModel.f60222l) && this.f60223m == combinedOfferModel.f60223m && C41536l.m120484d(this.f60224n, combinedOfferModel.f60224n) && C41536l.m120484d(this.f60225o, combinedOfferModel.f60225o) && this.f60226p == combinedOfferModel.f60226p && C41536l.m120484d(this.f60227q, combinedOfferModel.f60227q) && C41536l.m120484d(this.f60228r, combinedOfferModel.f60228r) && C41536l.m120484d(this.f60229s, combinedOfferModel.f60229s);
    }

    /* renamed from: f */
    public final boolean mo56937f() {
        return this.f60220j;
    }

    /* renamed from: g */
    public final boolean mo56938g() {
        return this.f60223m;
    }

    /* renamed from: h */
    public final String mo56939h() {
        return this.f60229s;
    }

    public int hashCode() {
        String str = this.f60214d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.f60215e;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l = this.f60216f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f60217g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f60218h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f60219i;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f60220j;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        BigDecimal bigDecimal2 = this.f60221k;
        int hashCode7 = (i2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l2 = this.f60222l;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        boolean z3 = this.f60223m;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode8 + (z2 ? 1 : 0)) * 31;
        BigDecimal bigDecimal3 = this.f60224n;
        int hashCode9 = (i3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Long l3 = this.f60225o;
        int hashCode10 = (((hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.f60226p) * 31;
        BigDecimal bigDecimal4 = this.f60227q;
        int hashCode11 = (hashCode10 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str4 = this.f60228r;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f60229s;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode12 + i;
    }

    /* renamed from: i */
    public final String mo56941i() {
        return this.f60214d;
    }

    /* renamed from: j */
    public final Long mo56942j() {
        return this.f60222l;
    }

    /* renamed from: k */
    public final BigDecimal mo56943k() {
        return this.f60224n;
    }

    /* renamed from: l */
    public final Long mo56944l() {
        return this.f60225o;
    }

    /* renamed from: m */
    public final int mo56945m() {
        return this.f60226p;
    }

    /* renamed from: p */
    public final Integer mo56946p() {
        return this.f60219i;
    }

    /* renamed from: q */
    public final BigDecimal mo56947q() {
        return this.f60227q;
    }

    public String toString() {
        String str = this.f60214d;
        BigDecimal bigDecimal = this.f60215e;
        Long l = this.f60216f;
        String str2 = this.f60217g;
        String str3 = this.f60218h;
        Integer num = this.f60219i;
        boolean z = this.f60220j;
        BigDecimal bigDecimal2 = this.f60221k;
        Long l2 = this.f60222l;
        boolean z2 = this.f60223m;
        BigDecimal bigDecimal3 = this.f60224n;
        Long l3 = this.f60225o;
        int i = this.f60226p;
        BigDecimal bigDecimal4 = this.f60227q;
        String str4 = this.f60228r;
        String str5 = this.f60229s;
        return "CombinedOfferModel(prodType=" + str + ", amount=" + bigDecimal + ", acctKeys=" + l + ", acctNo=" + str2 + ", ccy=" + str3 + ", term=" + num + ", openCAS=" + z + ", casAmount=" + bigDecimal2 + ", srcAcctKey=" + l2 + ", openSTO=" + z2 + ", stoAmount=" + bigDecimal3 + ", stoSrcAcctKey=" + l3 + ", stoTransferDay=" + i + ", totalAmount=" + bigDecimal4 + ", reasoning=" + str4 + ", periodType=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60214d);
        parcel.writeSerializable(this.f60215e);
        Long l = this.f60216f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f60217g);
        parcel.writeString(this.f60218h);
        Integer num = this.f60219i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f60220j ? 1 : 0);
        parcel.writeSerializable(this.f60221k);
        Long l2 = this.f60222l;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.f60223m ? 1 : 0);
        parcel.writeSerializable(this.f60224n);
        Long l3 = this.f60225o;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeInt(this.f60226p);
        parcel.writeSerializable(this.f60227q);
        parcel.writeString(this.f60228r);
        parcel.writeString(this.f60229s);
    }
}
