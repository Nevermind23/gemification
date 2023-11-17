package p105h7;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: h7.y */
final class C6475y {

    /* renamed from: a */
    private final String f19794a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final char[] f19795b;

    /* renamed from: c */
    final int f19796c;

    /* renamed from: d */
    final int f19797d;

    /* renamed from: e */
    final int f19798e;

    /* renamed from: f */
    final int f19799f;

    /* renamed from: g */
    private final byte[] f19800g;

    /* renamed from: h */
    private final boolean f19801h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C6475y(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        L_0x000a:
            int r5 = r11.length
            if (r4 >= r5) goto L_0x002b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L_0x0014
            r7 = r6
            goto L_0x0015
        L_0x0014:
            r7 = r3
        L_0x0015:
            java.lang.String r8 = "Non-ASCII character: %s"
            p105h7.C6460j.m25557d(r7, r8, r5)
            byte r7 = r1[r5]
            if (r7 != r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r6 = r3
        L_0x0020:
            java.lang.String r7 = "Duplicate character: %s"
            p105h7.C6460j.m25557d(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto L_0x000a
        L_0x002b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p105h7.C6475y.<init>(java.lang.String, char[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final char mo20382a(int i) {
        return this.f19795b[i];
    }

    /* renamed from: b */
    public final boolean mo20383b(char c) {
        return this.f19800g[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6475y) {
            C6475y yVar = (C6475y) obj;
            boolean z = yVar.f19801h;
            if (Arrays.equals(this.f19795b, yVar.f19795b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19795b) + 1237;
    }

    public final String toString() {
        return this.f19794a;
    }

    private C6475y(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f19794a = str;
        cArr.getClass();
        this.f19795b = cArr;
        try {
            int length = cArr.length;
            int b = C6451e0.m25545b(length, RoundingMode.UNNECESSARY);
            this.f19797d = b;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(b);
            int i = 1 << (3 - numberOfTrailingZeros);
            this.f19798e = i;
            this.f19799f = b >> numberOfTrailingZeros;
            this.f19796c = length - 1;
            this.f19800g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f19799f; i2++) {
                zArr[C6451e0.m25544a(i2 * 8, this.f19797d, RoundingMode.CEILING)] = true;
            }
            this.f19801h = false;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }
}
