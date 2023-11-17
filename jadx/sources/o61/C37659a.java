package o61;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: o61.a */
public final class C37659a {

    /* renamed from: a */
    private final List f90515a;

    /* renamed from: b */
    private final boolean f90516b;

    /* renamed from: c */
    private final int f90517c;

    public C37659a(List list, boolean z, int i) {
        C41536l.m120489i(list, "stories");
        this.f90515a = list;
        this.f90516b = z;
        this.f90517c = i;
    }

    /* renamed from: a */
    public final int mo90835a() {
        return this.f90517c;
    }

    /* renamed from: b */
    public final List mo90836b() {
        return this.f90515a;
    }

    /* renamed from: c */
    public final boolean mo90837c() {
        return this.f90516b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37659a)) {
            return false;
        }
        C37659a aVar = (C37659a) obj;
        return C41536l.m120484d(this.f90515a, aVar.f90515a) && this.f90516b == aVar.f90516b && this.f90517c == aVar.f90517c;
    }

    public int hashCode() {
        int hashCode = this.f90515a.hashCode() * 31;
        boolean z = this.f90516b;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f90517c;
    }

    public String toString() {
        List list = this.f90515a;
        boolean z = this.f90516b;
        int i = this.f90517c;
        return "OpenStoryGroupData(stories=" + list + ", isSeenStory=" + z + ", startingIndex=" + i + ")";
    }
}
