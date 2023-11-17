package p677yb;

/* renamed from: yb.b */
public class C18872b {

    /* renamed from: a */
    private final int f52812a;

    /* renamed from: b */
    private final int f52813b;

    public C18872b(int i, int i2) {
        this.f52812a = i;
        this.f52813b = i2;
    }

    /* renamed from: a */
    public final int mo46848a() {
        return this.f52813b;
    }

    /* renamed from: b */
    public final int mo46849b() {
        return this.f52812a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18872b)) {
            return false;
        }
        C18872b bVar = (C18872b) obj;
        if (this.f52812a == bVar.f52812a && this.f52813b == bVar.f52813b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52812a ^ this.f52813b;
    }

    public final String toString() {
        return this.f52812a + "(" + this.f52813b + ')';
    }
}
