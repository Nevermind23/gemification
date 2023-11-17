package com.google.zxing;

/* renamed from: com.google.zxing.k */
public final class C5762k extends C5758h {

    /* renamed from: c */
    private final byte[] f18192c;

    /* renamed from: d */
    private final int f18193d;

    /* renamed from: e */
    private final int f18194e;

    /* renamed from: f */
    private final int f18195f;

    /* renamed from: g */
    private final int f18196g;

    public C5762k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f18192c = bArr;
        this.f18193d = i;
        this.f18194e = i2;
        this.f18195f = i3;
        this.f18196g = i4;
        if (z) {
            m23188h(i5, i6);
        }
    }

    /* renamed from: h */
    private void m23188h(int i, int i2) {
        byte[] bArr = this.f18192c;
        int i3 = (this.f18196g * this.f18193d) + this.f18195f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f18193d;
        }
    }

    /* renamed from: b */
    public byte[] mo18878b() {
        int d = mo18884d();
        int a = mo18883a();
        int i = this.f18193d;
        if (d == i && a == this.f18194e) {
            return this.f18192c;
        }
        int i2 = d * a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f18196g * i) + this.f18195f;
        if (d == i) {
            System.arraycopy(this.f18192c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < a; i4++) {
            System.arraycopy(this.f18192c, i3, bArr, i4 * d, d);
            i3 += this.f18193d;
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo18879c(int i, byte[] bArr) {
        if (i < 0 || i >= mo18883a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int d = mo18884d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f18192c, ((i + this.f18196g) * this.f18193d) + this.f18195f, bArr, 0, d);
        return bArr;
    }
}
