package com.google.zxing;

/* renamed from: com.google.zxing.h */
public abstract class C5758h {

    /* renamed from: a */
    private final int f18186a;

    /* renamed from: b */
    private final int f18187b;

    protected C5758h(int i, int i2) {
        this.f18186a = i;
        this.f18187b = i2;
    }

    /* renamed from: a */
    public final int mo18883a() {
        return this.f18187b;
    }

    /* renamed from: b */
    public abstract byte[] mo18878b();

    /* renamed from: c */
    public abstract byte[] mo18879c(int i, byte[] bArr);

    /* renamed from: d */
    public final int mo18884d() {
        return this.f18186a;
    }

    /* renamed from: e */
    public C5758h mo18880e() {
        return new C5757g(this);
    }

    /* renamed from: f */
    public boolean mo18881f() {
        return false;
    }

    /* renamed from: g */
    public C5758h mo18882g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        char c;
        int i = this.f18186a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f18187b * (i + 1));
        for (int i2 = 0; i2 < this.f18187b; i2++) {
            bArr = mo18879c(i2, bArr);
            for (int i3 = 0; i3 < this.f18186a; i3++) {
                byte b = bArr[i3] & 255;
                if (b < 64) {
                    c = '#';
                } else if (b < 128) {
                    c = '+';
                } else if (b < 192) {
                    c = '.';
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
