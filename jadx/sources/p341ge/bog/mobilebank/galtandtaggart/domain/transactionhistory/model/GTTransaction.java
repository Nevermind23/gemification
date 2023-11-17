package p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction */
public final class GTTransaction implements Parcelable {
    public static final Parcelable.Creator<GTTransaction> CREATOR = new C23392a();

    /* renamed from: A */
    private final String f61157A;

    /* renamed from: B */
    private final Integer f61158B;

    /* renamed from: C */
    private final String f61159C;

    /* renamed from: D */
    private final String f61160D;

    /* renamed from: E */
    private final String f61161E;

    /* renamed from: F */
    private final String f61162F;

    /* renamed from: G */
    private final String f61163G;

    /* renamed from: H */
    private final String f61164H;

    /* renamed from: I */
    private final String f61165I;

    /* renamed from: J */
    private final String f61166J;

    /* renamed from: K */
    private final String f61167K;

    /* renamed from: L */
    private final String f61168L;

    /* renamed from: M */
    private final GTMergerRequisition f61169M;

    /* renamed from: N */
    private final GTDividend f61170N;

    /* renamed from: O */
    private final GTDividendTax f61171O;

    /* renamed from: P */
    private final GTInstrument f61172P;

    /* renamed from: Q */
    private final String f61173Q;

    /* renamed from: R */
    private final BigDecimal f61174R;

    /* renamed from: d */
    private final String f61175d;

    /* renamed from: e */
    private final String f61176e;

    /* renamed from: f */
    private final String f61177f;

    /* renamed from: g */
    private final String f61178g;

    /* renamed from: h */
    private final String f61179h;

    /* renamed from: i */
    private final String f61180i;

    /* renamed from: j */
    private final String f61181j;

    /* renamed from: k */
    private final String f61182k;

    /* renamed from: l */
    private final String f61183l;

    /* renamed from: m */
    private final String f61184m;

    /* renamed from: n */
    private final String f61185n;

    /* renamed from: o */
    private final String f61186o;

    /* renamed from: p */
    private final String f61187p;

    /* renamed from: q */
    private final String f61188q;

    /* renamed from: r */
    private final String f61189r;

    /* renamed from: s */
    private final String f61190s;

    /* renamed from: t */
    private final String f61191t;

    /* renamed from: u */
    private final String f61192u;

    /* renamed from: v */
    private final String f61193v;

    /* renamed from: w */
    private final String f61194w;

    /* renamed from: x */
    private final String f61195x;

    /* renamed from: y */
    private final String f61196y;

    /* renamed from: z */
    private final String f61197z;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction$a */
    public static final class C23392a implements Parcelable.Creator {
        /* renamed from: a */
        public final GTTransaction createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            GTInstrument gTInstrument = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            String readString31 = parcel.readString();
            String readString32 = parcel.readString();
            String readString33 = parcel.readString();
            String readString34 = parcel.readString();
            GTMergerRequisition createFromParcel = parcel.readInt() == 0 ? null : GTMergerRequisition.CREATOR.createFromParcel(parcel2);
            GTDividend createFromParcel2 = parcel.readInt() == 0 ? null : GTDividend.CREATOR.createFromParcel(parcel2);
            GTDividendTax createFromParcel3 = parcel.readInt() == 0 ? null : GTDividendTax.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() != 0) {
                gTInstrument = GTInstrument.CREATOR.createFromParcel(parcel2);
            }
            return new GTTransaction(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, valueOf, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, createFromParcel, createFromParcel2, createFromParcel3, gTInstrument, parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* renamed from: b */
        public final GTTransaction[] newArray(int i) {
            return new GTTransaction[i];
        }
    }

