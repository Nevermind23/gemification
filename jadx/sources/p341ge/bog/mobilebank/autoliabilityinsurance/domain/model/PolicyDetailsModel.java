package p341ge.bog.mobilebank.autoliabilityinsurance.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel */
public final class PolicyDetailsModel implements Parcelable {
    public static final Parcelable.Creator<PolicyDetailsModel> CREATOR = new C13582a();

    /* renamed from: A */
    private final String f40632A;

    /* renamed from: B */
    private final String f40633B;

    /* renamed from: C */
    private final String f40634C;

    /* renamed from: D */
    private final boolean f40635D;

    /* renamed from: d */
    private final long f40636d;

    /* renamed from: e */
    private final long f40637e;

    /* renamed from: f */
    private final String f40638f;

    /* renamed from: g */
    private final String f40639g;

    /* renamed from: h */
    private final String f40640h;

    /* renamed from: i */
    private final BigDecimal f40641i;

    /* renamed from: j */
    private final String f40642j;

    /* renamed from: k */
    private final BigDecimal f40643k;

    /* renamed from: l */
    private final String f40644l;

    /* renamed from: m */
    private final Date f40645m;

    /* renamed from: n */
    private final Date f40646n;

    /* renamed from: o */
    private final Date f40647o;

    /* renamed from: p */
    private final String f40648p;

    /* renamed from: q */
    private final Long f40649q;

    /* renamed from: r */
    private final String f40650r;

    /* renamed from: s */
    private final String f40651s;

    /* renamed from: t */
    private final String f40652t;

    /* renamed from: u */
    private final Date f40653u;

    /* renamed from: v */
    private final String f40654v;

    /* renamed from: w */
    private final boolean f40655w;

    /* renamed from: x */
    private final String f40656x;

    /* renamed from: y */
    private final String f40657y;

    /* renamed from: z */
    private final String f40658z;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel$a */
    public static final class C13582a implements Parcelable.Creator {
        /* renamed from: a */
        public final PolicyDetailsModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PolicyDetailsModel(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final PolicyDetailsModel[] newArray(int i) {
            return new PolicyDetailsModel[i];
        }
    }

    public PolicyDetailsModel(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, Date date, Date date2, Date date3, String str6, Long l, String str7, String str8, String str9, Date date4, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        Date date5 = date;
        Date date6 = date2;
        Date date7 = date3;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        Date date8 = date4;
        String str24 = str10;
        String str25 = str11;
        String str26 = str14;
        C41536l.m120489i(str17, "providerId");
        C41536l.m120489i(str18, "productType");
        C41536l.m120489i(str19, "policyNo");
        C41536l.m120489i(date5, "policyCreateDate");
        C41536l.m120489i(date6, "policyStartDate");
        C41536l.m120489i(date7, "policyEndDate");
        C41536l.m120489i(str20, "payPeriod");
        C41536l.m120489i(str21, "carOwnerFirstName");
        C41536l.m120489i(str22, "carOwnerLastName");
        C41536l.m120489i(str23, "carOwnerPin");
        C41536l.m120489i(date8, "carOwnerBirthDate");
        C41536l.m120489i(str24, "carNumber");
        C41536l.m120489i(str25, "productName");
        C41536l.m120489i(str12, "providerName");
        C41536l.m120489i(str13, "providerLogoUrl");
        C41536l.m120489i(str14, "providerPhone");
        C41536l.m120489i(str15, "policyPdfUrl");
        C41536l.m120489i(str16, "paymentPeriodName");
        this.f40636d = j;
        this.f40637e = j2;
        this.f40638f = str17;
        this.f40639g = str18;
        this.f40640h = str19;
        this.f40641i = bigDecimal;
        this.f40642j = str4;
        this.f40643k = bigDecimal2;
        this.f40644l = str5;
        this.f40645m = date5;
        this.f40646n = date6;
        this.f40647o = date7;
        this.f40648p = str20;
        this.f40649q = l;
        this.f40650r = str21;
        this.f40651s = str22;
        this.f40652t = str23;
        this.f40653u = date8;
        this.f40654v = str24;
        this.f40655w = z;
        this.f40656x = str25;
        this.f40657y = str12;
        this.f40658z = str13;
        this.f40632A = str14;
        this.f40633B = str15;
        this.f40634C = str16;
        this.f40635D = z2;
    }

