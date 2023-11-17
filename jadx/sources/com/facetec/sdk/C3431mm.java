package com.facetec.sdk;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p341ge.bog.mobilebank.p975ui.views.widgets.deprecated.BogTextInputET;

/* renamed from: com.facetec.sdk.mm */
public final class C3431mm implements C3432mn, C3434mp, Cloneable, ByteChannel {

    /* renamed from: a */
    private static final byte[] f11259a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    long f11260b;

    /* renamed from: e */
    C3459na f11261e;

    /* renamed from: k */
    private String m13656k(long j) {
        return m13655e(j, C3460nb.f11312a);
    }

    /* renamed from: a */
    public final long mo9835a() {
        return this.f11260b;
    }

    /* renamed from: b */
    public final long mo9838b() {
        long j = this.f11260b;
        if (j == 0) {
            return 0;
        }
        C3459na naVar = this.f11261e.f11310h;
        int i = naVar.f11307c;
        return (i >= 8192 || !naVar.f11305a) ? j : j - ((long) (i - naVar.f11309e));
    }

    /* renamed from: c */
    public final byte mo9843c(long j) {
        int i;
        C3460nb.m13841e(this.f11260b, j, 1);
        long j2 = this.f11260b;
        if (j2 - j > j) {
            C3459na naVar = this.f11261e;
            while (true) {
                int i2 = naVar.f11307c;
                int i3 = naVar.f11309e;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return naVar.f11308d[i3 + ((int) j)];
                }
                j -= j3;
                naVar = naVar.f11311j;
            }
        } else {
            long j4 = j - j2;
            C3459na naVar2 = this.f11261e;
            do {
                naVar2 = naVar2.f11310h;
                int i4 = naVar2.f11307c;
                i = naVar2.f11309e;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return naVar2.f11308d[i + ((int) j4)];
        }
    }

    public final /* synthetic */ Object clone() {
        C3431mm mmVar = new C3431mm();
        if (this.f11260b == 0) {
            return mmVar;
        }
        C3459na d = this.f11261e.mo9940d();
        mmVar.f11261e = d;
        d.f11310h = d;
        d.f11311j = d;
        C3459na naVar = this.f11261e;
        while (true) {
            naVar = naVar.f11311j;
            if (naVar != this.f11261e) {
                mmVar.f11261e.f11310h.mo9939a(naVar.mo9940d());
            } else {
                mmVar.f11260b = this.f11260b;
                return mmVar;
            }
        }
    }

    public final void close() {
    }

