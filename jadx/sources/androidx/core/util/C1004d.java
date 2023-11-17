package androidx.core.util;

/* renamed from: androidx.core.util.d */
public class C1004d {

    /* renamed from: a */
    public final Object f3642a;

    /* renamed from: b */
    public final Object f3643b;

    public C1004d(Object obj, Object obj2) {
        this.f3642a = obj;
        this.f3643b = obj2;
    }

    /* renamed from: a */
    public static C1004d m3516a(Object obj, Object obj2) {
        return new C1004d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1004d)) {
            return false;
        }
        C1004d dVar = (C1004d) obj;
        if (!C1002c.m3509a(dVar.f3642a, this.f3642a) || !C1002c.m3509a(dVar.f3643b, this.f3643b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.f3642a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3643b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f3642a + " " + this.f3643b + "}";
    }
}
