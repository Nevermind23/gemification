package p606sl;

import hd0.C24977a;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: sl.m */
public final class C17847m {

    /* renamed from: a */
    private final C24977a f50833a;

    /* renamed from: b */
    private final C24977a f50834b;

    /* renamed from: c */
    private final List f50835c;

    /* renamed from: d */
    private final List f50836d;

    public C17847m(C24977a aVar, C24977a aVar2, List list, List list2) {
        C41536l.m120489i(aVar, "summary");
        C41536l.m120489i(aVar2, "cosignerSummary");
        C41536l.m120489i(list, "loans");
        C41536l.m120489i(list2, "details");
        this.f50833a = aVar;
        this.f50834b = aVar2;
        this.f50835c = list;
        this.f50836d = list2;
    }

    /* renamed from: a */
    public final List mo45505a() {
        return this.f50836d;
    }

    /* renamed from: b */
    public final List mo45506b() {
        return this.f50835c;
    }

    /* renamed from: c */
    public final C24977a mo45507c() {
        return this.f50833a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17847m)) {
            return false;
        }
        C17847m mVar = (C17847m) obj;
        return C41536l.m120484d(this.f50833a, mVar.f50833a) && C41536l.m120484d(this.f50834b, mVar.f50834b) && C41536l.m120484d(this.f50835c, mVar.f50835c) && C41536l.m120484d(this.f50836d, mVar.f50836d);
    }

    public int hashCode() {
        return (((((this.f50833a.hashCode() * 31) + this.f50834b.hashCode()) * 31) + this.f50835c.hashCode()) * 31) + this.f50836d.hashCode();
    }

    public String toString() {
        C24977a aVar = this.f50833a;
        C24977a aVar2 = this.f50834b;
        List list = this.f50835c;
        List list2 = this.f50836d;
        return "BnplObject(summary=" + aVar + ", cosignerSummary=" + aVar2 + ", loans=" + list + ", details=" + list2 + ")";
    }
}
