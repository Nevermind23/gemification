package gc1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gc1.a */
public final class C40956a extends C40990p {

    /* renamed from: d */
    private final String f96732d;

    /* renamed from: e */
    private final String f96733e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40956a(String str, String str2) {
        super(str, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "_id");
        C41536l.m120489i(str2, "text");
        this.f96732d = str;
        this.f96733e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40956a)) {
            return false;
        }
        C40956a aVar = (C40956a) obj;
        return C41536l.m120484d(this.f96732d, aVar.f96732d) && C41536l.m120484d(this.f96733e, aVar.f96733e);
    }

    /* renamed from: f */
    public final String mo95354f() {
        return this.f96733e;
    }

    public int hashCode() {
        return (this.f96732d.hashCode() * 31) + this.f96733e.hashCode();
    }

    public String toString() {
        return "ContactItem(_id=" + this.f96732d + ", text=" + this.f96733e + ')';
    }
}
