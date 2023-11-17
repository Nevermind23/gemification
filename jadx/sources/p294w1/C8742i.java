package p294w1;

import androidx.core.util.C1004d;

/* renamed from: w1.i */
public class C8742i {

    /* renamed from: a */
    Object f24601a;

    /* renamed from: b */
    Object f24602b;

    /* renamed from: a */
    private static boolean m32535a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void mo24148b(Object obj, Object obj2) {
        this.f24601a = obj;
        this.f24602b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1004d)) {
            return false;
        }
        C1004d dVar = (C1004d) obj;
        if (!m32535a(dVar.f3642a, this.f24601a) || !m32535a(dVar.f3643b, this.f24602b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.f24601a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f24602b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f24601a + " " + this.f24602b + "}";
    }
}
