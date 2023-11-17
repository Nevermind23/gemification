package k51;

import kotlin.jvm.internal.C41536l;

/* renamed from: k51.b */
public final class C36874b {

    /* renamed from: a */
    private final String f88969a;

    /* renamed from: b */
    private final String f88970b;

    /* renamed from: c */
    private final boolean f88971c;

    /* renamed from: d */
    private final boolean f88972d;

    /* renamed from: e */
    private final boolean f88973e;

    public C36874b(String str, String str2, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "phone");
        this.f88969a = str;
        this.f88970b = str2;
        this.f88971c = z;
        this.f88972d = z2;
        this.f88973e = z3;
    }

    /* renamed from: a */
    public final String mo89806a() {
        return this.f88970b;
    }

    /* renamed from: b */
    public final boolean mo89807b() {
        return this.f88971c;
    }

    /* renamed from: c */
    public final boolean mo89808c() {
        return this.f88973e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36874b)) {
            return false;
        }
        C36874b bVar = (C36874b) obj;
        return C41536l.m120484d(this.f88969a, bVar.f88969a) && C41536l.m120484d(this.f88970b, bVar.f88970b) && this.f88971c == bVar.f88971c && this.f88972d == bVar.f88972d && this.f88973e == bVar.f88973e;
    }

    public int hashCode() {
        int hashCode = ((this.f88969a.hashCode() * 31) + this.f88970b.hashCode()) * 31;
        boolean z = this.f88971c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f88972d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f88973e;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f88969a;
        String str2 = this.f88970b;
        boolean z = this.f88971c;
        boolean z2 = this.f88972d;
        boolean z3 = this.f88973e;
        return "ClientPhone(id=" + str + ", phone=" + str2 + ", isFavorite=" + z + ", editable=" + z2 + ", isFinancial=" + z3 + ")";
    }
}