    /* renamed from: d */
    public final C3431mm mo9851d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3431mm)) {
            return false;
        }
        C3431mm mmVar = (C3431mm) obj;
        long j = this.f11260b;
        if (j != mmVar.f11260b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C3459na naVar = this.f11261e;
        C3459na naVar2 = mmVar.f11261e;
        int i = naVar.f11309e;
        int i2 = naVar2.f11309e;
        while (j2 < this.f11260b) {
            long min = (long) Math.min(naVar.f11307c - i, naVar2.f11307c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (naVar.f11308d[i] != naVar2.f11308d[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == naVar.f11307c) {
                naVar = naVar.f11311j;
                i = naVar.f11309e;
            }
            if (i2 == naVar2.f11307c) {
                naVar2 = naVar2.f11311j;
                i2 = naVar2.f11309e;
            }
            j2 += min;
        }
        return true;
    }

    public final void flush() {
    }

    /* renamed from: h */
    public final short mo9873h() {
        long j = this.f11260b;
        if (j >= 2) {
            C3459na naVar = this.f11261e;
            int i = naVar.f11309e;
            int i2 = naVar.f11307c;
            if (i2 - i < 2) {
                return (short) (((mo9866f() & 255) << 8) | (mo9866f() & 255));
            }
            byte[] bArr = naVar.f11308d;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f11260b = j - 2;
            if (i4 == i2) {
                this.f11261e = naVar.mo9941e();
                C3447mz.m13831b(naVar);
            } else {
                naVar.f11309e = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder("size < 2: ");
        sb.append(this.f11260b);
        throw new IllegalStateException(sb.toString());
    }

    public final int hashCode() {
        C3459na naVar = this.f11261e;
        if (naVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = naVar.f11307c;
            for (int i3 = naVar.f11309e; i3 < i2; i3++) {
                i = (i * 31) + naVar.f11308d[i3];
            }
            naVar = naVar.f11311j;
        } while (naVar != this.f11261e);
        return i;
    }

    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final int mo9879j() {
        long j = this.f11260b;
        if (j >= 4) {
            C3459na naVar = this.f11261e;
            int i = naVar.f11309e;
            int i2 = naVar.f11307c;
            if (i2 - i < 4) {
                return ((mo9866f() & 255) << 24) | ((mo9866f() & 255) << 16) | ((mo9866f() & 255) << 8) | (mo9866f() & 255);
            }
            byte[] bArr = naVar.f11308d;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f11260b = j - 4;
            if (i6 == i2) {
                this.f11261e = naVar.mo9941e();
                C3447mz.m13831b(naVar);
            } else {
                naVar.f11309e = i6;
            }
            return b3;
        }
        StringBuilder sb = new StringBuilder("size < 4: ");
        sb.append(this.f11260b);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        r14.f11261e = r6.mo9941e();
        com.facetec.sdk.C3447mz.m13831b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        r6.f11309e = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r1 != false) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073 A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo9882l() {
        /*
            r14 = this;
            long r0 = r14.f11260b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000b:
            com.facetec.sdk.na r6 = r14.f11261e
            byte[] r7 = r6.f11308d
            int r8 = r6.f11309e
            int r9 = r6.f11307c
        L_0x0013:
            if (r8 >= r9) goto L_0x008b
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x006f
            r11 = 70
            if (r10 > r11) goto L_0x006f
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            com.facetec.sdk.mm r0 = new com.facetec.sdk.mm
            r0.<init>()
            com.facetec.sdk.mm r0 = r0.mo9868f(r4)
            com.facetec.sdk.mm r0 = r0.mo9870g((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.mo9886o()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006f:
            if (r0 == 0) goto L_0x0073
            r1 = 1
            goto L_0x008b
        L_0x0073:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008b:
            if (r8 != r9) goto L_0x0097
            com.facetec.sdk.na r7 = r6.mo9941e()
            r14.f11261e = r7
            com.facetec.sdk.C3447mz.m13831b(r6)
            goto L_0x0099
        L_0x0097:
            r6.f11309e = r8
        L_0x0099:
            if (r1 != 0) goto L_0x009f
            com.facetec.sdk.na r6 = r14.f11261e
            if (r6 != 0) goto L_0x000b
        L_0x009f:
            long r1 = r14.f11260b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f11260b = r1
            return r4
        L_0x00a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3431mm.mo9882l():long");
    }

    /* renamed from: m */
    public final String mo9883m() {
        return mo9841b(Long.MAX_VALUE);
    }

    /* renamed from: o */
    public final String mo9886o() {
        try {
            return m13655e(this.f11260b, C3460nb.f11312a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C3434mp mo9887p() {
        return this;
    }

    /* renamed from: q */
    public final void mo9888q() {
        try {
            mo9880j(this.f11260b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: r */
    public final long mo9889r() {
        return mo9845c((byte) 0, 0, Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        C3459na naVar = this.f11261e;
        if (naVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), naVar.f11307c - naVar.f11309e);
        byteBuffer.put(naVar.f11308d, naVar.f11309e, min);
        int i = naVar.f11309e + min;
        naVar.f11309e = i;
        this.f11260b -= (long) min;
        if (i == naVar.f11307c) {
            this.f11261e = naVar.mo9941e();
            C3447mz.m13831b(naVar);
        }
        return min;
    }

    public final String toString() {
        C3435mq mqVar;
        long j = this.f11260b;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                mqVar = C3435mq.f11263a;
            } else {
                mqVar = new C3462nd(this, i);
            }
            return mqVar.toString();
        }
        StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.f11260b);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C3459na e = mo9862e(1);
                int min = Math.min(i, 8192 - e.f11307c);
                byteBuffer.get(e.f11308d, e.f11307c, min);
                i -= min;
                e.f11307c += min;
            }
            this.f11260b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final C3435mq mo9837a(long j) {
        return new C3435mq(mo9877i(j));
    }

    /* renamed from: g */
    public final short mo9871g() {
        return C3460nb.m13837b(mo9873h());
    }

    /* renamed from: i */
    public final int mo9875i() {
        return C3460nb.m13839d(mo9879j());
    }

    /* renamed from: k */
    public final byte[] mo9881k() {
        try {
            return mo9877i(this.f11260b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: n */
    public final C3435mq mo9885n() {
        return new C3435mq(mo9881k());
    }

    /* renamed from: a */
    public final C3431mm mo9836a(int i) {
        if (i < 128) {
            mo9870g(i);
        } else if (i < 2048) {
            mo9870g((i >> 6) | 192);
            mo9870g((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                mo9870g((i >> 12) | 224);
                mo9870g(((i >> 6) & 63) | 128);
                mo9870g((i & 63) | 128);
            } else {
                mo9870g(63);
            }
        } else if (i <= 1114111) {
            mo9870g((i >> 18) | 240);
            mo9870g(((i >> 12) & 63) | 128);
            mo9870g(((i >> 6) & 63) | 128);
            mo9870g((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    /* renamed from: d */
    public final C3431mm mo9853d(C3431mm mmVar, long j, long j2) {
        if (mmVar != null) {
            C3460nb.m13841e(this.f11260b, j, j2);
            if (j2 == 0) {
                return this;
            }
            mmVar.f11260b += j2;
            C3459na naVar = this.f11261e;
            while (true) {
                int i = naVar.f11307c;
                int i2 = naVar.f11309e;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                naVar = naVar.f11311j;
            }
            while (j2 > 0) {
                C3459na d = naVar.mo9940d();
                int i3 = (int) (((long) d.f11309e) + j);
                d.f11309e = i3;
                d.f11307c = Math.min(i3 + ((int) j2), d.f11307c);
                C3459na naVar2 = mmVar.f11261e;
                if (naVar2 == null) {
                    d.f11310h = d;
                    d.f11311j = d;
                    mmVar.f11261e = d;
                } else {
                    naVar2.f11310h.mo9939a(d);
                }
                j2 -= (long) (d.f11307c - d.f11309e);
                naVar = naVar.f11311j;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: e */
    public final boolean mo9864e() {
        return this.f11260b == 0;
    }

    /* renamed from: f */
    public final byte mo9866f() {
        long j = this.f11260b;
        if (j != 0) {
            C3459na naVar = this.f11261e;
            int i = naVar.f11309e;
            int i2 = naVar.f11307c;
            int i3 = i + 1;
            byte b = naVar.f11308d[i];
            this.f11260b = j - 1;
            if (i3 == i2) {
                this.f11261e = naVar.mo9941e();
                C3447mz.m13831b(naVar);
            } else {
                naVar.f11309e = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: g */
    public final C3431mm mo9884n(long j) {
        boolean z;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return mo9870g(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo9860e("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        C3459na e = mo9862e(i2);
        byte[] bArr = e.f11308d;
        int i3 = e.f11307c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f11259a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        e.f11307c += i2;
        this.f11260b += (long) i2;
        return this;
    }

    /* renamed from: i */
    public final byte[] mo9877i(long j) {
        C3460nb.m13841e(this.f11260b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            mo9856d(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    /* renamed from: e */
    public final void mo9863e(long j) {
        if (this.f11260b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: e */
    private String m13655e(long j, Charset charset) {
        C3460nb.m13841e(this.f11260b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return "";
        } else {
            C3459na naVar = this.f11261e;
            int i = naVar.f11309e;
            if (((long) i) + j > ((long) naVar.f11307c)) {
                return new String(mo9877i(j), charset);
            }
            String str = new String(naVar.f11308d, i, (int) j, charset);
            int i2 = (int) (((long) naVar.f11309e) + j);
            naVar.f11309e = i2;
            this.f11260b -= j;
            if (i2 == naVar.f11307c) {
                this.f11261e = naVar.mo9941e();
                C3447mz.m13831b(naVar);
            }
            return str;
        }
    }

    /* renamed from: b */
    public final String mo9842b(Charset charset) {
        try {
            return m13655e(this.f11260b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final String mo9841b(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long c = mo9845c((byte) 10, 0, j2);
            if (c != -1) {
                return mo9855d(c);
            }
            if (j2 < mo9835a() && mo9843c(j2 - 1) == 13 && mo9843c(j2) == 10) {
                return mo9855d(j2);
            }
            C3431mm mmVar = new C3431mm();
            mo9853d(mmVar, 0, Math.min(32, mo9835a()));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(mo9835a(), j));
            sb.append(" content=");
            sb.append(mmVar.mo9885n().mo9894b());
            sb.append(BogTextInputET.emptyChar);
            throw new EOFException(sb.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
    }

    /* renamed from: c */
    public final int mo9844c(byte[] bArr, int i, int i2) {
        C3460nb.m13841e((long) bArr.length, (long) i, (long) i2);
        C3459na naVar = this.f11261e;
        if (naVar == null) {
            return -1;
        }
        int min = Math.min(i2, naVar.f11307c - naVar.f11309e);
        System.arraycopy(naVar.f11308d, naVar.f11309e, bArr, i, min);
        int i3 = naVar.f11309e + min;
        naVar.f11309e = i3;
        this.f11260b -= (long) min;
        if (i3 == naVar.f11307c) {
            this.f11261e = naVar.mo9941e();
            C3447mz.m13831b(naVar);
        }
        return min;
    }

    /* renamed from: h */
    public final C3431mm mo9868f(long j) {
        if (j == 0) {
            return mo9870g(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C3459na e = mo9862e(numberOfTrailingZeros);
        byte[] bArr = e.f11308d;
        int i = e.f11307c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f11259a[(int) (15 & j)];
            j >>>= 4;
        }
        e.f11307c += numberOfTrailingZeros;
        this.f11260b += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo9855d(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (mo9843c(j2) == 13) {
                String k = m13656k(j2);
                mo9880j(2);
                return k;
            }
        }
        String k2 = m13656k(j);
        mo9880j(1);
        return k2;
    }

    /* renamed from: j */
    public final void mo9880j(long j) {
        while (j > 0) {
            C3459na naVar = this.f11261e;
            if (naVar != null) {
                int min = (int) Math.min(j, (long) (naVar.f11307c - naVar.f11309e));
                long j2 = (long) min;
                this.f11260b -= j2;
                j -= j2;
                C3459na naVar2 = this.f11261e;
                int i = naVar2.f11309e + min;
                naVar2.f11309e = i;
                if (i == naVar2.f11307c) {
                    this.f11261e = naVar2.mo9941e();
                    C3447mz.m13831b(naVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: b */
    public final C3431mm mo9861e(byte[] bArr) {
        if (bArr != null) {
            return mo9854d(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: e */
    public final C3431mm mo9858e(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        } else if (i2 < i) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    C3459na e = mo9862e(1);
                    byte[] bArr = e.f11308d;
                    int i3 = e.f11307c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i5 = e.f11307c;
                            int i6 = (i3 + i) - i5;
                            e.f11307c = i5 + i6;
                            this.f11260b += (long) i6;
                        } else {
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                    }
                    int i52 = e.f11307c;
                    int i62 = (i3 + i) - i52;
                    e.f11307c = i52 + i62;
                    this.f11260b += (long) i62;
                } else {
                    if (charAt2 < 2048) {
                        mo9870g((charAt2 >> 6) | 192);
                        mo9870g((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        mo9870g((charAt2 >> 12) | 224);
                        mo9870g(((charAt2 >> 6) & 63) | 128);
                        mo9870g((int) (charAt2 & '?') | 128);
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            mo9870g(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 0;
                            mo9870g((i8 >> 18) | 240);
                            mo9870g(((i8 >> 12) & 63) | 128);
                            mo9870g(((i8 >> 6) & 63) | 128);
                            mo9870g((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: b */
    public final C3431mm mo9867f(int i) {
        C3459na e = mo9862e(4);
        byte[] bArr = e.f11308d;
        int i2 = e.f11307c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        e.f11307c = i5 + 1;
        this.f11260b += 4;
        return this;
    }

    /* renamed from: c */
    public final C3431mm mo9847c(C3435mq mqVar) {
        if (mqVar != null) {
            mqVar.mo9899c(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: c */
    public final C3431mm mo9860e(String str) {
        return mo9858e(str, 0, str.length());
    }

    /* renamed from: d */
    public final void mo9856d(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int c = mo9844c(bArr, i, bArr.length - i);
            if (c != -1) {
                i += c;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: c */
    public final C3431mm mo9870g(int i) {
        C3459na e = mo9862e(1);
        byte[] bArr = e.f11308d;
        int i2 = e.f11307c;
        e.f11307c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f11260b++;
        return this;
    }

    /* renamed from: d */
    public final long mo9850d(C3465nf nfVar) {
        if (nfVar != null) {
            long j = 0;
            while (true) {
                long c = nfVar.mo9643c(this, 8192);
                if (c == -1) {
                    return j;
                }
                j += c;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: c */
    public final long mo9643c(C3431mm mmVar, long j) {
        if (mmVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f11260b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            mmVar.mo9671b(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    /* renamed from: d */
    public final C3431mm mo9876i(int i) {
        C3459na e = mo9862e(2);
        byte[] bArr = e.f11308d;
        int i2 = e.f11307c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        e.f11307c = i3 + 1;
        this.f11260b += 2;
        return this;
    }

    /* renamed from: b */
    public final void mo9671b(C3431mm mmVar, long j) {
        C3459na naVar;
        int i;
        if (mmVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (mmVar != this) {
            C3460nb.m13841e(mmVar.f11260b, 0, j);
            while (j > 0) {
                C3459na naVar2 = mmVar.f11261e;
                int i2 = naVar2.f11307c;
                int i3 = naVar2.f11309e;
                int i4 = 0;
                if (j < ((long) (i2 - i3))) {
                    C3459na naVar3 = this.f11261e;
                    C3459na naVar4 = naVar3 != null ? naVar3.f11310h : null;
                    if (naVar4 != null && naVar4.f11305a) {
                        long j2 = ((long) naVar4.f11307c) + j;
                        if (naVar4.f11306b) {
                            i = 0;
                        } else {
                            i = naVar4.f11309e;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            naVar2.mo9942e(naVar4, (int) j);
                            mmVar.f11260b -= j;
                            this.f11260b += j;
                            return;
                        }
                    }
                    int i5 = (int) j;
                    if (i5 <= 0 || i5 > i2 - i3) {
                        throw new IllegalArgumentException();
                    }
                    if (i5 >= 1024) {
                        naVar = naVar2.mo9940d();
                    } else {
                        naVar = C3447mz.m13830a();
                        System.arraycopy(naVar2.f11308d, naVar2.f11309e, naVar.f11308d, 0, i5);
                    }
                    naVar.f11307c = naVar.f11309e + i5;
                    naVar2.f11309e += i5;
                    naVar2.f11310h.mo9939a(naVar);
                    mmVar.f11261e = naVar;
                }
                C3459na naVar5 = mmVar.f11261e;
                long j3 = (long) (naVar5.f11307c - naVar5.f11309e);
                mmVar.f11261e = naVar5.mo9941e();
                C3459na naVar6 = this.f11261e;
                if (naVar6 == null) {
                    this.f11261e = naVar5;
                    naVar5.f11310h = naVar5;
                    naVar5.f11311j = naVar5;
                } else {
                    C3459na a = naVar6.f11310h.mo9939a(naVar5);
                    C3459na naVar7 = a.f11310h;
                    if (naVar7 == a) {
                        throw new IllegalStateException();
                    } else if (naVar7.f11305a) {
                        int i6 = a.f11307c - a.f11309e;
                        int i7 = 8192 - naVar7.f11307c;
                        if (!naVar7.f11306b) {
                            i4 = naVar7.f11309e;
                        }
                        if (i6 <= i7 + i4) {
                            a.mo9942e(naVar7, i6);
                            a.mo9941e();
                            C3447mz.m13831b(a);
                        }
                    }
                }
                mmVar.f11260b -= j3;
                this.f11260b += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: c */
    public final long mo9845c(byte b, long j, long j2) {
        C3459na naVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f11260b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f11260b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (naVar = this.f11261e) == null) {
            return -1;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                naVar = naVar.f11310h;
                j4 -= (long) (naVar.f11307c - naVar.f11309e);
            }
        } else {
            while (true) {
                long j6 = ((long) (naVar.f11307c - naVar.f11309e)) + j3;
                if (j6 >= j) {
                    break;
                }
                naVar = naVar.f11311j;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = naVar.f11308d;
            int min = (int) Math.min((long) naVar.f11307c, (((long) naVar.f11309e) + j5) - j4);
            for (int i = (int) ((((long) naVar.f11309e) + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - naVar.f11309e)) + j4;
                }
            }
            byte b2 = b;
            j4 += (long) (naVar.f11307c - naVar.f11309e);
            naVar = naVar.f11311j;
            j7 = j4;
        }
        return -1;
    }

    /* renamed from: d */
    public final boolean mo9857d(C3435mq mqVar) {
        return m13654d(mqVar, mqVar.mo9906g());
    }

    /* renamed from: d */
    private boolean m13654d(C3435mq mqVar, int i) {
        if (i < 0 || this.f11260b < ((long) i) || mqVar.mo9906g() < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (mo9843c(((long) i2) + 0) != mqVar.mo9902e(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final C3463ne mo9644c() {
        return C3463ne.f11315b;
    }

    /* renamed from: e */
    public final C3431mm mo9854d(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C3460nb.m13841e((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C3459na e = mo9862e(1);
                int min = Math.min(i3 - i, 8192 - e.f11307c);
                System.arraycopy(bArr, i, e.f11308d, e.f11307c, min);
                i += min;
                e.f11307c += min;
            }
            this.f11260b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C3459na mo9862e(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C3459na naVar = this.f11261e;
        if (naVar == null) {
            C3459na a = C3447mz.m13830a();
            this.f11261e = a;
            a.f11310h = a;
            a.f11311j = a;
            return a;
        }
        C3459na naVar2 = naVar.f11310h;
        return (naVar2.f11307c + i > 8192 || !naVar2.f11305a) ? naVar2.mo9939a(C3447mz.m13830a()) : naVar2;
    }
}
