package po0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: po0.n */
public final class C17469n {

    /* renamed from: a */
    private final C17456a f48884a;

    /* renamed from: b */
    private final List f48885b;

    public C17469n(C17456a aVar, List list) {
        C41536l.m120489i(aVar, "benefTypes");
        C41536l.m120489i(list, "benefits");
        this.f48884a = aVar;
        this.f48885b = list;
    }

    /* renamed from: a */
    public final C17456a mo44970a() {
        return this.f48884a;
    }

    /* renamed from: b */
    public final List mo44971b() {
        return this.f48885b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17469n)) {
            return false;
        }
        C17469n nVar = (C17469n) obj;
        return C41536l.m120484d(this.f48884a, nVar.f48884a) && C41536l.m120484d(this.f48885b, nVar.f48885b);
    }

    public int hashCode() {
        return (this.f48884a.hashCode() * 31) + this.f48885b.hashCode();
    }

    public String toString() {
        C17456a aVar = this.f48884a;
        List list = this.f48885b;
        return "OffersProgressModel(benefTypes=" + aVar + ", benefits=" + list + ")";
    }
}
