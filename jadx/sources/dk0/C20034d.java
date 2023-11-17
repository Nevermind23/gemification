package dk0;

import ek0.C20261a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dk0.d */
public final class C20034d {

    /* renamed from: a */
    private final C20261a f54635a;

    /* renamed from: b */
    private final String f54636b;

    public C20034d(C20261a aVar, String str) {
        C41536l.m120489i(aVar, "status");
        this.f54635a = aVar;
        this.f54636b = str;
    }

    /* renamed from: a */
    public final String mo48415a() {
        return this.f54636b;
    }

    /* renamed from: b */
    public final C20261a mo48416b() {
        return this.f54635a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20034d)) {
            return false;
        }
        C20034d dVar = (C20034d) obj;
        return this.f54635a == dVar.f54635a && C41536l.m120484d(this.f54636b, dVar.f54636b);
    }

    public int hashCode() {
        int hashCode = this.f54635a.hashCode() * 31;
        String str = this.f54636b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C20261a aVar = this.f54635a;
        String str = this.f54636b;
        return "CardTokenStatusResult(status=" + aVar + ", issuerTokenId=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20034d(C20261a aVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : str);
    }
}
