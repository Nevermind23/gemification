package p524mn;

import kotlin.jvm.internal.C41536l;
import o70.C26765d;

/* renamed from: mn.a */
public final class C16800a {

    /* renamed from: a */
    private final C26765d f47074a;

    /* renamed from: b */
    private final boolean f47075b;

    public C16800a(C26765d dVar, boolean z) {
        C41536l.m120489i(dVar, "card");
        this.f47074a = dVar;
        this.f47075b = z;
    }

    /* renamed from: a */
    public final C26765d mo43920a() {
        return this.f47074a;
    }

    /* renamed from: b */
    public final boolean mo43921b() {
        return this.f47075b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16800a)) {
            return false;
        }
        C16800a aVar = (C16800a) obj;
        return C41536l.m120484d(this.f47074a, aVar.f47074a) && this.f47075b == aVar.f47075b;
    }

    public int hashCode() {
        int hashCode = this.f47074a.hashCode() * 31;
        boolean z = this.f47075b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C26765d dVar = this.f47074a;
        boolean z = this.f47075b;
        return "CardAndBlockStatusModel(card=" + dVar + ", isBlocked=" + z + ")";
    }
}
