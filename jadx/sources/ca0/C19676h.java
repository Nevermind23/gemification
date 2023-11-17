package ca0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ca0.h */
public final class C19676h {

    /* renamed from: a */
    private final List f54008a;

    /* renamed from: b */
    private final List f54009b;

    /* renamed from: c */
    private final boolean f54010c;

    /* renamed from: d */
    private final C19669a f54011d;

    public C19676h(List list, List list2, boolean z, C19669a aVar) {
        C41536l.m120489i(list, "ddList");
        C41536l.m120489i(list2, "stoList");
        C41536l.m120489i(aVar, "contentState");
        this.f54008a = list;
        this.f54009b = list2;
        this.f54010c = z;
        this.f54011d = aVar;
    }

    /* renamed from: a */
    public final C19669a mo47865a() {
        return this.f54011d;
    }

    /* renamed from: b */
    public final List mo47866b() {
        return this.f54008a;
    }

    /* renamed from: c */
    public final boolean mo47867c() {
        return this.f54010c;
    }

    /* renamed from: d */
    public final List mo47868d() {
        return this.f54009b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19676h)) {
            return false;
        }
        C19676h hVar = (C19676h) obj;
        return C41536l.m120484d(this.f54008a, hVar.f54008a) && C41536l.m120484d(this.f54009b, hVar.f54009b) && this.f54010c == hVar.f54010c && this.f54011d == hVar.f54011d;
    }

    public int hashCode() {
        int hashCode = ((this.f54008a.hashCode() * 31) + this.f54009b.hashCode()) * 31;
        boolean z = this.f54010c;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f54011d.hashCode();
    }

    public String toString() {
        List list = this.f54008a;
        List list2 = this.f54009b;
        boolean z = this.f54010c;
        C19669a aVar = this.f54011d;
        return "DdStoIntroState(ddList=" + list + ", stoList=" + list2 + ", showEmptyDescription=" + z + ", contentState=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19676h(List list, List list2, boolean z, C19669a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list, (i & 2) != 0 ? C41341q.m119907j() : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C19669a.SUCCESS : aVar);
    }
}
