package p658wk;

import kotlin.jvm.internal.C41536l;

/* renamed from: wk.c */
public final class C18604c {

    /* renamed from: a */
    private final String f52195a;

    /* renamed from: b */
    private final String f52196b;

    /* renamed from: c */
    private final String f52197c;

    /* renamed from: d */
    private final String f52198d;

    /* renamed from: e */
    private final String f52199e;

    /* renamed from: f */
    private final String f52200f;

    /* renamed from: g */
    private final String f52201g;

    /* renamed from: h */
    private final String f52202h;

    /* renamed from: i */
    private final String f52203i;

    /* renamed from: j */
    private final String f52204j;

    /* renamed from: k */
    private final String f52205k;

    /* renamed from: l */
    private final boolean f52206l;

    public C18604c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        C41536l.m120489i(str, "insuranceCompany");
        C41536l.m120489i(str2, "insuranceLimit");
        C41536l.m120489i(str3, "policyPrice");
        C41536l.m120489i(str4, "startDate");
        C41536l.m120489i(str5, "endDate");
        C41536l.m120489i(str6, "automobileNumber");
        C41536l.m120489i(str7, "mobileNumber");
        C41536l.m120489i(str8, "email");
        this.f52195a = str;
        this.f52196b = str2;
        this.f52197c = str3;
        this.f52198d = str4;
        this.f52199e = str5;
        this.f52200f = str6;
        this.f52201g = str7;
        this.f52202h = str8;
        this.f52203i = str9;
        this.f52204j = str10;
        this.f52205k = str11;
        this.f52206l = z;
    }

    /* renamed from: a */
    public final String mo46450a() {
        return this.f52200f;
    }

    /* renamed from: b */
    public final String mo46451b() {
        return this.f52205k;
    }

    /* renamed from: c */
    public final String mo46452c() {
        return this.f52202h;
    }

    /* renamed from: d */
    public final String mo46453d() {
        return this.f52199e;
    }

    /* renamed from: e */
    public final String mo46454e() {
        return this.f52203i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18604c)) {
            return false;
        }
        C18604c cVar = (C18604c) obj;
        return C41536l.m120484d(this.f52195a, cVar.f52195a) && C41536l.m120484d(this.f52196b, cVar.f52196b) && C41536l.m120484d(this.f52197c, cVar.f52197c) && C41536l.m120484d(this.f52198d, cVar.f52198d) && C41536l.m120484d(this.f52199e, cVar.f52199e) && C41536l.m120484d(this.f52200f, cVar.f52200f) && C41536l.m120484d(this.f52201g, cVar.f52201g) && C41536l.m120484d(this.f52202h, cVar.f52202h) && C41536l.m120484d(this.f52203i, cVar.f52203i) && C41536l.m120484d(this.f52204j, cVar.f52204j) && C41536l.m120484d(this.f52205k, cVar.f52205k) && this.f52206l == cVar.f52206l;
    }

    /* renamed from: f */
    public final String mo46456f() {
        return this.f52204j;
    }

    /* renamed from: g */
    public final String mo46457g() {
        return this.f52195a;
    }

    /* renamed from: h */
    public final String mo46458h() {
        return this.f52196b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f52195a.hashCode() * 31) + this.f52196b.hashCode()) * 31) + this.f52197c.hashCode()) * 31) + this.f52198d.hashCode()) * 31) + this.f52199e.hashCode()) * 31) + this.f52200f.hashCode()) * 31) + this.f52201g.hashCode()) * 31) + this.f52202h.hashCode()) * 31;
        String str = this.f52203i;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f52204j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f52205k;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f52206l;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo46460i() {
        return this.f52201g;
    }

    /* renamed from: j */
    public final String mo46461j() {
        return this.f52197c;
    }

    /* renamed from: k */
    public final String mo46462k() {
        return this.f52198d;
    }

    /* renamed from: l */
    public final boolean mo46463l() {
        return this.f52206l;
    }

    public String toString() {
        String str = this.f52195a;
        String str2 = this.f52196b;
        String str3 = this.f52197c;
        String str4 = this.f52198d;
        String str5 = this.f52199e;
        String str6 = this.f52200f;
        String str7 = this.f52201g;
        String str8 = this.f52202h;
        String str9 = this.f52203i;
        String str10 = this.f52204j;
        String str11 = this.f52205k;
        boolean z = this.f52206l;
        return "PolicyDetailsUiState(insuranceCompany=" + str + ", insuranceLimit=" + str2 + ", policyPrice=" + str3 + ", startDate=" + str4 + ", endDate=" + str5 + ", automobileNumber=" + str6 + ", mobileNumber=" + str7 + ", email=" + str8 + ", fullName=" + str9 + ", idNumber=" + str10 + ", dateOfBirth=" + str11 + ", isOwner=" + z + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C18604c(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r14
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r15
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r16
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r17
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r18
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r19
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r20
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r2 = r21
        L_0x0041:
            r9 = r0 & 256(0x100, float:3.59E-43)
            r10 = 0
            if (r9 == 0) goto L_0x0048
            r9 = r10
            goto L_0x004a
        L_0x0048:
            r9 = r22
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r10
            goto L_0x0052
        L_0x0050:
            r11 = r23
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r10 = r24
        L_0x0059:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005f
            r0 = 1
            goto L_0x0061
        L_0x005f:
            r0 = r25
        L_0x0061:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r2
            r23 = r9
            r24 = r11
            r25 = r10
            r26 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p658wk.C18604c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
