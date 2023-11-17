package dk0;

import kotlin.jvm.internal.C41536l;

/* renamed from: dk0.c */
public final class C20033c {

    /* renamed from: a */
    private final C20032b f54633a;

    /* renamed from: b */
    private final C20034d f54634b;

    public C20033c(C20032b bVar, C20034d dVar) {
        C41536l.m120489i(bVar, "request");
        C41536l.m120489i(dVar, "result");
        this.f54633a = bVar;
        this.f54634b = dVar;
    }

    /* renamed from: a */
    public final C20032b mo48410a() {
        return this.f54633a;
    }

    /* renamed from: b */
    public final C20034d mo48411b() {
        return this.f54634b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20033c)) {
            return false;
        }
        C20033c cVar = (C20033c) obj;
        return C41536l.m120484d(this.f54633a, cVar.f54633a) && C41536l.m120484d(this.f54634b, cVar.f54634b);
    }

    public int hashCode() {
        return (this.f54633a.hashCode() * 31) + this.f54634b.hashCode();
    }

    public String toString() {
        C20032b bVar = this.f54633a;
        C20034d dVar = this.f54634b;
        return "CardTokenCheckResult(request=" + bVar + ", result=" + dVar + ")";
    }
}
