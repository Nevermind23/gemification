package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.model.PolicyDetailsUiModel */
public final class PolicyDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<PolicyDetailsUiModel> CREATOR = new C24534a();

    /* renamed from: d */
    private final long f63254d;

    /* renamed from: e */
    private final long f63255e;

    /* renamed from: f */
    private final String f63256f;

    /* renamed from: g */
    private final String f63257g;

    /* renamed from: h */
    private final String f63258h;

    /* renamed from: i */
    private final BigDecimal f63259i;

    /* renamed from: j */
    private final String f63260j;

    /* renamed from: k */
    private final BigDecimal f63261k;

    /* renamed from: l */
    private final String f63262l;

    /* renamed from: m */
    private final Date f63263m;

    /* renamed from: n */
    private final Date f63264n;

    /* renamed from: o */
    private final Long f63265o;

    /* renamed from: p */
    private final String f63266p;

    /* renamed from: q */
    private final String f63267q;

    /* renamed from: r */
    private final String f63268r;

    /* renamed from: s */
    private final String f63269s;

    /* renamed from: t */
    private final String f63270t;

    /* renamed from: u */
    private final Boolean f63271u;

    /* renamed from: v */
    private final String f63272v;

    /* renamed from: w */
    private final String f63273w;

    /* renamed from: x */
    private final String f63274x;

    /* renamed from: y */
    private final String f63275y;

    /* renamed from: z */
    private final List f63276z;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.model.PolicyDetailsUiModel$a */
    public static final class C24534a implements Parcelable.Creator {
        /* renamed from: a */
        public final PolicyDetailsUiModel createFromParcel(Parcel parcel) {
            Boolean bool;
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String readString4 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            String readString5 = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PolicyDetailsUiModel(readLong, readLong2, readString, readString2, readString3, bigDecimal, readString4, bigDecimal2, readString5, date, date2, valueOf, readString6, readString7, readString8, readString9, readString10, bool, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final PolicyDetailsUiModel[] newArray(int i) {
            return new PolicyDetailsUiModel[i];
        }
    }

    public PolicyDetailsUiModel(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, Date date, Date date2, Long l, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, String str13, String str14, List list) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        Date date3 = date;
        Date date4 = date2;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        String str25 = str13;
        C41536l.m120489i(str15, "providerId");
        C41536l.m120489i(str16, "productType");
        C41536l.m120489i(str17, "policyNo");
        C41536l.m120489i(date3, "policyStartDate");
        C41536l.m120489i(date4, "policyEndDate");
        C41536l.m120489i(str18, "insuredFirstName");
        C41536l.m120489i(str19, "insuredLastName");
        C41536l.m120489i(str20, "insuredFirstNameEn");
        C41536l.m120489i(str21, "insuredLastNameEn");
        C41536l.m120489i(str22, "insuredPin");
        C41536l.m120489i(str23, "productName");
        C41536l.m120489i(str24, "providerName");
        C41536l.m120489i(str25, "providerLogoUrl");
        C41536l.m120489i(str14, "policyPdfUrl");
        C41536l.m120489i(list, "contactInformation");
        this.f63254d = j;
        this.f63255e = j2;
        this.f63256f = str15;
        this.f63257g = str16;
        this.f63258h = str17;
        this.f63259i = bigDecimal;
        this.f63260j = str4;
        this.f63261k = bigDecimal2;
        this.f63262l = str5;
        this.f63263m = date3;
        this.f63264n = date4;
        this.f63265o = l;
        this.f63266p = str18;
        this.f63267q = str19;
        this.f63268r = str20;
        this.f63269s = str21;
        this.f63270t = str22;
        this.f63271u = bool;
        this.f63272v = str23;
        this.f63273w = str24;
        this.f63274x = str25;
        this.f63275y = str14;
        this.f63276z = list;
    }

    /* renamed from: a */
    public final List mo62662a() {
        return this.f63276z;
    }

    /* renamed from: b */
    public final long mo62663b() {
        return this.f63254d;
    }

    /* renamed from: d */
    public final BigDecimal mo62664d() {
        return this.f63259i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo62666e() {
        return this.f63260j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyDetailsUiModel)) {
            return false;
        }
        PolicyDetailsUiModel policyDetailsUiModel = (PolicyDetailsUiModel) obj;
        return this.f63254d == policyDetailsUiModel.f63254d && this.f63255e == policyDetailsUiModel.f63255e && C41536l.m120484d(this.f63256f, policyDetailsUiModel.f63256f) && C41536l.m120484d(this.f63257g, policyDetailsUiModel.f63257g) && C41536l.m120484d(this.f63258h, policyDetailsUiModel.f63258h) && C41536l.m120484d(this.f63259i, policyDetailsUiModel.f63259i) && C41536l.m120484d(this.f63260j, policyDetailsUiModel.f63260j) && C41536l.m120484d(this.f63261k, policyDetailsUiModel.f63261k) && C41536l.m120484d(this.f63262l, policyDetailsUiModel.f63262l) && C41536l.m120484d(this.f63263m, policyDetailsUiModel.f63263m) && C41536l.m120484d(this.f63264n, policyDetailsUiModel.f63264n) && C41536l.m120484d(this.f63265o, policyDetailsUiModel.f63265o) && C41536l.m120484d(this.f63266p, policyDetailsUiModel.f63266p) && C41536l.m120484d(this.f63267q, policyDetailsUiModel.f63267q) && C41536l.m120484d(this.f63268r, policyDetailsUiModel.f63268r) && C41536l.m120484d(this.f63269s, policyDetailsUiModel.f63269s) && C41536l.m120484d(this.f63270t, policyDetailsUiModel.f63270t) && C41536l.m120484d(this.f63271u, policyDetailsUiModel.f63271u) && C41536l.m120484d(this.f63272v, policyDetailsUiModel.f63272v) && C41536l.m120484d(this.f63273w, policyDetailsUiModel.f63273w) && C41536l.m120484d(this.f63274x, policyDetailsUiModel.f63274x) && C41536l.m120484d(this.f63275y, policyDetailsUiModel.f63275y) && C41536l.m120484d(this.f63276z, policyDetailsUiModel.f63276z);
    }

    /* renamed from: f */
    public final String mo62668f() {
        return this.f63268r;
    }

    /* renamed from: g */
    public final String mo62669g() {
        return this.f63269s;
    }

    /* renamed from: h */
    public final String mo62670h() {
        return this.f63270t;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f63254d) * 31) + C7397t.m28148a(this.f63255e)) * 31) + this.f63256f.hashCode()) * 31) + this.f63257g.hashCode()) * 31) + this.f63258h.hashCode()) * 31;
        BigDecimal bigDecimal = this.f63259i;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f63260j;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f63261k;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.f63262l;
        int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f63263m.hashCode()) * 31) + this.f63264n.hashCode()) * 31;
        Long l = this.f63265o;
        int hashCode5 = (((((((((((hashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.f63266p.hashCode()) * 31) + this.f63267q.hashCode()) * 31) + this.f63268r.hashCode()) * 31) + this.f63269s.hashCode()) * 31) + this.f63270t.hashCode()) * 31;
        Boolean bool = this.f63271u;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((((((((((hashCode5 + i) * 31) + this.f63272v.hashCode()) * 31) + this.f63273w.hashCode()) * 31) + this.f63274x.hashCode()) * 31) + this.f63275y.hashCode()) * 31) + this.f63276z.hashCode();
    }

    /* renamed from: i */
    public final Date mo62672i() {
        return this.f63264n;
    }

    /* renamed from: j */
    public final Long mo62673j() {
        return this.f63265o;
    }

    /* renamed from: k */
    public final String mo62674k() {
        return this.f63258h;
    }

    /* renamed from: l */
    public final String mo62675l() {
        return this.f63275y;
    }

    /* renamed from: m */
    public final Date mo62676m() {
        return this.f63263m;
    }

    /* renamed from: p */
    public final String mo62677p() {
        return this.f63274x;
    }

    /* renamed from: q */
    public final String mo62678q() {
        return this.f63273w;
    }

    public String toString() {
        long j = this.f63254d;
        long j2 = this.f63255e;
        String str = this.f63256f;
        String str2 = this.f63257g;
        String str3 = this.f63258h;
        BigDecimal bigDecimal = this.f63259i;
        String str4 = this.f63260j;
        BigDecimal bigDecimal2 = this.f63261k;
        String str5 = this.f63262l;
        Date date = this.f63263m;
        Date date2 = this.f63264n;
        Long l = this.f63265o;
        String str6 = this.f63266p;
        String str7 = this.f63267q;
        String str8 = this.f63268r;
        String str9 = this.f63269s;
        String str10 = this.f63270t;
        Boolean bool = this.f63271u;
        String str11 = this.f63272v;
        String str12 = this.f63273w;
        String str13 = this.f63274x;
        String str14 = this.f63275y;
        List list = this.f63276z;
        return "PolicyDetailsUiModel(docKey=" + j + ", clientKey=" + j2 + ", providerId=" + str + ", productType=" + str2 + ", policyNo=" + str3 + ", insLimit=" + bigDecimal + ", insLimitCcy=" + str4 + ", insPremium=" + bigDecimal2 + ", insPremiumCcy=" + str5 + ", policyStartDate=" + date + ", policyEndDate=" + date2 + ", policyFileId=" + l + ", insuredFirstName=" + str6 + ", insuredLastName=" + str7 + ", insuredFirstNameEn=" + str8 + ", insuredLastNameEn=" + str9 + ", insuredPin=" + str10 + ", addCoverage=" + bool + ", productName=" + str11 + ", providerName=" + str12 + ", providerLogoUrl=" + str13 + ", policyPdfUrl=" + str14 + ", contactInformation=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f63254d);
        parcel.writeLong(this.f63255e);
        parcel.writeString(this.f63256f);
        parcel.writeString(this.f63257g);
        parcel.writeString(this.f63258h);
        parcel.writeSerializable(this.f63259i);
        parcel.writeString(this.f63260j);
        parcel.writeSerializable(this.f63261k);
        parcel.writeString(this.f63262l);
        parcel.writeSerializable(this.f63263m);
        parcel.writeSerializable(this.f63264n);
        Long l = this.f63265o;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f63266p);
        parcel.writeString(this.f63267q);
        parcel.writeString(this.f63268r);
        parcel.writeString(this.f63269s);
        parcel.writeString(this.f63270t);
        Boolean bool = this.f63271u;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f63272v);
        parcel.writeString(this.f63273w);
        parcel.writeString(this.f63274x);
        parcel.writeString(this.f63275y);
        parcel.writeStringList(this.f63276z);
    }
}
