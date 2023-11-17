package s31;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: s31.b */
public final class C38422b {

    /* renamed from: a */
    private final String f92033a;

    /* renamed from: b */
    private final Boolean f92034b;

    /* renamed from: c */
    private final String f92035c;

    /* renamed from: d */
    private final Integer f92036d;

    /* renamed from: e */
    private final boolean f92037e;

    /* renamed from: f */
    private final Boolean f92038f;

    /* renamed from: g */
    private final Boolean f92039g;

    /* renamed from: h */
    private final String f92040h;

    /* renamed from: i */
    private final String f92041i;

    /* renamed from: j */
    private final String f92042j;

    /* renamed from: k */
    private final String f92043k;

    /* renamed from: l */
    private final String f92044l;

    /* renamed from: m */
    private final String f92045m;

    /* renamed from: n */
    private final String f92046n;

    /* renamed from: o */
    private final String f92047o;

    /* renamed from: p */
    private final String f92048p;

    /* renamed from: q */
    private final List f92049q;

    /* renamed from: r */
    private final boolean f92050r;

    public C38422b(String str, Boolean bool, String str2, Integer num, boolean z, Boolean bool2, Boolean bool3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, boolean z2) {
        this.f92033a = str;
        this.f92034b = bool;
        this.f92035c = str2;
        this.f92036d = num;
        this.f92037e = z;
        this.f92038f = bool2;
        this.f92039g = bool3;
        this.f92040h = str3;
        this.f92041i = str4;
        this.f92042j = str5;
        this.f92043k = str6;
        this.f92044l = str7;
        this.f92045m = str8;
        this.f92046n = str9;
        this.f92047o = str10;
        this.f92048p = str11;
        this.f92049q = list;
        this.f92050r = z2;
    }

    /* renamed from: a */
    public final Boolean mo91956a() {
        return this.f92034b;
    }

    /* renamed from: b */
    public final String mo91957b() {
        return this.f92044l;
    }

    /* renamed from: c */
    public final String mo91958c() {
        return this.f92042j;
    }

    /* renamed from: d */
    public final String mo91959d() {
        return this.f92047o;
    }

    /* renamed from: e */
    public final String mo91960e() {
        return this.f92040h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38422b)) {
            return false;
        }
        C38422b bVar = (C38422b) obj;
        return C41536l.m120484d(this.f92033a, bVar.f92033a) && C41536l.m120484d(this.f92034b, bVar.f92034b) && C41536l.m120484d(this.f92035c, bVar.f92035c) && C41536l.m120484d(this.f92036d, bVar.f92036d) && this.f92037e == bVar.f92037e && C41536l.m120484d(this.f92038f, bVar.f92038f) && C41536l.m120484d(this.f92039g, bVar.f92039g) && C41536l.m120484d(this.f92040h, bVar.f92040h) && C41536l.m120484d(this.f92041i, bVar.f92041i) && C41536l.m120484d(this.f92042j, bVar.f92042j) && C41536l.m120484d(this.f92043k, bVar.f92043k) && C41536l.m120484d(this.f92044l, bVar.f92044l) && C41536l.m120484d(this.f92045m, bVar.f92045m) && C41536l.m120484d(this.f92046n, bVar.f92046n) && C41536l.m120484d(this.f92047o, bVar.f92047o) && C41536l.m120484d(this.f92048p, bVar.f92048p) && C41536l.m120484d(this.f92049q, bVar.f92049q) && this.f92050r == bVar.f92050r;
    }

    /* renamed from: f */
    public final List mo91962f() {
        return this.f92049q;
    }

    /* renamed from: g */
    public final boolean mo91963g() {
        return this.f92050r;
    }

    /* renamed from: h */
    public final String mo91964h() {
        return this.f92041i;
    }

    public int hashCode() {
        String str = this.f92033a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f92034b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f92035c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f92036d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f92037e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        Boolean bool2 = this.f92038f;
        int hashCode5 = (i2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f92039g;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.f92040h;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f92041i;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f92042j;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f92043k;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f92044l;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f92045m;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f92046n;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f92047o;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f92048p;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List list = this.f92049q;
        if (list != null) {
            i = list.hashCode();
        }
        int i3 = (hashCode15 + i) * 31;
        boolean z3 = this.f92050r;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo91966i() {
        return this.f92048p;
    }

    /* renamed from: j */
    public final String mo91967j() {
        return this.f92043k;
    }

    /* renamed from: k */
    public final boolean mo91968k() {
        return this.f92037e;
    }

    /* renamed from: l */
    public final String mo91969l() {
        return this.f92033a;
    }

    /* renamed from: m */
    public final String mo91970m() {
        return this.f92045m;
    }

    /* renamed from: n */
    public final String mo91971n() {
        return this.f92035c;
    }

    /* renamed from: o */
    public final Boolean mo91972o() {
        return this.f92039g;
    }

    public String toString() {
        String str = this.f92033a;
        Boolean bool = this.f92034b;
        String str2 = this.f92035c;
        Integer num = this.f92036d;
        boolean z = this.f92037e;
        Boolean bool2 = this.f92038f;
        Boolean bool3 = this.f92039g;
        String str3 = this.f92040h;
        String str4 = this.f92041i;
        String str5 = this.f92042j;
        String str6 = this.f92043k;
        String str7 = this.f92044l;
        String str8 = this.f92045m;
        String str9 = this.f92046n;
        String str10 = this.f92047o;
        String str11 = this.f92048p;
        List list = this.f92049q;
        boolean z2 = this.f92050r;
        return "PaymentServiceConfigInput(type=" + str + ", enable=" + bool + ", value=" + str2 + ", width=" + num + ", submit=" + z + ", inputOptionBundle=" + bool2 + ", isNumeric=" + bool3 + ", inputName=" + str3 + ", mask=" + str4 + ", hint=" + str5 + ", prefix=" + str6 + ", errorDesc=" + str7 + ", validationRegex=" + str8 + ", dependedInputId=" + str9 + ", id=" + str10 + ", name=" + str11 + ", inputOption=" + list + ", keysFromPaymentDictionary=" + z2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38422b(java.lang.String r20, java.lang.Boolean r21, java.lang.String r22, java.lang.Integer r23, boolean r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.List r36, boolean r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r20
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r21
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r22
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r23
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r24
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r25
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r26
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r27
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r28
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r29
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r30
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r31
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r32
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r33
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r34
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r35
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r36
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r18
            if (r0 == 0) goto L_0x0099
            r0 = 1
            goto L_0x009b
        L_0x0099:
            r0 = r37
        L_0x009b:
            r20 = r19
            r21 = r1
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r2
            r36 = r16
            r37 = r17
            r38 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s31.C38422b.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
