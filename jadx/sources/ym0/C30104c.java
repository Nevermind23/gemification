package ym0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ym0.c */
public final class C30104c {

    /* renamed from: a */
    private final String f75953a;

    /* renamed from: b */
    private final boolean f75954b;

    /* renamed from: c */
    private final boolean f75955c;

    public C30104c(String str, boolean z, boolean z2) {
        C41536l.m120489i(str, "phoneNumber");
        this.f75953a = str;
        this.f75954b = z;
        this.f75955c = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C30104c m91084b(C30104c cVar, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f75953a;
        }
        if ((i & 2) != 0) {
            z = cVar.f75954b;
        }
        if ((i & 4) != 0) {
            z2 = cVar.f75955c;
        }
        return cVar.mo70389a(str, z, z2);
    }

    /* renamed from: a */
    public final C30104c mo70389a(String str, boolean z, boolean z2) {
        C41536l.m120489i(str, "phoneNumber");
        return new C30104c(str, z, z2);
    }

    /* renamed from: c */
    public final boolean mo70390c() {
        return this.f75954b;
    }

    /* renamed from: d */
    public final String mo70391d() {
        return this.f75953a;
    }

    /* renamed from: e */
    public final boolean mo70392e() {
        return this.f75955c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30104c)) {
            return false;
        }
        C30104c cVar = (C30104c) obj;
        return C41536l.m120484d(this.f75953a, cVar.f75953a) && this.f75954b == cVar.f75954b && this.f75955c == cVar.f75955c;
    }

    public int hashCode() {
        int hashCode = this.f75953a.hashCode() * 31;
        boolean z = this.f75954b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f75955c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f75953a;
        boolean z = this.f75954b;
        boolean z2 = this.f75955c;
        return "ChildPhoneData(phoneNumber=" + str + ", needsVerification=" + z + ", isVerified=" + z2 + ")";
    }
}
