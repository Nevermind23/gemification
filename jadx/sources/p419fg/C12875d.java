package p419fg;

import kotlin.jvm.internal.C41536l;

/* renamed from: fg.d */
public final class C12875d {

    /* renamed from: a */
    private final int f38029a;

    /* renamed from: b */
    private final String f38030b;

    /* renamed from: c */
    private final boolean f38031c;

    public C12875d(int i, String str, boolean z) {
        C41536l.m120489i(str, "status");
        this.f38029a = i;
        this.f38030b = str;
        this.f38031c = z;
    }

    /* renamed from: a */
    public final boolean mo33573a() {
        return this.f38031c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12875d)) {
            return false;
        }
        C12875d dVar = (C12875d) obj;
        return this.f38029a == dVar.f38029a && C41536l.m120484d(this.f38030b, dVar.f38030b) && this.f38031c == dVar.f38031c;
    }

    public int hashCode() {
        int hashCode = ((this.f38029a * 31) + this.f38030b.hashCode()) * 31;
        boolean z = this.f38031c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        int i = this.f38029a;
        String str = this.f38030b;
        boolean z = this.f38031c;
        return "CheckPolicy(code=" + i + ", status=" + str + ", approved=" + z + ")";
    }
}
