package hn0;

import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.i */
public final class C15544i {

    /* renamed from: a */
    private final int f44121a;

    /* renamed from: b */
    private final String f44122b;

    /* renamed from: c */
    private final boolean f44123c;

    public C15544i(int i, String str, boolean z) {
        C41536l.m120489i(str, "sourcePropertyDesc");
        this.f44121a = i;
        this.f44122b = str;
        this.f44123c = z;
    }

    /* renamed from: a */
    public final int mo42700a() {
        return this.f44121a;
    }

    /* renamed from: b */
    public final String mo42701b() {
        return this.f44122b;
    }

    /* renamed from: c */
    public final boolean mo42702c() {
        return this.f44121a == 80;
    }

    /* renamed from: d */
    public final boolean mo42703d() {
        return this.f44123c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15544i)) {
            return false;
        }
        C15544i iVar = (C15544i) obj;
        return this.f44121a == iVar.f44121a && C41536l.m120484d(this.f44122b, iVar.f44122b) && this.f44123c == iVar.f44123c;
    }

    public int hashCode() {
        int hashCode = ((this.f44121a * 31) + this.f44122b.hashCode()) * 31;
        boolean z = this.f44123c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        int i = this.f44121a;
        String str = this.f44122b;
        boolean z = this.f44123c;
        return "PropertySource(id=" + i + ", sourcePropertyDesc=" + str + ", isNoteMandatory=" + z + ")";
    }
}
