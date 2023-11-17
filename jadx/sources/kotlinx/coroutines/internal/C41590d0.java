package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.d0 */
abstract /* synthetic */ class C41590d0 {
    /* renamed from: a */
    public static final int m120641a(String str, int i, int i2, int i3) {
        return (int) C41586b0.m120627c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m120642b(String str, long j, long j2, long j3) {
        String d = C41586b0.m120628d(str);
        if (d == null) {
            return j;
        }
        Long l = C40438v.m117100l(d);
        if (l != null) {
            long longValue = l.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m120643c(String str, boolean z) {
        String d = C41586b0.m120628d(str);
        return d != null ? Boolean.parseBoolean(d) : z;
    }

    /* renamed from: d */
    public static /* synthetic */ int m120644d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C41586b0.m120626b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m120645e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C41586b0.m120627c(str, j, j4, j3);
    }
}
