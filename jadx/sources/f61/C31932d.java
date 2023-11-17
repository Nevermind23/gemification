package f61;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: f61.d */
public final class C31932d {

    /* renamed from: a */
    private final C31933e f78706a;

    /* renamed from: b */
    private final List f78707b;

    public C31932d(C31933e eVar, List list) {
        C41536l.m120489i(eVar, "story");
        C41536l.m120489i(list, "details");
        this.f78706a = eVar;
        this.f78707b = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C31932d m94302b(C31932d dVar, C31933e eVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = dVar.f78706a;
        }
        if ((i & 2) != 0) {
            list = dVar.f78707b;
        }
        return dVar.mo72402a(eVar, list);
    }

    /* renamed from: a */
    public final C31932d mo72402a(C31933e eVar, List list) {
        C41536l.m120489i(eVar, "story");
        C41536l.m120489i(list, "details");
        return new C31932d(eVar, list);
    }

    /* renamed from: c */
    public final List mo72403c() {
        return this.f78707b;
    }

    /* renamed from: d */
    public final C31933e mo72404d() {
        return this.f78706a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31932d)) {
            return false;
        }
        C31932d dVar = (C31932d) obj;
        return C41536l.m120484d(this.f78706a, dVar.f78706a) && C41536l.m120484d(this.f78707b, dVar.f78707b);
    }

    public int hashCode() {
        return (this.f78706a.hashCode() * 31) + this.f78707b.hashCode();
    }

    public String toString() {
        C31933e eVar = this.f78706a;
        List list = this.f78707b;
        return "StoryGroup(story=" + eVar + ", details=" + list + ")";
    }
}
