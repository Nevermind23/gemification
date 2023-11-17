package k51;

import kotlin.jvm.internal.C41536l;

/* renamed from: k51.a */
public final class C36873a {

    /* renamed from: a */
    private final String f88964a;

    /* renamed from: b */
    private final String f88965b;

    /* renamed from: c */
    private final boolean f88966c;

    /* renamed from: d */
    private final boolean f88967d;

    /* renamed from: e */
    private final boolean f88968e;

    public C36873a(String str, String str2, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "mail");
        this.f88964a = str;
        this.f88965b = str2;
        this.f88966c = z;
        this.f88967d = z2;
        this.f88968e = z3;
    }

    /* renamed from: a */
    public final String mo89799a() {
        return this.f88964a;
    }

    /* renamed from: b */
    public final String mo89800b() {
        return this.f88965b;
    }

    /* renamed from: c */
    public final boolean mo89801c() {
        return this.f88966c;
    }

    /* renamed from: d */
    public final boolean mo89802d() {
        return this.f88968e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36873a)) {
            return false;
        }
        C36873a aVar = (C36873a) obj;
        return C41536l.m120484d(this.f88964a, aVar.f88964a) && C41536l.m120484d(this.f88965b, aVar.f88965b) && this.f88966c == aVar.f88966c && this.f88967d == aVar.f88967d && this.f88968e == aVar.f88968e;
    }

    public int hashCode() {
        int hashCode = ((this.f88964a.hashCode() * 31) + this.f88965b.hashCode()) * 31;
        boolean z = this.f88966c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f88967d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f88968e;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f88964a;
        String str2 = this.f88965b;
        boolean z = this.f88966c;
        boolean z2 = this.f88967d;
        boolean z3 = this.f88968e;
        return "ClientMail(id=" + str + ", mail=" + str2 + ", isFavorite=" + z + ", editable=" + z2 + ", isFinancial=" + z3 + ")";
    }
}
