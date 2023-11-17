package hc1;

import kotlin.jvm.internal.C41536l;
import sso.type.AuthElementType;

/* renamed from: hc1.a */
public final class C41127a {

    /* renamed from: a */
    private final AuthElementType f97038a;

    /* renamed from: b */
    private final boolean f97039b;

    public C41127a(AuthElementType authElementType, boolean z) {
        C41536l.m120489i(authElementType, "element");
        this.f97038a = authElementType;
        this.f97039b = z;
    }

    /* renamed from: a */
    public final AuthElementType mo95555a() {
        return this.f97038a;
    }

    /* renamed from: b */
    public final boolean mo95556b() {
        return this.f97039b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41127a)) {
            return false;
        }
        C41127a aVar = (C41127a) obj;
        return this.f97038a == aVar.f97038a && this.f97039b == aVar.f97039b;
    }

    public int hashCode() {
        int hashCode = this.f97038a.hashCode() * 31;
        boolean z = this.f97039b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ElementConfig(element=" + this.f97038a + ", isSkippable=" + this.f97039b + ')';
    }
}
