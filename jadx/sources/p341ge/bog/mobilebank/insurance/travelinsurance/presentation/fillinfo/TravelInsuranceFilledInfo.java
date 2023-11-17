package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo */
public final class TravelInsuranceFilledInfo implements Parcelable {
    public static final Parcelable.Creator<TravelInsuranceFilledInfo> CREATOR = new C24556a();

    /* renamed from: d */
    private final String f63313d;

    /* renamed from: e */
    private final String f63314e;

    /* renamed from: f */
    private final Long f63315f;

    /* renamed from: g */
    private final Long f63316g;

    /* renamed from: h */
    private final String f63317h;

    /* renamed from: i */
    private final String f63318i;

    /* renamed from: j */
    private final String f63319j;

    /* renamed from: k */
    private final String f63320k;

    /* renamed from: l */
    private final String f63321l;

    /* renamed from: m */
    private final String f63322m;

    /* renamed from: n */
    private final String f63323n;

    /* renamed from: o */
    private final String f63324o;

    /* renamed from: p */
    private final String f63325p;

    /* renamed from: q */
    private final String f63326q;

    /* renamed from: r */
    private final InsurancePersonType f63327r;

    /* renamed from: s */
    private final String f63328s;

    /* renamed from: t */
    private final String f63329t;

    /* renamed from: u */
    private final String f63330u;

    /* renamed from: v */
    private final String f63331v;

    /* renamed from: w */
    private final String f63332w;

    /* renamed from: x */
    private final String f63333x;

