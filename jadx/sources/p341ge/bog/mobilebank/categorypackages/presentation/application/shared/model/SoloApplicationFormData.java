package p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData */
public final class SoloApplicationFormData implements Parcelable {
    public static final Parcelable.Creator<SoloApplicationFormData> CREATOR = new C14568a();

    /* renamed from: d */
    private final String f42448d;

    /* renamed from: e */
    private final String f42449e;

    /* renamed from: f */
    private final String f42450f;

    /* renamed from: g */
    private final String f42451g;

    /* renamed from: h */
    private final Integer f42452h;

    /* renamed from: i */
    private final int f42453i;

    /* renamed from: j */
    private final Long f42454j;

    /* renamed from: k */
    private final String f42455k;

    /* renamed from: l */
    private String f42456l;

    /* renamed from: m */
    private String f42457m;

    /* renamed from: n */
    private String f42458n;

    /* renamed from: o */
    private String f42459o;

    /* renamed from: p */
    private String f42460p;

    /* renamed from: q */
    private String f42461q;

    /* renamed from: r */
    private String f42462r;

    /* renamed from: s */
    private String f42463s;

    /* renamed from: t */
    private String f42464t;

    /* renamed from: u */
    private String f42465u;

    /* renamed from: v */
    private String f42466v;

    /* renamed from: w */
    private String f42467w;

    /* renamed from: x */
    private String f42468x;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData$a */
    public static final class C14568a implements Parcelable.Creator {
        /* renamed from: a */
        public final SoloApplicationFormData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SoloApplicationFormData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final SoloApplicationFormData[] newArray(int i) {
            return new SoloApplicationFormData[i];
        }
    }

    public SoloApplicationFormData(String str, String str2, String str3, String str4, Integer num, int i, Long l, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        String str19 = str;
        String str20 = str2;
        String str21 = str3;
        String str22 = str4;
        String str23 = str5;
        String str24 = str6;
        String str25 = str9;
        String str26 = str10;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        String str30 = str14;
        String str31 = str15;
        String str32 = str16;
        C41536l.m120489i(str19, "activePackageName");
        C41536l.m120489i(str20, "newPackageName");
        C41536l.m120489i(str21, "activePackageDesc");
        C41536l.m120489i(str22, "newPackageDesc");
        C41536l.m120489i(str23, "packageGroup");
        C41536l.m120489i(str24, "fee");
        C41536l.m120489i(str25, "employer");
        C41536l.m120489i(str26, "mobilePhone");
        C41536l.m120489i(str27, "email");
        C41536l.m120489i(str28, "commissionPaymentPeriod");
        C41536l.m120489i(str29, "feePeriod");
        C41536l.m120489i(str30, "serviceCenterKey");
        C41536l.m120489i(str31, "serviceCenterDesc");
        C41536l.m120489i(str32, "incomeAmount");
        C41536l.m120489i(str17, "depositAmount");
        String str33 = str18;
        C41536l.m120489i(str33, "loanAmount");
        this.f42448d = str19;
        this.f42449e = str20;
        this.f42450f = str21;
        this.f42451g = str22;
        this.f42452h = num;
        this.f42453i = i;
        this.f42454j = l;
        this.f42455k = str23;
        this.f42456l = str24;
        this.f42457m = str7;
        this.f42458n = str8;
        this.f42459o = str25;
        this.f42460p = str26;
        this.f42461q = str27;
        this.f42462r = str28;
        this.f42463s = str29;
        this.f42464t = str30;
        this.f42465u = str31;
        this.f42466v = str32;
        this.f42467w = str17;
        this.f42468x = str33;
    }

    /* renamed from: A */
    public final void mo40904A(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42461q = str;
    }

    /* renamed from: B */
    public final void mo40905B(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42459o = str;
    }

    /* renamed from: C */
    public final void mo40906C(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42456l = str;
    }

    /* renamed from: D */
    public final void mo40907D(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42463s = str;
    }

    /* renamed from: E */
    public final void mo40908E(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42466v = str;
    }

    /* renamed from: F */
    public final void mo40909F(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42468x = str;
    }

    /* renamed from: G */
    public final void mo40910G(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42460p = str;
    }

    /* renamed from: H */
    public final void mo40911H(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42465u = str;
    }

    /* renamed from: I */
    public final void mo40912I(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42464t = str;
    }

