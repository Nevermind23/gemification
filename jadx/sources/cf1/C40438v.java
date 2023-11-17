package cf1;

import kotlin.jvm.internal.C41536l;

/* renamed from: cf1.v */
abstract class C40438v extends C40437u {
    /* renamed from: j */
    public static Integer m117098j(String str) {
        C41536l.m120489i(str, "<this>");
        return m117099k(str, 10);
    }

    /* renamed from: k */
    public static final Integer m117099k(String str, int i) {
        int i2;
        boolean z;
        int i3;
        C41536l.m120489i(str, "<this>");
        int unused = C40405b.m116976a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (C41536l.m120491k(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int b = C40405b.m116977b(str.charAt(i2), i);
            if (b < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + b) {
                return null;
            }
            i4 = i3 - b;
            i2++;
        }
        if (z) {
            return Integer.valueOf(i4);
        }
        return Integer.valueOf(-i4);
    }

    /* renamed from: l */
    public static Long m117100l(String str) {
        C41536l.m120489i(str, "<this>");
        return m117101m(str, 10);
    }

    /* renamed from: m */
    public static final Long m117101m(String str, int i) {
        boolean z;
        String str2 = str;
        int i2 = i;
        C41536l.m120489i(str2, "<this>");
        int unused = C40405b.m116976a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        if (C41536l.m120491k(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i3 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i3 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i3 < length) {
            int b = C40405b.m116977b(str2.charAt(i3), i2);
            if (b < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / ((long) i2);
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * ((long) i2);
            long j6 = (long) b;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i3++;
            j2 = -256204778801521550L;
        }
        if (z) {
            return Long.valueOf(j3);
        }
        return Long.valueOf(-j3);
    }
}
