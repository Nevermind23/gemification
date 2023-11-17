package p226qb;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* renamed from: qb.c */
public final class C8003c {

    /* renamed from: a */
    private final C8001a f23068a;

    public C8003c(C8001a aVar) {
        this.f23068a = aVar;
    }

    /* renamed from: b */
    private int[] m30397b(C8002b bVar) {
        int f = bVar.mo23149f();
        int i = 0;
        if (f == 1) {
            return new int[]{bVar.mo23147d(1)};
        }
        int[] iArr = new int[f];
        for (int i2 = 1; i2 < this.f23068a.mo23138f() && i < f; i2++) {
            if (bVar.mo23146c(i2) == 0) {
                iArr[i] = this.f23068a.mo23140h(i2);
                i++;
            }
        }
        if (i == f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m30398c(C8002b bVar, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int h = this.f23068a.mo23140h(iArr[i2]);
            int i3 = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i2 != i4) {
                    int j = this.f23068a.mo23142j(iArr[i4], h);
                    if ((j & 1) == 0) {
                        i = j | 1;
                    } else {
                        i = j & -2;
                    }
                    i3 = this.f23068a.mo23142j(i3, i);
                }
            }
            iArr2[i2] = this.f23068a.mo23142j(bVar.mo23146c(h), this.f23068a.mo23140h(i3));
            if (this.f23068a.mo23136d() != 0) {
                iArr2[i2] = this.f23068a.mo23142j(iArr2[i2], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C8002b[] m30399d(C8002b bVar, C8002b bVar2, int i) {
        if (bVar.mo23149f() < bVar2.mo23149f()) {
            C8002b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C8002b g = this.f23068a.mo23139g();
        C8002b e = this.f23068a.mo23137e();
        do {
            C8002b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C8002b bVar5 = e;
            C8002b bVar6 = g;
            g = bVar5;
            if (bVar.mo23149f() < i / 2) {
                int d = g.mo23147d(0);
                if (d != 0) {
                    int h = this.f23068a.mo23140h(d);
                    return new C8002b[]{g.mo23151h(h), bVar.mo23151h(h)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            } else if (!bVar.mo23150g()) {
                C8002b g2 = this.f23068a.mo23139g();
                int h2 = this.f23068a.mo23140h(bVar.mo23147d(bVar.mo23149f()));
                while (r11.mo23149f() >= bVar.mo23149f() && !r11.mo23150g()) {
                    int f = r11.mo23149f() - bVar.mo23149f();
                    int j = this.f23068a.mo23142j(r11.mo23147d(r11.mo23149f()), h2);
                    g2 = g2.mo23144a(this.f23068a.mo23134b(f, j));
                    r11 = r11.mo23144a(bVar.mo23153j(f, j));
                }
                e = g2.mo23152i(g).mo23144a(bVar6);
            } else {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
        } while (r11.mo23149f() < bVar.mo23149f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void mo23155a(int[] iArr, int i) {
        C8002b bVar = new C8002b(this.f23068a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C8001a aVar = this.f23068a;
            int c = bVar.mo23146c(aVar.mo23135c(aVar.mo23136d() + i3));
            iArr2[(i - 1) - i3] = c;
            if (c != 0) {
                z = false;
            }
        }
        if (!z) {
            C8002b[] d = m30399d(this.f23068a.mo23134b(i, 1), new C8002b(this.f23068a, iArr2), i);
            C8002b bVar2 = d[0];
            C8002b bVar3 = d[1];
            int[] b = m30397b(bVar2);
            int[] c2 = m30398c(bVar3, b);
            while (i2 < b.length) {
                int length = (iArr.length - 1) - this.f23068a.mo23141i(b[i2]);
                if (length >= 0) {
                    iArr[length] = C8001a.m30377a(iArr[length], c2[i2]);
                    i2++;
                } else {
                    throw new ReedSolomonException("Bad error location");
                }
            }
        }
    }
}
