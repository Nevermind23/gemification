package x80;

import kotlin.jvm.internal.C41536l;

/* renamed from: x80.d */
public final class C29660d {

    /* renamed from: a */
    private final C29659c f74844a;

    public C29660d(C29659c cVar) {
        C41536l.m120489i(cVar, "loanDetails");
        this.f74844a = cVar;
    }

    /* renamed from: a */
    public final C29659c mo69598a() {
        return this.f74844a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29660d) && C41536l.m120484d(this.f74844a, ((C29660d) obj).f74844a);
    }

    public int hashCode() {
        return this.f74844a.hashCode();
    }

    public String toString() {
        C29659c cVar = this.f74844a;
        return "PrepareApplication(loanDetails=" + cVar + ")";
    }
}
