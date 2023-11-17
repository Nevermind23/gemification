package com.facetec.sdk;

/* renamed from: com.facetec.sdk.na */
final class C3459na {

    /* renamed from: a */
    boolean f11305a;

    /* renamed from: b */
    boolean f11306b;

    /* renamed from: c */
    int f11307c;

    /* renamed from: d */
    final byte[] f11308d;

    /* renamed from: e */
    int f11309e;

    /* renamed from: h */
    C3459na f11310h;

    /* renamed from: j */
    C3459na f11311j;

    C3459na() {
        this.f11308d = new byte[8192];
        this.f11305a = true;
        this.f11306b = false;
    }

    /* renamed from: a */
    public final C3459na mo9939a(C3459na naVar) {
        naVar.f11310h = this;
        naVar.f11311j = this.f11311j;
        this.f11311j.f11310h = naVar;
        this.f11311j = naVar;
        return naVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C3459na mo9940d() {
        this.f11306b = true;
        return new C3459na(this.f11308d, this.f11309e, this.f11307c);
    }

    /* renamed from: e */
    public final C3459na mo9941e() {
        C3459na naVar = this.f11311j;
        C3459na naVar2 = naVar != this ? naVar : null;
        C3459na naVar3 = this.f11310h;
        naVar3.f11311j = naVar;
        this.f11311j.f11310h = naVar3;
        this.f11311j = null;
        this.f11310h = null;
        return naVar2;
    }

    C3459na(byte[] bArr, int i, int i2) {
        this.f11308d = bArr;
        this.f11309e = i;
        this.f11307c = i2;
        this.f11306b = true;
        this.f11305a = false;
    }

    /* renamed from: e */
    public final void mo9942e(C3459na naVar, int i) {
        if (naVar.f11305a) {
            int i2 = naVar.f11307c;
            if (i2 + i > 8192) {
                if (!naVar.f11306b) {
                    int i3 = naVar.f11309e;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = naVar.f11308d;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        naVar.f11307c -= naVar.f11309e;
                        naVar.f11309e = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f11308d, this.f11309e, naVar.f11308d, naVar.f11307c, i);
            naVar.f11307c += i;
            this.f11309e += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
