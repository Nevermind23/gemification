package p252sb;

import p252sb.C8297e;

/* renamed from: sb.b */
final class C8292b {

    /* renamed from: a */
    private final int f23488a;

    /* renamed from: b */
    private final byte[] f23489b;

    private C8292b(int i, byte[] bArr) {
        this.f23488a = i;
        this.f23489b = bArr;
    }

    /* renamed from: b */
    static C8292b[] m31154b(byte[] bArr, C8297e eVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        C8297e.C8300c d = eVar.mo23458d();
        C8297e.C8299b[] a = d.mo23466a();
        int i4 = 0;
        for (C8297e.C8299b a2 : a) {
            i4 += a2.mo23464a();
        }
        C8292b[] bVarArr = new C8292b[i4];
        int i5 = 0;
        for (C8297e.C8299b bVar : a) {
            int i6 = 0;
            while (i6 < bVar.mo23464a()) {
                int b = bVar.mo23465b();
                bVarArr[i5] = new C8292b(b, new byte[(d.mo23467b() + b)]);
                i6++;
                i5++;
            }
        }
        int length = bVarArr[0].f23489b.length - d.mo23467b();
        int i7 = length - 1;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            int i12 = 0;
            while (i12 < i5) {
                bVarArr[i12].f23489b[i9] = bArr[i8];
                i12++;
                i8++;
            }
        }
        if (eVar.mo23462i() == 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = i5;
        }
        int i13 = 0;
        while (i13 < i) {
            bVarArr[i13].f23489b[i7] = bArr[i8];
            i13++;
            i8++;
        }
        int length2 = bVarArr[0].f23489b.length;
        while (length < length2) {
            int i14 = 0;
            while (i14 < i5) {
                if (z) {
                    i2 = (i14 + 8) % i5;
                } else {
                    i2 = i14;
                }
                if (!z || i2 <= 7) {
                    i3 = length;
                } else {
                    i3 = length - 1;
                }
                bVarArr[i2].f23489b[i3] = bArr[i8];
                i14++;
                i8++;
            }
            length++;
        }
        if (i8 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo23453a() {
        return this.f23489b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo23454c() {
        return this.f23488a;
    }
}