    /* renamed from: a */
    public final String mo40913a() {
        return this.f42450f;
    }

    /* renamed from: b */
    public final Long mo40914b() {
        return this.f42454j;
    }

    /* renamed from: d */
    public final String mo40915d() {
        return this.f42457m;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo40917e() {
        return this.f42458n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoloApplicationFormData)) {
            return false;
        }
        SoloApplicationFormData soloApplicationFormData = (SoloApplicationFormData) obj;
        return C41536l.m120484d(this.f42448d, soloApplicationFormData.f42448d) && C41536l.m120484d(this.f42449e, soloApplicationFormData.f42449e) && C41536l.m120484d(this.f42450f, soloApplicationFormData.f42450f) && C41536l.m120484d(this.f42451g, soloApplicationFormData.f42451g) && C41536l.m120484d(this.f42452h, soloApplicationFormData.f42452h) && this.f42453i == soloApplicationFormData.f42453i && C41536l.m120484d(this.f42454j, soloApplicationFormData.f42454j) && C41536l.m120484d(this.f42455k, soloApplicationFormData.f42455k) && C41536l.m120484d(this.f42456l, soloApplicationFormData.f42456l) && C41536l.m120484d(this.f42457m, soloApplicationFormData.f42457m) && C41536l.m120484d(this.f42458n, soloApplicationFormData.f42458n) && C41536l.m120484d(this.f42459o, soloApplicationFormData.f42459o) && C41536l.m120484d(this.f42460p, soloApplicationFormData.f42460p) && C41536l.m120484d(this.f42461q, soloApplicationFormData.f42461q) && C41536l.m120484d(this.f42462r, soloApplicationFormData.f42462r) && C41536l.m120484d(this.f42463s, soloApplicationFormData.f42463s) && C41536l.m120484d(this.f42464t, soloApplicationFormData.f42464t) && C41536l.m120484d(this.f42465u, soloApplicationFormData.f42465u) && C41536l.m120484d(this.f42466v, soloApplicationFormData.f42466v) && C41536l.m120484d(this.f42467w, soloApplicationFormData.f42467w) && C41536l.m120484d(this.f42468x, soloApplicationFormData.f42468x);
    }

    /* renamed from: f */
    public final String mo40919f() {
        return this.f42448d;
    }

    /* renamed from: g */
    public final Integer mo40920g() {
        return this.f42452h;
    }

    /* renamed from: h */
    public final String mo40921h() {
        return this.f42462r;
    }

    public int hashCode() {
        int hashCode = ((((((this.f42448d.hashCode() * 31) + this.f42449e.hashCode()) * 31) + this.f42450f.hashCode()) * 31) + this.f42451g.hashCode()) * 31;
        Integer num = this.f42452h;
        int i = 0;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f42453i) * 31;
        Long l = this.f42454j;
        int hashCode3 = (((((hashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.f42455k.hashCode()) * 31) + this.f42456l.hashCode()) * 31;
        String str = this.f42457m;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42458n;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((((((((((((((hashCode4 + i) * 31) + this.f42459o.hashCode()) * 31) + this.f42460p.hashCode()) * 31) + this.f42461q.hashCode()) * 31) + this.f42462r.hashCode()) * 31) + this.f42463s.hashCode()) * 31) + this.f42464t.hashCode()) * 31) + this.f42465u.hashCode()) * 31) + this.f42466v.hashCode()) * 31) + this.f42467w.hashCode()) * 31) + this.f42468x.hashCode();
    }

    /* renamed from: i */
    public final String mo40923i() {
        return this.f42467w;
    }

    /* renamed from: j */
    public final String mo40924j() {
        return this.f42461q;
    }

    /* renamed from: k */
    public final String mo40925k() {
        return this.f42459o;
    }

    /* renamed from: l */
    public final String mo40926l() {
        return this.f42456l;
    }

    /* renamed from: m */
    public final String mo40927m() {
        return this.f42463s;
    }

    /* renamed from: p */
    public final String mo40928p() {
        return this.f42466v;
    }

    /* renamed from: q */
    public final String mo40929q() {
        return this.f42468x;
    }

    /* renamed from: r */
    public final String mo40930r() {
        return this.f42460p;
    }

    /* renamed from: s */
    public final String mo40931s() {
        return this.f42451g;
    }

    /* renamed from: t */
    public final String mo40932t() {
        return this.f42449e;
    }

    public String toString() {
        String str = this.f42448d;
        String str2 = this.f42449e;
        String str3 = this.f42450f;
        String str4 = this.f42451g;
        Integer num = this.f42452h;
        int i = this.f42453i;
        Long l = this.f42454j;
        String str5 = this.f42455k;
        String str6 = this.f42456l;
        String str7 = this.f42457m;
        String str8 = this.f42458n;
        String str9 = this.f42459o;
        String str10 = this.f42460p;
        String str11 = this.f42461q;
        String str12 = this.f42462r;
        String str13 = this.f42463s;
        String str14 = this.f42464t;
        String str15 = this.f42465u;
        String str16 = this.f42466v;
        String str17 = this.f42467w;
        String str18 = this.f42468x;
        return "SoloApplicationFormData(activePackageName=" + str + ", newPackageName=" + str2 + ", activePackageDesc=" + str3 + ", newPackageDesc=" + str4 + ", activePackagePriority=" + num + ", newPackagePriority=" + i + ", activePackageEndDate=" + l + ", packageGroup=" + str5 + ", fee=" + str6 + ", activePackageFee=" + str7 + ", activePackageFeePeriod=" + str8 + ", employer=" + str9 + ", mobilePhone=" + str10 + ", email=" + str11 + ", commissionPaymentPeriod=" + str12 + ", feePeriod=" + str13 + ", serviceCenterKey=" + str14 + ", serviceCenterDesc=" + str15 + ", incomeAmount=" + str16 + ", depositAmount=" + str17 + ", loanAmount=" + str18 + ")";
    }

    /* renamed from: u */
    public final int mo40934u() {
        return this.f42453i;
    }

    /* renamed from: v */
    public final String mo40935v() {
        return this.f42455k;
    }

    /* renamed from: w */
    public final String mo40936w() {
        return this.f42465u;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f42448d);
        parcel.writeString(this.f42449e);
        parcel.writeString(this.f42450f);
        parcel.writeString(this.f42451g);
        Integer num = this.f42452h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f42453i);
        Long l = this.f42454j;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f42455k);
        parcel.writeString(this.f42456l);
        parcel.writeString(this.f42457m);
        parcel.writeString(this.f42458n);
        parcel.writeString(this.f42459o);
        parcel.writeString(this.f42460p);
        parcel.writeString(this.f42461q);
        parcel.writeString(this.f42462r);
        parcel.writeString(this.f42463s);
        parcel.writeString(this.f42464t);
        parcel.writeString(this.f42465u);
        parcel.writeString(this.f42466v);
        parcel.writeString(this.f42467w);
        parcel.writeString(this.f42468x);
    }

    /* renamed from: x */
    public final String mo40938x() {
        return this.f42464t;
    }

    /* renamed from: y */
    public final void mo40939y(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42462r = str;
    }

    /* renamed from: z */
    public final void mo40940z(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f42467w = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SoloApplicationFormData(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.Integer r30, int r31, java.lang.Long r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r25 = this;
            r0 = r47
            r1 = r0 & 2048(0x800, float:2.87E-42)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r15 = r2
            goto L_0x000c
        L_0x000a:
            r15 = r37
        L_0x000c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0013
            r16 = r2
            goto L_0x0015
        L_0x0013:
            r16 = r38
        L_0x0015:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x001c
            r17 = r2
            goto L_0x001e
        L_0x001c:
            r17 = r39
        L_0x001e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0025
            r18 = r2
            goto L_0x0027
        L_0x0025:
            r18 = r40
        L_0x0027:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0030
            r19 = r2
            goto L_0x0032
        L_0x0030:
            r19 = r41
        L_0x0032:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x003a
            r20 = r2
            goto L_0x003c
        L_0x003a:
            r20 = r42
        L_0x003c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0044
            r21 = r2
            goto L_0x0046
        L_0x0044:
            r21 = r43
        L_0x0046:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004e
            r22 = r2
            goto L_0x0050
        L_0x004e:
            r22 = r44
        L_0x0050:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0058
            r23 = r2
            goto L_0x005a
        L_0x0058:
            r23 = r45
        L_0x005a:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0062
            r24 = r2
            goto L_0x0064
        L_0x0062:
            r24 = r46
        L_0x0064:
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
