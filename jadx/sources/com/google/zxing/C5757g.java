package com.google.zxing;

/* renamed from: com.google.zxing.g */
public final class C5757g extends C5758h {

    /* renamed from: c */
    private final C5758h f18185c;

    public C5757g(C5758h hVar) {
        super(hVar.mo18884d(), hVar.mo18883a());
        this.f18185c = hVar;
    }

    /* renamed from: b */
    public byte[] mo18878b() {
        byte[] b = this.f18185c.mo18878b();
        int d = mo18884d() * mo18883a();
        byte[] bArr = new byte[d];
        for (int i = 0; i < d; i++) {
            bArr[i] = (byte) (255 - (b[i] & 255));
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo18879c(int i, byte[] bArr) {
        byte[] c = this.f18185c.mo18879c(i, bArr);
        int d = mo18884d();
        for (int i2 = 0; i2 < d; i2++) {
            c[i2] = (byte) (255 - (c[i2] & 255));
        }
        return c;
    }

    /* renamed from: e */
    public C5758h mo18880e() {
        return this.f18185c;
    }

    /* renamed from: f */
    public boolean mo18881f() {
        return this.f18185c.mo18881f();
    }

    /* renamed from: g */
    public C5758h mo18882g() {
        return new C5757g(this.f18185c.mo18882g());
    }
}