    public GTTransaction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, GTMergerRequisition gTMergerRequisition, GTDividend gTDividend, GTDividendTax gTDividendTax, GTInstrument gTInstrument, String str35, BigDecimal bigDecimal) {
        this.f61175d = str;
        this.f61176e = str2;
        this.f61177f = str3;
        this.f61178g = str4;
        this.f61179h = str5;
        this.f61180i = str6;
        this.f61181j = str7;
        this.f61182k = str8;
        this.f61183l = str9;
        this.f61184m = str10;
        this.f61185n = str11;
        this.f61186o = str12;
        this.f61187p = str13;
        this.f61188q = str14;
        this.f61189r = str15;
        this.f61190s = str16;
        this.f61191t = str17;
        this.f61192u = str18;
        this.f61193v = str19;
        this.f61194w = str20;
        this.f61195x = str21;
        this.f61196y = str22;
        this.f61197z = str23;
        this.f61157A = str24;
        this.f61158B = num;
        this.f61159C = str25;
        this.f61160D = str26;
        this.f61161E = str27;
        this.f61162F = str28;
        this.f61163G = str29;
        this.f61164H = str30;
        this.f61165I = str31;
        this.f61166J = str32;
        this.f61167K = str33;
        this.f61168L = str34;
        this.f61169M = gTMergerRequisition;
        this.f61170N = gTDividend;
        this.f61171O = gTDividendTax;
        this.f61172P = gTInstrument;
        this.f61173Q = str35;
        this.f61174R = bigDecimal;
    }

    /* renamed from: b */
    public static /* synthetic */ GTTransaction m75720b(GTTransaction gTTransaction, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, GTMergerRequisition gTMergerRequisition, GTDividend gTDividend, GTDividendTax gTDividendTax, GTInstrument gTInstrument, String str35, BigDecimal bigDecimal, int i, int i2, Object obj) {
        GTTransaction gTTransaction2 = gTTransaction;
        int i3 = i;
        int i4 = i2;
        return gTTransaction.mo60154a((i3 & 1) != 0 ? gTTransaction2.f61175d : str, (i3 & 2) != 0 ? gTTransaction2.f61176e : str2, (i3 & 4) != 0 ? gTTransaction2.f61177f : str3, (i3 & 8) != 0 ? gTTransaction2.f61178g : str4, (i3 & 16) != 0 ? gTTransaction2.f61179h : str5, (i3 & 32) != 0 ? gTTransaction2.f61180i : str6, (i3 & 64) != 0 ? gTTransaction2.f61181j : str7, (i3 & 128) != 0 ? gTTransaction2.f61182k : str8, (i3 & C11398b.f33139r) != 0 ? gTTransaction2.f61183l : str9, (i3 & C11398b.f33140s) != 0 ? gTTransaction2.f61184m : str10, (i3 & C11398b.f33141t) != 0 ? gTTransaction2.f61185n : str11, (i3 & C11398b.f33142u) != 0 ? gTTransaction2.f61186o : str12, (i3 & C11398b.f33143v) != 0 ? gTTransaction2.f61187p : str13, (i3 & 8192) != 0 ? gTTransaction2.f61188q : str14, (i3 & 16384) != 0 ? gTTransaction2.f61189r : str15, (i3 & 32768) != 0 ? gTTransaction2.f61190s : str16, (i3 & 65536) != 0 ? gTTransaction2.f61191t : str17, (i3 & 131072) != 0 ? gTTransaction2.f61192u : str18, (i3 & 262144) != 0 ? gTTransaction2.f61193v : str19, (i3 & 524288) != 0 ? gTTransaction2.f61194w : str20, (i3 & 1048576) != 0 ? gTTransaction2.f61195x : str21, (i3 & 2097152) != 0 ? gTTransaction2.f61196y : str22, (i3 & 4194304) != 0 ? gTTransaction2.f61197z : str23, (i3 & 8388608) != 0 ? gTTransaction2.f61157A : str24, (i3 & 16777216) != 0 ? gTTransaction2.f61158B : num, (i3 & 33554432) != 0 ? gTTransaction2.f61159C : str25, (i3 & 67108864) != 0 ? gTTransaction2.f61160D : str26, (i3 & 134217728) != 0 ? gTTransaction2.f61161E : str27, (i3 & 268435456) != 0 ? gTTransaction2.f61162F : str28, (i3 & 536870912) != 0 ? gTTransaction2.f61163G : str29, (i3 & 1073741824) != 0 ? gTTransaction2.f61164H : str30, (i3 & Integer.MIN_VALUE) != 0 ? gTTransaction2.f61165I : str31, (i4 & 1) != 0 ? gTTransaction2.f61166J : str32, (i4 & 2) != 0 ? gTTransaction2.f61167K : str33, (i4 & 4) != 0 ? gTTransaction2.f61168L : str34, (i4 & 8) != 0 ? gTTransaction2.f61169M : gTMergerRequisition, (i4 & 16) != 0 ? gTTransaction2.f61170N : gTDividend, (i4 & 32) != 0 ? gTTransaction2.f61171O : gTDividendTax, (i4 & 64) != 0 ? gTTransaction2.f61172P : gTInstrument, (i4 & 128) != 0 ? gTTransaction2.f61173Q : str35, (i4 & C11398b.f33139r) != 0 ? gTTransaction2.f61174R : bigDecimal);
    }

    /* renamed from: A */
    public final String mo60150A() {
        return this.f61168L;
    }

    /* renamed from: B */
    public final String mo60151B() {
        return this.f61189r;
    }

    /* renamed from: C */
    public final String mo60152C() {
        return this.f61192u;
    }

    /* renamed from: D */
    public final String mo60153D() {
        return this.f61194w;
    }

    /* renamed from: a */
    public final GTTransaction mo60154a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, Integer num, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, GTMergerRequisition gTMergerRequisition, GTDividend gTDividend, GTDividendTax gTDividendTax, GTInstrument gTInstrument, String str35, BigDecimal bigDecimal) {
        return new GTTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, num, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, gTMergerRequisition, gTDividend, gTDividendTax, gTInstrument, str35, bigDecimal);
    }

    /* renamed from: d */
    public final String mo60155d() {
        return this.f61176e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BigDecimal mo60157e() {
        return this.f61174R;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTTransaction)) {
            return false;
        }
        GTTransaction gTTransaction = (GTTransaction) obj;
        return C41536l.m120484d(this.f61175d, gTTransaction.f61175d) && C41536l.m120484d(this.f61176e, gTTransaction.f61176e) && C41536l.m120484d(this.f61177f, gTTransaction.f61177f) && C41536l.m120484d(this.f61178g, gTTransaction.f61178g) && C41536l.m120484d(this.f61179h, gTTransaction.f61179h) && C41536l.m120484d(this.f61180i, gTTransaction.f61180i) && C41536l.m120484d(this.f61181j, gTTransaction.f61181j) && C41536l.m120484d(this.f61182k, gTTransaction.f61182k) && C41536l.m120484d(this.f61183l, gTTransaction.f61183l) && C41536l.m120484d(this.f61184m, gTTransaction.f61184m) && C41536l.m120484d(this.f61185n, gTTransaction.f61185n) && C41536l.m120484d(this.f61186o, gTTransaction.f61186o) && C41536l.m120484d(this.f61187p, gTTransaction.f61187p) && C41536l.m120484d(this.f61188q, gTTransaction.f61188q) && C41536l.m120484d(this.f61189r, gTTransaction.f61189r) && C41536l.m120484d(this.f61190s, gTTransaction.f61190s) && C41536l.m120484d(this.f61191t, gTTransaction.f61191t) && C41536l.m120484d(this.f61192u, gTTransaction.f61192u) && C41536l.m120484d(this.f61193v, gTTransaction.f61193v) && C41536l.m120484d(this.f61194w, gTTransaction.f61194w) && C41536l.m120484d(this.f61195x, gTTransaction.f61195x) && C41536l.m120484d(this.f61196y, gTTransaction.f61196y) && C41536l.m120484d(this.f61197z, gTTransaction.f61197z) && C41536l.m120484d(this.f61157A, gTTransaction.f61157A) && C41536l.m120484d(this.f61158B, gTTransaction.f61158B) && C41536l.m120484d(this.f61159C, gTTransaction.f61159C) && C41536l.m120484d(this.f61160D, gTTransaction.f61160D) && C41536l.m120484d(this.f61161E, gTTransaction.f61161E) && C41536l.m120484d(this.f61162F, gTTransaction.f61162F) && C41536l.m120484d(this.f61163G, gTTransaction.f61163G) && C41536l.m120484d(this.f61164H, gTTransaction.f61164H) && C41536l.m120484d(this.f61165I, gTTransaction.f61165I) && C41536l.m120484d(this.f61166J, gTTransaction.f61166J) && C41536l.m120484d(this.f61167K, gTTransaction.f61167K) && C41536l.m120484d(this.f61168L, gTTransaction.f61168L) && C41536l.m120484d(this.f61169M, gTTransaction.f61169M) && C41536l.m120484d(this.f61170N, gTTransaction.f61170N) && C41536l.m120484d(this.f61171O, gTTransaction.f61171O) && C41536l.m120484d(this.f61172P, gTTransaction.f61172P) && C41536l.m120484d(this.f61173Q, gTTransaction.f61173Q) && C41536l.m120484d(this.f61174R, gTTransaction.f61174R);
    }

    /* renamed from: f */
    public final String mo60159f() {
        return this.f61178g;
    }

    /* renamed from: g */
    public final String mo60160g() {
        return this.f61166J;
    }

    /* renamed from: h */
    public final GTDividend mo60161h() {
        return this.f61170N;
    }

    public int hashCode() {
        String str = this.f61175d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61176e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61177f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61178g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f61179h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f61180i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f61181j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f61182k;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f61183l;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f61184m;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f61185n;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f61186o;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f61187p;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f61188q;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f61189r;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f61190s;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f61191t;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f61192u;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f61193v;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f61194w;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f61195x;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f61196y;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f61197z;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f61157A;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Integer num = this.f61158B;
        int hashCode25 = (hashCode24 + (num == null ? 0 : num.hashCode())) * 31;
        String str25 = this.f61159C;
        int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f61160D;
        int hashCode27 = (hashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.f61161E;
        int hashCode28 = (hashCode27 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.f61162F;
        int hashCode29 = (hashCode28 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.f61163G;
        int hashCode30 = (hashCode29 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.f61164H;
        int hashCode31 = (hashCode30 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.f61165I;
        int hashCode32 = (hashCode31 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.f61166J;
        int hashCode33 = (hashCode32 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.f61167K;
        int hashCode34 = (hashCode33 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.f61168L;
        int hashCode35 = (hashCode34 + (str34 == null ? 0 : str34.hashCode())) * 31;
        GTMergerRequisition gTMergerRequisition = this.f61169M;
        int hashCode36 = (hashCode35 + (gTMergerRequisition == null ? 0 : gTMergerRequisition.hashCode())) * 31;
        GTDividend gTDividend = this.f61170N;
        int hashCode37 = (hashCode36 + (gTDividend == null ? 0 : gTDividend.hashCode())) * 31;
        GTDividendTax gTDividendTax = this.f61171O;
        int hashCode38 = (hashCode37 + (gTDividendTax == null ? 0 : gTDividendTax.hashCode())) * 31;
        GTInstrument gTInstrument = this.f61172P;
        int hashCode39 = (hashCode38 + (gTInstrument == null ? 0 : gTInstrument.hashCode())) * 31;
        String str35 = this.f61173Q;
        int hashCode40 = (hashCode39 + (str35 == null ? 0 : str35.hashCode())) * 31;
        BigDecimal bigDecimal = this.f61174R;
        if (bigDecimal != null) {
            i = bigDecimal.hashCode();
        }
        return hashCode40 + i;
    }

    /* renamed from: i */
    public final GTDividendTax mo60163i() {
        return this.f61171O;
    }

    /* renamed from: j */
    public final String mo60164j() {
        return this.f61173Q;
    }

    /* renamed from: k */
    public final String mo60165k() {
        return this.f61185n;
    }

    /* renamed from: l */
    public final String mo60166l() {
        return this.f61182k;
    }

    /* renamed from: m */
    public final String mo60167m() {
        return this.f61184m;
    }

    /* renamed from: p */
    public final String mo60168p() {
        return this.f61187p;
    }

    /* renamed from: q */
    public final String mo60169q() {
        return this.f61186o;
    }

    /* renamed from: r */
    public final String mo60170r() {
        return this.f61181j;
    }

    /* renamed from: s */
    public final String mo60171s() {
        return this.f61180i;
    }

    /* renamed from: t */
    public final GTInstrument mo60172t() {
        return this.f61172P;
    }

    public String toString() {
        String str = this.f61175d;
        String str2 = this.f61176e;
        String str3 = this.f61177f;
        String str4 = this.f61178g;
        String str5 = this.f61179h;
        String str6 = this.f61180i;
        String str7 = this.f61181j;
        String str8 = this.f61182k;
        String str9 = this.f61183l;
        String str10 = this.f61184m;
        String str11 = this.f61185n;
        String str12 = this.f61186o;
        String str13 = this.f61187p;
        String str14 = this.f61188q;
        String str15 = this.f61189r;
        String str16 = this.f61190s;
        String str17 = this.f61191t;
        String str18 = this.f61192u;
        String str19 = this.f61193v;
        String str20 = this.f61194w;
        String str21 = this.f61195x;
        String str22 = this.f61196y;
        String str23 = this.f61197z;
        String str24 = this.f61157A;
        Integer num = this.f61158B;
        String str25 = this.f61159C;
        String str26 = this.f61160D;
        String str27 = this.f61161E;
        String str28 = this.f61162F;
        String str29 = this.f61163G;
        String str30 = this.f61164H;
        String str31 = this.f61165I;
        String str32 = this.f61166J;
        String str33 = this.f61167K;
        String str34 = this.f61168L;
        GTMergerRequisition gTMergerRequisition = this.f61169M;
        GTDividend gTDividend = this.f61170N;
        GTDividendTax gTDividendTax = this.f61171O;
        GTInstrument gTInstrument = this.f61172P;
        String str35 = this.f61173Q;
        BigDecimal bigDecimal = this.f61174R;
        return "GTTransaction(accountAmount=" + str + ", accountBalance=" + str2 + ", accountType=" + str3 + ", comment=" + str4 + ", dnb=" + str5 + ", fintTranID=" + str6 + ", finTranTypeID=" + str7 + ", feeSec=" + str8 + ", feeTaf=" + str9 + ", feeXtraShares=" + str10 + ", feeExchange=" + str11 + ", fillQty=" + str12 + ", fillPx=" + str13 + ", orderID=" + str14 + ", positionDelta=" + str15 + ", sendCommissionToInterliclear=" + str16 + ", systemAmount=" + str17 + ", tranAmount=" + str18 + ", tranSource=" + str19 + ", tranWhen=" + str20 + ", wlpAmount=" + str21 + ", orderNo=" + str22 + ", wplFintranTypeID=" + str23 + ", execType=" + str24 + ", ordStatus=" + num + ", ordType=" + str25 + ", ordRejReason=" + str26 + ", ordRejCode=" + str27 + ", ordRejDctKey=" + str28 + ", side=" + str29 + ", lasShares=" + str30 + ", lastPx=" + str31 + ", cumQty=" + str32 + ", leavesQty=" + str33 + ", orderQty=" + str34 + ", mergerAcquisition=" + gTMergerRequisition + ", dividend=" + gTDividend + ", dividendTax=" + gTDividendTax + ", instrument=" + gTInstrument + ", feeBase=" + str35 + ", amountCash=" + bigDecimal + ")";
    }

    /* renamed from: u */
    public final String mo60174u() {
        return this.f61167K;
    }

    /* renamed from: v */
    public final GTMergerRequisition mo60175v() {
        return this.f61169M;
    }

    /* renamed from: w */
    public final String mo60176w() {
        return this.f61162F;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f61175d);
        parcel.writeString(this.f61176e);
        parcel.writeString(this.f61177f);
        parcel.writeString(this.f61178g);
        parcel.writeString(this.f61179h);
        parcel.writeString(this.f61180i);
        parcel.writeString(this.f61181j);
        parcel.writeString(this.f61182k);
        parcel.writeString(this.f61183l);
        parcel.writeString(this.f61184m);
        parcel.writeString(this.f61185n);
        parcel.writeString(this.f61186o);
        parcel.writeString(this.f61187p);
        parcel.writeString(this.f61188q);
        parcel.writeString(this.f61189r);
        parcel.writeString(this.f61190s);
        parcel.writeString(this.f61191t);
        parcel.writeString(this.f61192u);
        parcel.writeString(this.f61193v);
        parcel.writeString(this.f61194w);
        parcel.writeString(this.f61195x);
        parcel.writeString(this.f61196y);
        parcel.writeString(this.f61197z);
        parcel.writeString(this.f61157A);
        Integer num = this.f61158B;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.f61159C);
        parcel.writeString(this.f61160D);
        parcel.writeString(this.f61161E);
        parcel.writeString(this.f61162F);
        parcel.writeString(this.f61163G);
        parcel.writeString(this.f61164H);
        parcel.writeString(this.f61165I);
        parcel.writeString(this.f61166J);
        parcel.writeString(this.f61167K);
        parcel.writeString(this.f61168L);
        GTMergerRequisition gTMergerRequisition = this.f61169M;
        if (gTMergerRequisition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gTMergerRequisition.writeToParcel(parcel, i);
        }
        GTDividend gTDividend = this.f61170N;
        if (gTDividend == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gTDividend.writeToParcel(parcel, i);
        }
        GTDividendTax gTDividendTax = this.f61171O;
        if (gTDividendTax == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gTDividendTax.writeToParcel(parcel, i);
        }
        GTInstrument gTInstrument = this.f61172P;
        if (gTInstrument == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gTInstrument.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f61173Q);
        parcel.writeSerializable(this.f61174R);
    }

    /* renamed from: x */
    public final Integer mo60178x() {
        return this.f61158B;
    }

    /* renamed from: y */
    public final String mo60179y() {
        return this.f61188q;
    }

    /* renamed from: z */
    public final String mo60180z() {
        return this.f61196y;
    }
}
