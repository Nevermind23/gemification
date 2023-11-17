package y50;

import kotlin.jvm.internal.C41536l;

/* renamed from: y50.b */
public final class C29928b {

    /* renamed from: a */
    private final Object f75718a;

    /* renamed from: b */
    private boolean f75719b;

    public C29928b(Object obj) {
        C41536l.m120489i(obj, "item");
        this.f75718a = obj;
    }

    /* renamed from: b */
    public static /* synthetic */ C29928b m90791b(C29928b bVar, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = bVar.f75718a;
        }
        return bVar.mo70236a(obj);
    }

    /* renamed from: a */
    public final C29928b mo70236a(Object obj) {
        C41536l.m120489i(obj, "item");
        return new C29928b(obj);
    }

    /* renamed from: c */
    public final Object mo70237c() {
        return this.f75718a;
    }

    /* renamed from: d */
    public final boolean mo70238d() {
        return this.f75719b;
    }

    /* renamed from: e */
    public final void mo70239e(boolean z) {
        this.f75719b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29928b) && C41536l.m120484d(this.f75718a, ((C29928b) obj).f75718a);
    }

    public int hashCode() {
        return this.f75718a.hashCode();
    }

    public String toString() {
        Object obj = this.f75718a;
        return "SelectableItem(item=" + obj + ")";
    }
}
