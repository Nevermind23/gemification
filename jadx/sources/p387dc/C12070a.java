package p387dc;

import com.google.zxing.ChecksumException;

/* renamed from: dc.a */
public final class C12070a {

    /* renamed from: a */
    private final C12071b f35472a = C12071b.f35473f;

    /* renamed from: b */
    private int[] m44273b(C12072c cVar) {
        int d = cVar.mo32208d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f35472a.mo32199e() && i < d; i2++) {
            if (cVar.mo32206b(i2) == 0) {
                iArr[i] = this.f35472a.mo32201g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw ChecksumException.m23152a();
    }

    /* renamed from: c */
    private int[] m44274c(C12072c cVar, C12072c cVar2, int[] iArr) {
        int d = cVar2.mo32208d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f35472a.mo32203i(i, cVar2.mo32207c(i));
        }
        C12072c cVar3 = new C12072c(this.f35472a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f35472a.mo32201g(iArr[i2]);
            iArr3[i2] = this.f35472a.mo32203i(this.f35472a.mo32204j(0, cVar.mo32206b(g)), this.f35472a.mo32201g(cVar3.mo32206b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C12072c[] m44275d(C12072c cVar, C12072c cVar2, int i) {
        if (cVar.mo32208d() < cVar2.mo32208d()) {
            C12072c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C12072c f = this.f35472a.mo32200f();
        C12072c d = this.f35472a.mo32198d();
        while (true) {
            C12072c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C12072c cVar5 = d;
            C12072c cVar6 = f;
            f = cVar5;
            if (cVar.mo32208d() < i / 2) {
                int c = f.mo32207c(0);
                if (c != 0) {
                    int g = this.f35472a.mo32201g(c);
                    return new C12072c[]{f.mo32210f(g), cVar.mo32210f(g)};
                }
                throw ChecksumException.m23152a();
            } else if (!cVar.mo32209e()) {
                C12072c f2 = this.f35472a.mo32200f();
                int g2 = this.f35472a.mo32201g(cVar.mo32207c(cVar.mo32208d()));
                while (r11.mo32208d() >= cVar.mo32208d() && !r11.mo32209e()) {
                    int d2 = r11.mo32208d() - cVar.mo32208d();
                    int i2 = this.f35472a.mo32203i(r11.mo32207c(r11.mo32208d()), g2);
                    f2 = f2.mo32205a(this.f35472a.mo32196b(d2, i2));
                    r11 = r11.mo32214j(cVar.mo32212h(d2, i2));
                }
                d = f2.mo32211g(f).mo32214j(cVar6).mo32213i();
            } else {
                throw ChecksumException.m23152a();
            }
        }
    }

    /* renamed from: a */
    public int mo32194a(int[] iArr, int i, int[] iArr2) {
        C12072c cVar = new C12072c(this.f35472a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = cVar.mo32206b(this.f35472a.mo32197c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C12072c d = this.f35472a.mo32198d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f35472a.mo32197c((iArr.length - 1) - length);
                C12071b bVar = this.f35472a;
                d = d.mo32211g(new C12072c(bVar, new int[]{bVar.mo32204j(0, c), 1}));
            }
        }
        C12072c[] d2 = m44275d(this.f35472a.mo32196b(i, 1), new C12072c(this.f35472a, iArr3), i);
        C12072c cVar2 = d2[0];
        C12072c cVar3 = d2[1];
        int[] b2 = m44273b(cVar2);
        int[] c2 = m44274c(cVar3, cVar2, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f35472a.mo32202h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f35472a.mo32204j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw ChecksumException.m23152a();
            }
        }
        return b2.length;
    }
}
