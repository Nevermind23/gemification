package ie1;

import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.h0 */
public final class C41324h0 {

    /* renamed from: a */
    private final int f97378a;

    /* renamed from: b */
    private final Object f97379b;

    public C41324h0(int i, Object obj) {
        this.f97378a = i;
        this.f97379b = obj;
    }

    /* renamed from: a */
    public final int mo95943a() {
        return this.f97378a;
    }

    /* renamed from: b */
    public final Object mo95944b() {
        return this.f97379b;
    }

    /* renamed from: c */
    public final int mo95945c() {
        return this.f97378a;
    }

    /* renamed from: d */
    public final Object mo95946d() {
        return this.f97379b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41324h0)) {
            return false;
        }
        C41324h0 h0Var = (C41324h0) obj;
        return this.f97378a == h0Var.f97378a && C41536l.m120484d(this.f97379b, h0Var.f97379b);
    }

    public int hashCode() {
        int i = this.f97378a * 31;
        Object obj = this.f97379b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f97378a + ", value=" + this.f97379b + ')';
    }
}