    /* renamed from: a */
    public final String mo37367a() {
        return this.f40654v;
    }

    /* renamed from: b */
    public final Date mo37368b() {
        return this.f40653u;
    }

    /* renamed from: d */
    public final String mo37369d() {
        return this.f40650r;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo37371e() {
        return this.f40651s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyDetailsModel)) {
            return false;
        }
        PolicyDetailsModel policyDetailsModel = (PolicyDetailsModel) obj;
        return this.f40636d == policyDetailsModel.f40636d && this.f40637e == policyDetailsModel.f40637e && C41536l.m120484d(this.f40638f, policyDetailsModel.f40638f) && C41536l.m120484d(this.f40639g, policyDetailsModel.f40639g) && C41536l.m120484d(this.f40640h, policyDetailsModel.f40640h) && C41536l.m120484d(this.f40641i, policyDetailsModel.f40641i) && C41536l.m120484d(this.f40642j, policyDetailsModel.f40642j) && C41536l.m120484d(this.f40643k, policyDetailsModel.f40643k) && C41536l.m120484d(this.f40644l, policyDetailsModel.f40644l) && C41536l.m120484d(this.f40645m, policyDetailsModel.f40645m) && C41536l.m120484d(this.f40646n, policyDetailsModel.f40646n) && C41536l.m120484d(this.f40647o, policyDetailsModel.f40647o) && C41536l.m120484d(this.f40648p, policyDetailsModel.f40648p) && C41536l.m120484d(this.f40649q, policyDetailsModel.f40649q) && C41536l.m120484d(this.f40650r, policyDetailsModel.f40650r) && C41536l.m120484d(this.f40651s, policyDetailsModel.f40651s) && C41536l.m120484d(this.f40652t, policyDetailsModel.f40652t) && C41536l.m120484d(this.f40653u, policyDetailsModel.f40653u) && C41536l.m120484d(this.f40654v, policyDetailsModel.f40654v) && this.f40655w == policyDetailsModel.f40655w && C41536l.m120484d(this.f40656x, policyDetailsModel.f40656x) && C41536l.m120484d(this.f40657y, policyDetailsModel.f40657y) && C41536l.m120484d(this.f40658z, policyDetailsModel.f40658z) && C41536l.m120484d(this.f40632A, policyDetailsModel.f40632A) && C41536l.m120484d(this.f40633B, policyDetailsModel.f40633B) && C41536l.m120484d(this.f40634C, policyDetailsModel.f40634C) && this.f40635D == policyDetailsModel.f40635D;
    }

    /* renamed from: f */
    public final String mo37373f() {
        return this.f40652t;
    }

    /* renamed from: g */
    public final boolean mo37374g() {
        return this.f40655w;
    }

