package pe1;

/* renamed from: pe1.c */
public abstract class C42193c {
    /* renamed from: a */
    private static final int m122495a(int i, int i2, int i3) {
        return m122499e(m122499e(i, i3) - m122499e(i2, i3), i3);
    }

    /* renamed from: b */
    private static final long m122496b(long j, long j2, long j3) {
        return m122500f(m122500f(j, j3) - m122500f(j2, j3), j3);
    }

    /* renamed from: c */
    public static final int m122497c(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m122495a(i2, i, i3);
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            return i2 + m122495a(i, i2, -i3);
        }
    }

    /* renamed from: d */
    public static final long m122498d(long j, long j2, long j3) {
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i > 0) {
            if (j >= j2) {
                return j2;
            }
            return j2 - m122496b(j2, j, j3);
        } else if (i >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (j <= j2) {
            return j2;
        } else {
            return j2 + m122496b(j, j2, -j3);
        }
    }

    /* renamed from: e */
    private static final int m122499e(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: f */
    private static final long m122500f(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
