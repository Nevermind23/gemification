package p251sa;

import java.util.Set;

/* renamed from: sa.a */
final class C8276a extends C8277b {

    /* renamed from: a */
    private final Set f23473a;

    C8276a(Set set) {
        if (set != null) {
            this.f23473a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    /* renamed from: b */
    public Set mo23443b() {
        return this.f23473a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8277b) {
            return this.f23473a.equals(((C8277b) obj).mo23443b());
        }
        return false;
    }

    public int hashCode() {
        return this.f23473a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f23473a + "}";
    }
}
