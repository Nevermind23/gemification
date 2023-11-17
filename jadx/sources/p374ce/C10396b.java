package p374ce;

/* renamed from: ce.b */
public class C10396b implements Comparable {

    /* renamed from: d */
    private final int f29604d;

    /* renamed from: e */
    private final int f29605e;

    public C10396b(int i, int i2) {
        this.f29604d = i;
        this.f29605e = i2;
    }

    /* renamed from: a */
    public int compareTo(C10396b bVar) {
        return (this.f29604d * this.f29605e) - (bVar.f29604d * bVar.f29605e);
    }

    /* renamed from: b */
    public C10396b mo27059b() {
        return new C10396b(this.f29605e, this.f29604d);
    }

    /* renamed from: c */
    public int mo27060c() {
        return this.f29605e;
    }

    /* renamed from: e */
    public int mo27062e() {
        return this.f29604d;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10396b)) {
            return false;
        }
        C10396b bVar = (C10396b) obj;
        if (this.f29604d == bVar.f29604d && this.f29605e == bVar.f29605e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f29605e;
        int i2 = this.f29604d;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f29604d + "x" + this.f29605e;
    }
}
