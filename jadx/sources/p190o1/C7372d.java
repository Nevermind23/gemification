package p190o1;

import kotlin.jvm.internal.C41536l;

/* renamed from: o1.d */
public final class C7372d {

    /* renamed from: a */
    private final String f21596a;

    /* renamed from: b */
    private final Long f21597b;

    public C7372d(String str, Long l) {
        C41536l.m120489i(str, "key");
        this.f21596a = str;
        this.f21597b = l;
    }

    /* renamed from: a */
    public final String mo21749a() {
        return this.f21596a;
    }

    /* renamed from: b */
    public final Long mo21750b() {
        return this.f21597b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7372d)) {
            return false;
        }
        C7372d dVar = (C7372d) obj;
        return C41536l.m120484d(this.f21596a, dVar.f21596a) && C41536l.m120484d(this.f21597b, dVar.f21597b);
    }

    public int hashCode() {
        int hashCode = this.f21596a.hashCode() * 31;
        Long l = this.f21597b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f21596a + ", value=" + this.f21597b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7372d(String str, boolean z) {
        this(str, Long.valueOf(z ? 1 : 0));
        C41536l.m120489i(str, "key");
    }
}
