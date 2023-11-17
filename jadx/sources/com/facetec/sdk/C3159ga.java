package com.facetec.sdk;

import com.salesforce.marketingcloud.C11398b;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.facetec.sdk.ga */
public final class C3159ga extends FilterInputStream {

    /* renamed from: c */
    private static final short f10415c = ((short) ((int) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d))));

    /* renamed from: a */
    private byte[] f10416a = new byte[8];

    /* renamed from: b */
    private byte[] f10417b = new byte[8];

    /* renamed from: d */
    private int f10418d = 8;

    /* renamed from: e */
    private byte[] f10419e = new byte[8];

    /* renamed from: f */
    private int f10420f = 8;

    /* renamed from: g */
    private int f10421g;

    /* renamed from: h */
    private int f10422h;

    /* renamed from: i */
    private int f10423i = Integer.MAX_VALUE;

    /* renamed from: j */
    private int f10424j;

    /* renamed from: k */
    private int f10425k;

    /* renamed from: l */
    private int f10426l;

    /* renamed from: o */
    private int f10427o;

    public C3159ga(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        super(new BufferedInputStream(inputStream, C11398b.f33143v));
        this.f10422h = Math.min(Math.max(i2, 5), 16);
        this.f10424j = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.f10417b, 0, 8);
        }
        long j = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i == 0) {
            this.f10421g = (int) j;
            long j2 = j >> 3;
            short s = f10415c;
            this.f10426l = (int) ((((long) s) * j2) >> 32);
            this.f10425k = (int) (j >> 32);
            this.f10427o = (int) (j2 + ((long) s));
            return;
        }
        int i4 = (int) j;
        this.f10421g = i4;
        this.f10426l = i4 * i;
        this.f10425k = i4 ^ i;
        this.f10427o = (int) (j >> 32);
    }

    /* renamed from: a */
    private void m12938a() {
        if (this.f10424j == 3) {
            byte[] bArr = this.f10419e;
            System.arraycopy(bArr, 0, this.f10416a, 0, bArr.length);
        }
        byte[] bArr2 = this.f10419e;
        int i = ((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.f10422h;
            if (i3 >= i4) {
                break;
            }
            short s = f10415c;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.f10425k)) ^ ((i >>> 5) + this.f10427o);
            i -= (((i2 << 4) + this.f10421g) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.f10426l);
            i3++;
        }
        byte[] bArr3 = this.f10419e;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.f10424j == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.f10419e;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.f10417b[i5]);
            }
            byte[] bArr5 = this.f10416a;
            System.arraycopy(bArr5, 0, this.f10417b, 0, bArr5.length);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m12939c() {
        /*
            r7 = this;
            int r0 = r7.f10423i
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f10423i = r0
        L_0x000f:
            int r0 = r7.f10418d
            r1 = 8
            if (r0 != r1) goto L_0x0059
            byte[] r0 = r7.f10419e
            int r2 = r7.f10423i
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0053
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.f10419e
            int r6 = 8 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x004d
            r7.m12938a()
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.f10423i = r0
            r7.f10418d = r4
            if (r0 >= 0) goto L_0x004a
            byte[] r0 = r7.f10419e
            r2 = 7
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004a:
            r7.f10420f = r1
            goto L_0x0059
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0059:
            int r0 = r7.f10420f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3159ga.m12939c():int");
    }

    public final int available() {
        m12939c();
        return this.f10420f - this.f10418d;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        m12939c();
        int i = this.f10418d;
        if (i >= this.f10420f) {
            return -1;
        }
        byte[] bArr = this.f10419e;
        this.f10418d = i + 1;
        return bArr[i] & 255;
    }

    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m12939c();
            int i5 = this.f10418d;
            if (i5 < this.f10420f) {
                byte[] bArr2 = this.f10419e;
                this.f10418d = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }
}
