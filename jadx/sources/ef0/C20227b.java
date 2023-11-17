package ef0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ef0.b */
public final class C20227b {

    /* renamed from: a */
    private final C20231f f55097a;

    /* renamed from: b */
    private final List f55098b;

    public C20227b(C20231f fVar, List list) {
        C41536l.m120489i(list, "fundingSourcesList");
        this.f55097a = fVar;
        this.f55098b = list;
    }

    /* renamed from: a */
    public final C20231f mo48669a() {
        return this.f55097a;
    }

    /* renamed from: b */
    public final List mo48670b() {
        return this.f55098b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20227b)) {
            return false;
        }
        C20227b bVar = (C20227b) obj;
        return C41536l.m120484d(this.f55097a, bVar.f55097a) && C41536l.m120484d(this.f55098b, bVar.f55098b);
    }

    public int hashCode() {
        C20231f fVar = this.f55097a;
        return ((fVar == null ? 0 : fVar.hashCode()) * 31) + this.f55098b.hashCode();
    }

    public String toString() {
        C20231f fVar = this.f55097a;
        List list = this.f55098b;
        return "FundingSourcesModel(fundingSource=" + fVar + ", fundingSourcesList=" + list + ")";
    }
}
