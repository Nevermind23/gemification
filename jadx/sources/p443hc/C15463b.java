package p443hc;

import p443hc.C15480j;

/* renamed from: hc.b */
final class C15463b {

    /* renamed from: a */
    private final int f43885a;

    /* renamed from: b */
    private final byte[] f43886b;

    private C15463b(int i, byte[] bArr) {
        this.f43885a = i;
        this.f43886b = bArr;
    }

    /* renamed from: b */
    static C15463b[] m55952b(byte[] bArr, C15480j jVar, C15476f fVar) {
        int i;
        if (bArr.length == jVar.mo42571h()) {
            C15480j.C15482b f = jVar.mo42570f(fVar);
            C15480j.C15481a[] a = f.mo42576a();
            int i2 = 0;
            for (C15480j.C15481a a2 : a) {
                i2 += a2.mo42574a();
            }
            C15463b[] bVarArr = new C15463b[i2];
            int i3 = 0;
            for (C15480j.C15481a aVar : a) {
                int i4 = 0;
                while (i4 < aVar.mo42574a()) {
                    int b = aVar.mo42575b();
                    bVarArr[i3] = new C15463b(b, new byte[(f.mo42577b() + b)]);
                    i4++;
                    i3++;
                }
            }
            int length = bVarArr[0].f43886b.length;
            int i5 = i2 - 1;
            while (i5 >= 0 && bVarArr[i5].f43886b.length != length) {
                i5--;
            }
            int i6 = i5 + 1;
            int b2 = length - f.mo42577b();
            int i7 = 0;
            for (int i8 = 0; i8 < b2; i8++) {
                int i9 = 0;
                while (i9 < i3) {
                    bVarArr[i9].f43886b[i8] = bArr[i7];
                    i9++;
                    i7++;
                }
            }
            int i12 = i6;
            while (i12 < i3) {
                bVarArr[i12].f43886b[b2] = bArr[i7];
                i12++;
                i7++;
            }
            int length2 = bVarArr[0].f43886b.length;
            while (b2 < length2) {
                int i13 = 0;
                while (i13 < i3) {
                    if (i13 < i6) {
                        i = b2;
                    } else {
                        i = b2 + 1;
                    }
                    bVarArr[i13].f43886b[i] = bArr[i7];
                    i13++;
                    i7++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo42554a() {
        return this.f43886b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo42555c() {
        return this.f43885a;
    }
}