    /* renamed from: h */
    public final long mo37375h() {
        return this.f40636d;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f40636d) * 31) + C7397t.m28148a(this.f40637e)) * 31) + this.f40638f.hashCode()) * 31) + this.f40639g.hashCode()) * 31) + this.f40640h.hashCode()) * 31;
        BigDecimal bigDecimal = this.f40641i;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f40642j;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f40643k;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.f40644l;
        int hashCode4 = (((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f40645m.hashCode()) * 31) + this.f40646n.hashCode()) * 31) + this.f40647o.hashCode()) * 31) + this.f40648p.hashCode()) * 31;
        Long l = this.f40649q;
        if (l != null) {
            i = l.hashCode();
        }
        int hashCode5 = (((((((((((hashCode4 + i) * 31) + this.f40650r.hashCode()) * 31) + this.f40651s.hashCode()) * 31) + this.f40652t.hashCode()) * 31) + this.f40653u.hashCode()) * 31) + this.f40654v.hashCode()) * 31;
        boolean z = this.f40655w;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode6 = (((((((((((((hashCode5 + (z ? 1 : 0)) * 31) + this.f40656x.hashCode()) * 31) + this.f40657y.hashCode()) * 31) + this.f40658z.hashCode()) * 31) + this.f40632A.hashCode()) * 31) + this.f40633B.hashCode()) * 31) + this.f40634C.hashCode()) * 31;
        boolean z3 = this.f40635D;
        if (!z3) {
            z2 = z3;
        }
        return hashCode6 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final BigDecimal mo37377i() {
        return this.f40641i;
    }

    /* renamed from: j */
    public final String mo37378j() {
        return this.f40642j;
    }

    /* renamed from: k */
    public final BigDecimal mo37379k() {
        return this.f40643k;
    }

    /* renamed from: l */
    public final String mo37380l() {
        return this.f40644l;
    }

    /* renamed from: m */
    public final String mo37381m() {
        return this.f40634C;
    }

    /* renamed from: p */
    public final Date mo37382p() {
        return this.f40647o;
    }

    /* renamed from: q */
    public final String mo37383q() {
        return this.f40640h;
    }

    /* renamed from: r */
    public final String mo37384r() {
        return this.f40633B;
    }

    /* renamed from: s */
    public final Date mo37385s() {
        return this.f40646n;
    }

    /* renamed from: t */
    public final String mo37386t() {
        return this.f40658z;
    }

    public String toString() {
        long j = this.f40636d;
        long j2 = this.f40637e;
        String str = this.f40638f;
        String str2 = this.f40639g;
        String str3 = this.f40640h;
        BigDecimal bigDecimal = this.f40641i;
        String str4 = this.f40642j;
        BigDecimal bigDecimal2 = this.f40643k;
        String str5 = this.f40644l;
        Date date = this.f40645m;
        Date date2 = this.f40646n;
        Date date3 = this.f40647o;
        String str6 = this.f40648p;
        Long l = this.f40649q;
        String str7 = this.f40650r;
        String str8 = this.f40651s;
        String str9 = this.f40652t;
        Date date4 = this.f40653u;
        String str10 = this.f40654v;
        boolean z = this.f40655w;
        String str11 = this.f40656x;
        String str12 = this.f40657y;
        String str13 = this.f40658z;
        String str14 = this.f40632A;
        String str15 = this.f40633B;
        String str16 = this.f40634C;
        boolean z2 = this.f40635D;
        return "PolicyDetailsModel(docKey=" + j + ", clientKey=" + j2 + ", providerId=" + str + ", productType=" + str2 + ", policyNo=" + str3 + ", insLimit=" + bigDecimal + ", insLimitCcy=" + str4 + ", insPremium=" + bigDecimal2 + ", insPremiumCcy=" + str5 + ", policyCreateDate=" + date + ", policyStartDate=" + date2 + ", policyEndDate=" + date3 + ", payPeriod=" + str6 + ", policyFileId=" + l + ", carOwnerFirstName=" + str7 + ", carOwnerLastName=" + str8 + ", carOwnerPin=" + str9 + ", carOwnerBirthDate=" + date4 + ", carNumber=" + str10 + ", directDebitStatus=" + z + ", productName=" + str11 + ", providerName=" + str12 + ", providerLogoUrl=" + str13 + ", providerPhone=" + str14 + ", policyPdfUrl=" + str15 + ", paymentPeriodName=" + str16 + ", isOwnersCar=" + z2 + ")";
    }

    /* renamed from: u */
    public final String mo37388u() {
        return this.f40657y;
    }

    /* renamed from: v */
    public final String mo37389v() {
        return this.f40632A;
    }

    /* renamed from: w */
    public final boolean mo37390w() {
        return this.f40635D;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f40636d);
        parcel.writeLong(this.f40637e);
        parcel.writeString(this.f40638f);
        parcel.writeString(this.f40639g);
        parcel.writeString(this.f40640h);
        parcel.writeSerializable(this.f40641i);
        parcel.writeString(this.f40642j);
        parcel.writeSerializable(this.f40643k);
        parcel.writeString(this.f40644l);
        parcel.writeSerializable(this.f40645m);
        parcel.writeSerializable(this.f40646n);
        parcel.writeSerializable(this.f40647o);
        parcel.writeString(this.f40648p);
        Long l = this.f40649q;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f40650r);
        parcel.writeString(this.f40651s);
        parcel.writeString(this.f40652t);
        parcel.writeSerializable(this.f40653u);
        parcel.writeString(this.f40654v);
        parcel.writeInt(this.f40655w ? 1 : 0);
        parcel.writeString(this.f40656x);
        parcel.writeString(this.f40657y);
        parcel.writeString(this.f40658z);
        parcel.writeString(this.f40632A);
        parcel.writeString(this.f40633B);
        parcel.writeString(this.f40634C);
        parcel.writeInt(this.f40635D ? 1 : 0);
    }
}
