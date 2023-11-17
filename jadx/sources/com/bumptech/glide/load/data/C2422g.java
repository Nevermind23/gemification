package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.g */
public final class C2422g extends FilterInputStream {

    /* renamed from: f */
    private static final byte[] f7653f;

    /* renamed from: g */
    private static final int f7654g;

    /* renamed from: h */
    private static final int f7655h;

    /* renamed from: d */
    private final byte f7656d;

    /* renamed from: e */
    private int f7657e;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f7653f = bArr;
        int length = bArr.length;
        f7654g = length;
        f7655h = length + 2;
    }

    public C2422g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f7656d = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i;
        int i2;
        int i3 = this.f7657e;
        if (i3 < 2 || i3 > (i2 = f7655h)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f7656d;
        } else {
            i = f7653f[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f7657e++;
        }
        return i;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f7657e = (int) (((long) this.f7657e) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f7657e;
        int i5 = f7655h;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f7656d;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f7653f, this.f7657e - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f7657e += i3;
        }
        return i3;
    }
}
