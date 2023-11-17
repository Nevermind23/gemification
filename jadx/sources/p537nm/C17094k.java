package p537nm;

import kotlin.jvm.internal.C41536l;

/* renamed from: nm.k */
public final class C17094k {

    /* renamed from: a */
    private final boolean f47820a;

    /* renamed from: b */
    private final String f47821b;

    public C17094k(boolean z, String str) {
        this.f47820a = z;
        this.f47821b = str;
    }

    /* renamed from: a */
    public final String mo44390a() {
        return this.f47821b;
    }

    /* renamed from: b */
    public final boolean mo44391b() {
        return this.f47820a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17094k)) {
            return false;
        }
        C17094k kVar = (C17094k) obj;
        return this.f47820a == kVar.f47820a && C41536l.m120484d(this.f47821b, kVar.f47821b);
    }

    public int hashCode() {
        boolean z = this.f47820a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f47821b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.f47820a;
        String str = this.f47821b;
        return "CardSmallImage(isDark=" + z + ", fileUrl=" + str + ")";
    }
}
