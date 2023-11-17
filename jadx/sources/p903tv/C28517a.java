package p903tv;

import kotlin.jvm.internal.C41536l;

/* renamed from: tv.a */
public final class C28517a {

    /* renamed from: a */
    private final C28519c f72329a;

    /* renamed from: b */
    private final C28519c f72330b;

    public C28517a(C28519c cVar, C28519c cVar2) {
        C41536l.m120489i(cVar, "expenses");
        C41536l.m120489i(cVar2, "incomes");
        this.f72329a = cVar;
        this.f72330b = cVar2;
    }

    /* renamed from: b */
    public static /* synthetic */ C28517a m87349b(C28517a aVar, C28519c cVar, C28519c cVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = aVar.f72329a;
        }
        if ((i & 2) != 0) {
            cVar2 = aVar.f72330b;
        }
        return aVar.mo68114a(cVar, cVar2);
    }

    /* renamed from: a */
    public final C28517a mo68114a(C28519c cVar, C28519c cVar2) {
        C41536l.m120489i(cVar, "expenses");
        C41536l.m120489i(cVar2, "incomes");
        return new C28517a(cVar, cVar2);
    }

    /* renamed from: c */
    public final C28519c mo68115c() {
        return this.f72329a;
    }

    /* renamed from: d */
    public final C28519c mo68116d() {
        return this.f72330b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28517a)) {
            return false;
        }
        C28517a aVar = (C28517a) obj;
        return C41536l.m120484d(this.f72329a, aVar.f72329a) && C41536l.m120484d(this.f72330b, aVar.f72330b);
    }

    public int hashCode() {
        return (this.f72329a.hashCode() * 31) + this.f72330b.hashCode();
    }

    public String toString() {
        C28519c cVar = this.f72329a;
        C28519c cVar2 = this.f72330b;
        return "Analysis(expenses=" + cVar + ", incomes=" + cVar2 + ")";
    }
}
