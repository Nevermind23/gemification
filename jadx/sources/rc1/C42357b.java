package rc1;

import kotlin.jvm.internal.C41536l;
import sso.type.AuthElementType;

/* renamed from: rc1.b */
public final class C42357b {

    /* renamed from: a */
    private final AuthElementType f99579a;

    /* renamed from: b */
    private final boolean f99580b;

    /* renamed from: c */
    private Integer f99581c;

    /* renamed from: d */
    private boolean f99582d;

    /* renamed from: e */
    private boolean f99583e;

    /* renamed from: f */
    private final Integer f99584f;

    public C42357b(AuthElementType authElementType, boolean z, Integer num, boolean z2, boolean z3, Integer num2) {
        C41536l.m120489i(authElementType, "element");
        this.f99579a = authElementType;
        this.f99580b = z;
        this.f99581c = num;
        this.f99582d = z2;
        this.f99583e = z3;
        this.f99584f = num2;
    }

    /* renamed from: a */
    public final AuthElementType mo97802a() {
        return this.f99579a;
    }

    /* renamed from: b */
    public final Integer mo97803b() {
        return this.f99581c;
    }

    /* renamed from: c */
    public final Integer mo97804c() {
        return this.f99584f;
    }

    /* renamed from: d */
    public final boolean mo97805d() {
        return this.f99583e;
    }

    /* renamed from: e */
    public final boolean mo97806e() {
        return this.f99582d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42357b)) {
            return false;
        }
        C42357b bVar = (C42357b) obj;
        return this.f99579a == bVar.f99579a && this.f99580b == bVar.f99580b && C41536l.m120484d(this.f99581c, bVar.f99581c) && this.f99582d == bVar.f99582d && this.f99583e == bVar.f99583e && C41536l.m120484d(this.f99584f, bVar.f99584f);
    }

    /* renamed from: f */
    public final boolean mo97808f() {
        return this.f99580b;
    }

    /* renamed from: g */
    public final void mo97809g(Integer num) {
        this.f99581c = num;
    }

    /* renamed from: h */
    public final void mo97810h(boolean z) {
        this.f99583e = z;
    }

    public int hashCode() {
        int hashCode = this.f99579a.hashCode() * 31;
        boolean z = this.f99580b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        Integer num = this.f99581c;
        int i2 = 0;
        int hashCode2 = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z3 = this.f99582d;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f99583e;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        Integer num2 = this.f99584f;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i4 + i2;
    }

    /* renamed from: i */
    public final void mo97812i(boolean z) {
        this.f99582d = z;
    }

    public String toString() {
        return "ScaVerificationType(element=" + this.f99579a + ", isBiometricEnabled=" + this.f99580b + ", memberOfScheme=" + this.f99581c + ", wasSkipped=" + this.f99582d + ", wasShown=" + this.f99583e + ", skipWithScheme=" + this.f99584f + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C42357b(sso.type.AuthElementType r7, boolean r8, java.lang.Integer r9, boolean r10, boolean r11, java.lang.Integer r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r13 & 4
            r3 = 0
            if (r2 == 0) goto L_0x000f
            r2 = r3
            goto L_0x0010
        L_0x000f:
            r2 = r9
        L_0x0010:
            r4 = r13 & 8
            if (r4 == 0) goto L_0x0016
            r4 = r1
            goto L_0x0017
        L_0x0016:
            r4 = r10
        L_0x0017:
            r5 = r13 & 16
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r11
        L_0x001d:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r3 = r12
        L_0x0023:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r4
            r13 = r1
            r14 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc1.C42357b.<init>(sso.type.AuthElementType, boolean, java.lang.Integer, boolean, boolean, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
