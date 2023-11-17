package p190o1;

import kotlin.jvm.internal.C41536l;

/* renamed from: o1.m */
public final class C7386m {

    /* renamed from: a */
    private final String f21611a;

    /* renamed from: b */
    private final int f21612b;

    public C7386m(String str, int i) {
        C41536l.m120489i(str, "workSpecId");
        this.f21611a = str;
        this.f21612b = i;
    }

    /* renamed from: a */
    public final int mo21769a() {
        return this.f21612b;
    }

    /* renamed from: b */
    public final String mo21770b() {
        return this.f21611a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7386m)) {
            return false;
        }
        C7386m mVar = (C7386m) obj;
        return C41536l.m120484d(this.f21611a, mVar.f21611a) && this.f21612b == mVar.f21612b;
    }

    public int hashCode() {
        return (this.f21611a.hashCode() * 31) + this.f21612b;
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f21611a + ", generation=" + this.f21612b + ')';
    }
}
