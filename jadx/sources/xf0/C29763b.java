package xf0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xf0.b */
public final class C29763b {

    /* renamed from: a */
    private C29765d f75290a;

    /* renamed from: b */
    private final List f75291b;

    public C29763b(C29765d dVar, List list) {
        C41536l.m120489i(list, "fundingSourcesList");
        this.f75290a = dVar;
        this.f75291b = list;
    }

    /* renamed from: a */
    public final C29765d mo69910a() {
        return this.f75290a;
    }

    /* renamed from: b */
    public final List mo69911b() {
        return this.f75291b;
    }

    /* renamed from: c */
    public final void mo69912c(C29765d dVar) {
        this.f75290a = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29763b)) {
            return false;
        }
        C29763b bVar = (C29763b) obj;
        return C41536l.m120484d(this.f75290a, bVar.f75290a) && C41536l.m120484d(this.f75291b, bVar.f75291b);
    }

    public int hashCode() {
        C29765d dVar = this.f75290a;
        return ((dVar == null ? 0 : dVar.hashCode()) * 31) + this.f75291b.hashCode();
    }

    public String toString() {
        C29765d dVar = this.f75290a;
        List list = this.f75291b;
        return "FundingSourcesUIModel(fundingSource=" + dVar + ", fundingSourcesList=" + list + ")";
    }
}
