package hc1;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: hc1.i0 */
public final class C41171i0 {

    /* renamed from: a */
    private final C41127a f97128a;

    /* renamed from: b */
    private final List f97129b;

    public C41171i0(C41127a aVar, List list) {
        C41536l.m120489i(list, "secondaryElements");
        this.f97128a = aVar;
        this.f97129b = list;
    }

    /* renamed from: c */
    public static /* synthetic */ C41171i0 m119342c(C41171i0 i0Var, C41127a aVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = i0Var.f97128a;
        }
        if ((i & 2) != 0) {
            list = i0Var.f97129b;
        }
        return i0Var.mo95620b(aVar, list);
    }

    /* renamed from: a */
    public final List mo95619a() {
        List p = C41341q.m119913p(this.f97128a);
        p.addAll(this.f97129b);
        return C41358y.m120004T(p);
    }

    /* renamed from: b */
    public final C41171i0 mo95620b(C41127a aVar, List list) {
        C41536l.m120489i(list, "secondaryElements");
        return new C41171i0(aVar, list);
    }

    /* renamed from: d */
    public final C41127a mo95621d() {
        return this.f97128a;
    }

    /* renamed from: e */
    public final List mo95622e() {
        return this.f97129b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41171i0)) {
            return false;
        }
        C41171i0 i0Var = (C41171i0) obj;
        return C41536l.m120484d(this.f97128a, i0Var.f97128a) && C41536l.m120484d(this.f97129b, i0Var.f97129b);
    }

    public int hashCode() {
        C41127a aVar = this.f97128a;
        return ((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f97129b.hashCode();
    }

    public String toString() {
        return "VerificationFlow(primaryElement=" + this.f97128a + ", secondaryElements=" + this.f97129b + ')';
    }
}
