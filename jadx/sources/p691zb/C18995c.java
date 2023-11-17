package p691zb;

import java.util.ArrayList;
import java.util.List;

/* renamed from: zb.c */
final class C18995c {

    /* renamed from: a */
    private final List f53007a;

    /* renamed from: b */
    private final int f53008b;

    /* renamed from: c */
    private final boolean f53009c;

    C18995c(List list, int i, boolean z) {
        this.f53007a = new ArrayList(list);
        this.f53008b = i;
        this.f53009c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List mo47040a() {
        return this.f53007a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo47041b() {
        return this.f53008b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo47042c(List list) {
        return this.f53007a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18995c)) {
            return false;
        }
        C18995c cVar = (C18995c) obj;
        if (!this.f53007a.equals(cVar.f53007a) || this.f53009c != cVar.f53009c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f53007a.hashCode() ^ Boolean.valueOf(this.f53009c).hashCode();
    }

    public String toString() {
        return "{ " + this.f53007a + " }";
    }
}
