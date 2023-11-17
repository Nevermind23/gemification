package dk0;

import kotlin.jvm.internal.C41536l;

/* renamed from: dk0.b */
public final class C20032b {

    /* renamed from: a */
    private final String f54630a;

    /* renamed from: b */
    private final C20031a f54631b;

    /* renamed from: c */
    private final C20036f f54632c;

    public C20032b(String str, C20031a aVar, C20036f fVar) {
        C41536l.m120489i(str, "identifier");
        C41536l.m120489i(aVar, "network");
        C41536l.m120489i(fVar, "provider");
        this.f54630a = str;
        this.f54631b = aVar;
        this.f54632c = fVar;
    }

    /* renamed from: a */
    public final String mo48402a() {
        return this.f54630a;
    }

    /* renamed from: b */
    public final C20031a mo48403b() {
        return this.f54631b;
    }

    /* renamed from: c */
    public final C20036f mo48404c() {
        return this.f54632c;
    }

    /* renamed from: d */
    public final String mo48405d() {
        return this.f54630a;
    }

    /* renamed from: e */
    public final C20031a mo48406e() {
        return this.f54631b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20032b)) {
            return false;
        }
        C20032b bVar = (C20032b) obj;
        return C41536l.m120484d(this.f54630a, bVar.f54630a) && this.f54631b == bVar.f54631b && this.f54632c == bVar.f54632c;
    }

    public int hashCode() {
        return (((this.f54630a.hashCode() * 31) + this.f54631b.hashCode()) * 31) + this.f54632c.hashCode();
    }

    public String toString() {
        String str = this.f54630a;
        C20031a aVar = this.f54631b;
        C20036f fVar = this.f54632c;
        return "CardTokenCheckRequest(identifier=" + str + ", network=" + aVar + ", provider=" + fVar + ")";
    }
}
