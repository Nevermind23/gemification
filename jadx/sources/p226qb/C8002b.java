package p226qb;

import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: qb.b */
final class C8002b {

    /* renamed from: a */
    private final C8001a f23066a;

    /* renamed from: b */
    private final int[] f23067b;

    C8002b(C8001a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f23066a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f23067b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f23067b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f23067b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8002b mo23144a(C8002b bVar) {
        if (!this.f23066a.equals(bVar.f23066a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo23150g()) {
            return bVar;
        } else {
            if (bVar.mo23150g()) {
                return this;
            }
            int[] iArr = this.f23067b;
            int[] iArr2 = bVar.f23067b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C8001a.m30377a(iArr2[i - length], iArr[i]);
            }
            return new C8002b(this.f23066a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8002b[] mo23145b(C8002b bVar) {
        if (!this.f23066a.equals(bVar.f23066a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo23150g()) {
            C8002b g = this.f23066a.mo23139g();
            int h = this.f23066a.mo23140h(bVar.mo23147d(bVar.mo23149f()));
            C8002b bVar2 = this;
            while (bVar2.mo23149f() >= bVar.mo23149f() && !bVar2.mo23150g()) {
                int f = bVar2.mo23149f() - bVar.mo23149f();
                int j = this.f23066a.mo23142j(bVar2.mo23147d(bVar2.mo23149f()), h);
                C8002b j2 = bVar.mo23153j(f, j);
                g = g.mo23144a(this.f23066a.mo23134b(f, j));
                bVar2 = bVar2.mo23144a(j2);
            }
            return new C8002b[]{g, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo23146c(int i) {
        if (i == 0) {
            return mo23147d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f23067b) {
                i2 = C8001a.m30377a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f23067b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C8001a.m30377a(this.f23066a.mo23142j(i, i3), this.f23067b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo23147d(int i) {
        int[] iArr = this.f23067b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo23148e() {
        return this.f23067b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo23149f() {
        return this.f23067b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo23150g() {
        return this.f23067b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C8002b mo23151h(int i) {
        if (i == 0) {
            return this.f23066a.mo23139g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f23067b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f23066a.mo23142j(this.f23067b[i2], i);
        }
        return new C8002b(this.f23066a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C8002b mo23152i(C8002b bVar) {
        if (!this.f23066a.equals(bVar.f23066a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo23150g() || bVar.mo23150g()) {
            return this.f23066a.mo23139g();
        } else {
            int[] iArr = this.f23067b;
            int length = iArr.length;
            int[] iArr2 = bVar.f23067b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C8001a.m30377a(iArr3[i4], this.f23066a.mo23142j(i2, iArr2[i3]));
                }
            }
            return new C8002b(this.f23066a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C8002b mo23153j(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f23066a.mo23139g();
        } else {
            int length = this.f23067b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f23066a.mo23142j(this.f23067b[i3], i2);
            }
            return new C8002b(this.f23066a, iArr);
        }
    }

    public String toString() {
        if (mo23150g()) {
            return BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        }
        StringBuilder sb = new StringBuilder(mo23149f() * 8);
        for (int f = mo23149f(); f >= 0; f--) {
            int d = mo23147d(f);
            if (d != 0) {
                if (d < 0) {
                    if (f == mo23149f()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    d = -d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (f == 0 || d != 1) {
                    int i = this.f23066a.mo23141i(d);
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (f != 0) {
                    if (f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
