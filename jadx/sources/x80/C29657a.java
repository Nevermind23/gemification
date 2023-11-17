package x80;

import kotlin.jvm.internal.C41536l;

/* renamed from: x80.a */
public final class C29657a {

    /* renamed from: a */
    private final String f74828a;

    /* renamed from: b */
    private final String f74829b;

    /* renamed from: c */
    private final String f74830c;

    /* renamed from: d */
    private final String f74831d;

    /* renamed from: e */
    private final String f74832e;

    /* renamed from: f */
    private final String f74833f;

    /* renamed from: g */
    private final String f74834g;

    /* renamed from: h */
    private final String f74835h;

    /* renamed from: i */
    private final String f74836i;

    /* renamed from: j */
    private final String f74837j;

    public C29657a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f74828a = str;
        this.f74829b = str2;
        this.f74830c = str3;
        this.f74831d = str4;
        this.f74832e = str5;
        this.f74833f = str6;
        this.f74834g = str7;
        this.f74835h = str8;
        this.f74836i = str9;
        this.f74837j = str10;
    }

    /* renamed from: a */
    public final String mo69575a() {
        return this.f74830c;
    }

    /* renamed from: b */
    public final String mo69576b() {
        return this.f74836i;
    }

    /* renamed from: c */
    public final String mo69577c() {
        return this.f74831d;
    }

    /* renamed from: d */
    public final String mo69578d() {
        return this.f74828a;
    }

    /* renamed from: e */
    public final String mo69579e() {
        return this.f74832e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29657a)) {
            return false;
        }
        C29657a aVar = (C29657a) obj;
        return C41536l.m120484d(this.f74828a, aVar.f74828a) && C41536l.m120484d(this.f74829b, aVar.f74829b) && C41536l.m120484d(this.f74830c, aVar.f74830c) && C41536l.m120484d(this.f74831d, aVar.f74831d) && C41536l.m120484d(this.f74832e, aVar.f74832e) && C41536l.m120484d(this.f74833f, aVar.f74833f) && C41536l.m120484d(this.f74834g, aVar.f74834g) && C41536l.m120484d(this.f74835h, aVar.f74835h) && C41536l.m120484d(this.f74836i, aVar.f74836i) && C41536l.m120484d(this.f74837j, aVar.f74837j);
    }

    /* renamed from: f */
    public final String mo69581f() {
        return this.f74834g;
    }

    /* renamed from: g */
    public final String mo69582g() {
        return this.f74833f;
    }

    /* renamed from: h */
    public final String mo69583h() {
        return this.f74835h;
    }

    public int hashCode() {
        String str = this.f74828a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f74829b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f74830c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f74831d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f74832e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f74833f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f74834g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f74835h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f74836i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f74837j;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final String mo69585i() {
        return this.f74829b;
    }

    /* renamed from: j */
    public final String mo69586j() {
        return this.f74837j;
    }

    public String toString() {
        String str = this.f74828a;
        String str2 = this.f74829b;
        String str3 = this.f74830c;
        String str4 = this.f74831d;
        String str5 = this.f74832e;
        String str6 = this.f74833f;
        String str7 = this.f74834g;
        String str8 = this.f74835h;
        String str9 = this.f74836i;
        String str10 = this.f74837j;
        return "ApplicationSalaryInfo(id=" + str + ", sourceOfIncome=" + str2 + ", amount=" + str3 + ", currency=" + str4 + ", organization=" + str5 + ", organizationInn=" + str6 + ", organizationAddress=" + str7 + ", position=" + str8 + ", comment=" + str9 + ", sourceOfIncomeDictionaryKey=" + str10 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C29657a(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.C29657a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
