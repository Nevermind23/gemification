package o30;

import kotlin.jvm.internal.C41536l;

/* renamed from: o30.c */
public class C26713c implements C26720h {

    /* renamed from: a */
    private final String f67334a;

    /* renamed from: b */
    private final Integer f67335b;

    /* renamed from: c */
    private final String f67336c;

    /* renamed from: d */
    private final String f67337d;

    /* renamed from: e */
    private final int f67338e;

    /* renamed from: f */
    private final boolean f67339f;

    /* renamed from: g */
    private final C26716f f67340g;

    /* renamed from: h */
    private final int f67341h;

    /* renamed from: i */
    private final int f67342i;

    /* renamed from: j */
    private final int f67343j;

    /* renamed from: k */
    private final Integer f67344k;

    /* renamed from: l */
    private final Integer f67345l;

    public C26713c(String str, Integer num, String str2, String str3, int i, boolean z, C26716f fVar, int i2, int i3, int i4, Integer num2, Integer num3) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(fVar, "background");
        this.f67334a = str;
        this.f67335b = num;
        this.f67336c = str2;
        this.f67337d = str3;
        this.f67338e = i;
        this.f67339f = z;
        this.f67340g = fVar;
        this.f67341h = i2;
        this.f67342i = i3;
        this.f67343j = i4;
        this.f67344k = num2;
        this.f67345l = num3;
    }

    /* renamed from: a */
    public String mo65922a() {
        return this.f67334a;
    }

    /* renamed from: b */
    public String mo65923b() {
        return this.f67337d;
    }

    /* renamed from: c */
    public C26716f mo65924c() {
        return this.f67340g;
    }

    /* renamed from: d */
    public int mo65925d() {
        return this.f67341h;
    }

    /* renamed from: e */
    public int mo65926e() {
        return this.f67342i;
    }

    /* renamed from: f */
    public String mo65927f() {
        return this.f67336c;
    }

    /* renamed from: g */
    public int mo65928g() {
        return this.f67343j;
    }

    /* renamed from: h */
    public Integer mo65929h() {
        return this.f67335b;
    }

    /* renamed from: i */
    public Integer mo65930i() {
        return this.f67344k;
    }

    /* renamed from: j */
    public boolean mo65931j() {
        return this.f67339f;
    }

    /* renamed from: k */
    public int mo65932k() {
        return this.f67338e;
    }

    /* renamed from: l */
    public Integer mo65933l() {
        return this.f67345l;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C26713c(java.lang.String r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, int r17, boolean r18, o30.C26716f r19, int r20, int r21, int r22, java.lang.Integer r23, java.lang.Integer r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r12 = this;
            r0 = r25
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000d
            int r1 = p366bk.C10320i.f28688dc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x000e
        L_0x000d:
            r1 = r14
        L_0x000e:
            r2 = r0 & 4
            r3 = 0
            if (r2 == 0) goto L_0x0015
            r2 = r3
            goto L_0x0016
        L_0x0015:
            r2 = r15
        L_0x0016:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x001c
            r4 = r3
            goto L_0x001e
        L_0x001c:
            r4 = r16
        L_0x001e:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0025
            r5 = r6
            goto L_0x0027
        L_0x0025:
            r5 = r17
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r6
            goto L_0x002f
        L_0x002d:
            r7 = r18
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            o30.f$b r8 = o30.C26716f.C26718b.f67352a
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = -1
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r6 = r21
        L_0x0047:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x004d
            r10 = 3
            goto L_0x004f
        L_0x004d:
            r10 = r22
        L_0x004f:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0055
            r11 = r3
            goto L_0x0057
        L_0x0055:
            r11 = r23
        L_0x0057:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r3 = r24
        L_0x005e:
            r14 = r12
            r15 = r13
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r6
            r24 = r10
            r25 = r11
            r26 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.C26713c.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, o30.f, int, int, int, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
