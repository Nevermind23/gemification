package p913uu;

import kotlin.jvm.internal.C41536l;

/* renamed from: uu.a */
public final class C28935a {

    /* renamed from: a */
    private final C28936b f73791a;

    public C28935a(C28936b bVar) {
        C41536l.m120489i(bVar, "details");
        this.f73791a = bVar;
    }

    /* renamed from: a */
    public final C28936b mo68689a() {
        return this.f73791a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28935a) && C41536l.m120484d(this.f73791a, ((C28935a) obj).f73791a);
    }

    public int hashCode() {
        return this.f73791a.hashCode();
    }

    public String toString() {
        C28936b bVar = this.f73791a;
        return "CheckLimitDecision(details=" + bVar + ")";
    }
}
