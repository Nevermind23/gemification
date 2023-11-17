package u80;

import kotlin.jvm.internal.C41536l;

/* renamed from: u80.a */
public final class C28610a {

    /* renamed from: a */
    private final Long f72619a;

    /* renamed from: b */
    private final String f72620b;

    /* renamed from: c */
    private final String f72621c;

    /* renamed from: d */
    private final String f72622d;

    /* renamed from: e */
    private final String f72623e;

    /* renamed from: f */
    private final String f72624f;

    /* renamed from: g */
    private final String f72625g;

    /* renamed from: h */
    private final String f72626h;

    /* renamed from: i */
    private final String f72627i;

    public C28610a(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f72619a = l;
        this.f72620b = str;
        this.f72621c = str2;
        this.f72622d = str3;
        this.f72623e = str4;
        this.f72624f = str5;
        this.f72625g = str6;
        this.f72626h = str7;
        this.f72627i = str8;
    }

    /* renamed from: a */
    public final String mo68321a() {
        return this.f72622d;
    }

    /* renamed from: b */
    public final String mo68322b() {
        return this.f72623e;
    }

    /* renamed from: c */
    public final String mo68323c() {
        return this.f72626h;
    }

    /* renamed from: d */
    public final String mo68324d() {
        return this.f72627i;
    }

    /* renamed from: e */
    public final String mo68325e() {
        return this.f72624f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28610a)) {
            return false;
        }
        C28610a aVar = (C28610a) obj;
        return C41536l.m120484d(this.f72619a, aVar.f72619a) && C41536l.m120484d(this.f72620b, aVar.f72620b) && C41536l.m120484d(this.f72621c, aVar.f72621c) && C41536l.m120484d(this.f72622d, aVar.f72622d) && C41536l.m120484d(this.f72623e, aVar.f72623e) && C41536l.m120484d(this.f72624f, aVar.f72624f) && C41536l.m120484d(this.f72625g, aVar.f72625g) && C41536l.m120484d(this.f72626h, aVar.f72626h) && C41536l.m120484d(this.f72627i, aVar.f72627i);
    }

    /* renamed from: f */
    public final String mo68327f() {
        return this.f72625g;
    }

    /* renamed from: g */
    public final Long mo68328g() {
        return this.f72619a;
    }

    /* renamed from: h */
    public final String mo68329h() {
        return this.f72620b;
    }

    public int hashCode() {
        Long l = this.f72619a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f72620b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72621c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72622d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f72623e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f72624f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f72625g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f72626h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f72627i;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public final String mo68331i() {
        return this.f72621c;
    }

    public String toString() {
        Long l = this.f72619a;
        String str = this.f72620b;
        String str2 = this.f72621c;
        String str3 = this.f72622d;
        String str4 = this.f72623e;
        String str5 = this.f72624f;
        String str6 = this.f72625g;
        String str7 = this.f72626h;
        String str8 = this.f72627i;
        return "Organization(id=" + l + ", statId=" + str + ", taxId=" + str2 + ", abbreviation=" + str3 + ", abbreviationEn=" + str4 + ", customerName=" + str5 + ", customerNameEn=" + str6 + ", address=" + str7 + ", addressEn=" + str8 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C28610a(java.lang.Long r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u80.C28610a.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
