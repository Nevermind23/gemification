package jw0;

import kotlin.jvm.internal.C41536l;

/* renamed from: jw0.e */
public final class C36808e {

    /* renamed from: a */
    private final String f88786a;

    /* renamed from: b */
    private final String f88787b;

    /* renamed from: c */
    private final String f88788c;

    /* renamed from: d */
    private final boolean f88789d;

    /* renamed from: e */
    private final boolean f88790e;

    public C36808e(String str, String str2, String str3, boolean z, boolean z2) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "normalizedNumber");
        C41536l.m120489i(str3, "errorInfo");
        this.f88786a = str;
        this.f88787b = str2;
        this.f88788c = str3;
        this.f88789d = z;
        this.f88790e = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C36808e m109040b(C36808e eVar, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f88786a;
        }
        if ((i & 2) != 0) {
            str2 = eVar.f88787b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = eVar.f88788c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = eVar.f88789d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = eVar.f88790e;
        }
        return eVar.mo89720a(str, str4, str5, z3, z2);
    }

    /* renamed from: c */
    private final String m109041c(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '+') {
                sb.append(charAt);
            } else {
                if (i % 3 != 0 || i <= 0) {
                    str2 = String.valueOf(charAt);
                } else {
                    str2 = " " + charAt;
                }
                sb.append(str2);
                i++;
            }
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "result.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final C36808e mo89720a(String str, String str2, String str3, boolean z, boolean z2) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "normalizedNumber");
        C41536l.m120489i(str3, "errorInfo");
        return new C36808e(str, str2, str3, z, z2);
    }

    /* renamed from: d */
    public final String mo89721d() {
        return this.f88788c;
    }

    /* renamed from: e */
    public final boolean mo89722e() {
        return this.f88790e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36808e)) {
            return false;
        }
        C36808e eVar = (C36808e) obj;
        return C41536l.m120484d(this.f88786a, eVar.f88786a) && C41536l.m120484d(this.f88787b, eVar.f88787b) && C41536l.m120484d(this.f88788c, eVar.f88788c) && this.f88789d == eVar.f88789d && this.f88790e == eVar.f88790e;
    }

    /* renamed from: f */
    public final String mo89724f() {
        return m109041c(this.f88787b);
    }

    /* renamed from: g */
    public final String mo89725g() {
        return this.f88787b;
    }

    /* renamed from: h */
    public final boolean mo89726h() {
        return this.f88789d;
    }

    public int hashCode() {
        int hashCode = ((((this.f88786a.hashCode() * 31) + this.f88787b.hashCode()) * 31) + this.f88788c.hashCode()) * 31;
        boolean z = this.f88789d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f88790e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f88786a;
        String str2 = this.f88787b;
        String str3 = this.f88788c;
        boolean z = this.f88789d;
        boolean z2 = this.f88790e;
        return "PhoneInputUiState(name=" + str + ", normalizedNumber=" + str2 + ", errorInfo=" + str3 + ", isValid=" + z + ", formatPhoneNumber=" + z2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C36808e(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = r6
        L_0x0016:
            r4 = r9 & 8
            r5 = 0
            if (r4 == 0) goto L_0x001d
            r2 = r5
            goto L_0x001e
        L_0x001d:
            r2 = r7
        L_0x001e:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0024
            r9 = r5
            goto L_0x0025
        L_0x0024:
            r9 = r8
        L_0x0025:
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jw0.C36808e.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
