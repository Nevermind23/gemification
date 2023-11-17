package jw0;

import bw0.C31210c;
import kotlin.jvm.internal.C41536l;

/* renamed from: jw0.a */
public final class C36804a {

    /* renamed from: a */
    private final Double f88770a;

    /* renamed from: b */
    private final C31210c f88771b;

    /* renamed from: c */
    private final Integer f88772c;

    /* renamed from: d */
    private final String f88773d;

    /* renamed from: e */
    private final boolean f88774e;

    /* renamed from: f */
    private final boolean f88775f;

    public C36804a(Double d, C31210c cVar, Integer num, String str, boolean z, boolean z2) {
        C41536l.m120489i(str, "errorText");
        this.f88770a = d;
        this.f88771b = cVar;
        this.f88772c = num;
        this.f88773d = str;
        this.f88774e = z;
        this.f88775f = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C36804a m109018b(C36804a aVar, Double d, C31210c cVar, Integer num, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = aVar.f88770a;
        }
        if ((i & 2) != 0) {
            cVar = aVar.f88771b;
        }
        C31210c cVar2 = cVar;
        if ((i & 4) != 0) {
            num = aVar.f88772c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = aVar.f88773d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = aVar.f88774e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = aVar.f88775f;
        }
        return aVar.mo89689a(d, cVar2, num2, str2, z3, z2);
    }

    /* renamed from: a */
    public final C36804a mo89689a(Double d, C31210c cVar, Integer num, String str, boolean z, boolean z2) {
        C41536l.m120489i(str, "errorText");
        return new C36804a(d, cVar, num, str, z, z2);
    }

    /* renamed from: c */
    public final Double mo89690c() {
        return this.f88770a;
    }

    /* renamed from: d */
    public final Integer mo89691d() {
        return this.f88772c;
    }

    /* renamed from: e */
    public final C31210c mo89692e() {
        return this.f88771b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36804a)) {
            return false;
        }
        C36804a aVar = (C36804a) obj;
        return C41536l.m120484d(this.f88770a, aVar.f88770a) && C41536l.m120484d(this.f88771b, aVar.f88771b) && C41536l.m120484d(this.f88772c, aVar.f88772c) && C41536l.m120484d(this.f88773d, aVar.f88773d) && this.f88774e == aVar.f88774e && this.f88775f == aVar.f88775f;
    }

    /* renamed from: f */
    public final String mo89694f() {
        return this.f88773d;
    }

    /* renamed from: g */
    public final boolean mo89695g() {
        return this.f88774e;
    }

    /* renamed from: h */
    public final boolean mo89696h() {
        return this.f88775f;
    }

    public int hashCode() {
        Double d = this.f88770a;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        C31210c cVar = this.f88771b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.f88772c;
        if (num != null) {
            i = num.hashCode();
        }
        int hashCode3 = (((hashCode2 + i) * 31) + this.f88773d.hashCode()) * 31;
        boolean z = this.f88774e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f88775f;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        Double d = this.f88770a;
        C31210c cVar = this.f88771b;
        Integer num = this.f88772c;
        String str = this.f88773d;
        boolean z = this.f88774e;
        boolean z2 = this.f88775f;
        return "AmountInputUiState(amount=" + d + ", commission=" + cVar + ", amountLimit=" + num + ", errorText=" + str + ", requestFocus=" + z + ", isCommissionPackages=" + z2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C36804a(java.lang.Double r5, bw0.C31210c r6, java.lang.Integer r7, java.lang.String r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0007
            r12 = r0
            goto L_0x0008
        L_0x0007:
            r12 = r5
        L_0x0008:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = r7
        L_0x0015:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x001b
            java.lang.String r8 = ""
        L_0x001b:
            r2 = r8
            r5 = r11 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0023
            r3 = r6
            goto L_0x0024
        L_0x0023:
            r3 = r9
        L_0x0024:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x002a
            r11 = r6
            goto L_0x002b
        L_0x002a:
            r11 = r10
        L_0x002b:
            r5 = r4
            r6 = r12
            r7 = r1
            r8 = r0
            r9 = r2
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jw0.C36804a.<init>(java.lang.Double, bw0.c, java.lang.Integer, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
