package p341ge.bog.mobilebank.products.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.products.domain.model.CreditMRInsurance */
public final class CreditMRInsurance implements Parcelable {
    public static final Parcelable.Creator<CreditMRInsurance> CREATOR = new C33804a();

    /* renamed from: d */
    private final long f82368d;

    /* renamed from: e */
    private final long f82369e;

    /* renamed from: f */
    private final String f82370f;

    /* renamed from: g */
    private final long f82371g;

    /* renamed from: h */
    private final String f82372h;

    /* renamed from: i */
    private final String f82373i;

    /* renamed from: j */
    private final String f82374j;

    /* renamed from: k */
    private final String f82375k;

    /* renamed from: l */
    private final String f82376l;

    /* renamed from: m */
    private final String f82377m;

    /* renamed from: n */
    private final long f82378n;

    /* renamed from: o */
    private final String f82379o;

    /* renamed from: p */
    private final String f82380p;

    /* renamed from: q */
    private final String f82381q;

    /* renamed from: r */
    private String f82382r;

    /* renamed from: s */
    private final long f82383s;

    /* renamed from: t */
    private final String f82384t;

    /* renamed from: ge.bog.mobilebank.products.domain.model.CreditMRInsurance$a */
    public static final class C33804a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditMRInsurance createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CreditMRInsurance(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* renamed from: b */
        public final CreditMRInsurance[] newArray(int i) {
            return new CreditMRInsurance[i];
        }
    }

    public CreditMRInsurance(long j, long j2, String str, long j3, String str2, String str3, String str4, String str5, String str6, String str7, long j4, String str8, String str9, String str10, String str11, long j5, String str12) {
        this.f82368d = j;
        this.f82369e = j2;
        this.f82370f = str;
        this.f82371g = j3;
        this.f82372h = str2;
        this.f82373i = str3;
        this.f82374j = str4;
        this.f82375k = str5;
        this.f82376l = str6;
        this.f82377m = str7;
        this.f82378n = j4;
        this.f82379o = str8;
        this.f82380p = str9;
        this.f82381q = str10;
        this.f82382r = str11;
        this.f82383s = j5;
        this.f82384t = str12;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditMRInsurance)) {
            return false;
        }
        CreditMRInsurance creditMRInsurance = (CreditMRInsurance) obj;
        return this.f82368d == creditMRInsurance.f82368d && this.f82369e == creditMRInsurance.f82369e && C41536l.m120484d(this.f82370f, creditMRInsurance.f82370f) && this.f82371g == creditMRInsurance.f82371g && C41536l.m120484d(this.f82372h, creditMRInsurance.f82372h) && C41536l.m120484d(this.f82373i, creditMRInsurance.f82373i) && C41536l.m120484d(this.f82374j, creditMRInsurance.f82374j) && C41536l.m120484d(this.f82375k, creditMRInsurance.f82375k) && C41536l.m120484d(this.f82376l, creditMRInsurance.f82376l) && C41536l.m120484d(this.f82377m, creditMRInsurance.f82377m) && this.f82378n == creditMRInsurance.f82378n && C41536l.m120484d(this.f82379o, creditMRInsurance.f82379o) && C41536l.m120484d(this.f82380p, creditMRInsurance.f82380p) && C41536l.m120484d(this.f82381q, creditMRInsurance.f82381q) && C41536l.m120484d(this.f82382r, creditMRInsurance.f82382r) && this.f82383s == creditMRInsurance.f82383s && C41536l.m120484d(this.f82384t, creditMRInsurance.f82384t);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f82368d) * 31) + C7397t.m28148a(this.f82369e)) * 31;
        String str = this.f82370f;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.f82371g)) * 31;
        String str2 = this.f82372h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82373i;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82374j;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82375k;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f82376l;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f82377m;
        int hashCode7 = (((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + C7397t.m28148a(this.f82378n)) * 31;
        String str8 = this.f82379o;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f82380p;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f82381q;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f82382r;
        int hashCode11 = (((hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31) + C7397t.m28148a(this.f82383s)) * 31;
        String str12 = this.f82384t;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        long j = this.f82368d;
        long j2 = this.f82369e;
        String str = this.f82370f;
        long j3 = this.f82371g;
        String str2 = this.f82372h;
        String str3 = this.f82373i;
        String str4 = this.f82374j;
        String str5 = this.f82375k;
        String str6 = this.f82376l;
        String str7 = this.f82377m;
        long j4 = this.f82378n;
        String str8 = this.f82379o;
        String str9 = this.f82380p;
        String str10 = this.f82381q;
        String str11 = str8;
        String str12 = this.f82382r;
        long j5 = this.f82383s;
        String str13 = this.f82384t;
        return "CreditMRInsurance(acctKey=" + j + ", cardId=" + j2 + ", languageCode=" + str + ", clientKey=" + j3 + ", cardClass=" + str2 + ", cardType=" + str3 + ", subProductCode=" + str4 + ", lastFour=" + str5 + ", cardTypeName=" + str6 + ", insuranceCode=" + str7 + ", expDate=" + j4 + ", insuranceText=" + str11 + ", productUrl=" + str9 + ", cardConditionsUrl=" + str10 + ", phoneNumber=" + str12 + ", expDateMillis=" + j5 + ", attachmentFileBase64=" + str13 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f82368d);
        parcel.writeLong(this.f82369e);
        parcel.writeString(this.f82370f);
        parcel.writeLong(this.f82371g);
        parcel.writeString(this.f82372h);
        parcel.writeString(this.f82373i);
        parcel.writeString(this.f82374j);
        parcel.writeString(this.f82375k);
        parcel.writeString(this.f82376l);
        parcel.writeString(this.f82377m);
        parcel.writeLong(this.f82378n);
        parcel.writeString(this.f82379o);
        parcel.writeString(this.f82380p);
        parcel.writeString(this.f82381q);
        parcel.writeString(this.f82382r);
        parcel.writeLong(this.f82383s);
        parcel.writeString(this.f82384t);
    }
}
