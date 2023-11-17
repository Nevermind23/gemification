package p161lb;

import p200ob.C7507a;

/* renamed from: lb.e */
final class C7040e extends C7042g {

    /* renamed from: c */
    private final short f20959c;

    /* renamed from: d */
    private final short f20960d;

    C7040e(C7042g gVar, int i, int i2) {
        super(gVar);
        this.f20959c = (short) i;
        this.f20960d = (short) i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21251c(C7507a aVar, byte[] bArr) {
        aVar.mo21951c(this.f20959c, this.f20960d);
    }

    public String toString() {
        short s = this.f20959c;
        short s2 = this.f20960d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f20960d)).substring(1) + '>';
    }
}
