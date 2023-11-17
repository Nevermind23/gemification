package t10;

import kotlin.jvm.internal.C41536l;

/* renamed from: t10.c */
public final class C28298c {

    /* renamed from: a */
    private final String f71809a;

    /* renamed from: b */
    private final int f71810b;

    /* renamed from: c */
    private final boolean f71811c;

    /* renamed from: d */
    private final boolean f71812d;

    public C28298c(String str, int i, boolean z, boolean z2) {
        this.f71809a = str;
        this.f71810b = i;
        this.f71811c = z;
        this.f71812d = z2;
    }

    /* renamed from: a */
    public final int mo67940a() {
        return this.f71810b;
    }

    /* renamed from: b */
    public final boolean mo67941b() {
        return this.f71812d;
    }

    /* renamed from: c */
    public final String mo67942c() {
        return this.f71809a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28298c)) {
            return false;
        }
        C28298c cVar = (C28298c) obj;
        return C41536l.m120484d(this.f71809a, cVar.f71809a) && this.f71810b == cVar.f71810b && this.f71811c == cVar.f71811c && this.f71812d == cVar.f71812d;
    }

    public int hashCode() {
        String str = this.f71809a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f71810b) * 31;
        boolean z = this.f71811c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f71812d;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f71809a;
        int i = this.f71810b;
        boolean z = this.f71811c;
        boolean z2 = this.f71812d;
        return "ProfilePictureItem(profilePictureUrl=" + str + ", drawableId=" + i + ", isBogContact=" + z + ", hasCustomPhoto=" + z2 + ")";
    }
}
