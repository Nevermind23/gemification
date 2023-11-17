package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditCardOfferDetailsUiModel */
public final class CreditCardOfferDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<CreditCardOfferDetailsUiModel> CREATOR = new C21685a();

    /* renamed from: A */
    private String f57832A;

    /* renamed from: B */
    private String f57833B;

    /* renamed from: C */
    private Integer f57834C;

    /* renamed from: D */
    private String f57835D;

    /* renamed from: E */
    private String f57836E;

    /* renamed from: F */
    private BigDecimal f57837F;

    /* renamed from: G */
    private BigDecimal f57838G;

    /* renamed from: H */
    private String f57839H;

    /* renamed from: I */
    private String f57840I;

    /* renamed from: J */
    private String f57841J;

    /* renamed from: K */
    private String f57842K;

    /* renamed from: d */
    private String f57843d;

    /* renamed from: e */
    private String f57844e;

    /* renamed from: f */
    private Double f57845f;

    /* renamed from: g */
    private String f57846g;

    /* renamed from: h */
    private Double f57847h;

    /* renamed from: i */
    private String f57848i;

    /* renamed from: j */
    private Double f57849j;

    /* renamed from: k */
    private BigDecimal f57850k;

    /* renamed from: l */
    private long f57851l;

    /* renamed from: m */
    private String f57852m;

    /* renamed from: n */
    private String f57853n;

    /* renamed from: o */
    private String f57854o;

    /* renamed from: p */
    private BigDecimal f57855p;

    /* renamed from: q */
    private Double f57856q;

    /* renamed from: r */
    private Double f57857r;

    /* renamed from: s */
    private String f57858s;

    /* renamed from: t */
    private String f57859t;

    /* renamed from: u */
    private String f57860u;

    /* renamed from: v */
    private String f57861v;

    /* renamed from: w */
    private String f57862w;

    /* renamed from: x */
    private String f57863x;

    /* renamed from: y */
    private String f57864y;

    /* renamed from: z */
    private String f57865z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditCardOfferDetailsUiModel$a */
    public static final class C21685a implements Parcelable.Creator {
        /* renamed from: a */
        public final CreditCardOfferDetailsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CreditCardOfferDetailsUiModel(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), (BigDecimal) parcel.readSerializable(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CreditCardOfferDetailsUiModel[] newArray(int i) {
            return new CreditCardOfferDetailsUiModel[i];
        }
    }

    public CreditCardOfferDetailsUiModel(String str, String str2, Double d, String str3, Double d2, String str4, Double d3, BigDecimal bigDecimal, long j, String str5, String str6, String str7, BigDecimal bigDecimal2, Double d4, Double d5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, String str19, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str20, String str21, String str22, String str23) {
        String str24 = str6;
        String str25 = str7;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str26 = str8;
        String str27 = str9;
        String str28 = str13;
        String str29 = str22;
        String str30 = str23;
        C41536l.m120489i(str24, "decisionScheme");
        C41536l.m120489i(str25, "cardClass");
        C41536l.m120489i(bigDecimal5, "cardLimit");
        C41536l.m120489i(str26, "cardType");
        C41536l.m120489i(str27, "cardCcy");
        C41536l.m120489i(str28, "templCode");
        C41536l.m120489i(str29, "offerDetailsText");
        C41536l.m120489i(str30, "offerMainText");
        this.f57843d = str;
        this.f57844e = str2;
        this.f57845f = d;
        this.f57846g = str3;
        this.f57847h = d2;
        this.f57848i = str4;
        this.f57849j = d3;
        this.f57850k = bigDecimal;
        this.f57851l = j;
        this.f57852m = str5;
        this.f57853n = str24;
        this.f57854o = str25;
        this.f57855p = bigDecimal5;
        this.f57856q = d4;
        this.f57857r = d5;
        this.f57858s = str26;
        this.f57859t = str27;
        this.f57860u = str10;
        this.f57861v = str11;
        this.f57862w = str12;
        this.f57863x = str28;
        this.f57864y = str14;
        this.f57865z = str15;
        this.f57832A = str16;
        this.f57833B = str17;
        this.f57834C = num;
        this.f57835D = str18;
        this.f57836E = str19;
        this.f57837F = bigDecimal3;
        this.f57838G = bigDecimal4;
        this.f57839H = str20;
        this.f57840I = str21;
        this.f57841J = str29;
        this.f57842K = str30;
    }

    /* renamed from: b */
    public static /* synthetic */ CreditCardOfferDetailsUiModel m70125b(CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel, String str, String str2, Double d, String str3, Double d2, String str4, Double d3, BigDecimal bigDecimal, long j, String str5, String str6, String str7, BigDecimal bigDecimal2, Double d4, Double d5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, String str19, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str20, String str21, String str22, String str23, int i, int i2, Object obj) {
        CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel2 = creditCardOfferDetailsUiModel;
        int i3 = i;
        return creditCardOfferDetailsUiModel.mo54040a((i3 & 1) != 0 ? creditCardOfferDetailsUiModel2.f57843d : str, (i3 & 2) != 0 ? creditCardOfferDetailsUiModel2.f57844e : str2, (i3 & 4) != 0 ? creditCardOfferDetailsUiModel2.f57845f : d, (i3 & 8) != 0 ? creditCardOfferDetailsUiModel2.f57846g : str3, (i3 & 16) != 0 ? creditCardOfferDetailsUiModel2.f57847h : d2, (i3 & 32) != 0 ? creditCardOfferDetailsUiModel2.f57848i : str4, (i3 & 64) != 0 ? creditCardOfferDetailsUiModel2.f57849j : d3, (i3 & 128) != 0 ? creditCardOfferDetailsUiModel2.f57850k : bigDecimal, (i3 & C11398b.f33139r) != 0 ? creditCardOfferDetailsUiModel2.f57851l : j, (i3 & C11398b.f33140s) != 0 ? creditCardOfferDetailsUiModel2.f57852m : str5, (i3 & C11398b.f33141t) != 0 ? creditCardOfferDetailsUiModel2.f57853n : str6, (i3 & C11398b.f33142u) != 0 ? creditCardOfferDetailsUiModel2.f57854o : str7, (i3 & C11398b.f33143v) != 0 ? creditCardOfferDetailsUiModel2.f57855p : bigDecimal2, (i3 & 8192) != 0 ? creditCardOfferDetailsUiModel2.f57856q : d4, (i3 & 16384) != 0 ? creditCardOfferDetailsUiModel2.f57857r : d5, (i3 & 32768) != 0 ? creditCardOfferDetailsUiModel2.f57858s : str8, (i3 & 65536) != 0 ? creditCardOfferDetailsUiModel2.f57859t : str9, (i3 & 131072) != 0 ? creditCardOfferDetailsUiModel2.f57860u : str10, (i3 & 262144) != 0 ? creditCardOfferDetailsUiModel2.f57861v : str11, (i3 & 524288) != 0 ? creditCardOfferDetailsUiModel2.f57862w : str12, (i3 & 1048576) != 0 ? creditCardOfferDetailsUiModel2.f57863x : str13, (i3 & 2097152) != 0 ? creditCardOfferDetailsUiModel2.f57864y : str14, (i3 & 4194304) != 0 ? creditCardOfferDetailsUiModel2.f57865z : str15, (i3 & 8388608) != 0 ? creditCardOfferDetailsUiModel2.f57832A : str16, (i3 & 16777216) != 0 ? creditCardOfferDetailsUiModel2.f57833B : str17, (i3 & 33554432) != 0 ? creditCardOfferDetailsUiModel2.f57834C : num, (i3 & 67108864) != 0 ? creditCardOfferDetailsUiModel2.f57835D : str18, (i3 & 134217728) != 0 ? creditCardOfferDetailsUiModel2.f57836E : str19, (i3 & 268435456) != 0 ? creditCardOfferDetailsUiModel2.f57837F : bigDecimal3, (i3 & 536870912) != 0 ? creditCardOfferDetailsUiModel2.f57838G : bigDecimal4, (i3 & 1073741824) != 0 ? creditCardOfferDetailsUiModel2.f57839H : str20, (i3 & Integer.MIN_VALUE) != 0 ? creditCardOfferDetailsUiModel2.f57840I : str21, (i2 & 1) != 0 ? creditCardOfferDetailsUiModel2.f57841J : str22, (i2 & 2) != 0 ? creditCardOfferDetailsUiModel2.f57842K : str23);
    }

    /* renamed from: a */
    public final CreditCardOfferDetailsUiModel mo54040a(String str, String str2, Double d, String str3, Double d2, String str4, Double d3, BigDecimal bigDecimal, long j, String str5, String str6, String str7, BigDecimal bigDecimal2, Double d4, Double d5, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, String str19, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str20, String str21, String str22, String str23) {
        String str24 = str;
        C41536l.m120489i(str6, "decisionScheme");
        C41536l.m120489i(str7, "cardClass");
        C41536l.m120489i(bigDecimal2, "cardLimit");
        C41536l.m120489i(str8, "cardType");
        C41536l.m120489i(str9, "cardCcy");
        C41536l.m120489i(str13, "templCode");
        C41536l.m120489i(str22, "offerDetailsText");
        C41536l.m120489i(str23, "offerMainText");
        return new CreditCardOfferDetailsUiModel(str, str2, d, str3, d2, str4, d3, bigDecimal, j, str5, str6, str7, bigDecimal2, d4, d5, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, num, str18, str19, bigDecimal3, bigDecimal4, str20, str21, str22, str23);
    }

    /* renamed from: d */
    public final String mo54041d() {
        return this.f57848i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo54043e() {
        return this.f57859t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardOfferDetailsUiModel)) {
            return false;
        }
        CreditCardOfferDetailsUiModel creditCardOfferDetailsUiModel = (CreditCardOfferDetailsUiModel) obj;
        return C41536l.m120484d(this.f57843d, creditCardOfferDetailsUiModel.f57843d) && C41536l.m120484d(this.f57844e, creditCardOfferDetailsUiModel.f57844e) && C41536l.m120484d(this.f57845f, creditCardOfferDetailsUiModel.f57845f) && C41536l.m120484d(this.f57846g, creditCardOfferDetailsUiModel.f57846g) && C41536l.m120484d(this.f57847h, creditCardOfferDetailsUiModel.f57847h) && C41536l.m120484d(this.f57848i, creditCardOfferDetailsUiModel.f57848i) && C41536l.m120484d(this.f57849j, creditCardOfferDetailsUiModel.f57849j) && C41536l.m120484d(this.f57850k, creditCardOfferDetailsUiModel.f57850k) && this.f57851l == creditCardOfferDetailsUiModel.f57851l && C41536l.m120484d(this.f57852m, creditCardOfferDetailsUiModel.f57852m) && C41536l.m120484d(this.f57853n, creditCardOfferDetailsUiModel.f57853n) && C41536l.m120484d(this.f57854o, creditCardOfferDetailsUiModel.f57854o) && C41536l.m120484d(this.f57855p, creditCardOfferDetailsUiModel.f57855p) && C41536l.m120484d(this.f57856q, creditCardOfferDetailsUiModel.f57856q) && C41536l.m120484d(this.f57857r, creditCardOfferDetailsUiModel.f57857r) && C41536l.m120484d(this.f57858s, creditCardOfferDetailsUiModel.f57858s) && C41536l.m120484d(this.f57859t, creditCardOfferDetailsUiModel.f57859t) && C41536l.m120484d(this.f57860u, creditCardOfferDetailsUiModel.f57860u) && C41536l.m120484d(this.f57861v, creditCardOfferDetailsUiModel.f57861v) && C41536l.m120484d(this.f57862w, creditCardOfferDetailsUiModel.f57862w) && C41536l.m120484d(this.f57863x, creditCardOfferDetailsUiModel.f57863x) && C41536l.m120484d(this.f57864y, creditCardOfferDetailsUiModel.f57864y) && C41536l.m120484d(this.f57865z, creditCardOfferDetailsUiModel.f57865z) && C41536l.m120484d(this.f57832A, creditCardOfferDetailsUiModel.f57832A) && C41536l.m120484d(this.f57833B, creditCardOfferDetailsUiModel.f57833B) && C41536l.m120484d(this.f57834C, creditCardOfferDetailsUiModel.f57834C) && C41536l.m120484d(this.f57835D, creditCardOfferDetailsUiModel.f57835D) && C41536l.m120484d(this.f57836E, creditCardOfferDetailsUiModel.f57836E) && C41536l.m120484d(this.f57837F, creditCardOfferDetailsUiModel.f57837F) && C41536l.m120484d(this.f57838G, creditCardOfferDetailsUiModel.f57838G) && C41536l.m120484d(this.f57839H, creditCardOfferDetailsUiModel.f57839H) && C41536l.m120484d(this.f57840I, creditCardOfferDetailsUiModel.f57840I) && C41536l.m120484d(this.f57841J, creditCardOfferDetailsUiModel.f57841J) && C41536l.m120484d(this.f57842K, creditCardOfferDetailsUiModel.f57842K);
    }

    /* renamed from: f */
    public final BigDecimal mo54045f() {
        return this.f57855p;
    }

    /* renamed from: g */
    public final String mo54046g() {
        return this.f57858s;
    }

    /* renamed from: h */
    public final String mo54047h() {
        return this.f57840I;
    }

    public int hashCode() {
        String str = this.f57843d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57844e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f57845f;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.f57846g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.f57847h;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str4 = this.f57848i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d3 = this.f57849j;
        int hashCode7 = (hashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        BigDecimal bigDecimal = this.f57850k;
        int hashCode8 = (((hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + C7397t.m28148a(this.f57851l)) * 31;
        String str5 = this.f57852m;
        int hashCode9 = (((((((hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f57853n.hashCode()) * 31) + this.f57854o.hashCode()) * 31) + this.f57855p.hashCode()) * 31;
        Double d4 = this.f57856q;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f57857r;
        int hashCode11 = (((((hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31) + this.f57858s.hashCode()) * 31) + this.f57859t.hashCode()) * 31;
        String str6 = this.f57860u;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f57861v;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f57862w;
        int hashCode14 = (((hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.f57863x.hashCode()) * 31;
        String str9 = this.f57864y;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f57865z;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f57832A;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f57833B;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num = this.f57834C;
        int hashCode19 = (hashCode18 + (num == null ? 0 : num.hashCode())) * 31;
        String str13 = this.f57835D;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f57836E;
        int hashCode21 = (hashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f57837F;
        int hashCode22 = (hashCode21 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f57838G;
        int hashCode23 = (hashCode22 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str15 = this.f57839H;
        int hashCode24 = (hashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f57840I;
        if (str16 != null) {
            i = str16.hashCode();
        }
        return ((((hashCode24 + i) * 31) + this.f57841J.hashCode()) * 31) + this.f57842K.hashCode();
    }

    /* renamed from: i */
    public final long mo54049i() {
        return this.f57851l;
    }

    /* renamed from: j */
    public final String mo54050j() {
        return this.f57853n;
    }

    /* renamed from: k */
    public final BigDecimal mo54051k() {
        return this.f57837F;
    }

    /* renamed from: l */
    public final BigDecimal mo54052l() {
        return this.f57838G;
    }

    /* renamed from: m */
    public final String mo54053m() {
        return this.f57863x;
    }

    /* renamed from: p */
    public final boolean mo54054p() {
        return C40440x.m117135K(this.f57854o, "amex", true);
    }

    public String toString() {
        String str = this.f57843d;
        String str2 = this.f57844e;
        Double d = this.f57845f;
        String str3 = this.f57846g;
        Double d2 = this.f57847h;
        String str4 = this.f57848i;
        Double d3 = this.f57849j;
        BigDecimal bigDecimal = this.f57850k;
        long j = this.f57851l;
        String str5 = this.f57852m;
        String str6 = this.f57853n;
        String str7 = this.f57854o;
        BigDecimal bigDecimal2 = this.f57855p;
        Double d4 = this.f57856q;
        Double d5 = this.f57857r;
        String str8 = this.f57858s;
        String str9 = this.f57859t;
        String str10 = this.f57860u;
        String str11 = this.f57861v;
        String str12 = this.f57862w;
        String str13 = this.f57863x;
        String str14 = this.f57864y;
        String str15 = this.f57865z;
        String str16 = this.f57832A;
        String str17 = this.f57833B;
        Integer num = this.f57834C;
        String str18 = this.f57835D;
        String str19 = this.f57836E;
        BigDecimal bigDecimal3 = this.f57837F;
        BigDecimal bigDecimal4 = this.f57838G;
        String str20 = this.f57839H;
        String str21 = this.f57840I;
        String str22 = this.f57841J;
        String str23 = this.f57842K;
        return "CreditCardOfferDetailsUiModel(irr2Purchase=" + str + ", cardName=" + str2 + ", ratePurchase=" + d + ", periodUnit=" + str3 + ", overCancelRate=" + d2 + ", accessType=" + str4 + ", overdueSoftRate=" + d3 + ", withdrawalAmount=" + bigDecimal + ", decisionNo=" + j + ", newCardIconBase64=" + str5 + ", decisionScheme=" + str6 + ", cardClass=" + str7 + ", cardLimit=" + bigDecimal2 + ", irrWithdrawal=" + d4 + ", rateWithdrawal=" + d5 + ", cardType=" + str8 + ", cardCcy=" + str9 + ", overPenaltyRate=" + str10 + ", comisAmount=" + str11 + ", feeAmount=" + str12 + ", templCode=" + str13 + ", irrPurchase=" + str14 + ", overdueHardRate=" + str15 + ", irr2Withdrawal=" + str16 + ", operationType=" + str17 + ", periodLength=" + num + ", overdueHard=" + str18 + ", overdueSoft=" + str19 + ", disbursementAmount=" + bigDecimal3 + ", disbursementAmount2=" + bigDecimal4 + ", cardLast4=" + str20 + ", cardTypeDictionaryKey=" + str21 + ", offerDetailsText=" + str22 + ", offerMainText=" + str23 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f57843d);
        parcel.writeString(this.f57844e);
        Double d = this.f57845f;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f57846g);
        Double d2 = this.f57847h;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.f57848i);
        Double d3 = this.f57849j;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        parcel.writeSerializable(this.f57850k);
        parcel.writeLong(this.f57851l);
        parcel.writeString(this.f57852m);
        parcel.writeString(this.f57853n);
        parcel.writeString(this.f57854o);
        parcel.writeSerializable(this.f57855p);
        Double d4 = this.f57856q;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Double d5 = this.f57857r;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        parcel.writeString(this.f57858s);
        parcel.writeString(this.f57859t);
        parcel.writeString(this.f57860u);
        parcel.writeString(this.f57861v);
        parcel.writeString(this.f57862w);
        parcel.writeString(this.f57863x);
        parcel.writeString(this.f57864y);
        parcel.writeString(this.f57865z);
        parcel.writeString(this.f57832A);
        parcel.writeString(this.f57833B);
        Integer num = this.f57834C;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f57835D);
        parcel.writeString(this.f57836E);
        parcel.writeSerializable(this.f57837F);
        parcel.writeSerializable(this.f57838G);
        parcel.writeString(this.f57839H);
        parcel.writeString(this.f57840I);
        parcel.writeString(this.f57841J);
        parcel.writeString(this.f57842K);
    }
}
