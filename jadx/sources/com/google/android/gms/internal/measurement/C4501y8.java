package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y8 */
final class C4501y8 extends C4096a9 {

    /* renamed from: e */
    private final byte[] f13838e;

    /* renamed from: f */
    private final int f13839f;

    /* renamed from: g */
    private int f13840g;

    C4501y8(byte[] bArr, int i, int i2) {
        super((C4517z8) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.f13838e = bArr;
                this.f13840g = 0;
                this.f13839f = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: B */
    public final void mo13833B(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f13838e, this.f13840g, i2);
            this.f13840g += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13840g), Integer.valueOf(this.f13839f), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: C */
    public final void mo13834C(String str) {
        int i = this.f13840g;
        try {
            int y = C4096a9.m15484y(str.length() * 3);
            int y2 = C4096a9.m15484y(str.length());
            if (y2 == y) {
                int i2 = i + y2;
                this.f13840g = i2;
                int b = C4472wb.m17100b(str, this.f13838e, i2, this.f13839f - i2);
                this.f13840g = i;
                mo12861r((b - i) - y2);
                this.f13840g = b;
                return;
            }
            mo12861r(C4472wb.m17101c(str));
            byte[] bArr = this.f13838e;
            int i3 = this.f13840g;
            this.f13840g = C4472wb.m17100b(str, bArr, i3, this.f13839f - i3);
        } catch (C4455vb e) {
            this.f13840g = i;
            mo12846b(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzkg(e2);
        }
    }

    /* renamed from: d */
    public final int mo12847d() {
        return this.f13839f - this.f13840g;
    }

    /* renamed from: e */
    public final void mo12848e(byte b) {
        try {
            byte[] bArr = this.f13838e;
            int i = this.f13840g;
            this.f13840g = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13840g), Integer.valueOf(this.f13839f), 1}), e);
        }
    }

    /* renamed from: f */
    public final void mo12849f(int i, boolean z) {
        mo12861r(i << 3);
        mo12848e(z ? (byte) 1 : 0);
    }

    /* renamed from: g */
    public final void mo12850g(int i, C4418t8 t8Var) {
        mo12861r((i << 3) | 2);
        mo12861r(t8Var.mo13355g());
        t8Var.mo13463n(this);
    }

    /* renamed from: h */
    public final void mo12851h(int i, int i2) {
        mo12861r((i << 3) | 5);
        mo12852i(i2);
    }

    /* renamed from: i */
    public final void mo12852i(int i) {
        try {
            byte[] bArr = this.f13838e;
            int i2 = this.f13840g;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & C11051p3.f31759c);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & C11051p3.f31759c);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & C11051p3.f31759c);
            this.f13840g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & C11051p3.f31759c);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13840g), Integer.valueOf(this.f13839f), 1}), e);
        }
    }

    /* renamed from: j */
    public final void mo12853j(int i, long j) {
        mo12861r((i << 3) | 1);
        mo12854k(j);
    }

    /* renamed from: k */
    public final void mo12854k(long j) {
        try {
            byte[] bArr = this.f13838e;
            int i = this.f13840g;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & C11051p3.f31759c);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & C11051p3.f31759c);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & C11051p3.f31759c);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & C11051p3.f31759c);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & C11051p3.f31759c);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & C11051p3.f31759c);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & C11051p3.f31759c);
            this.f13840g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & C11051p3.f31759c);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13840g), Integer.valueOf(this.f13839f), 1}), e);
        }
    }

    /* renamed from: l */
    public final void mo12855l(int i, int i2) {
        mo12861r(i << 3);
        mo12856m(i2);
    }

    /* renamed from: m */
    public final void mo12856m(int i) {
        if (i >= 0) {
            mo12861r(i);
        } else {
            mo12863t((long) i);
        }
    }

    /* renamed from: n */
    public final void mo12857n(byte[] bArr, int i, int i2) {
        mo13833B(bArr, 0, i2);
    }

    /* renamed from: o */
    public final void mo12858o(int i, String str) {
        mo12861r((i << 3) | 2);
        mo13834C(str);
    }

    /* renamed from: p */
    public final void mo12859p(int i, int i2) {
        mo12861r((i << 3) | i2);
    }

    /* renamed from: q */
    public final void mo12860q(int i, int i2) {
        mo12861r(i << 3);
        mo12861r(i2);
    }

    /* renamed from: r */
    public final void mo12861r(int i) {
        while ((i & -128) != 0) {
            byte[] bArr = this.f13838e;
            int i2 = this.f13840g;
            this.f13840g = i2 + 1;
            bArr[i2] = (byte) ((i & C11051p3.f31760d) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f13838e;
            int i3 = this.f13840g;
            this.f13840g = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13840g), Integer.valueOf(this.f13839f), 1}), e);
        }
    }

    /* renamed from: s */
    public final void mo12862s(int i, long j) {
        mo12861r(i << 3);
        mo12863t(j);
    }

    /* renamed from: t */
    public final void mo12863t(long j) {
        if (!C4096a9.f13140c || this.f13839f - this.f13840g < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f13838e;
                int i = this.f13840g;
                this.f13840g = i + 1;
                bArr[i] = (byte) ((((int) j) & C11051p3.f31760d) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f13838e;
                int i2 = this.f13840g;
                this.f13840g = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f13840g), Integer.valueOf(this.f13839f), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f13838e;
                int i3 = this.f13840g;
                this.f13840g = i3 + 1;
                C4387rb.m16592s(bArr3, (long) i3, (byte) ((((int) j) & C11051p3.f31760d) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f13838e;
            int i4 = this.f13840g;
            this.f13840g = i4 + 1;
            C4387rb.m16592s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
