package ln0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ln0.s */
public final class C16625s {

    /* renamed from: a */
    private final int f46822a;

    /* renamed from: b */
    private final String f46823b;

    /* renamed from: c */
    private final boolean f46824c;

    /* renamed from: d */
    private final boolean f46825d;

    public C16625s(int i, String str, boolean z, boolean z2) {
        C41536l.m120489i(str, "sourceDesc");
        this.f46822a = i;
        this.f46823b = str;
        this.f46824c = z;
        this.f46825d = z2;
    }

    /* renamed from: a */
    public final int mo43771a() {
        return this.f46822a;
    }

    /* renamed from: b */
    public final boolean mo43772b() {
        return this.f46825d;
    }

    /* renamed from: c */
    public final String mo43773c() {
        return this.f46823b;
    }

    /* renamed from: d */
    public final boolean mo43774d() {
        return this.f46824c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16625s)) {
            return false;
        }
        C16625s sVar = (C16625s) obj;
        return this.f46822a == sVar.f46822a && C41536l.m120484d(this.f46823b, sVar.f46823b) && this.f46824c == sVar.f46824c && this.f46825d == sVar.f46825d;
    }

    public int hashCode() {
        int hashCode = ((this.f46822a * 31) + this.f46823b.hashCode()) * 31;
        boolean z = this.f46824c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f46825d;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        int i = this.f46822a;
        String str = this.f46823b;
        boolean z = this.f46824c;
        boolean z2 = this.f46825d;
        return "IncomeSourceRecyclerItem(id=" + i + ", sourceDesc=" + str + ", isNoteRequired=" + z + ", singleCheckable=" + z2 + ")";
    }
}
