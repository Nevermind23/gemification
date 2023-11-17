package p683yh;

import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: yh.a */
public final class C18917a {

    /* renamed from: a */
    private final long f52892a;

    /* renamed from: b */
    private final String f52893b;

    /* renamed from: c */
    private final Image f52894c;

    /* renamed from: d */
    private final String f52895d;

    /* renamed from: e */
    private final boolean f52896e;

    /* renamed from: f */
    private final String f52897f;

    /* renamed from: g */
    private final boolean f52898g;

    /* renamed from: h */
    private final boolean f52899h;

    /* renamed from: i */
    private final boolean f52900i;

    /* renamed from: j */
    private final String f52901j;

    /* renamed from: k */
    private final String f52902k;

    /* renamed from: l */
    private final Integer f52903l;

    public C18917a(long j, String str, Image image, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, String str4, String str5, Integer num) {
        C41536l.m120489i(str, "cardName");
        C41536l.m120489i(image, "image");
        C41536l.m120489i(str2, "lastFourDigits");
        C41536l.m120489i(str4, "cardTitle");
        C41536l.m120489i(str5, "infoText");
        this.f52892a = j;
        this.f52893b = str;
        this.f52894c = image;
        this.f52895d = str2;
        this.f52896e = z;
        this.f52897f = str3;
        this.f52898g = z2;
        this.f52899h = z3;
        this.f52900i = z4;
        this.f52901j = str4;
        this.f52902k = str5;
        this.f52903l = num;
    }

    /* renamed from: b */
    public static /* synthetic */ C18917a m63970b(C18917a aVar, long j, String str, Image image, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, String str4, String str5, Integer num, int i, Object obj) {
        C18917a aVar2 = aVar;
        int i2 = i;
        return aVar.mo46920a((i2 & 1) != 0 ? aVar2.f52892a : j, (i2 & 2) != 0 ? aVar2.f52893b : str, (i2 & 4) != 0 ? aVar2.f52894c : image, (i2 & 8) != 0 ? aVar2.f52895d : str2, (i2 & 16) != 0 ? aVar2.f52896e : z, (i2 & 32) != 0 ? aVar2.f52897f : str3, (i2 & 64) != 0 ? aVar2.f52898g : z2, (i2 & 128) != 0 ? aVar2.f52899h : z3, (i2 & C11398b.f33139r) != 0 ? aVar2.f52900i : z4, (i2 & C11398b.f33140s) != 0 ? aVar2.f52901j : str4, (i2 & C11398b.f33141t) != 0 ? aVar2.f52902k : str5, (i2 & C11398b.f33142u) != 0 ? aVar2.f52903l : num);
    }

    /* renamed from: a */
    public final C18917a mo46920a(long j, String str, Image image, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, String str4, String str5, Integer num) {
        String str6 = str;
        C41536l.m120489i(str6, "cardName");
        Image image2 = image;
        C41536l.m120489i(image2, "image");
        String str7 = str2;
        C41536l.m120489i(str7, "lastFourDigits");
        String str8 = str4;
        C41536l.m120489i(str8, "cardTitle");
        String str9 = str5;
        C41536l.m120489i(str9, "infoText");
        return new C18917a(j, str6, image2, str7, z, str3, z2, z3, z4, str8, str9, num);
    }

    /* renamed from: c */
    public final long mo46921c() {
        return this.f52892a;
    }

    /* renamed from: d */
    public final String mo46922d() {
        return this.f52893b;
    }

    /* renamed from: e */
    public final String mo46923e() {
        return this.f52901j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18917a)) {
            return false;
        }
        C18917a aVar = (C18917a) obj;
        return this.f52892a == aVar.f52892a && C41536l.m120484d(this.f52893b, aVar.f52893b) && C41536l.m120484d(this.f52894c, aVar.f52894c) && C41536l.m120484d(this.f52895d, aVar.f52895d) && this.f52896e == aVar.f52896e && C41536l.m120484d(this.f52897f, aVar.f52897f) && this.f52898g == aVar.f52898g && this.f52899h == aVar.f52899h && this.f52900i == aVar.f52900i && C41536l.m120484d(this.f52901j, aVar.f52901j) && C41536l.m120484d(this.f52902k, aVar.f52902k) && C41536l.m120484d(this.f52903l, aVar.f52903l);
    }

    /* renamed from: f */
    public final boolean mo46925f() {
        return this.f52896e;
    }

    /* renamed from: g */
    public final String mo46926g() {
        return this.f52897f;
    }

    /* renamed from: h */
    public final Image mo46927h() {
        return this.f52894c;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.f52892a) * 31) + this.f52893b.hashCode()) * 31) + this.f52894c.hashCode()) * 31) + this.f52895d.hashCode()) * 31;
        boolean z = this.f52896e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.f52897f;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f52898g;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f52899h;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f52900i;
        if (!z5) {
            z2 = z5;
        }
        int hashCode2 = (((((i4 + (z2 ? 1 : 0)) * 31) + this.f52901j.hashCode()) * 31) + this.f52902k.hashCode()) * 31;
        Integer num = this.f52903l;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: i */
    public final Integer mo46929i() {
        return this.f52903l;
    }

    /* renamed from: j */
    public final String mo46930j() {
        return this.f52902k;
    }

    /* renamed from: k */
    public final String mo46931k() {
        return this.f52895d;
    }

    /* renamed from: l */
    public final boolean mo46932l() {
        return this.f52900i;
    }

    /* renamed from: m */
    public final boolean mo46933m() {
        return this.f52899h;
    }

    /* renamed from: n */
    public final boolean mo46934n() {
        return this.f52898g;
    }

    public String toString() {
        long j = this.f52892a;
        String str = this.f52893b;
        Image image = this.f52894c;
        String str2 = this.f52895d;
        boolean z = this.f52896e;
        String str3 = this.f52897f;
        boolean z2 = this.f52898g;
        boolean z3 = this.f52899h;
        boolean z4 = this.f52900i;
        String str4 = this.f52901j;
        String str5 = this.f52902k;
        Integer num = this.f52903l;
        return "CreditCardInfo(cardId=" + j + ", cardName=" + str + ", image=" + image + ", lastFourDigits=" + str2 + ", expired=" + z + ", expiresIn=" + str3 + ", isDigital=" + z2 + ", isBlocked=" + z3 + ", isActive=" + z4 + ", cardTitle=" + str4 + ", infoText=" + str5 + ", infoColor=" + num + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C18917a(long r18, java.lang.String r20, p341ge.bog.designsystem.components.common.Image r21, java.lang.String r22, boolean r23, java.lang.String r24, boolean r25, boolean r26, boolean r27, java.lang.String r28, java.lang.String r29, java.lang.Integer r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r25
        L_0x000b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r26
        L_0x0013:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x001a
            r1 = 1
            r13 = r1
            goto L_0x001c
        L_0x001a:
            r13 = r27
        L_0x001c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0024
            r14 = r2
            goto L_0x0026
        L_0x0024:
            r14 = r28
        L_0x0026:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x002c
            r15 = r2
            goto L_0x002e
        L_0x002c:
            r15 = r29
        L_0x002e:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            r16 = r0
            goto L_0x0038
        L_0x0036:
            r16 = r30
        L_0x0038:
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p683yh.C18917a.<init>(long, java.lang.String, ge.bog.designsystem.components.common.Image, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