    /* renamed from: y */
    private final Long f63334y;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo$a */
    public static final class C24556a implements Parcelable.Creator {
        /* renamed from: a */
        public final TravelInsuranceFilledInfo createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            return new TravelInsuranceFilledInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), InsurancePersonType.CREATOR.createFromParcel(parcel2), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final TravelInsuranceFilledInfo[] newArray(int i) {
            return new TravelInsuranceFilledInfo[i];
        }
    }

    public TravelInsuranceFilledInfo(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InsurancePersonType insurancePersonType, String str13, String str14, String str15, String str16, String str17, String str18, Long l3) {
        InsurancePersonType insurancePersonType2 = insurancePersonType;
        String str19 = str13;
        C41536l.m120489i(str, "curr");
        C41536l.m120489i(insurancePersonType2, "person");
        C41536l.m120489i(str19, "personTitle");
        this.f63313d = str;
        this.f63314e = str2;
        this.f63315f = l;
        this.f63316g = l2;
        this.f63317h = str3;
        this.f63318i = str4;
        this.f63319j = str5;
        this.f63320k = str6;
        this.f63321l = str7;
        this.f63322m = str8;
        this.f63323n = str9;
        this.f63324o = str10;
        this.f63325p = str11;
        this.f63326q = str12;
        this.f63327r = insurancePersonType2;
        this.f63328s = str19;
        this.f63329t = str14;
        this.f63330u = str15;
        this.f63331v = str16;
        this.f63332w = str17;
        this.f63333x = str18;
        this.f63334y = l3;
    }

    /* renamed from: b */
    public static /* synthetic */ TravelInsuranceFilledInfo m78893b(TravelInsuranceFilledInfo travelInsuranceFilledInfo, String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InsurancePersonType insurancePersonType, String str13, String str14, String str15, String str16, String str17, String str18, Long l3, int i, Object obj) {
        TravelInsuranceFilledInfo travelInsuranceFilledInfo2 = travelInsuranceFilledInfo;
        int i2 = i;
        return travelInsuranceFilledInfo.mo62716a((i2 & 1) != 0 ? travelInsuranceFilledInfo2.f63313d : str, (i2 & 2) != 0 ? travelInsuranceFilledInfo2.f63314e : str2, (i2 & 4) != 0 ? travelInsuranceFilledInfo2.f63315f : l, (i2 & 8) != 0 ? travelInsuranceFilledInfo2.f63316g : l2, (i2 & 16) != 0 ? travelInsuranceFilledInfo2.f63317h : str3, (i2 & 32) != 0 ? travelInsuranceFilledInfo2.f63318i : str4, (i2 & 64) != 0 ? travelInsuranceFilledInfo2.f63319j : str5, (i2 & 128) != 0 ? travelInsuranceFilledInfo2.f63320k : str6, (i2 & C11398b.f33139r) != 0 ? travelInsuranceFilledInfo2.f63321l : str7, (i2 & C11398b.f33140s) != 0 ? travelInsuranceFilledInfo2.f63322m : str8, (i2 & C11398b.f33141t) != 0 ? travelInsuranceFilledInfo2.f63323n : str9, (i2 & C11398b.f33142u) != 0 ? travelInsuranceFilledInfo2.f63324o : str10, (i2 & C11398b.f33143v) != 0 ? travelInsuranceFilledInfo2.f63325p : str11, (i2 & 8192) != 0 ? travelInsuranceFilledInfo2.f63326q : str12, (i2 & 16384) != 0 ? travelInsuranceFilledInfo2.f63327r : insurancePersonType, (i2 & 32768) != 0 ? travelInsuranceFilledInfo2.f63328s : str13, (i2 & 65536) != 0 ? travelInsuranceFilledInfo2.f63329t : str14, (i2 & 131072) != 0 ? travelInsuranceFilledInfo2.f63330u : str15, (i2 & 262144) != 0 ? travelInsuranceFilledInfo2.f63331v : str16, (i2 & 524288) != 0 ? travelInsuranceFilledInfo2.f63332w : str17, (i2 & 1048576) != 0 ? travelInsuranceFilledInfo2.f63333x : str18, (i2 & 2097152) != 0 ? travelInsuranceFilledInfo2.f63334y : l3);
    }

    /* renamed from: A */
    public final Long mo62715A() {
        return this.f63315f;
    }

    /* renamed from: a */
    public final TravelInsuranceFilledInfo mo62716a(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, InsurancePersonType insurancePersonType, String str13, String str14, String str15, String str16, String str17, String str18, Long l3) {
        String str19 = str;
        C41536l.m120489i(str19, "curr");
        C41536l.m120489i(insurancePersonType, "person");
        C41536l.m120489i(str13, "personTitle");
        return new TravelInsuranceFilledInfo(str19, str2, l, l2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, insurancePersonType, str13, str14, str15, str16, str17, str18, l3);
    }

    /* renamed from: d */
    public final String mo62717d() {
        return this.f63319j;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo62719e() {
        return this.f63313d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelInsuranceFilledInfo)) {
            return false;
        }
        TravelInsuranceFilledInfo travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) obj;
        return C41536l.m120484d(this.f63313d, travelInsuranceFilledInfo.f63313d) && C41536l.m120484d(this.f63314e, travelInsuranceFilledInfo.f63314e) && C41536l.m120484d(this.f63315f, travelInsuranceFilledInfo.f63315f) && C41536l.m120484d(this.f63316g, travelInsuranceFilledInfo.f63316g) && C41536l.m120484d(this.f63317h, travelInsuranceFilledInfo.f63317h) && C41536l.m120484d(this.f63318i, travelInsuranceFilledInfo.f63318i) && C41536l.m120484d(this.f63319j, travelInsuranceFilledInfo.f63319j) && C41536l.m120484d(this.f63320k, travelInsuranceFilledInfo.f63320k) && C41536l.m120484d(this.f63321l, travelInsuranceFilledInfo.f63321l) && C41536l.m120484d(this.f63322m, travelInsuranceFilledInfo.f63322m) && C41536l.m120484d(this.f63323n, travelInsuranceFilledInfo.f63323n) && C41536l.m120484d(this.f63324o, travelInsuranceFilledInfo.f63324o) && C41536l.m120484d(this.f63325p, travelInsuranceFilledInfo.f63325p) && C41536l.m120484d(this.f63326q, travelInsuranceFilledInfo.f63326q) && this.f63327r == travelInsuranceFilledInfo.f63327r && C41536l.m120484d(this.f63328s, travelInsuranceFilledInfo.f63328s) && C41536l.m120484d(this.f63329t, travelInsuranceFilledInfo.f63329t) && C41536l.m120484d(this.f63330u, travelInsuranceFilledInfo.f63330u) && C41536l.m120484d(this.f63331v, travelInsuranceFilledInfo.f63331v) && C41536l.m120484d(this.f63332w, travelInsuranceFilledInfo.f63332w) && C41536l.m120484d(this.f63333x, travelInsuranceFilledInfo.f63333x) && C41536l.m120484d(this.f63334y, travelInsuranceFilledInfo.f63334y);
    }

    /* renamed from: f */
    public final String mo62721f() {
        return this.f63318i;
    }

    /* renamed from: g */
    public final Long mo62722g() {
        return this.f63316g;
    }

    /* renamed from: h */
    public final String mo62723h() {
        return this.f63325p;
    }

    public int hashCode() {
        int hashCode = this.f63313d.hashCode() * 31;
        String str = this.f63314e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f63315f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f63316g;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f63317h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f63318i;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f63319j;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f63320k;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f63321l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f63322m;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f63323n;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f63324o;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f63325p;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f63326q;
        int hashCode14 = (((((hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.f63327r.hashCode()) * 31) + this.f63328s.hashCode()) * 31;
        String str12 = this.f63329t;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f63330u;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f63331v;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f63332w;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f63333x;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Long l3 = this.f63334y;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode19 + i;
    }

    /* renamed from: i */
    public final Long mo62725i() {
        return this.f63334y;
    }

    /* renamed from: j */
    public final String mo62726j() {
        return this.f63329t;
    }

    /* renamed from: k */
    public final String mo62727k() {
        return this.f63331v;
    }

    /* renamed from: l */
    public final String mo62728l() {
        return this.f63330u;
    }

    /* renamed from: m */
    public final String mo62729m() {
        return this.f63332w;
    }

    /* renamed from: p */
    public final String mo62730p() {
        return this.f63333x;
    }

    /* renamed from: q */
    public final String mo62731q() {
        return this.f63314e;
    }

    /* renamed from: r */
    public final InsurancePersonType mo62732r() {
        return this.f63327r;
    }

    /* renamed from: s */
    public final String mo62733s() {
        return this.f63328s;
    }

    /* renamed from: t */
    public final String mo62734t() {
        return this.f63317h;
    }

    public String toString() {
        String str = this.f63313d;
        String str2 = this.f63314e;
        Long l = this.f63315f;
        Long l2 = this.f63316g;
        String str3 = this.f63317h;
        String str4 = this.f63318i;
        String str5 = this.f63319j;
        String str6 = this.f63320k;
        String str7 = this.f63321l;
        String str8 = this.f63322m;
        String str9 = this.f63323n;
        String str10 = this.f63324o;
        String str11 = this.f63325p;
        String str12 = this.f63326q;
        InsurancePersonType insurancePersonType = this.f63327r;
        String str13 = this.f63328s;
        String str14 = this.f63329t;
        String str15 = this.f63330u;
        String str16 = this.f63331v;
        String str17 = this.f63332w;
        String str18 = this.f63333x;
        Long l3 = this.f63334y;
        return "TravelInsuranceFilledInfo(curr=" + str + ", limit=" + str2 + ", startDate=" + l + ", endDate=" + l2 + ", phoneNumber=" + str3 + ", email=" + str4 + ", coverage=" + str5 + ", providerName=" + str6 + ", productId=" + str7 + ", providerId=" + str8 + ", premium=" + str9 + ", premiumCcy=" + str10 + ", hashKey=" + str11 + ", sessionKey=" + str12 + ", person=" + insurancePersonType + ", personTitle=" + str13 + ", insuredFirstName=" + str14 + ", insuredLastName=" + str15 + ", insuredFirstNameInt=" + str16 + ", insuredLastNameInt=" + str17 + ", insuredPin=" + str18 + ", insuredBirthDate=" + l3 + ")";
    }

    /* renamed from: u */
    public final String mo62736u() {
        return this.f63323n;
    }

    /* renamed from: v */
    public final String mo62737v() {
        return this.f63324o;
    }

    /* renamed from: w */
    public final String mo62738w() {
        return this.f63321l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f63313d);
        parcel.writeString(this.f63314e);
        Long l = this.f63315f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f63316g;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f63317h);
        parcel.writeString(this.f63318i);
        parcel.writeString(this.f63319j);
        parcel.writeString(this.f63320k);
        parcel.writeString(this.f63321l);
        parcel.writeString(this.f63322m);
        parcel.writeString(this.f63323n);
        parcel.writeString(this.f63324o);
        parcel.writeString(this.f63325p);
        parcel.writeString(this.f63326q);
        this.f63327r.writeToParcel(parcel, i);
        parcel.writeString(this.f63328s);
        parcel.writeString(this.f63329t);
        parcel.writeString(this.f63330u);
        parcel.writeString(this.f63331v);
        parcel.writeString(this.f63332w);
        parcel.writeString(this.f63333x);
        Long l3 = this.f63334y;
        if (l3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l3.longValue());
    }

    /* renamed from: x */
    public final String mo62740x() {
        return this.f63322m;
    }

    /* renamed from: y */
    public final String mo62741y() {
        return this.f63320k;
    }

    /* renamed from: z */
    public final String mo62742z() {
        return this.f63326q;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TravelInsuranceFilledInfo(java.lang.String r27, java.lang.String r28, java.lang.Long r29, java.lang.Long r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.Long r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r28
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r29
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r30
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r2
            goto L_0x0023
        L_0x0021:
            r8 = r31
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r32
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r33
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r34
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r12 = r2
            goto L_0x0043
        L_0x0041:
            r12 = r35
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r36
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r37
        L_0x0053:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0059
            r15 = r2
            goto L_0x005b
        L_0x0059:
            r15 = r38
        L_0x005b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0062
            r16 = r2
            goto L_0x0064
        L_0x0062:
            r16 = r39
        L_0x0064:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006b
            r17 = r2
            goto L_0x006d
        L_0x006b:
            r17 = r40
        L_0x006d:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0075
            r20 = r2
            goto L_0x0077
        L_0x0075:
            r20 = r43
        L_0x0077:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007f
            r21 = r2
            goto L_0x0081
        L_0x007f:
            r21 = r44
        L_0x0081:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0089
            r22 = r2
            goto L_0x008b
        L_0x0089:
            r22 = r45
        L_0x008b:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0093
            r23 = r2
            goto L_0x0095
        L_0x0093:
            r23 = r46
        L_0x0095:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009d
            r24 = r2
            goto L_0x009f
        L_0x009d:
            r24 = r47
        L_0x009f:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a7
            r25 = r2
            goto L_0x00a9
        L_0x00a7:
            r25 = r48
        L_0x00a9:
            r3 = r26
            r4 = r27
            r18 = r41
            r19 = r42
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
