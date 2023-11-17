package p342j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.m */
public final class C9506m {

    /* renamed from: c */
    private static final C9506m f26153c = new C9506m();

    /* renamed from: a */
    private final boolean f26154a;

    /* renamed from: b */
    private final long f26155b;

    private C9506m() {
        this.f26154a = false;
        this.f26155b = 0;
    }

    private C9506m(long j) {
        this.f26154a = true;
        this.f26155b = j;
    }

    /* renamed from: a */
    public static C9506m m34872a() {
        return f26153c;
    }

    /* renamed from: d */
    public static C9506m m34873d(long j) {
        return new C9506m(j);
    }

    /* renamed from: b */
    public final long mo25654b() {
        if (this.f26154a) {
            return this.f26155b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean mo25655c() {
        return this.f26154a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9506m)) {
            return false;
        }
        C9506m mVar = (C9506m) obj;
        boolean z = this.f26154a;
        if (!z || !mVar.f26154a) {
            if (z == mVar.f26154a) {
                return true;
            }
        } else if (this.f26155b == mVar.f26155b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f26154a) {
            return 0;
        }
        long j = this.f26155b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (!this.f26154a) {
            return "OptionalLong.empty";
        }
        return String.format("OptionalLong[%s]", new Object[]{Long.valueOf(this.f26155b)});
    }
}
