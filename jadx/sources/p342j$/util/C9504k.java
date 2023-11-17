package p342j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.k */
public final class C9504k {

    /* renamed from: c */
    private static final C9504k f26147c = new C9504k();

    /* renamed from: a */
    private final boolean f26148a;

    /* renamed from: b */
    private final double f26149b;

    private C9504k() {
        this.f26148a = false;
        this.f26149b = Double.NaN;
    }

    private C9504k(double d) {
        this.f26148a = true;
        this.f26149b = d;
    }

    /* renamed from: a */
    public static C9504k m34864a() {
        return f26147c;
    }

    /* renamed from: d */
    public static C9504k m34865d(double d) {
        return new C9504k(d);
    }

    /* renamed from: b */
    public final double mo25644b() {
        if (this.f26148a) {
            return this.f26149b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean mo25645c() {
        return this.f26148a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9504k)) {
            return false;
        }
        C9504k kVar = (C9504k) obj;
        boolean z = this.f26148a;
        if (!z || !kVar.f26148a) {
            if (z == kVar.f26148a) {
                return true;
            }
        } else if (Double.compare(this.f26149b, kVar.f26149b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f26148a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f26149b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f26148a) {
            return "OptionalDouble.empty";
        }
        return String.format("OptionalDouble[%s]", new Object[]{Double.valueOf(this.f26149b)});
    }
}
