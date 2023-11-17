package yd0;

import kotlin.jvm.internal.C41536l;

/* renamed from: yd0.b */
public final class C30003b {

    /* renamed from: a */
    private final boolean f75815a;

    /* renamed from: b */
    private final Long f75816b;

    /* renamed from: c */
    private final C30004c f75817c;

    /* renamed from: d */
    private final boolean f75818d;

    /* renamed from: e */
    private final boolean f75819e;

    public C30003b(boolean z, Long l, C30004c cVar, boolean z2, boolean z3) {
        C41536l.m120489i(cVar, "prizeType");
        this.f75815a = z;
        this.f75816b = l;
        this.f75817c = cVar;
        this.f75818d = z2;
        this.f75819e = z3;
    }

    /* renamed from: a */
    public final Long mo70298a() {
        return this.f75816b;
    }

    /* renamed from: b */
    public final C30004c mo70299b() {
        return this.f75817c;
    }

    /* renamed from: c */
    public final boolean mo70300c() {
        return this.f75818d;
    }

    /* renamed from: d */
    public final boolean mo70301d() {
        return this.f75819e;
    }

    /* renamed from: e */
    public final boolean mo70302e() {
        return this.f75815a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30003b)) {
            return false;
        }
        C30003b bVar = (C30003b) obj;
        return this.f75815a == bVar.f75815a && C41536l.m120484d(this.f75816b, bVar.f75816b) && this.f75817c == bVar.f75817c && this.f75818d == bVar.f75818d && this.f75819e == bVar.f75819e;
    }

    public int hashCode() {
        boolean z = this.f75815a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Long l = this.f75816b;
        int hashCode = (((i + (l == null ? 0 : l.hashCode())) * 31) + this.f75817c.hashCode()) * 31;
        boolean z3 = this.f75818d;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f75819e;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f75815a;
        Long l = this.f75816b;
        C30004c cVar = this.f75817c;
        boolean z2 = this.f75818d;
        boolean z3 = this.f75819e;
        return "EndYearCampaignInfo(isWinner=" + z + ", prizeAmount=" + l + ", prizeType=" + cVar + ", showPopup=" + z2 + ", isSuperPrize=" + z3 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C30003b(boolean r5, java.lang.Long r6, yd0.C30004c r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000d
            r6 = 0
        L_0x000d:
            r1 = r6
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0014
            yd0.c r7 = yd0.C30004c.NONE
        L_0x0014:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001b
            r3 = r0
            goto L_0x001c
        L_0x001b:
            r3 = r8
        L_0x001c:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0022
            r10 = r0
            goto L_0x0023
        L_0x0022:
            r10 = r9
        L_0x0023:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yd0.C30003b.<init>(boolean, java.lang.Long, yd0.c, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
