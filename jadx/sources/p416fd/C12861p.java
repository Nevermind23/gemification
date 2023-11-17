package p416fd;

/* renamed from: fd.p */
public class C12861p implements Comparable {

    /* renamed from: d */
    public final int f38002d;

    /* renamed from: e */
    public final int f38003e;

    public C12861p(int i, int i2) {
        this.f38002d = i;
        this.f38003e = i2;
    }

    /* renamed from: a */
    public int compareTo(C12861p pVar) {
        int i = this.f38003e * this.f38002d;
        int i2 = pVar.f38003e * pVar.f38002d;
        if (i2 < i) {
            return 1;
        }
        if (i2 > i) {
            return -1;
        }
        return 0;
    }

    /* renamed from: b */
    public C12861p mo33530b() {
        return new C12861p(this.f38003e, this.f38002d);
    }

    /* renamed from: c */
    public C12861p mo33531c(C12861p pVar) {
        int i = this.f38002d;
        int i2 = pVar.f38003e;
        int i3 = i * i2;
        int i4 = pVar.f38002d;
        int i5 = this.f38003e;
        if (i3 <= i4 * i5) {
            return new C12861p(i4, (i5 * i4) / i);
        }
        return new C12861p((i * i2) / i5, i2);
    }

    /* renamed from: e */
    public C12861p mo33533e(C12861p pVar) {
        int i = this.f38002d;
        int i2 = pVar.f38003e;
        int i3 = i * i2;
        int i4 = pVar.f38002d;
        int i5 = this.f38003e;
        if (i3 >= i4 * i5) {
            return new C12861p(i4, (i5 * i4) / i);
        }
        return new C12861p((i * i2) / i5, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12861p pVar = (C12861p) obj;
        if (this.f38002d == pVar.f38002d && this.f38003e == pVar.f38003e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f38002d * 31) + this.f38003e;
    }

    public String toString() {
        return this.f38002d + "x" + this.f38003e;
    }
}
