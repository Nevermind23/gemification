package df1;

import df1.C40651b;

/* renamed from: df1.g */
public abstract class C40657g {
    /* renamed from: a */
    private static final long m117516a(long j, long j2) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            long j4 = (long) 1000000;
            long j5 = (j % j4) - (j2 % j4);
            C40651b.C40652a aVar = C40651b.f96277d;
            return C40651b.m117469D(C40654d.m117511o((j / j4) - (j2 / j4), C40655e.MILLISECONDS), C40654d.m117511o(j5, C40655e.NANOSECONDS));
        }
        C40651b.C40652a aVar2 = C40651b.f96277d;
        return C40654d.m117511o(j3, C40655e.NANOSECONDS);
    }

    /* renamed from: b */
    public static final long m117517b(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if ((1 | (j - 1)) != Long.MAX_VALUE) {
                z2 = false;
            }
            if (z2) {
                return C40654d.m117511o(j, C40655e.DAYS);
            }
            return m117516a(j, j2);
        } else if (j == j2) {
            return C40651b.f96277d.mo94646a();
        } else {
            return C40651b.m117473H(C40654d.m117511o(j2, C40655e.DAYS));
        }
    }
}
